package com.quorum.challenge.service;

import com.quorum.challenge.models.Bill;
import com.quorum.challenge.models.Vote;
import com.quorum.challenge.models.VoteResult;
import com.quorum.challenge.response.BillResponse;
import com.quorum.challenge.utils.CsvUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Service
public class BillServiceImpl implements BillService {

    @Autowired
    private CsvUtils csvUtils;

    @Override
    public Set<BillResponse> getBills() {
        Map<Integer, BillResponse> result = new HashMap<>();
        Map<Integer, VoteResult> voteResults = csvUtils.getVoteResultsData();
        Map<Integer, Vote> votes = csvUtils.getVotesData();
        Map<Integer, Bill> bills = csvUtils.getBillsData();

        bills.values().forEach(bill -> result.put(bill.getId(), BillResponse.builder().id(bill.getId())
                .bill(bill.getTitle()).primarySponsor(bill.getPrimarySponsor()).supporters(0).opposers(0).build()));

        voteResults.values().forEach(voteResult -> {
            Vote vote = votes.get(voteResult.getVoteId());
            BillResponse billResponse = result.get(vote.getBillId());

            if (voteResult.getVoteType().equals(1)) {
                if (billResponse.getSupporters() == null) {
                    billResponse.setSupporters(1);
                }else {
                    billResponse.setSupporters(billResponse.getSupporters() + 1);
                }
            }else {
                if (billResponse.getSupporters() == null) {
                    billResponse.setOpposers(1);
                }else {
                    billResponse.setOpposers(billResponse.getOpposers() + 1);
                }
            }
        });

        return new HashSet<>(result.values());
    }
}
