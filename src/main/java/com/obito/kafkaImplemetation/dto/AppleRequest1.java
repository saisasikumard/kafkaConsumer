package com.obito.kafkaImplemetation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AppleRequest1 {
    String productName;
    double amounnt;
    Date date;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmounnt() {
        return amounnt;
    }

    public void setAmounnt(double amounnt) {
        this.amounnt = amounnt;
    }
}
