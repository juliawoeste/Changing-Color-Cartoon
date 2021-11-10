// Julia Woeste
// Assignment #3
// March 1st
//calls the head and body classes

import wheels.users.*;
import java.awt.Color;
import java.awt.event.MouseEvent; 
public class Cartoon {
	//instance variables of head, body, x and y for the setLocation

	private Head head;
	private Body body; 
	private int x;
	private int y;
	private int dx;
	private int dy;


	public Cartoon(int x, int y, java.awt.Color color, ColorHolder colorholder) {
		//initializes the instance variables with parameters x, y, and color
		this.x = x;
		this.y = y;
		body = new Body(x, y, this, color, colorholder);
		head = new Head(x, y, color, this, colorholder);


	}

	public void setLocation(int x, int y) {
		// uses relative positioning to position the cartoons
		// template for the location of the head and body

		this.x = x;
		this.y = y;
		head.setLocation(x,y);
		body.setLocation(x,y);


	}
	public void setdLocation(int dx, int dy) {
		this.dx = dx;
		this.dy = dy;
	}
	//returns x location
	public int getXLocation() {
		return x;
	}
	//returns y location
	public int getYLocation() {
		return y;
	}
	// returns the body for this class
	public Body getBody() {
		return body;
	}

	public int getdxLocation() {
		return dx;
	}
	public int getdyLocation() {
		return dy;
	}


}
