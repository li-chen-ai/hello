package hello;

public class Num492 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(Math.sqrt(5));
	}
	
    public int[] constructRectangle(int area) {
        int a = (int) Math.sqrt(area);
        while(area%a!=0)
        {
        	a++;
        }
        int[] ret = new int[2];
        ret[0] = area/a;
        ret[1] = a;
        return new int[]{3, 4};
    }
}
