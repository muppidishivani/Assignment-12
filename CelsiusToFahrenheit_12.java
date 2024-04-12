package com.web.java;

import java.util.Scanner;

public class CelsiusToFahrenheit_12 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the temperature in celsius");
		int celsius=sc.nextInt();
		int fahrenheit=0;
		if(celsius!=0)
		{
			fahrenheit=celsius*9/5+32;
		}
		System.out.println("The temperature in fahrenheit is="+fahrenheit);
	}
	}
