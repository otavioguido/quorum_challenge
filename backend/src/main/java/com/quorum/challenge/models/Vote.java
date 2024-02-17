package com.quorum.challenge.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Vote {
    private Integer id;
    private Integer billId;
}
