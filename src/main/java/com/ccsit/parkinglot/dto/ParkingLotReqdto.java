package com.ccsit.parkinglot.dto;

public class ParkingLotReqdto {
    private String name;
    private int floors;
    private int spotsPerFloor;

    public ParkingLotReqdto(String name, int floors, int spotsPerFloor) {
        this.name = name;
        this.floors = floors;
        this.spotsPerFloor = spotsPerFloor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getSpotsPerFloor() {
        return spotsPerFloor;
    }

    public void setSpotsPerFloor(int spotsPerFloor) {
        this.spotsPerFloor = spotsPerFloor;
    }
}
