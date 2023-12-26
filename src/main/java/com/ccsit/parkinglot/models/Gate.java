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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGateId() {
        return gateId;
    }

    public void setGateId(int gateId) {
        this.gateId = gateId;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
