package com.example.ktragiuaky.model;

public class Unit {

    private int unit_id;
    private String unit_name;
    private String email;
    private String website;
    private byte[] logo;
    private String address;
    private String phone;

    public Unit(int unit_id, String unit_name, String email, String website, byte[] logo, String address, String phone) {
        this.unit_id = unit_id;
        this.unit_name = unit_name;
        this.email = email;
        this.website = website;
        this.logo = logo;
        this.address = address;
        this.phone = phone;
    }

    public int getUnit_id() {
        return unit_id;
    }

    public void setUnit_id(int unit_id) {
        this.unit_id = unit_id;
    }

    public String getUnit_name() {
        return unit_name;
    }

    public void setUnit_name(String unit_name) {
        this.unit_name = unit_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
