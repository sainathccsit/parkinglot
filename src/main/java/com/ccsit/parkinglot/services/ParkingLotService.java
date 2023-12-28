package com.ccsit.parkinglot.services;


import com.ccsit.parkinglot.models.ParkingFloor;
import com.ccsit.parkinglot.models.ParkingLot;
import com.ccsit.parkinglot.models.ParkingSpot;
import com.ccsit.parkinglot.models.ParkingSpotType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public class ParkingLotService {
    private  List<ParkingLot> parkingLotList = new ArrayList<>();
    private  int lotId = 0;


    public ParkingLot create(String name, int floors, int spotsPerFloor) {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setName(name);
        parkingLot.setNumOfFloors(floors);
        parkingLot.setSpotsPerFloor(spotsPerFloor);

        List<ParkingFloor> floorList = new ArrayList<>();
        for( int i=1;i<=floors;i++){
            ParkingFloor floor = new ParkingFloor();
            floor.setFloorNumber(name+"-"+i+" Floor");
            List<ParkingSpot> spotList = new ArrayList<>();
            for(int k =1;k<spotsPerFloor;k++){
                ParkingSpot spot = new ParkingSpot();
                if(k%2 == 0)
                    spot.setSpotType(ParkingSpotType.CAR);
                else
                    spot.setSpotType(ParkingSpotType.BIKE);

                spot.setParkingFloorId(parkingLot.getName());
                spot.setSpotId(floor.getFloorNumber()+"-"+k+" spot");
                spotList.add(spot);
            }
            floor.setParkingSpots(spotList);
            floorList.add(floor);
        }

        parkingLot.setParkingFloors(floorList);
        parkingLotList.add(parkingLot);
        parkingLot.setId(parkingLotList.size());
        this.lotId++;

        return parkingLot;
    }

    public List<ParkingLot> getAllParkingLot() {

        return parkingLotList;
    }
}
