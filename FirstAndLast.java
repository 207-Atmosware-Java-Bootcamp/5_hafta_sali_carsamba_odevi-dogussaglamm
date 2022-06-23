package com.dogussaglam;

import java.util.Scanner;

public class FirstAndLast {
	
	public static String firstLast(String str) {
		char[] ch = str.toCharArray();
		String temp = "";
		
		for (int i = 1; i < str.length() - 1; i++) {
			ch[i] = '*';
		}
		System.out.println();
		for (int i = 0; i < str.length(); i++) {
			
			if (i == 0 || i == str.length() - 1) {
				temp += str.charAt(i);
				
			} else {
				temp += '*';
			}
			
		}
		
		return String.valueOf(ch);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("cümlenizi yazınız");
		String word = sc.nextLine();
		System.out.println(firstLast(word));
		
	}
	
}
