package com.ccsit.parkinglot.controllers;


import com.ccsit.parkinglot.dto.TicketReqDto;
import com.ccsit.parkinglot.dto.TicketResDto;
import com.ccsit.parkinglot.models.Ticket;
import com.ccsit.parkinglot.models.Vehicle;
import com.ccsit.parkinglot.services.TicketService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/app/v1/parkvehicle")
public class TicketController {
    private TicketService ticketService ;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping("")
    public TicketResDto createTicket(@RequestBody TicketReqDto req) throws Exception {

       Ticket ticket = ticketService.generateTicket(req.getVehicle(),req.getParkingLotName());
        TicketResDto res = new TicketResDto();
        res.setParkingSpot(ticket.getParkingSpot());
        res.setVehicle(ticket.getVehicle());
        res.setParkingLotName(ticket.getParkingLot().getName());
        res.setTicketId(ticket.getTicketId());
        res.setEntryTime(ticket.getEntryTime());
        res.setParkingSpot(ticket.getParkingSpot());
       return res;
    }

    @GetMapping("")
    public List<TicketResDto> getAllTickets(){
        List<Ticket> ticketList = ticketService.getAllTickets();
        List<TicketResDto> responses = new ArrayList<>();
        for(Ticket ticket : ticketList){
            TicketResDto res = new TicketResDto();
            res.setParkingSpot(ticket.getParkingSpot());
            res.setVehicle(ticket.getVehicle());
            res.setParkingLotName(ticket.getParkingLot().getName());
            res.setTicketId(ticket.getTicketId());
            res.setEntryTime(ticket.getEntryTime());
            res.setParkingSpot(ticket.getParkingSpot());
            responses.add(res);
        }
        return responses;
    }

}
