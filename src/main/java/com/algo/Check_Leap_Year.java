package com.algo;
import java.util.Scanner;
public class Check_Leap_Year 
{
    public static void main(String args[])
    {
    	Check_Leap_Year ch = new Check_Leap_Year();
    	Scanner s = new Scanner(System.in);
        System.out.print("Enter any year:");
        int year = s.nextInt();		
    	ch.checkLeapYear(year);
    }

	public boolean checkLeapYear(int year) {
		
        boolean flag = false;
        if(year % 4000 == 0)
        {
            flag = false;
        }
        if(year % 400 == 0)
        {
            flag = true;
        }
        else if (year % 100 == 0)
        {
            flag = false;
        }
        else if(year % 4 == 0)
        {
            flag = true;
        }
        else
        {
            flag = false;
        }
        if(flag)
        {
            System.out.println("Year "+year+" is a Leap Year");
        }
        else
        {
            System.out.println("Year "+year+" is not a Leap Year");
        }
		return flag;
	}
}