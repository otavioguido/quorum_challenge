package com.quorum.challenge.utils;

import com.quorum.challenge.models.Bill;
import com.quorum.challenge.models.Legislator;
import com.quorum.challenge.models.Vote;
import com.quorum.challenge.models.VoteResult;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
public class CsvUtilsImpl implements CsvUtils {

    @Override
    public Map<Integer, VoteResult> getVoteResultsData() {
        try {
            Map<Integer, VoteResult> result = new HashMap<>();
            BufferedReader reader = new BufferedReader(new FileReader("vote_results.csv"));
            String line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                result.put(Integer.parseInt(data[0]), new VoteResult(Integer.parseInt(data[0]),
                        Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3])));
            }
            reader.close();
            return result;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Map<Integer, Vote> getVotesData() {
        try {
            Map<Integer, Vote> result = new HashMap<>();
            BufferedReader reader = new BufferedReader(new FileReader("votes.csv"));
            String line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                result.put(Integer.parseInt(data[0]), new Vote(Integer.parseInt(data[0]), Integer.parseInt(data[1])));
            }
            reader.close();
            return result;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Map<Integer, Legislator> getLegislatorsData() {
        try {
            Map<Integer, Legislator> result = new HashMap<>();
            BufferedReader reader = new BufferedReader(new FileReader("legislators.csv"));
            String line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                result.put(Integer.parseInt(data[0]), new Legislator(Integer.parseInt(data[0]), data[1]));
            }
            reader.close();
            return result;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Map<Integer, Bill> getBillsData() {
        try {
            Map<Integer, Bill> result = new HashMap<>();
            BufferedReader reader = new BufferedReader(new FileReader("bills.csv"));
            String line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                result.put(Integer.parseInt(data[0]), new Bill(Integer.parseInt(data[0]), data[1], data[2]));
            }
            reader.close();
            return result;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
