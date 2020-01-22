package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Bean.Add_Society_Bean;
import com.DBConnection.DBConnection;

public class Add_Society_Dao_Class implements Add_Society_Dao_Interface{
	
	DBConnection DB=new DBConnection();
	Connection con=DB.GetConnection();
	
	public int insert_society_details(Add_Society_Bean ASB)
	{
		int status = 0;
		
		System.out.println("%%%%%%%%%%%%%%% before insert query  %%%%%%%%%%%%%");
		
	
		
		try {
			
			
			System.out.println("$$$$$$$ inside try  $$$$$$$$$$");
			
			PreparedStatement ps =con.prepareStatement("insert into society_master(society_name,society_email,society_telephone,society_website,society_registration_year,society_office_no,society_registration_no,society_udise_no,society_total_schools,society_number_of_schools,society_contact_person	,society_contact_p_number,society_address)values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			
			ps.setString(1, ASB.getSociety_name());
			ps.setString(2, ASB.getSociety_email());
			ps.setLong(3, ASB.getSociety_telephone());
			ps.setString(4, ASB.getSociety_website());
			ps.setString(5, ASB.getSociety_registration_year());
			ps.setLong(6, ASB.getSociety_office_number());
			ps.setLong(7, ASB.getSociety_registration_number());
			ps.setLong(8,  ASB.getSociety_udise_number());
			ps.setInt(9, ASB.getSociety_total_schools());
			ps.setInt(10, ASB.getSociety_number_of_schools());
			ps.setString(11,ASB.getSociety_contact_person());
			ps.setLong(12, ASB.getSociety_contact_p_number());
			ps.setString(13, ASB.getSociety_address());

			status=ps.executeUpdate();
			System.out.println("******************* "+status);
			
			
		} catch (Exception e) {
			System.out.println("in catch");
		}
	
			return status;
	
	}
	
	public int school_login(Add_Society_Bean ASB) {
		int status = 0;
		
		System.out.println("%%%%%%%%%%%%%%% before insert query  %%%%%%%%%%%%%");
		
	
		
		try {
			
			
			System.out.println("$$$$$$$ inside try  $$$$$$$$$$");
			
			PreparedStatement ps =con.prepareStatement("insert into school_login (	user_id,password,conform_password) values (?,?,?)");
			
			ps.setString(1, ASB.getSchool_userid());
			ps.setString(2, ASB.getSchool_password());
			ps.setString(3, ASB.getSchool_c_password());
			


			status=ps.executeUpdate();
			System.out.println("******************* "+status);
			
			
		} catch (Exception e) {
			System.out.println("in catch");
		}
	
			return status;
	
	}
		
	}
	

