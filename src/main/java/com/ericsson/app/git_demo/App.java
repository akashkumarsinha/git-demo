package com.ericsson.app.git_demo;

/**
 * Hello world!
 *
 */
public class App {
	public void addData(String data) {
		System.out.println("data : " + data);
		if(data.equals("Java Techie")) {
			System.out.println("welcome");
		}
		else
			System.out.println("BYE-BYE");
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
