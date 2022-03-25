package hello;

import java.util.Scanner;

public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		timeswitch();
	}
	
	public static void timeswitch() {
		Scanner in = new Scanner(System.in);
		int BJT = in.nextInt();
		int BJTm = BJT % 100;
		int BJTh = BJT / 100;
		int UTCh = (BJTh + 24 - 8) % 24;
		System.out.println(UTCh*100 + BJTm);
	}
	
	public static void single() {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String r = "";
		String s = "";
		switch(num / 10) {
			case 1: 
				r = "Unreadable";
				break;
			case 2:
				r = "Barely readable, occasional words distinguishable";
				break;
			case 3: 
				r = "Readable with considerable difficulty";
				break;
			case 4:
				r = "Readable with practically no difficulty";
				break;
			case 5:
				r = "Perfectly readable";
				break;
		}
		
		switch(num % 10) {
			case 1: 
				s = "Faint signals, barely perceptible";
				break;
			case 2:
				s = "Very weak signals";
				break;
			case 3: 
				s = "Weak signals";
				break;
			case 4:
				s = "Fair signals";
				break;
			case 5:
				s = "Fairly good signals";
				break;
			case 6: 
				s = "Good signals";
				break;
			case 7:
				s = "Moderately strong signals";
				break;
			case 8: 
				s = "Strong signals";
				break;
			case 9:
				s = "Extremely strong signals";
				break;
		}	
		System.out.println(s+','+r+'.');
	}

}
