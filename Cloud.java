import java.awt.*;
import java.awt.geom.*;

public class Cloud implements DrawingObject{
ArrayList<Circle> glares = new ArrayList<Circle>();
	Color lighter = Color.decode("#FFECD0");
	Color darker = Color.decode("#ffb12b");
	
	public CityGlare(){
		glares.add(new Circle(109, 419, 18.25*2, 0.75f, lighter,true));
		glares.add(new Circle(145.9, 401.5, 29*2, 0.5f, darker, false));
		glares.add(new Circle(205, 417.5, 20.17*2, 0.4f, lighter, false));
		glares.add(new Circle(311.4, 393.1, 18.06*2, 0.3f, lighter, true));
		glares.add(new Circle(395.4, 418.4, 27.28*2, 0.5f, lighter, false));
		glares.add(new Circle(430.2, 394.1, 29*2, 0.75f, darker, true));
		glares.add(new Circle(686.7, 399.9, 28.06*2, 0.6f, darker, false));
	}
	
	public void draw(Graphics2D g2d){
		for(int i = 0; i<glares.size(); i++){
			(glares.get(i)).draw(g2d);
		}
	}
	
	public void adjustX(double distance){}
	
	public void fade(){
		for(int i = 0; i<glares.size(); i++){
			(glares.get(i)).fade();
		}
	}
}
}