package com.ccsit.parkinglot.controllers;

import com.ccsit.parkinglot.dto.ParkingLotReqdto;
import com.ccsit.parkinglot.dto.ParkingLotResDto;
import com.ccsit.parkinglot.models.ParkingLot;
import com.ccsit.parkinglot.services.ParkingLotService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/app/v1/admin")
public class ParkingLotController {

    private ParkingLotService parkingLotService ;

    public ParkingLotController() {
        this.parkingLotService = new ParkingLotService();
    }

    @PostMapping
    public String createParkingLot(@RequestBody ParkingLotReqdto request) {
        ParkingLot parkingLot = this.parkingLotService.create(request.getName(),request.getFloors(),request.getSpotsPerFloor());

        return "Successfully Created ParkingLot with Id:"+parkingLot.getId();
    }


    @GetMapping("")
    public List<ParkingLotResDto> getAllParkingLots(){
        List<ParkingLot> parkingLotList = this.parkingLotService.getAllParkingLot();
        List<ParkingLotResDto> parkingLotResDtoList = new ArrayList<>();
        for(ParkingLot lot : parkingLotList){
            ParkingLotResDto res = new ParkingLotResDto();
            res.setId(lot.getId());
            res.setName(lot.getName());
            res.setNumOfFloors(lot.getNumOfFloors());
            res.setParkingFloorList(lot.getParkingFloors());
            parkingLotResDtoList.add(res);

        }
        return parkingLotResDtoList;
    }

}
