package com.quorum.challenge.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class VoteResult {
    private Integer id;
    private Integer legislatorId;
    private Integer voteId;
    private Integer voteType;
}
