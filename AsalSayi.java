package com.dogussaglam;

import java.util.Scanner;

public class AsalSayi {
	
	// method tanımlama
	private static boolean asalSayi(int asal) {
		
		// her sayı 1 e bölündüğü için 2 den başlattık
		// en küçük bölen 2 olduğu için 2 ye böldürüp bir bir arttırdık
		
		for (int i = 2; i <= asal / 2; i++) {
			// bölümünden kalan sıfırsa sayı asal değildir
			if (asal % i == 0) {
				
				return false;
			}
		}
		// herhangi bir sayıya tam bölünmediyse true dönüyor
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sayi3 = sc.nextInt();
		if (asalSayi(sayi3)) {
			System.out.println(sayi3 + ": sayisi asaldir");
		} else {
			System.out.println(sayi3 + ": sayisi asal degildir");
		}
	}
}