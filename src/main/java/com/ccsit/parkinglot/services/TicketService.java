package com.ccsit.parkinglot.services;

import com.ccsit.parkinglot.models.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TicketService {
    ParkingLotService parkingLotService = new ParkingLotService();
    private static List<Ticket> ticketList = new ArrayList<Ticket>();
    private  int ticketId = 1;



    public Ticket generateTicket(Vehicle vehicle,String parkingLotname) throws Exception {
        ParkingLot parkingLot = parkingLotService.getParkingLotByName(parkingLotname);
        if(parkingLot == null) throw new Exception("Invalid Parkinglot");

        Ticket ticket = new Ticket();
        ticket.setTicketId(ticketId++);
        ticket.setVehicle(vehicle);
        ticket.setEntryTime(new Date());
        ticket.setParkingLot(parkingLot);
        List<ParkingFloor> floors = parkingLot.getParkingFloors();

        for(ParkingFloor floor : floors){
            boolean foundEmptySpot = false;
            for(ParkingSpot spot : floor.getParkingSpots()){
                if(spot.getSpotType().toString().equalsIgnoreCase(vehicle.getVehicleType().toString())
                && spot.getParkingSpotStatus() == ParkingSpotStatusType.AVAILABLE){
                    spot.setParkingSpotStatus(ParkingSpotStatusType.FILLED);
                     ticket.setParkingSpot(spot);
                     foundEmptySpot = true;
                     break;
                }
            }

            if(foundEmptySpot) break;
        }
       ticketList.add(ticket);
        return ticket;


    }

    public List<Ticket> getAllTickets() {

        return ticketList;
    }

    public Ticket getTicketById(int id){
        for(Ticket ticket : ticketList){
            if(ticket.getTicketId() == id) return ticket;
        }

        return null;
    }
}
