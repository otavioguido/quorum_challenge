package com.quorum.challenge.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Bill {
    private Integer id;
    private String title;
    private String primarySponsor;
}
