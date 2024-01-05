package com.ccsit.parkinglot.models;

import lombok.Data;

import java.util.Date;
import java.util.List;

public class Bill {
    private int billId;

    private Ticket ticket;
    private Operator operator;
    Gate exitGate;
    Date exitTime;
    List<Payment> payments;
    Double billAmount;
    BillStatusType billstatus;

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public Double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(Double billAmount) {
        this.billAmount = billAmount;
    }

    public BillStatusType getBillstatus() {
        return billstatus;
    }

    public void setBillstatus(BillStatusType billstatus) {
        this.billstatus = billstatus;
    }
}
