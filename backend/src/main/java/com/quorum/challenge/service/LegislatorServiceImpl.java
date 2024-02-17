package com.quorum.challenge.service;

import com.quorum.challenge.models.Legislator;
import com.quorum.challenge.models.VoteResult;
import com.quorum.challenge.response.LegislatorsResponse;
import com.quorum.challenge.utils.CsvUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Service
public class LegislatorServiceImpl implements LegislatorService {

    @Autowired
    private CsvUtils csvUtils;

    @Override
    public Set<LegislatorsResponse> getLegislators() {
        Map<Integer, LegislatorsResponse> result = new HashMap<>();
        Map<Integer, Legislator> legislators = csvUtils.getLegislatorsData();
        Map<Integer, VoteResult> voteResults = csvUtils.getVoteResultsData();

        legislators.values().forEach(legislator -> result.put(legislator.getId(), LegislatorsResponse.builder()
                .id(legislator.getId()).legislator(legislator.getName()).opposedBills(0).supportedBills(0).build()));

        voteResults.values().forEach(voteResult -> {
            LegislatorsResponse response = result.get(voteResult.getLegislatorId());
            if (voteResult.getVoteType().equals(1)) {
                if (response.getSupportedBills() == null) {
                    response.setSupportedBills(1);
                }else {
                    response.setSupportedBills(response.getSupportedBills() + 1);
                }
            }else if(voteResult.getVoteType().equals(2)) {
                if (response.getOpposedBills() == null) {
                    response.setOpposedBills(1);
                } else {
                    response.setOpposedBills(response.getOpposedBills() + 1);
                }
            }
        });

        return new HashSet<>(result.values());
    }
}
