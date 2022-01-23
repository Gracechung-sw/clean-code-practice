package com.practice.houseutils.policy;

public class BrokerageRule {
    private Double brokeragePercent;
    private Long limitAmount;

    public Long calcMaxBrokerage(Long price) {
        Double amount = Math.floor(brokeragePercent / 100 * price);
        Long calculated_amount = amount.longValue();
        if (limitAmount == null) {
            return calculated_amount;
        }
        return Math.min(calculated_amount, limitAmount);
    }
}
