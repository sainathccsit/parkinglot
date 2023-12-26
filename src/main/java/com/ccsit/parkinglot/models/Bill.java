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
}
