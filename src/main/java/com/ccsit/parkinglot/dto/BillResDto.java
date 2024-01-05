package com.ccsit.parkinglot.dto;

import com.ccsit.parkinglot.models.*;

import java.util.Date;
import java.util.List;

public class BillResDto {
    private int billId;

    private int ticketId;
    Date entryTime;
    Date exitTime;
    int duration;
    Double billAmount;
    BillStatusType billstatus;

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
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
