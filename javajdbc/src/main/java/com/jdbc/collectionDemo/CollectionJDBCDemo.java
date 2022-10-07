package com.jdbc.collectionDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CollectionJDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:mysql://localhost/switchcrud", "root", "root");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Press 1 for Add Details");
			System.out.println("Press 2 for search");
			System.out.println("Press 3 for delete");
			System.out.println("Press 4 for display data");
			System.out.println("Press 5 for update");
			System.out.println("enter your choice");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:

				System.out.println("**********************insert************");
				List<college> li = new ArrayList<college>();
				li.add(new college(80, "nhmj", "pune", "mhbmjh"));
				li.add(new college(90, "nkk", "nane", "j"));
				PreparedStatement stmt = conn.prepareStatement("insert into college values(?,?,?,?)");
				System.out.println("record inserted succesfully");
				for(Iterator<college>iterator=li.iterator();iterator.hasNext();) {
					college c=(college)iterator.next();
					stmt.setInt(1,c.getCid());
					stmt.setString(2,c.getCname());

					stmt.setString(3, c.getCcity());
					stmt.setString(4, c.getCcourse());
					stmt.addBatch();
				}
				int []a=stmt.executeBatch();
				System.out.println(Arrays.toString(a));
                break;
			case 2:
				System.out.println("Enter stud id");
				int cid=sc.nextInt();
				System.out.println("Enter stud name");
				String cname=sc.next();
				System.out.println("Enter stud city");
				String ccity=sc.next();
				System.out.println("Enter stud course");
				String ccourse=sc.next();
				college c=new college();
				c.setCid(cid);
				
				
			}
		}

	}

}
