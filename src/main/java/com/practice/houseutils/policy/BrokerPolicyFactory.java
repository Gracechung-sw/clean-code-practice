package com.practice.houseutils.policy;

import com.practice.houseutils.constants.ActionType;
import com.practice.houseutils.exception.ErrorCode;
import com.practice.houseutils.exception.HouseUtilsException;

public class BrokerPolicyFactory {
    public static BrokeragePolicy of(ActionType actionType) {
        switch (actionType) {
            case RENT:
                return new RentBrokeragePolicy();
            case PURCHASE:
                return new PurchaseBrokeragePolicy();
            default:
                throw new HouseUtilsException(ErrorCode.INVALID_REQUEST, "해당 actionType에 대한 정책이 존재하지 않습니다. ");
        }
    }
}
