package com.dogussaglam;

import java.util.Scanner;

public class VizeFinal {
	
	public static void main(String[] args) {
		
		// kullanıcıdan alınan vize ve final notuna göre geçme(ortalama)
		// eğer kullanıcı 0(sıfır) bir değer girerse sistemden atsın bunun haricinde
		// sürekli vize final sorsun
		// Sınav geçme AA BA BB
		// not ortalaması: ortalama<50 altında ise kaldı FF
		// not ortalaması: ortalama==50 Geçti
		// not ortalaması: 55<=x<=69 BB
		// not ortalaması: 70<=x<=84 BA
		// not ortalaması: 85<=x<=100 AA
		// Vize:40% Final:60%
		// Dikkat: Consolda virgül kullanmalısın.
		
		Scanner klavye = new Scanner(System.in);
		int not1, not2;
		
		System.out.println("vize notunu giriniz");
		not1 = klavye.nextInt();
		if (not1 == 0)
			
			System.out.println("final notunu giriniz");
		not2 = klavye.nextInt();
		
		double ort = (not1 * 0.4 + not2 * 0.6);
		
		if (ort < 50)
			System.out.println("Kaldi");
		else if (ort == 50)
			System.out.println("Gecti");
		else if (ort >= 51 && ort <= 70)
			System.out.println("BB");
		else if (ort >= 71 && ort <= 84)
			System.out.println("BA");
		else if (ort >= 85 && ort <= 100)
			System.out.println("AA");
		else
			System.out.println("Gecersiz");
		
	}
}
