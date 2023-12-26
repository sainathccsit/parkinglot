package com.ccsit.parkinglot.models;

import java.util.List;

public class ParkingFloor {
   private String floorNumber ;
   private List<ParkingSpot> parkingSpots;

   public String getFloorNumber() {
      return floorNumber;
   }

   public void setFloorNumber(String floorNumber) {
      this.floorNumber = floorNumber;
   }

   public List<ParkingSpot> getParkingSpots() {
      return parkingSpots;
   }

   public void setParkingSpots(List<ParkingSpot> parkingSpots) {
      this.parkingSpots = parkingSpots;
   }
}
