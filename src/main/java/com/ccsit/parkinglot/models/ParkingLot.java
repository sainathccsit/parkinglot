package com.ccsit.parkinglot.models;

import java.util.List;

public class ParkingLot {
    int id;

    String name;
    List<ParkingFloor> parkingFloors;
    int numOfFloors ;

    int spotsPerFloor;
    List<Gate> entryGates;
    List<Gate> exitGates;
    Address address;

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

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public int getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(int numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    public int getSpotsPerFloor() {
        return spotsPerFloor;
    }

    public void setSpotsPerFloor(int spotsPerFloor) {
        this.spotsPerFloor = spotsPerFloor;
    }

    public List<Gate> getEntryGates() {
        return entryGates;
    }

    public void setEntryGates(List<Gate> entryGates) {
        this.entryGates = entryGates;
    }

    public List<Gate> getExitGates() {
        return exitGates;
    }

    public void setExitGates(List<Gate> exitGates) {
        this.exitGates = exitGates;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
