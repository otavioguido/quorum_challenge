package com.quorum.challenge.utils;

import com.quorum.challenge.models.Bill;
import com.quorum.challenge.models.Legislator;
import com.quorum.challenge.models.Vote;
import com.quorum.challenge.models.VoteResult;

import java.util.Map;

public interface CsvUtils {
    Map<Integer, VoteResult> getVoteResultsData();

    Map<Integer, Vote> getVotesData();

    Map<Integer, Legislator> getLegislatorsData();

    Map<Integer, Bill> getBillsData();
}
