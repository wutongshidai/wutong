package com.parasol.core.bid;

import java.io.Serializable;

public class OrderInfo implements Serializable{


    private static final long serialVersionUID = 1070014347683587524L;

    private Bid_info bid_info;

    private Bid_order bid_order;


    public Bid_info getBid_info() {
        return bid_info;
    }

    public void setBid_info(Bid_info bid_info) {
        this.bid_info = bid_info;
    }

    public Bid_order getBid_order() {
        return bid_order;
    }

    public void setBid_order(Bid_order bid_order) {
        this.bid_order = bid_order;
    }
}
