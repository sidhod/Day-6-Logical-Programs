package Logical_Programs;

import java.util.Scanner;

public class primeNumber {
	public static void main(String args[]){    
		  int i,m=0,flag=0;      
		  System.out.println("--------------Check Number is Prime or Not -----------------"); 
			Scanner sc= new Scanner(System.in); 
			System.out.print("Enter Value Number : ");
			int Num= sc.nextInt();  
		  m=Num/2;      
		  if(Num==0||Num==1){  
		   System.out.println(Num+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(Num%i==0){      
		     System.out.println(Num+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  
		   { System.out.println(Num+" is prime number"); }  
		  }  
		}    

}
