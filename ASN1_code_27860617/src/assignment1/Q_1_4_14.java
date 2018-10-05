package assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Q_1_4_14  {
	
	public static int [] getArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("input the numbers in your array: ");
		String input=sc.nextLine();
		String[] stringArr=input.split(" ");
		final int SIZE=stringArr.length;
		int[] intArr=new int[SIZE];
		
		for(int i=0;i<SIZE;i++) {
			intArr[i] = Integer.parseInt(stringArr[i]);
		}

		sc.close();
		return intArr;
	}
	
private static void fourSum(int[] a, int sum) {
	int N= a.length;
	int cnt=0;
	
    for (int i = 0; i < N; i++) 
        for (int j = i + 1; j < N; j++) 
            for(int k = j + 1; k < N; k++) 
                for (int l = k + 1; l < N; l++) 
                    if (a[i] + a[j] + a[k] + a[l] == sum) 
                        System.out.println("Found values " + a[i] + " " + a[j] + " " + a[k]  + " " + a[l]) ;
                        return;
                    }
             

	
    public static void main(String[] args) {
    	
    	 System.out.println("What sum number do you want: ");
    	 Scanner sum= new Scanner(System.in);
    	 int value= sum.nextInt();
    	 
    	 int[] numbers = getArray();
    	 
    	
        fourSum(numbers,value);
    	
    	}
    


}