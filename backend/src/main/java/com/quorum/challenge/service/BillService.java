package com.quorum.challenge.service;

import com.quorum.challenge.response.BillResponse;

import java.util.Set;

public interface BillService {
    Set<BillResponse> getBills();
}
