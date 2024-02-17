package com.quorum.challenge.response;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
public class BillResponse {
    private Integer id;
    private String bill;
    private Integer supporters;
    private Integer opposers;
    private String primarySponsor;

    public BillResponse setSupporters(Integer supporters) {
        this.supporters = supporters;
        return this;
    }

    public BillResponse setOpposers(Integer opposers) {
        this.opposers = opposers;
        return this;
    }
}
