package fwd.main;
import fwd.utils.*;
import java.io.Writer;

//import fwd.users.Customer;
import fwd.customers.*;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "D:\\DATA\\bankcsv.csv";
		FileWriter writer = new FileWriter(path);
		writer.append("Hi");
		writer.append(" Jack");
		writer.append("\r\nthis is new line");
		writer.flush();
		writer.close();		
	
		User[] customers = {
				new User("Visut","Khun",20,1400000),
				new User("Prin","Song",299,15000),
				new User("Papa","Mama",50,99000)
		};
		
		SmartCsv csv = new SmartCsv(path,"Windows","|");
		csv.write(customers);
		SmartCsv csv2 = new SmartCsv("D:\\\\DATA\\\\bankcsv2.csv");
		csv2.write(customers);
		User.log(customers);
		
		/*User a = new User("Visut","Khun",20) ;//new initial first
		User b = new User("Prin","Song",30) ;
		User c = new User("Papa","Mama",60) ;
		User[] customers = {a,b,c};*/
		
		/*User.getFields();
		SmartCsv.write(customers, path);
		User.log(customers);*/
	}

}
