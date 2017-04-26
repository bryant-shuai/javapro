package com.sxt.calendar;

import java.util.Arrays;
import java.util.Scanner;

// 非递归实现斐波那契数列
public class FeiBo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("需要得到几个斐波那契数？请输入");
		int num = input.nextInt();
		feibo(num);
	}
	
	public static void feibo(int n) {
		int [] arr = new int[n];
		arr[0] = 1;
		if(n > 1) {
			arr[1] = 1;
		}
		
        if (1 == n || 2 == n) {  
//        	System.out.println(1);
            System.out.println(Arrays.toString(arr));            
        } else {
//          int num1 = 1;  
//          int num2 = 1;  
//          int temp = 0;  
          for (int i = 2; i < n; i++) {  
          	arr[i] = arr[i-1] + arr[i-2];
          }  
//        System.out.println(num2);
          System.out.println(Arrays.toString(arr));
        } 
	}

}
