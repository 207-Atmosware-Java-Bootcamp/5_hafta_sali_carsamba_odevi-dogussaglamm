package com.dogussaglam;

import java.util.Scanner;

public class ReverseString {
	
	public static String reverseString(String str) {
		
		char[] ch = str.toCharArray();
		
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
		
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			temp += str.charAt(i);
		}
		
		System.out.println();
		
		return temp;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("bir kelime giriniz");
		String kelime = sc.nextLine();
		sc.close();
		System.out.println(reverseString(kelime));
		
	}
	
}
