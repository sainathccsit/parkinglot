package com.ccsit.parkinglot.services;

import com.ccsit.parkinglot.models.*;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ParkingLotService {
    private List<ParkingLot> parkingLotList = new ArrayList<>();



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

        Gate entryGate = new EntryGate("Entry Gate", GateType.ENTRY_GATE, null);
        Gate exitGate = new ExitGate("Exit-1", GateType.EXIT_GATE, null);
        parkingLot.setEntryGates(Arrays.asList(entryGate));
        parkingLot.setExitGates(Arrays.asList(exitGate));

        this.parkingLotList.add(parkingLot);
        return this.parkingLotList.get(parkingLotList.size()-1);
    }


    public List<ParkingLot> getAllParkingLots() {

        return this.parkingLotList;
    }
}
