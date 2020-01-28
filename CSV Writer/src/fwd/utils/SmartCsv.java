package fwd.utils;

import java.io.FileWriter;
import java.io.IOException;

import fwd.customers.*;

public class SmartCsv {
	
	public String path;
	public String spliter=",";
	public String newLineChar="\n";
	public String os = "OSX";
	
	public SmartCsv(String path) {
		this.path = path;
	}
	
	public SmartCsv(String path,String os) {
		this(path);
		this.os=os;
		if(os.equals("OSX"))
			this.newLineChar="\n";
		else
			this.newLineChar="\r\n";
	}
	
	public SmartCsv(String path,String os,String spliter) {
		this(path,os);
		this.spliter=spliter;
	}	
	
	String getCSVLine(String[] fields)  {
		String answer ="";
		for(int i =0;i<fields.length;i++) {
			if(i>0) 
				answer+=this.spliter;
				answer+=fields[i];
			}
			return answer + this.newLineChar;		
	}
	
	public void write(User[] users) throws IOException {
		FileWriter writer = new FileWriter(this.path);
		writer.append(getCSVLine(User.getFields()));
		for(int i=0 ;i<users.length;i++) 
		writer.append(this.getCSVLine(users[i].getStringValues()));
		writer.flush();
		writer.close();

	}

	
	/*static String getCSVLine(String[] fields) {
		String answer ="";
		for(int i =0;i<fields.length;i++) {
			if(i>0) 
				answer+=",";
				answer+=fields[i];
			}
			return answer + "\n";
	}*/
	

	/*public static void write(User[] users,String path) throws IOException {
		FileWriter writer = new FileWriter(path);
		writer.append(getCSVLine(User.getFields()));
				for(int i=0 ;i<users.length;i++) 
		writer.append(getCSVLine(users[i].getStringValues()));
		writer.flush();
		writer.close();

	}*/
}
