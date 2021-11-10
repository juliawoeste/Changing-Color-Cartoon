//Julia Woeste
//Assignment 3
//March 1st
//the class MyApp calls the Cartoon class


import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import wheels.users.*;
public class MyApp extends Frame {
	//instance variables

	private Cartoon cartoon, cartoon2;
	private ButtonsContainer _buttonscontainer;
	
	//conversation bubble was changed to ClickableBubble so the conversation bubble will be able to access mouse clicked

	public MyApp() {
		//initializes the instance variables
		ColorHolder colorholder = new ColorHolder();
		cartoon2 = new Cartoon(400, 250, Color.GRAY, colorholder);
		cartoon = new Cartoon(200,250,Color.GRAY, colorholder);
	    _buttonscontainer = new ButtonsContainer(colorholder);

	}
	//main method program
	public static void main(String[] args) {
		new MyApp();
		
//		_dp.addMouseMotionListener(new MouseMotionAdapter() {
//	        @Override
//	        public void mouseMoved(MouseEvent e) {
//	            System.out.println(e.getX() + ", " + e.getY());
//	        }
//		});
	}
}
