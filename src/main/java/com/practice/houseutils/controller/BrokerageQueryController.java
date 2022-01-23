package com.practice.houseutils.controller;

import com.practice.houseutils.constants.ActionType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrokerageQueryController {
    @GetMapping("/api/calc/brokerage")
    public Long calcBrokerage(@RequestParam ActionType actionType,
                              @RequestParam Long price) {

        // TODO: business logic - 중개수수료 계산하는 로직
        return null;


    }
}
