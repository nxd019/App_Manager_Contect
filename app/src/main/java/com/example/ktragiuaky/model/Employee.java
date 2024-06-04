package com.example.ktragiuaky.model;

public class Employee {

    private int employee_id;
    private String employee_name;
    private String position;
    private String email;
    private byte[] avatar;
    private int unit_id;

    public Employee(int employee_id, String employee_name, String position, String email, byte[] avatar, int unit_id) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.position = position;
        this.email = email;
        this.avatar = avatar;
        this.unit_id = unit_id;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte[] getAvatar() {
        return avatar;
    }

    public void setAvatar(byte[] avatar) {
        this.avatar = avatar;
    }

    public int getUnit_id() {
        return unit_id;
    }

    public void setUnit_id(int unit_id) {
        this.unit_id = unit_id;
    }
}
