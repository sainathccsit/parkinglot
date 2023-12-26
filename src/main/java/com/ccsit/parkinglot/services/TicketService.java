package com.ccsit.parkinglot.services;

import com.ccsit.parkinglot.models.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TicketService {
    private ParkingLotService parkingLotService;
    private List<Ticket> ticketList;

    public TicketService(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
        this.ticketList = new ArrayList<>();
    }

    public Ticket createTicket(Vehicle vehicle, Gate entryGate) {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());
        ticket.setVehicle(vehicle);
        ParkingLot lot =  getParkingLot(entryGate);
        entryGate.setOperator(null);
        ticket.setParkingLot(lot);
        ParkingSpot spot = lot.getParkingFloors().get(0).getParkingSpots().get(1);
        ticket.setParkingSpot(spot);
        ticket.setTicketId(ticketList.size()+1);
        this.ticketList.add(ticket);
        return ticket;
    }

    private ParkingLot getParkingLot(Gate entryGate) {
        for(ParkingLot lot : this.parkingLotService.getAllParkingLots()){
            for(Gate g : lot.getEntryGates()){
                if(g.getName().equalsIgnoreCase(entryGate.getName())) return lot;
            }
        }

        return null;
    }

    public Ticket getTicket(int id){
        return this.ticketList.get(id);
    }

    public List<Ticket> getAllTickets() {
        return this.ticketList;
    }
}
