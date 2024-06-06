package com.jdpattern.Kproxy.refl;

public class Account extends Enroll {
    private String id = "";
    public String division = "";
    private String phone = "";

    public Account(String id, String division, String phone) {
        this.id = id;
        this.division = division;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

