package p1;

import java.util.Scanner;

public class AdditionMatrix {
	 



	 	public static void main(String[] args) {
	 		int a[][],b[][],c[][],r1,c1,r2,c2;
	 		
	 		Scanner sc  = new Scanner(System.in);
	 		System.out.println("Enter rows and colmns of first matrix");
	 		r1=sc.nextInt();
	 		c1=sc.nextInt();
	 		System.out.println("Enter rows and colmns of second  matrix");
	 		r2=sc.nextInt();
	 		c2=sc.nextInt();
	 		
	 		if(r1==r2 && c1==c2) {
	 			a=new int[r1][c1];
	 			b=new int[r2][c2];
	 			
	 			c=new int[r1][c1];
	 			//First Matrix
	 			System.out.println("Enter the elements of first Matrix "+r1+"x"+c1);
	 			
	 			for(int i=0;i<r1;i++) {
	 				for(int j=0;j<c1;j++) {
	 					a[i][j]=sc.nextInt();
	 					
	 				}
	 			}
	 			
	 			//Second Matrix
	 			System.out.println("Enter the elements of first Matrix "+r2+"x"+c2);
	 			
	 			for(int i=0;i<r2;i++) {
	 				for(int j=0;j<c2;j++) {
	 					b[i][j]=sc.nextInt();
	 					
	 				}
	 			}
	 			
	 //Display matrix
	 			System.out.println("Addition of two matrices");
	 			
	 			for(int i=0;i<r2;i++) {
	 				for(int j=0;j<c2;j++) {
	 					System.out.print(c[i][j]+" ");
	 					
	 				}
	 				System.out.println();
	 			}
	 			
	 	    }//if
	 		else {
	 			System.out.println("Matrix addition is not possible");
	 		}
	 	}

	 }


