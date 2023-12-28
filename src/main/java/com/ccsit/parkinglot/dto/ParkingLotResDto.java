package com.ccsit.parkinglot.dto;

import com.ccsit.parkinglot.models.ParkingFloor;

import java.util.List;

public class ParkingLotResDto {

    private int id;
    private String name;
    private int numOfFloors;

    private List<ParkingFloor> parkingFloorList;

    public List<ParkingFloor> getParkingFloorList() {
        return parkingFloorList;
    }

    public void setParkingFloorList(List<ParkingFloor> parkingFloorList) {
        this.parkingFloorList = parkingFloorList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(int numOfFloors) {
        this.numOfFloors = numOfFloors;
    }
}
