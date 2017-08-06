package com;

import java.util.Scanner;

public class Algorithms {
	
	
	public static void main(String[] args) {
	   System.out.println("1 - Find majority element in array:Given an array of size n, find the element which occurs more than n/2 times.\n");
	   System.out.println("Enter the algo number to be executed");
		  
	   
	   Scanner sc=new Scanner(System.in);
	   
	   Algorithms algo=new Algorithms();
	   int i=sc.nextInt();
	   switch(i){
	   case 1:
	       System.out.println("Enter the array size");
	       int arraySize=sc.nextInt();
		   int[] arr=new int[arraySize];
		   for(int j=0;j<arraySize;j++){
			   int tElement=sc.nextInt();
	    	   arr[j]=tElement;
	       }
	       
	       algo.findMajorityElementInarray(arr);
	       
	       
	       break;
		   
	   
	   }
	}
	
	/**
	 * Given an array of size n, find the element which occurs more than n/2 times.
	 * 
	 */
	public void findMajorityElementInarray(int[] arr){
		
		if(arr==null ||arr.length<0){
			System.out.println("Invalid input");
			
		}
		int currenElement=0;
		int counter=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (counter == 0) {
				currenElement = arr[i];
				counter++;
				continue;
			} else if (currenElement == arr[i]) {
				counter++;

			} else {

				counter--;
			}

		}
		
		if(counter>0){
			//check if the element is the majority element
			int majorityElementCount=0;
			for (int i = 0; i < arr.length; i++) {
			     if(arr[i]==currenElement){
			    	 majorityElementCount++;
			    	 
			     }
			}
			 
			if(majorityElementCount>arr.length/2)
			{
				System.out.println("Majority element-"+currenElement+" occurs -"+majorityElementCount+" times in the array");
			}else{
				System.out.println("NO Majority element found");
			}
		}
	}
	

}
