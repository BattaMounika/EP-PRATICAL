package com.insert;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.connections.DBUtil;
import com.Bean.LabBean;
public class  ItemInsertion{
	Scanner s = new Scanner(System.in);
   public int ItemInsert(LabBean Products)throws ClassNotFoundException, SQLException
   {
	   Connection con=DBUtil.DBConnection();
	   PreparedStatement ps=con.prepareStatement("insert into ProductInfo values(?,?,?)"); 
	   ps.setInt(1,Products.getItemid());
	   ps.setString(2,Products.getName());
	   ps.setInt(3,Products.getCost());
	   int i = ps.executeUpdate();
	   con.close();
	   return i;
   }
  
   public void StudentDisplay(LabBean Products)throws ClassNotFoundException, SQLException
   {
	   Connection con=DBUtil.DBConnection();
	   PreparedStatement stmt=con.prepareStatement("select * from ProductInfo");  
	   ResultSet rs=stmt.executeQuery();  
	   while(rs.next()){  
	   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
	   }
	   con.close();
	   }
   public int TotalCost() throws  ClassNotFoundException, SQLException
   {
	   Connection con=DBUtil.DBConnection();
	   PreparedStatement ps=con.prepareStatement("select  sum(Cost) from ProductInfo");  
	   ResultSet rs=ps.executeQuery();  
	   while(rs.next()){  
	   System.out.println("Total cost of all items: "+rs.getInt(1)+" Rupees");
	   }
	   int i = ps.executeUpdate();
	   con.close();
	   return i;
	   }
   
}



