import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class Eiffel implements DrawingObject{
	String mode;
	Color highlight;
	Color shadow;
	Color holes;

	public Eiffel(Color highlight, Color shadow, Color holes){
		this.highlight = highlight;
		this.shadow = shadow;
		this.holes = holes;
	}
	public void draw (Graphics2D g2d){
		
		RenderingHints rh = new RenderingHints(
		RenderingHints.KEY_ANTIALIASING,
		RenderingHints.VALUE_ANTIALIAS_ON);
		
		
		g2d.setRenderingHints(rh);
		
		
		
		Path2D.Double towerSide = new Path2D.Double();
		towerSide.moveTo(236.6, 208.4);
		towerSide.curveTo(236.5, 205.5, 245.3, 204.4, 245.3, 207.3);
		towerSide.curveTo(243.0, 342.6, 327.6, 409.7, 327.6, 409.7);
		towerSide.lineTo(304.8, 414.9);
		towerSide.curveTo(304.8, 414.9, 281.7, 373.5, 274.4, 375.5);
		towerSide.curveTo(267.1, 377.5, 283.1, 421.4, 283.1, 421.4);
		towerSide.lineTo(275.2, 426.6);
		towerSide.curveTo(275.2, 426.6, 240.3, 372.2, 236.6, 208.4);
		
		towerSide.closePath();
		g2d.setColor(highlight);
		g2d.fill(towerSide);
		g2d.draw(towerSide);
		
		Path2D.Double topSide = new Path2D.Double();
		topSide.moveTo(249.4,187.5);
		topSide.lineTo(238.6,185.6);
		topSide.lineTo(238.6,208.2);
		topSide.lineTo(248.6,211.7);
		
		topSide.closePath();
		g2d.setColor(highlight);
		g2d.fill(topSide);
		g2d.draw(topSide);
		
		Rectangle2D.Double topTop = new Rectangle2D.Double(232.0, 162.1, 3.0, 23.0);
		g2d.setColor(shadow);
		g2d.fill(topTop);
		g2d.draw(topTop);
		
		Path2D.Double tower = new Path2D.Double();
		tower.moveTo(220.9, 210.0);
		tower.curveTo(229.5, 325.1, 160.6, 408.1, 160.6, 408.1);
		tower.lineTo(191.2, 409.9);
		tower.curveTo(191.2, 409.9, 197.3, 387.2, 217.9, 386.3);
		tower.curveTo(238.5, 385.4, 239.3, 414.4, 239.3, 414.4);
		tower.lineTo(276.0, 428.4);
		tower.curveTo(276.0, 428.4, 239.7, 365.7, 238.1, 209.0);
		tower.curveTo(238.1, 205.9, 220.8, 208.0, 221.0, 209.0);
		
		tower.closePath();
		g2d.setColor(shadow);
		g2d.fill(tower);
		g2d.draw(tower);
		
		Rectangle2D.Double top = new Rectangle2D.Double(217.2, 185.7, 21.6, 24.4);
		g2d.setColor(shadow);
		g2d.fill(top);
		g2d.draw(top);
		
		Path2D.Double hole1 = new Path2D.Double();
		hole1.moveTo( 218.6,328.9);
		hole1.curveTo(213.4,352.4, 203.6,368.1, 203.6,368.1);
		hole1.lineTo(238.2,368.1);
		hole1.lineTo(233.6,328.9);
		
		hole1.closePath();
		g2d.setColor(holes);
		g2d.fill(hole1);
		g2d.draw(hole1);
		
		Path2D.Double hole2 = new Path2D.Double();
		hole2.moveTo( 252.9,324);
		hole2.curveTo(255.5,348.4, 261.5,365.3, 261.5,365.3);
		hole2.lineTo(269.2,358.5);
		hole2.curveTo(269.2,358.5, 263.3,347.3, 252.9,324);
		
		hole2.closePath();
		g2d.setColor(holes);
		g2d.fill(hole2);
		g2d.draw(hole2);
		
	}
	
	public void adjustX(double distance){}
}