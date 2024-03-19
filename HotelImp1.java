package management;
import com.ty.*;

import Exception.GuestDetailNotFound;

import java.util.LinkedHashMap;
import java.util.*;

public class HotelImp1 implements Hotelmp{
 Map<String,Hotel> db=new LinkedHashMap<String,Hotel>();
  Scanner sc=new Scanner(System.in);
	
	@Override
	public void addGuest()
	{
		System.out.println("enter the Guest name");
		String name=sc.next();
		System.out.println(" enter the Guest age");
		int age=sc.nextInt();
		System.out.println(" enter the number of member to stay");
		int no_of_members=sc.nextInt();
		System.out.println("enter the cost of the room");
		double cost=sc.nextDouble();
		System.out.println("enter thr number of days to stay");
		int no_of_days_stayin=sc.nextInt();
		  
		Hotel h=new Hotel(name, age, no_of_members, cost, no_of_days_stayin);
		db.put(h.getRoomid(), h);
		System.out.println("Guest Details are inserted Successfully");
		System.out.println("your room Id is "+h.getRoomid());
		
	}
	@Override
	public void payment() {
		System.out.println("enter the  roomid");
		String roomid=sc.next();
		roomid=roomid.toUpperCase();
		 if(db.containsKey(roomid))
		 {
			 System.out.println("Guest details is present in the Record");
			 System.out.println("your payment is successfully");
		 }
		 else
		 {
			 try {
				 String message="Guest with roomid "+roomid+" is not found and your payment is unsuccesfully";
				 throw new GuestDetailNotFound(message);
			 }
			 catch(Exception e)
			 {
				 System.out.println(e.getMessage());
			 }
		 }
		
	}

	@Override
	public void displayreservedRoom(){
		  System.out.println("Enter the roomid: ");
		  String roomid=sc.next();
		  if(db.containsKey(roomid))
		  {
			  System.out.println("Room is already Reserved");
			  Hotel h=db.get(roomid);
			  System.out.println("Reserved Details");
			  System.out.println("---------------------------------");
			  System.out.println("Roomid: "+h.getRoomid());
			  System.out.println("Guestname: "+h.getGuestname());
			  System.out.println("Guestage: "+h.getGuest_age());
			  System.out.println("no_of_members: "+h.getNo_of_members());
			  System.out.println("cost: "+h.getCost());
			  System.out.println("no_of_days_staying: "+h.getNo_of_members());

		  }
		  else
		  {
				 try {
					 String message="Guest with roomid "+roomid+" is not Reserved ";
					 throw new GuestDetailNotFound(message);
				 }
				 catch(Exception e)
				 {
					 System.out.println(e.getMessage());
				 }
			 }
		
	}

	@Override
	public void DisplayallReservedRoom() {
		if(!db.isEmpty())
		{
			System.out.println("Room Records are as follows: ");
			System.out.println("--------------------");
			Set<String> keys=db.keySet();
			for(String key:keys)
			{
				System.out.println(db.get(key));
			}
		}
		else
		  {
				 try {
					 String message="Reserved Room are record are to display";
					 throw new GuestDetailNotFound(message);
				 }
				 catch(Exception e)
				 {
					 System.out.println(e.getMessage());
				 }
			 }
		
		
	}

	@Override
	public void offers() {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the cost");
		double cost=sc.nextDouble();
		 if(cost>=5000)
		 {
			 System.out.println("luxury room is available for 4 memgers");
		 }
		 else if(cost==4000)
		 {
			 System.out.println("AC room is available for 3 member");
		 }
		 else {
			 System.out.println("the normal rooms is available for 3,4 members");
		 }
		 
	}

	@Override
	public void removeGuest() {
		  
		System.out.println("enter the roomid");
		String roomid=sc.next();
		roomid=roomid.toUpperCase();
		if(db.containsKey(roomid))
		{
			Hotel h=db.get(roomid);
		System.out.println(h);
		db.remove(roomid);
		System.out.println(" Roomid "+roomid+" is remove from the reserved record");
		}
	}

}
