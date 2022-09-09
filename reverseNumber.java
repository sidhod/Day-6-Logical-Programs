package Logical_Programs;

import java.util.Scanner;

public class reverseNumber {
	public static void main(String[] args) {
	System.out.println("--------------Reverse A Number-----------------"); 
	int reverse=0;
	
	Scanner sc= new Scanner(System.in); 
	System.out.print("Enter Value Number : ");
	int Num= sc.nextInt();  
	while(Num != 0)   
	{  
	int remainder = Num % 10;
	
	reverse = reverse * 10 + remainder;  
	Num = Num/10;  
	}  
	System.out.println("The reverse of the given number is: " + reverse);  
	}  
	
	}

