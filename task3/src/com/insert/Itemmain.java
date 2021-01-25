package com.insert;
import java.sql.SQLException;
import java.util.Scanner;

import com.Bean.LabBean;
import com.insert.ItemInsertion;
import java.util.Scanner;
public class Itemmain {
public static void main(String[] args)throws ClassNotFoundException,SQLException {
	Scanner s =new Scanner(System.in);
	
	ItemInsertion si=new ItemInsertion();
	LabBean sb=new LabBean();
	while(true) {
		System.out.println("\n1.insert into table \n2.display the details \n3.Total cost ");
		int ch = s.nextInt();
	switch(ch) {
	case 1:
		System.out.println("enter id,name,cost");
		int Itemid=s.nextInt();
		String Name=s.next();
		int Cost=s.nextInt();
		
		sb.setItemid(Itemid);
		sb.setName(Name);
		sb.setCost(Cost);
		int i=si.ItemInsert(sb);
		if(i>0)
			System.out.println("Insertion is successfull");
		else
			System.out.println("fail");
		break;
	case 2:
		si.StudentDisplay(sb);
		break;
	case 3:
		int total=si.TotalCost();
		if(total>0) {
			System.out.println("Total can be displayed");
		}
			else {
				System.out.println("Total can't be displayed");
		}
		
	}
	}
	
}
}