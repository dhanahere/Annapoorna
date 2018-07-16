package com.dhana.Annapoorna.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.dhana.Annapoorna.entity.Login;

@Component
public class LoginDao {
	
	private SessionFactory sessionFactory;

	public void checkLogin(Login login) {
		
		System.out.println("==inside login=="+login);
		
		/*String url="jdbc:mysql://localhost:3306/annapoorna";
		String uName="root";
		String pass="root";
		
		String userName=login.getUsername();
		String password=login.getPassword();*/
		
		//JDBC Connection
		
		/*try
		{				
			//String query="select * from student";
			String query="insert into userRegistration values(?,?,?)";
			Class.forName("com.mysql.jdbc.Driver");		
			Connection con=DriverManager.getConnection(url,uName,pass);
			//Statement st=con.createStatement();
			PreparedStatement st=con.prepareStatement(query);
			st.setInt(1,1);
			st.setString(2, userName);
			st.setString(3, password);
			//ResultSet rs=st.executeQuery(query);
			//while(rs.next())
			//{
				//System.out.println(rs.getInt(1)+"******"+rs.getString(2));
			//}
			int count=st.executeUpdate();
			System.out.println("==rows affected==="+count);
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception e===="+e);
		}*/
		
		//HiberNate
		
		
		Session session=sessionFactory.getCurrentSession();
		session.save(login);
		
	}

}
