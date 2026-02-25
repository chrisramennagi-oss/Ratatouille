import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class Square implements DrawingObject{
	private double x, y, size;
	private Color squareColor;
	
	public Square(double x, double y, double size, Color squareColor){
		this.x = x;
		this.y = y;
		this.size = size;
		this.squareColor = squareColor;
	}
	
	public void draw(Graphics2D g2d){
		Rectangle2D.Double s = new Rectangle2D.Double(x, y, size, size);
		g2d.setColor(squareColor);
		g2d.fill(s);
	}
	
	public void adjustX(double distance){}

}