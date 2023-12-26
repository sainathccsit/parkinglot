package com.ccsit.parkinglot.models;

import java.util.Date;

public class Ticket {
    int ticketId;
    Date entryTime;
    Date exitTime;
    Vehicle vehicle;
    Operator operator;
    Gate entryGate;
    ParkingLot parkingLot;
    ParkingSpot parkingSpot;
}
