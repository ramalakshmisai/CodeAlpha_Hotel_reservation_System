package com.ty;

public class Hotel {
private String roomid;
private String guestname;
private int guest_age;
private int no_of_members;
private double cost;
private int no_of_days_staying;
static int count=101;
public Hotel(String guestname, int guest_age, int no_of_members, double cost, int no_of_days_staying) {
	super();
	this.roomid = "MRK"+count;
	count++;
	this.guestname = guestname;
	this.guest_age = guest_age;
	this.no_of_members = no_of_members;
	this.cost = cost;
	this.no_of_days_staying = no_of_days_staying;
}
public String getRoomid() {
	return roomid;
}
public void setRoomid(String roomid) {
	this.roomid = roomid;
}
public String getGuestname() {
	return guestname;
}
public void setGuestname(String guestname) {
	this.guestname = guestname;
}
public int getGuest_age() {
	return guest_age;
}
public void setGuest_age(int guest_age) {
	this.guest_age = guest_age;
}
public int getNo_of_members() {
	return no_of_members;
}
public void setNo_of_members(int no_of_members) {
	this.no_of_members = no_of_members;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
public int getNo_of_days_staying() {
	return no_of_days_staying;
}
public void setNo_of_days_staying(int no_of_days_staying) {
	this.no_of_days_staying = no_of_days_staying;
}
@Override
public String toString() {
	return "Hotel [roomid=" + roomid + ", guestname=" + guestname + ", guest_age=" + guest_age + ", no_of_members="
			+ no_of_members + ", cost=" + cost + ", no_of_days_staying=" + no_of_days_staying + "]";
}

}
