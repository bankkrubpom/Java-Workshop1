package fwd.customers;

import java.io.FileWriter;
import java.io.IOException;

public class User {
	public User[] customers;
	public String name;
	public String lastname;
	public int age;
	public double salary;
	
	public User(String name,String lastname,int age,double salary) {
		this.name = name;
		this.lastname=lastname;
		this.age=age;
		this.salary=salary;
	}
	
	public static void log(User users) {
			System.out.println(users.name + ","+users.lastname+","+users.age+","+users.salary);
	}
	
	public static void log(User[] users) {
		for(int i=0 ;i<users.length;i++) {
			User.log(users[i]);
		}
	}
	
	public static String[] getFields() {
		String [] fields = {"name","last name","age","salary"};
		return fields;
	}
	public String[] getStringValues() {
		String[] values = {this.name,this.lastname,this.age +"",this.salary+""};
		return values;
	}
	

}
