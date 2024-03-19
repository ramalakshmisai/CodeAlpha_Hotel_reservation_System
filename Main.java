package com.ty;
import java.util.*;
import Exception.*;
import management.*;
public class Main {
    public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation project");
		System.out.println("********************");
		Scanner sc=new Scanner(System.in);
		Hotelmp htl=new HotelImp1();
		while(true)
		{
			System.out.println("\n1.add Guest \n2.payment \n3.DisplayReservedRoom details\n4.dispaly All reserved Room \n5.offers");
			System.out.println("6.remove the guest\n7.Exit");
			System.out.println("Enter the Choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				htl.addGuest();
				break;
			case 2:
				htl.payment();
				break;
			case 3:
				htl.displayreservedRoom();
				break;
			case 4:
				htl.DisplayallReservedRoom();
				break;
			case 5:
				htl.offers();
				break;
			case 6:
				htl.removeGuest();
				break;
			case 7:
				System.out.println("Thank for Visit our Hotel*********");
				break;
				default:
					try
					{
						String message="Invalid Choice, Kindly Enter Valid Choice!";
						throw new InvalidException(message);
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
			}
		}
	}
	}
