package hello;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class sushu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		sushu(5, 100);
//		nianzhnegshu(-1000);
//		add();
		string();
	}

	public static int sushu(int n, int m) {
		int[] map = new int[200];
		int i = 0, k;
		int sum = 0;
		for(int j = 2;;j++)
		{
			for(k = (int) Math.sqrt(j); k>1; k--)
			{
				if( j%k == 0)
					break;
			}
			if(k == 1)
			{
				map[i++] = j;
			}
			if(i == m)
				break;
		}
//		for(int j=0;j<m;j++)
//			System.out.print(map[j]+" ");
		for(int j = n-1; j < m; j++)
			sum += map[j];
		System.out.print(sum);
		return sum;
	}
	
	public static void nianzhnegshu(int number) {
		if(number < 0) 
		{
			System.out.print("fu ");
			number = -number;
		}
		if (number==0)
			System.out.print("ling");
		int i = 0;
		int number01 = number;
		
		while(number01!=0) {
			number01 /= 10;
			i++;
		}
		int count = i;
		while(i != 0)
		{
			if(i != count)
				System.out.print(" ");
			switch((int)(number/Math.pow(10, i-1))) {
				case 0:
					System.out.print("ling");
					break;
				case 1:
					System.out.print("yi");
					break;
				case 2:
					System.out.print("er");
					break;
				case 3:
					System.out.print("san");
					break;
				case 4:
					System.out.print("si");
					break;
				case 5:
					System.out.print("wu");
					break;
				case 6:
					System.out.print("liu");
					break;
				case 7:
					System.out.print("qi");
					break;
				case 8:
					System.out.print("ba");
					break;
				case 9:
					System.out.print("jiu");
					break;
			}
			number = number % 10;
			i--;
		}
	}
	public static void add() {
		Scanner in = new Scanner(System.in);
		TreeMap<Integer, Integer> one = new TreeMap<>(Collections.reverseOrder());
		int a = -1;
		int count = 0;
		while(count <2) {
			a = in.nextInt();
			if(a == 0)
				count++;
			int b = in.nextInt();
			if(one.containsKey(a))
				one.put(a, one.get(a)+b);
			else
				one.put(a, b);
		}
		Iterator<Integer> it = one.keySet().iterator();
        while(it.hasNext()){
            Integer key = it.next();
            if(it.hasNext())
            {
            	if(one.get(key) != 0)
            		System.out.print(one.get(key)+"x"+key+"+");
            }
            	
            else
            {
            	if(one.get(key) != 0)
            		System.out.print(one.get(key)+"x"+key);
            }
            	
        }
	}
	
	public static void string() {
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String[] b = a.split(" ");
		for(int i = 0;i<b.length;i++) 
		{
			if(b[i].length() == 0)
				continue;
			if(i!= b.length-1)
				System.out.print(b[i].length()+" ");
			else
				System.out.print(b[i].length()-1);
		}
	}
}
