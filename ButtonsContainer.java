import wheels.users.*;

import java.awt.Color;

public class ButtonsContainer {
	private ClickableRoundedRectangle button1, button2, button3, button4, button5;
	private int x, y;
	private Color _color;
	private Rectangle rectangle;
	
	public ButtonsContainer(ColorHolder colorholder) {
		rectangle = new Rectangle();
		rectangle.setSize(375,70);
		rectangle.setLocation(20,20);
	    rectangle.setColor(java.awt.Color.BLACK);
		rectangle.setFillColor(null);
		
		
		button1 = new ClickableRoundedRectangle(25,25, java.awt.Color.red, colorholder);
		
		
		button2 = new ClickableRoundedRectangle(100,25, java.awt.Color.orange, colorholder);
		
		
		button3 = new ClickableRoundedRectangle(175, 25, java.awt.Color.blue, colorholder);
		
		
		button4 = new ClickableRoundedRectangle(250,25, java.awt.Color.MAGENTA, colorholder);
		
		
		button5 = new ClickableRoundedRectangle(325,25, java.awt.Color.GREEN, colorholder);
		
		
	}
}
