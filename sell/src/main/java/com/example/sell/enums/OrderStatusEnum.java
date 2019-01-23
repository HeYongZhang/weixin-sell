package com.example.sell.enums;

import lombok.Getter;

@Getter
public enum OrderStatusEnum implements CodeEnum{

    NEW(0, "新订单"),
    FINISH(1, "完成"),
    DOWN(2, "已取消订单");

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
