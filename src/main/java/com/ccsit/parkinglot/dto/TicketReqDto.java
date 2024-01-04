package com.ccsit.parkinglot.dto;

import com.ccsit.parkinglot.models.Vehicle;

public class TicketReqDto {

    Vehicle vehicle;
    String parkingLotName;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getParkingLotName() {
        return parkingLotName;
    }

    public void setParkingLotName(String parkingLotName) {
        this.parkingLotName = parkingLotName;
    }
}
