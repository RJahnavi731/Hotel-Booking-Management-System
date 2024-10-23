package com.jv7.booking;

public class Booking {
    private int id;
    private int RoomId;
    private int GuestId;
    private String ArrivalDate;
    private String DepartureDate;
    private String Status;
    public Booking(int id,int RoomId,int GuestId,String ArrivalDate,String DepartureDate,String Status){
       this.id=id;
       this.RoomId=RoomId;
       this.GuestId=GuestId;
       this.ArrivalDate=ArrivalDate;
       this.DepartureDate=DepartureDate;
       this.Status=Status;

    }
    public void setid(int id){
        this.id=id;
    }
    public int getid(){
        return id;
    }
    public void setRoomId(int RoomId){
        this.RoomId=RoomId;
    }
    public int getRoomId(){
        return RoomId;
    }
    public void setGuestId(int GuestId){
        this.GuestId=GuestId;
    }
    public int getGuestId(){
        return GuestId;
    }
    public void setArrivalDate(String ArrivalDate){
        this.ArrivalDate=ArrivalDate;
    }
    public String getArrivalDate(){
        return ArrivalDate;
    }
    public void setDepartureDate(String DepartureDate){
        this.DepartureDate=DepartureDate;
    }
    public String getDepartureDate(){
        return DepartureDate;
    }
    public void setStatus(String Status){
        this.Status=Status;
    }
    public String getStatus(){
        return Status;
    }
   public String toString(){
    return "Booking{"+ "id:"+id+" "+"RoomId:"+RoomId+" "+
    "GuestId:"+GuestId+" "+"ArrivalDate:"+ArrivalDate+" "+"DepartureDate:"+DepartureDate+ " " + "status:"+ Status+ "}";
   }
}