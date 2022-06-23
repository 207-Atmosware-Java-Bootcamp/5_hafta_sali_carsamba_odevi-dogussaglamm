package com.dogussaglam;

import java.util.Scanner;

public class Faktoriyel {
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen Bir Sayi Giriniz : ");
		int faktoriyel = klavye.nextInt();
		long res = 1L;
		for (int i = faktoriyel; i > 0; i--) {
			res = res * i;
		}
		System.out.println(faktoriyel + "! = " + res);
		
	}
}
