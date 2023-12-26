package com.ccsit.parkinglot.dto;

import com.ccsit.parkinglot.models.Gate;
import com.ccsit.parkinglot.models.Vehicle;

public class TicketReqDto {
    private Vehicle vehicle;
    private Gate entryGate;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }
}
