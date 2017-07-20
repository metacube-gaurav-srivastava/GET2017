/**
 *
 * Name 		:	Matrix
 * Author		:	Anushtha Gupta
 * Date			:	2017-07-19
 * References	:	OOP Assignment1 - Exercise 2
 * Description	:	Contain functions to add elements to a matrix ,generate 
 * 					transpose of a matrix,display matrix and multiply matrices 
 * 					 
 */
package Assignment2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Matrix {
	private int row,column;
	private int[][] matrix;
	
	//Default constructor for initializing row,column,matrix
	public Matrix(){
		row=0;
		column=0;
		matrix=new int[row][column];
	}
	
	//Parametrized constructor for initializing row,column values according to user input
	public Matrix(int row,int column){
		if(row<0||column<0){
			throw new IllegalArgumentException();
		}
		this.row=row;
		this.column=column;
		matrix=new int[row][column];
	}
	
	//functions to add elements to the matrix for given object
	/**
	 * @param row		:	row number on which element is to be added
	 * @param column	:	column on which element is to be added 	
	 * @param value		:	data value to be added to the matrix
	 * Description 		:	functions to add elements to the matrix for given object
	 */
	public boolean addElements(int row,int column,int value){
		
		//condition if row and column values are illegal
		if((row<0||row>this.row)||(column<0||column>this.column)){
			throw new IllegalArgumentException();
		}
		else{
			matrix[row][column]=value;
			return true;
		}
	}
	
	
	/**
	 * @return		:	matrix for that object 
	 *Description	:	used to return the matrix 	
	 */
	public int[][] showMatrix(){
		return matrix;
	}
	
	
	/**
	 * @return		:	object containing transpose of the matrix for 
	 * 					object that called this method
	 *Description	:	used to calculate transpose of matrix	

	 */
	public Matrix transposeMatrix(){
		
		//condition when value of row and column is less than zero
		if(row<0||column<0){
			throw new IllegalArgumentException();
		}
		else{
			Matrix temporaryObject= new Matrix(column,row);
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					
					temporaryObject.addElements(j, i, matrix[i][j]);
				}
		}
		return temporaryObject;
	}
	}
	
	/**
	 * @param secondMatrix	:	object containing second matrix argument for multiplication
	 * @return				:	object containing final multiplied matrix
	 * Description 			:	multiply two matrix and return an object containing result 
	 */
	public Matrix multiplyMatrix(Matrix secondMatrix){
		
		//condition when multiplication is not possible
		if(this.column!=secondMatrix.row){
			throw new InputMismatchException();
			
		}
		else{
			Matrix temporaryObject= new Matrix(row,secondMatrix.column);
			for(int i=0;i<this.row;i++){
				for(int j=0;j<secondMatrix.column;j++){
					for(int k=0;k<this.column;k++){
						temporaryObject.matrix[i][j] += matrix[i][k]*secondMatrix.matrix[k][j];
					}
				}
			}
			
			//returning object having mutiplied matrix
			return temporaryObject;
		}
		
	}
	

	
}

