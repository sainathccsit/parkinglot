package com.ccsit.parkinglot.controllers;

import com.ccsit.parkinglot.dto.ParkingLotReqdto;
import com.ccsit.parkinglot.models.ParkingLot;
import com.ccsit.parkinglot.services.ParkingLotService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/app/v1/parklot")
public class ParkingLotController {
    private ParkingLotService parkingLotService;

    public ParkingLotController(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
    }

    @PostMapping("")
    public String createParkingLot(@RequestBody ParkingLotReqdto request) {
        ParkingLot lot = parkingLotService.createParkingLot(request.getName(), request.getFloors(), request.getSpotsPerFloor());
        return lot.getName();
    }

    @GetMapping("")
    public List<ParkingLot> getAllParkingLots() {
        List<ParkingLot> parkingLots = new ArrayList<>();
        parkingLots = parkingLotService.getAllParkingLots();
        return parkingLots;
    }
}
