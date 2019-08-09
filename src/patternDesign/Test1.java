package patternDesign;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;

import procedure.calling.example.MySqlConnection;

public class Test1 {
	
	

	public static void main(String[] args) {
		
		ShakillaAddress address = new ShakillaAddress();
		
		ArrayList<ShakillaAddress> list = new ArrayList<ShakillaAddress>();
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		try{
			
			con= MySqlConnection.getConnection();
			stmt =con.prepareStatement("select address_id,address,district,city_id,postal_code,phone from sakila.address where address_id between 1 and 4");
			rs=stmt.executeQuery();
			
			while(rs.next())
			{
				
				address.setAddress_id(rs.getString(1));
				address.setAddress(rs.getString(2));
				address.setDistrict(rs.getString(3));
				address.setCity_id(rs.getString(4));
				address.setPostal_code(rs.getString(5));
				address.setPhone(rs.getString(6));
				
				
			}
			list.add(address);
			System.out.println(address.getAddress());
//			Iterator itr = list.iterator();
//			
//			while(itr.hasNext())
//			{
//				System.out.println(itr.next());
//			}
//			
			
			for(ShakillaAddress s:list)
			{
				System.out.println(s);
			}
			
			}catch(Exception e)
			{
					e.printStackTrace();
			}
		
				
			}
	
	}
