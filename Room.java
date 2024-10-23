package com.jv7.booking;
public class Room {

    private int id;
    private int price;
    private String type;
 
    public Room(int id, int price, String type) {
       this.id = id;
       this.price = price;
       this.type = type;
 
    }
 
    public void setid(int id) {
       this.id = id;
    }
 
    public int getid() {
       return id;
    }
 
    public void setprice(int price) {
       this.price = price;
    }
 
    public int getprice() {
       return price;
    }
 
    public void settype(String type) {
       this.type = type;
    }
 
    public String gettype() {
       return type;
    }
 
    public String toString() {
       return "Room{" + "id: " + id + " " + "price: " + price + " " + "type: " + type + "}";
    }
 }