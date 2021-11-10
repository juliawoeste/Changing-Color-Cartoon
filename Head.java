//Julia Woeste
//Assignment 3
//March 1st
import java.awt.Color;
import java.awt.event.MouseEvent;

import wheels.users.*;

public class Head {
	//instance variables for head, eyes, lips and location

	private Ellipse head;
	private Ellipse eye, eye2;
	private Rectangle lips;
	private int x, y; 
	private Cartoon _cartoon;
	private ColorHolder colorholder;

	public Head(int x, int y, Color color, Cartoon cartoon, ColorHolder colorholder) {
		// initializes the instance variables
		this.colorholder = colorholder;
		_cartoon = cartoon;

		head = new DraggableEllipse(this, _cartoon, colorholder);
		//sets size of the head
		head.setSize(100,100); 
		//set color of head
		head.setColor(Color.CYAN);


		//initializes the instance variables

		eye = new DraggableEllipse(this, _cartoon, colorholder);
		eye2 = new DraggableEllipse(this, _cartoon, colorholder);
		//set size for both eyes
		eye.setSize(10,10);
		eye2.setSize(10,10);
		//sets color of the eyes
		eye.setColor(Color.BLUE);
		eye2.setColor(Color.BLUE);


		//initializes the instance variables
		lips = new Rectangle();
		//sets size
		lips.setSize(20,7);
		//sets color of lips
		lips.setColor(Color.BLACK);


		// calls set location method
		setLocation(x,y);

	}
	public void setLocation(int x, int y) {
		//uses relative positioning for the cartoon, x and y are parameters, x and y are cartoon class
		head.setLocation(x + 0, y - 100);
		// relative positioning for eyes and lips from head position 
		eye.setLocation(x + 20,y - 60);
		eye2.setLocation(x + 70, y - 60);
		lips.setLocation(x + 40, y - 35);
	}
	public int getXLocation() {
		return x;
	}
	public int getYLocation() {
		return y;
	}
	
	public void mouseClicked(MouseEvent e) {
		head.setColor(colorholder.getColor());
	}

}

