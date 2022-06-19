package com.apps.allo24.models;

import java.io.Serializable;
import java.util.List;

public class SingleOrderDataModel implements Serializable {
    private OrderModel order;

    public OrderModel getOrder() {
        return order;
    }
}
