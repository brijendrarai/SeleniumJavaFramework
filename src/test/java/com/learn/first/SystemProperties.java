package com.learn.first;

public class SystemProperties {
	
	public static void main(String[] args) {
		String currentDirectory = System.getProperty("usr.dir");
		System.out.println("CurrentDirectory: "+ currentDirectory);
		
		String osName = System.getProperty("os.name");
		System.out.println("OS Name: "+ osName);
		
		
	}

}
