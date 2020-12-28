package com.example.customelistexample.mine;

public class MyContact {

    private int icon;
    private String phone;
    private String name;

    public MyContact(String name, String phone, int icon) {
        if(name.equals("")) name="Unknown";
        this.icon = icon;
        this.phone = phone;
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
