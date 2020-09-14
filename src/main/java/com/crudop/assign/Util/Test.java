package com.crudop.assign.Util;

import com.crudop.assign.Laptop.Laptop;
import com.crudop.assign.dao.HqlLapDAO;
import com.crudop.assign.dao.LaptopDAO;

public class Test {

	public static void main(String[] args)
	{
		/*Laptop lapy=new Laptop();
		lapy.setName("ASUS");
		lapy.setModel("X541UA");
		lapy.setSpecifications("8gb RAM,4gbRom,TouchScreen");
		lapy.setPrice(85000.00D);
		lapy.setUserrating(4.4D);*/
		
		
		LaptopDAO dao=new LaptopDAO();
		Laptop lapydetails1=dao.getLaptopDetailsBYID(1L);
		Laptop lapydetails2=dao.getLaptopDetailsBYID(1L);
		System.out.println(lapydetails1);
		System.out.println(lapydetails2);
		/*HqlLapDAO dao=new HqlLapDAO();
		dao.deleteBYID(4L);*/
	}

}
