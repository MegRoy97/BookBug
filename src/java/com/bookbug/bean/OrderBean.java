/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookbug.bean;

/**
 *
 * @author MEGHA
 */
public class OrderBean {
    private String UserId, ProductId, DateOfOrder, TimeOfOrder;

    public String getTimeOfOrder() {
        return TimeOfOrder;
    }

    public void setTimeOfOrder(String TimeOfOrder) {
        this.TimeOfOrder = TimeOfOrder;
    }
    int Quantity;

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    public String getDateOfOrder() {
        return DateOfOrder;
    }

    public void setDateOfOrder(String DateOfOrder) {
        this.DateOfOrder = DateOfOrder;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
}
