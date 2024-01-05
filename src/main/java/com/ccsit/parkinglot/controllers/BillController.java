package com.ccsit.parkinglot.controllers;

import com.ccsit.parkinglot.dto.BillReqDto;
import com.ccsit.parkinglot.dto.BillResDto;
import com.ccsit.parkinglot.models.Bill;
import com.ccsit.parkinglot.models.BillStatusType;
import com.ccsit.parkinglot.services.BillService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app/v1/bill")
public class BillController {
    private BillService billService ;

    public BillController(BillService billService) {
        this.billService = billService;
    }

    @GetMapping("/{id}")
    public BillResDto getBill(@PathVariable int id){
        Bill bill = billService.getBill(id);

        BillResDto response = new BillResDto();
        response.setBillAmount(bill.getBillAmount());
        response.setBillId(bill.getBillId());
        response.setEntryTime(bill.getTicket().getEntryTime());
        response.setExitTime(bill.getExitTime());
        int duration = (int)(response.getExitTime().getTime()-response.getExitTime().getTime())/1000;
        response.setDuration(duration);
        response.setBillstatus(BillStatusType.INPROGRESS);
        return response;

    }

    @PostMapping("/{id}")
    public BillResDto settleBill(@PathVariable int billId, @RequestBody BillReqDto req){

      Bill bill = billService.settleBill(billId,req);
      /*

       */
        return null;
    }



}
