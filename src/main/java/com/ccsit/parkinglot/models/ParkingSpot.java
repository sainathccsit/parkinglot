package com.ccsit.parkinglot.models;

public class ParkingSpot {
    String spotId;
    ParkingSpotType spotType;
    String parkingFloorId;

    ParkingSpotStatusType parkingSpotStatus;

    public String getSpotId() {
        return spotId;
    }

    public void setSpotId(String spotId) {
        this.spotId = spotId;
    }

    public ParkingSpotType getSpotType() {
        return spotType;
    }

    public void setSpotType(ParkingSpotType spotType) {
        this.spotType = spotType;
    }

    public String getParkingFloorId() {
        return parkingFloorId;
    }

    public void setParkingFloorId(String parkingFloorId) {
        this.parkingFloorId = parkingFloorId;
    }

    public ParkingSpotStatusType getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatusType parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }
}
