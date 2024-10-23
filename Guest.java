package com.jv7.booking;

public class Guest {
    private int id;
    private String name;
    private long contactNum;
     public Guest(int id,String name,long contactNum){
        this.id=id;
        this.name=name;
        this.contactNum=contactNum;
     }
     public void setid(int id){
        this.id=id;
     }
     public int getid(){
        return id;
     }
     public void setname(String name){
        this.name=name;
     }
     public String getname(){
        return name;
     }
     public void setcontactNum(long contactNum){
      this.contactNum=contactNum;
     }
     public long getcontactNum(){
        return contactNum;
     }
     public String toString(){
        return "Guest{"+ "id:"+id+ " "+"name:"+name+" "+ "contactNum:"+ contactNum+"}";
     }
}

