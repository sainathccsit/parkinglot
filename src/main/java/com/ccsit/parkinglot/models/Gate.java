package com.ccsit.parkinglot.models;

public class Gate {

    private String name;
    private  int gateId;
    private GateType gateType;
    private Operator operator;

    public Gate(String name, GateType gateType, Operator operator) {
        this.name = name;
        this.gateType = gateType;
        this.operator = operator;
    }
}
