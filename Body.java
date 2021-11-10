//Julia Woeste
//Assignment 3
//March 1st

import java.awt.Color;
import java.awt.event.MouseEvent;

import wheels.users.*;
public class Body {
	//instance variables
	private DraggableRoundedRectangle body;
	private Rectangle leg, leg1;
	private int x, y;
	private Cartoon _cartoon;
	private ColorHolder colorholder;


	public Body(int x, int y, Cartoon cartoon, Color color, ColorHolder colorholder) {
		//initializes the instance variables
		this.colorholder = colorholder;
		_cartoon = cartoon;
		body = new DraggableRoundedRectangle(this, _cartoon, colorholder);
		//set size
		body.setSize(100,200);
		//set color of the body
		body.setColor(Color.GRAY);

		


		//initializes the instance variables
		leg = new Rectangle();
		//sets size
		leg.setSize(10,75);
		//set color of one of the legs
		leg.setColor(Color.LIGHT_GRAY);




		//initializes the instance variables
		leg1 = new Rectangle();
		//sets size
		leg1.setSize(10,75);
		//set color of the second leg
		leg1.setColor(Color.LIGHT_GRAY);



// calls the set color and set location method form below 
		setLocation(x,y);
		//setColor(color);


	}



	public void setLocation(int x, int y) {
		//setting the location 
		body.setLocation(x + _cartoon.getdxLocation() ,y + _cartoon.getdyLocation());
		//relative location from body 
		leg.setLocation(x + 60, y + 200);
		leg1.setLocation(x + 35,y + 200);

	}



	public int getXLocation() {
		
		return x;
	}



	public int getYLocation() {
		
		return y;
	}
	
	//public void mouseClicked(MouseEvent e) {
		//body.setColor();
	//}

	public void setColor(Color color) {
		body.setColor(color);
	}

	public void mouseClicked(MouseEvent e) {
		body.setColor(colorholder.getColor());
	}
}
