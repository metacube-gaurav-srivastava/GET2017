/*
 * This is the class having main method which is used to call matrix class functions 
 */
package Assignment2;

import java.util.Scanner;

public class MatrixMain {
	
	/**
	 * @param row		:	row number
	 * @param column	:	column number
	 * @param result	:	matrix to be printed
	 * Description		:	used to print given input matrix
	 */
	public static void printMatrix(int row,int column,int[][] result){
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	/**
	 * @param row			:	row number
	 * @param column		:	column number
	 * @param matrixObject	:	matrix in which values are to be inserted
	 * Description			:	used to take values from console
	 */
	public static void inputValue(int row,int column,Matrix matrixObject){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter elements row by row");
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				matrixObject.addElements(i, j, input.nextInt());
			}
		}
	}
	
	
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
				//to add number to a matrix
				System.out.println("enter number of rows and columns in a matrix");
				int row=input.nextInt();
				int column=input.nextInt();
				Matrix matrixObject=new Matrix(row,column);
				inputValue(row,column,matrixObject);
				
				//printing elements after addition of elements
				int[][] result=new int[row][column];
				System.out.println("Matrix after elements addition is:");
				result=matrixObject.showMatrix();
				printMatrix(row,column,result);
				
				//to calculate transpose of a matrix
				int[][] result1=new int[column][row];
				Matrix matrixObject2 =new Matrix(column,row);
				matrixObject2=matrixObject.transposeMatrix();
				System.out.println("Matrix after elements transposition is:");
				result1=matrixObject2.showMatrix();
				printMatrix(column,row,result1);
				
				//For multiplication of two matrix
				System.out.print("For Matrix Multiplication : ");
				System.out.print("enter number of rows and columns in second matrix");
				int row2=input.nextInt();
				int column2=input.nextInt();
				int[][] result2=new int[row][column2];
				Matrix matrixObject4=new Matrix(row,column2);
				Matrix matrixObject3=new Matrix(row2,column2);
				
				//function to input values in matrix which is present in object
				inputValue(row2,column2,matrixObject3);
				matrixObject4=matrixObject.multiplyMatrix(matrixObject3);
				result2=matrixObject4.showMatrix();
				printMatrix(row,column2,result2);
	}

}
