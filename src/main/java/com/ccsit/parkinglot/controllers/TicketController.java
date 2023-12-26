package com.ccsit.parkinglot.controllers;

import com.ccsit.parkinglot.dto.TicketReqDto;
import com.ccsit.parkinglot.dto.TicketResDto;
import com.ccsit.parkinglot.models.Ticket;
import com.ccsit.parkinglot.services.TicketService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/app/v1/parking")
public class TicketController {
    private TicketService ticketService;
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping("")
    public TicketResDto createTicket(@RequestBody TicketReqDto req){

      Ticket ticket = this.ticketService.createTicket(req.getVehicle(),req.getEntryGate());
        TicketResDto res = new TicketResDto();
        res.setEntryGate(ticket.getEntryGate());
        res.setEntryTime(ticket.getEntryTime());
        res.setTicketId(ticket.getTicketId());
        res.setVehicle(ticket.getVehicle());
        res.setParkingLotName(ticket.getParkingLot().getName());
        res.setParkingSpot(ticket.getParkingSpot());

        return res;
    }
    @GetMapping("/{id}")
    public Ticket getTicketById(@PathVariable int id){
        return this.ticketService.getTicket(id);
    }

    @GetMapping("")
    public List<TicketResDto> getAllTickets(){
        List<TicketResDto> responses = new ArrayList<>();
        List<Ticket> ticketList = this.ticketService.getAllTickets();
        for(Ticket ticket : ticketList){
            TicketResDto res = new TicketResDto();
            res.setEntryGate(ticket.getEntryGate());
            res.setEntryTime(ticket.getEntryTime());
            res.setTicketId(ticket.getTicketId());
            res.setVehicle(ticket.getVehicle());
            res.setParkingLotName(ticket.getParkingLot().getName());
            res.setParkingSpot(ticket.getParkingSpot());
            responses.add(res);
        }

        return responses;
    }
}
