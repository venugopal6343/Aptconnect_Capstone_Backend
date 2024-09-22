package com.AptConnect.UserManagement.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Generated;

@Entity
@Table(
        name = "parking"
)
public class Parking {
    @Id
    private String parkingSlotNumber;
    private String UserName;

    @Generated
    public Parking(final String parkingSlotNumber, final String UserName) {
        this.parkingSlotNumber = parkingSlotNumber;
        this.UserName = UserName;
    }

    @Generated
    public Parking() {
    }

    @Generated
    public String getParkingSlotNumber() {
        return this.parkingSlotNumber;
    }

    @Generated
    public String getUserName() {
        return this.UserName;
    }

    @Generated
    public void setParkingSlotNumber(final String parkingSlotNumber) {
        this.parkingSlotNumber = parkingSlotNumber;
    }

    @Generated
    public void setUserName(final String UserName) {
        this.UserName = UserName;
    }
}
