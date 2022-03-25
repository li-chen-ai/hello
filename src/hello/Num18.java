package hello;

public class Num18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=1160;i++) {
			if(i>=1&&i<10) {
				System.out.print("00000");
				System.out.println(i);
			}
			if(i>=10&&i<100) {
				System.out.print("0000");
				System.out.println(i);
			}
			if(i>=100&&i<1000) {
				System.out.print("000");
				System.out.println(i);
			}
			if(i>=1000){
				System.out.print("00");
				System.out.println(i);
			}	
		}
	}

}
