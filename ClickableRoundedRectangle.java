import wheels.users.*;
import java.awt.Color;
import java.awt.event.MouseEvent;

public class ClickableRoundedRectangle extends RoundedRectangle{
	private Color _color;
	private int x, y;
	private ColorHolder colorholder;
	
	
	
	public ClickableRoundedRectangle(int x, int y, Color color, ColorHolder colorholder) {
		super(color);
		this.setLocation(x, y);
		this.colorholder = colorholder;
		_color = color;
		// TODO Auto-generated constructor stub
	}
	
	
	public void mouseClicked(MouseEvent e) {
		colorholder.setColor(_color);
		
		
	}

	}


