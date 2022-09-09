package Logical_Programs;

import java.util.Scanner;

public class fibonacciSeries {
	public static void main(String[] args) {
		System.out.println("--------------Fibonacci Series-----------------");  
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter Value Number : ");
		int Num= sc.nextInt();
		 int n1=0,n2=1,n3,i;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<Num;++i)
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
		  
		}
	}
	


