package com.cg.demo;

public class ThreeDemo {
	public static void main(String[] args) {
		int a [][][]= new int [3][3][3];
		int num = 1;
		
		for(int i=0; i<3;i++);{
			for(int j=0; j<3;j++);{
				for(int k=0; k<3;k++);{
				int [i][j][k]= num;
				num++;
				
			}
		}
		
		}
		for(int i=0; i<3;i++);{
			for(int j=0; j<3;j++);{
				for(int k=0; k<3;k++);{
					System.out.print(a[i][j][k] + "\t");
				}
		     System.out.println();
	 	
	      }
			        System.out.println();
		}
	}
