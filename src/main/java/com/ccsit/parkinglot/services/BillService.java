package com.ccsit.parkinglot.services;

import com.ccsit.parkinglot.dto.BillReqDto;
import com.ccsit.parkinglot.models.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BillService {
    TicketService ticketService = new TicketService();
    private static List<Bill> billList = new ArrayList<>();
    private int billId = 1;

    public Bill getBill(int id){
        Ticket ticket = ticketService.getTicketById(id);
        Date entryTime = ticket.getEntryTime();
        Date exitTime = new Date();

        long duration = (exitTime.getTime()-entryTime.getTime());
        int min = (int)duration/1000;
        int totalCost = 0;
        ParkingSpot spot = ticket.getParkingSpot();
        if(spot.getSpotType()== ParkingSpotType.CAR){
            totalCost = min*1000;
        }else{
            totalCost = min*500;
        }
        Bill bill = new Bill();
        bill.setBillId(billId++);
        bill.setBillAmount((double) totalCost);
        bill.setTicket(ticket);
        bill.setExitTime(exitTime);
        billList.add(bill);
        return bill;
    }


    public Bill settleBill(int id, BillReqDto reqDto){
        /*
            get the bill
            change the status to paid
            bi
         */
        return null;
    }
}
