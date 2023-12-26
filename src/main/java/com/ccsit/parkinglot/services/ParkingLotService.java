package com.ccsit.parkinglot.services;

import com.ccsit.parkinglot.models.ParkingFloor;
import com.ccsit.parkinglot.models.ParkingLot;
import com.ccsit.parkinglot.models.ParkingSpot;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ParkingLotService {
    private ParkingLot parkingLot;
    public void createParkingLot(String hyd, int i) {


    }

    public ParkingLot createParkingLot(String name, int floors, int spotsPerFloor) {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setName(name);
        parkingLot.setNumOfFloors(floors);
        parkingLot.setSpotsPerFloor(spotsPerFloor);

        List<ParkingFloor> parkingFloorList = new ArrayList<ParkingFloor>();
        for (int i = 1; i <= floors; i++) {
            ParkingFloor floor = new ParkingFloor();
            floor.setFloorNumber(name + "-Floor-" + i);
            List<ParkingSpot> parkingSpotList = new ArrayList<>();
            for (int s = 1; s < spotsPerFloor; s++) {
                ParkingSpot spot = new ParkingSpot();
                spot.setSpotId(floor.getFloorNumber() + "-Spot-" + s);
                parkingSpotList.add(spot);
            }
            floor.setParkingSpots(parkingSpotList);
            parkingFloorList.add(floor);
        }
        parkingLot.setParkingFloors(parkingFloorList);
        this.parkingLot = parkingLot;
        return this.parkingLot;
    }


    public ParkingLot getAllParkingLots() {

        return this.parkingLot;
    }
}
