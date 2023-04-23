package com.Resturent.Resturent.Model;

public class RestuDetails {
    private int Id;
    private String Name;
    private String Address;
    private String  Speciality;
    private long Number;
    private  int totalStaff;

    public RestuDetails(int id, String name, String address, String speciality, long number, int totalStaff) {
        Id = id;
        Name = name;
        Address = address;
        Speciality = speciality;
        Number = number;
        this.totalStaff = totalStaff;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }

    public long getNumber() {
        return Number;
    }

    public void setNumber(long number) {
        Number = number;
    }

    public int getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(int totalStaff) {
        this.totalStaff = totalStaff;
    }
}
