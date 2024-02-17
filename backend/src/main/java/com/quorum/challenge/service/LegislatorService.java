package com.quorum.challenge.service;

import com.quorum.challenge.response.LegislatorsResponse;

import java.io.IOException;
import java.util.Set;

public interface LegislatorService {
    Set<LegislatorsResponse> getLegislators();
}
