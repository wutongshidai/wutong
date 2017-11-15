package com.parasol.core.alipay;

import java.io.Serializable;

@SuppressWarnings("serial")
public class BizContent implements Serializable {

    private String out_trade_no;

    private String product_code;

    private double total_amount;

    private String subject;

    private String body;

    private String passback_params;

    public BizContent(String out_trade_no, String product_code, double total_amount, String subject, String body, String passback_params) {
        this.out_trade_no = out_trade_no;
        this.product_code = product_code;
        this.total_amount = total_amount;
        this.subject = subject;
        this.body = body;
        this.passback_params = passback_params;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getPassback_params() {
        return passback_params;
    }

    public void setPassback_params(String passback_params) {
        this.passback_params = passback_params;
    }
}
