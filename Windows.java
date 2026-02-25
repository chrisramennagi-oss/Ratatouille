import java.awt.*;
import java.awt.geom.*;

public class Windows implements DrawingObject{
	private ArrayList<DrawingObject> windows = new ArrayList<DrawingObject>();
	private Color color;
	
	public Windows(Color color){
		this.color = color;
		windows.add(new Rectangle(62.23, 417.3, 12.3, 7.3, 0, color));
		windows.add(new Rectangle(77.61, 417.3, 12.3, 7.3, 0, color));
		windows.add(new Rectangle(91.08, 417.3, 12.3, 7.3, 0, color));
		windows.add(new Square(122.6, 425.7, 12.68, color));
		windows.add(new Square(138.7, 425.7, 12.68, color));
		windows.add(new Rectangle(304, 418.1, 24.59, 12.68, 0, color));
		windows.add(new Rectangle(304.3, 434.2, 12.5, 4.9, 0, color));
		windows.add(new Rectangle(216, 421, 12.5, 10.6, 0, color));
		windows.add(new Rectangle(232.1, 421.2, 11.14, 10.87, 0, color));
		windows.add(new Rectangle(246.2, 421.2, 11.41, 10.6, 0, color));
		windows.add(new Rectangle(739.6, 410.9, 29.61, 29.34, 0, color));
		windows.add(new Rectangle(759.7, 410.1, 22.28, 17.66, 0, color));
		windows.add(new Rectangle(688.2, 423.4, 29.34, 10.6, 0, color));
		windows.add(new Square(213.6, 423.5, 13.83, color));
		windows.add(new Square(230.9, 423.5, 13.83, color));
		windows.add(new Square(248.5, 423.5, 13.83, color));
		windows.add(new Circle(109, 419, 18.25*2, 0.75f, lighter,true));
		windows.add(new Triangle((x, y, width, height, angle, color));
		windows.add()
	}
	public void draw(Graphics2D g2d){
		
	}
	public void adjustX(double distance){}
}