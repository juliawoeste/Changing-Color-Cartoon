import wheels.users.*;
import java.awt.event.*;
public class DraggableEllipse extends Ellipse{
	private Head _head; 
    private int _previousMouseY;
    private int _previousMouseX;
    private Cartoon _cartoon;
    private ColorHolder colorholder;

public DraggableEllipse(Head head, Cartoon cartoon, ColorHolder colorholder) {
	this.colorholder = colorholder;
	_head = head;
	_cartoon = cartoon;
}
public void mousePressed(MouseEvent e) {
	_previousMouseX = e.getX();
	_previousMouseY = e.getY();
}
public void mouseDragged(MouseEvent e) {
	int dx = e.getX() - _previousMouseX;
	int dy = e.getY() - _previousMouseY;
	
	int newLocationX = _cartoon.getXLocation() + dx;
	int newLocationY = _cartoon.getYLocation() + dy;
	_cartoon.setLocation(newLocationX, newLocationY);
	
	
	_previousMouseX = e.getX();
	_previousMouseY = e.getY();
	

}
	public void mouseClicked(MouseEvent e) {
		this.setColor(colorholder.getColor());
	}

}
