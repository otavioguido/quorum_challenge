package com.quorum.challenge.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LegislatorsResponse {
    private Integer id;
    private String legislator;
    private Integer supportedBills;
    private Integer opposedBills;
}
