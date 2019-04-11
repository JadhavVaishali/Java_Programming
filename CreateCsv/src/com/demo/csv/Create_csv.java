package com.demo.csv;

import java.io.File;
import java.io.PrintWriter;

public class Create_csv {

public static void main(String[] args) {
	 try {
	   PrintWriter pw= new PrintWriter(new File("C://Users//vaish//Desktop//Java_Programming//CSV//user.csv"));
	   StringBuilder sb=new StringBuilder();
	   sb.append("Emp_Id");
	   sb.append(",");
	   sb.append("Emp_FirstName");
	   sb.append(",");
	   sb.append("Emp_LastName");
	   sb.append("\r\n");
	   sb.append("101");
	   sb.append(",");
	   
	   sb.append("X1"); // FIRST RECORD
	   sb.append(",");
	   sb.append("A1");
	   sb.append("\r\n");
	   
	   sb.append("102"); //SECOND RECORD
	   sb.append(",");
	   sb.append("X2");
	   sb.append(",");
	   sb.append("A2");
	   
	   sb.append("\r\n");
	   pw.write(sb.toString());
	   pw.close();
	   System.out.println("CSV file Successfully created");
	   } catch (Exception e) {
		   e.printStackTrace();
	   }
	}
	}
