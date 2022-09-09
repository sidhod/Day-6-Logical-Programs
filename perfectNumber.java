package Logical_Programs;

import java.util.Scanner;

public class perfectNumber {

	public static void main(String[] args) {
		System.out.println("--------------Check No Is Perfect or not-----------------"); 
		int sumOfDivisor=0;
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter Value Number : ");
		int Num= sc.nextInt();  
		System.out.print("Positive Divisor: ");
		
		 for(int i=1;i<Num;i++)
		 {    
		  if(Num % i==0) {
		  System.out.print(i+" ");  
		  sumOfDivisor=sumOfDivisor+i;
		  }
		     
		 }  
		 System.out.println("Sum of Postive Divisor of Number: "+sumOfDivisor);
		 if(Num==sumOfDivisor) {
			 System.out.println(Num +"="+sumOfDivisor);
			 System.out.println(Num+" is Perfect Number");
			 
		 }else {
			 System.out.println(Num +"!="+sumOfDivisor);
			 System.out.println(Num+" is not Perfect Number");
			 
		 }
		  
		}
}
