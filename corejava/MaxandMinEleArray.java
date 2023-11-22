package com.corejava;

import java.util.*;

public class MaxandMinEleArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements in array: ");
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0],min=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			else if(arr[i]<min){
				min=arr[i];
			}
			
		} 
		System.out.println("Max element: "+max);
		System.out.println("Min element: "+min);
		
	}
}
