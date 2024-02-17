package com.quorum.challenge.controller;

import com.quorum.challenge.response.LegislatorsResponse;
import com.quorum.challenge.service.LegislatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("legislators")
public class LegislatorController {
    @Autowired
    private LegislatorService legislatorService;

    @GetMapping
    public Set<LegislatorsResponse> getLegislators() {
        return legislatorService.getLegislators();
    }
}
