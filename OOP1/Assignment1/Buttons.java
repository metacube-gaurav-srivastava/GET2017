/*
 * Button class to set width height of the buttons to be placed on grid
 */

package Assignment1;

import java.awt.Button;

public class Buttons extends Button{
	protected int height, width;
	
	/*
	 * default constructor to set height and width of the buttons
	 */
	public Buttons() {
		height =100;
		width = 100;
	}
	
	/**
	 * Define height and width of what a button should have
	 * */
	public Buttons(int height,int width){
		this.height = height;
		this.width = width;
	}
	
	/**
	 * set Button position onto screen
	 * */
	public void setButton(int position) {
		
	}
	
	/**
	 * whether button is available or not
	 * */
	public void enableButton() {
		
	}
	
	/** find operator label on button
	 * */
	public void getLabelOnButton() {
		
	}
	
}
