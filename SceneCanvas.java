import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class SceneCanvas extends JComponent{
	
	private CityGlare cg;
	private int width, height;
	private Eiffel tower;
	private CityScape front;
	private CityScape highlight;
	private CityScape back;
	
	public SceneCanvas(int w, int h){
		cg = new CityGlare();
		width = w;
		height = h;
		tower = new Eiffel(Color.decode("#f0a65a"), Color.decode("#8e9295"),Color.decode("#f6d0b6"));
		front = new CityScape(Color.decode("#c0341b"));
		highlight = new CityScape(Color.decode("#ffd6ab"));
		back = new CityScape(Color.decode("#ff6347"));
		setPreferredSize(new Dimension(width, height));
	}
	
	@Override
	protected void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		AffineTransform reset = g2d.getTransform();
		
		Color bgColor = Color.decode("#f6d0b6");
		
		RenderingHints rh = new RenderingHints(
			RenderingHints.KEY_ANTIALIASING,
			RenderingHints.VALUE_ANTIALIAS_ON
		);
		g2d.setRenderingHints(rh);
		
		Rectangle2D.Double bg = new Rectangle2D.Double(0, 0, 800, 600);
		g2d.setColor(bgColor);
		g2d.fill(bg);
		g2d.clip(new Rectangle2D.Double(0, 0, width, height));
		g2d.translate(-350, -20);
		back.draw(g2d);
		
		g2d.setTransform(reset);
		g2d.translate(350, -20);
		back.draw(g2d);
		
		g2d.setTransform(reset);

		tower.draw(g2d);
		
		g2d.translate(0, -2);
		highlight.draw(g2d);
		g2d.setTransform(reset);
		front.draw(g2d);
		
		cg.draw(g2d);
	}
	
	public CityGlare getCityGlare(){return cg;}
	
}