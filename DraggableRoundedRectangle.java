import wheels.users.*;
import java.awt.event.MouseEvent;

public class DraggableRoundedRectangle extends RoundedRectangle{
	private Body _body; 
	private int _previousMouseY;
	private int _previousMouseX;
	private Cartoon _cartoon;
	
	private ColorHolder colorholder;
	
	public DraggableRoundedRectangle(Body body, Cartoon cartoon, ColorHolder colorholder) {
		this.colorholder = colorholder;
		_body = body;
		_cartoon = cartoon;
	}
	public void mousePressed(MouseEvent e) {
		_previousMouseX = e.getX();
		_previousMouseY = e.getY();
	}
	public void mouseDragged(MouseEvent e) {
		int dx = e.getX() - _previousMouseX + _cartoon.getdxLocation();
		int dy = e.getY() - _previousMouseY + _cartoon.getdyLocation();
		
		_cartoon.setdLocation(dx, dy);
		_previousMouseX = e.getX();
		_previousMouseY = e.getY();
		
		_cartoon.setLocation(_cartoon.getXLocation(), _cartoon.getYLocation());
		
	
	}
	public void mouseClicked (MouseEvent e) {
		this.setColor(colorholder.getColor());
	}

}

