import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class CityScape{
	private String mode;
	private Color color;
	
	public CityScape(Color color){
		this.color = color;
	}
	
	public void draw (Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		
		RenderingHints rh = new RenderingHints(
		RenderingHints.KEY_ANTIALIASING,
		RenderingHints.VALUE_ANTIALIAS_ON);
		
		g2d.setRenderingHints(rh);
		

	
		Path2D.Double frontBuild = new Path2D.Double();
		frontBuild.moveTo(56.5,417.3);
		frontBuild.lineTo(55.3,398.4);
		frontBuild.lineTo(64.5,391.1);
		frontBuild.lineTo(73.8,398.4);
		frontBuild.lineTo(74.9,407.3);
		frontBuild.lineTo(98.7,406.9);
		frontBuild.lineTo(98.4,395.7);
		frontBuild.lineTo(108.7,387.7);
		frontBuild.lineTo(117.6,395.7);
		frontBuild.lineTo(117.6,415.3);
		frontBuild.lineTo(146.4,414.2);
		
		frontBuild.curveTo(146.4,414.2, 148,396.9, 163.3,396.9);
		frontBuild.curveTo(178.6,396.9, 178.3,414.2, 178.3,414.2);
		
		frontBuild.lineTo(198.3,415);
		frontBuild.lineTo(207.1,402.7);
		frontBuild.lineTo(242.8,402.7);
		frontBuild.lineTo(255.1,415.3);
		frontBuild.lineTo(276.6,413.8);
		frontBuild.lineTo(275.9,399.6);
		
		frontBuild.curveTo(275.9,399.6, 279.7,389.5, 293.2,389.6);
		frontBuild.curveTo(306.6,389.7, 308.5,399.2, 308.5,399.2);
		
		frontBuild.lineTo(309.3,416.5);
		frontBuild.lineTo(315.4,415.3);
		
		frontBuild.curveTo(315.4,415.3, 316.8,403.2, 320.4,399.6);
		frontBuild.curveTo(324.1,396, 334.3,395.4, 334.3,395.4);
		
		frontBuild.lineTo(361.9,395.4);
		
		frontBuild.curveTo(361.9,395.4, 370.9,397, 374.2,400.4);
		frontBuild.curveTo(377.5,403.7, 379.6,414.2, 379.6,414.2);
		
		frontBuild.lineTo(401.9,414.6);
		frontBuild.lineTo(429.6,379.6);
		frontBuild.lineTo(458.4,414.6);
		frontBuild.lineTo(488.7,414);
		frontBuild.lineTo(488.7,399.2);
		
		frontBuild.curveTo(488.7,399.2, 489.9,388.3, 505.2,388.8);
		frontBuild.curveTo(520.5,389.4, 521,400, 521,400);
		
		frontBuild.lineTo(521.2,413.6);
		frontBuild.lineTo(568.3,414.6);
		frontBuild.lineTo(567.1,393.1);
		frontBuild.lineTo(582.9,382.3);
		frontBuild.lineTo(598.2,391.9);
		frontBuild.lineTo(599.8,405);
		frontBuild.lineTo(616.1,405);
		
		frontBuild.curveTo(616.1,405, 625,404.4, 627.8,407.3);
		frontBuild.curveTo(630.6,410.1, 629.7,416.3, 629.7,416.3);
		
		frontBuild.lineTo(651,416.9);
		frontBuild.lineTo(650.8,404.4);
		frontBuild.lineTo(659.6,398.5);
		frontBuild.lineTo(668.9,403.2);
		frontBuild.lineTo(669.4,417.8);
		frontBuild.lineTo(678.2,417.9);
		
		frontBuild.curveTo(678.2,417.9, 684.1,388.7, 690.1,388.7);
		frontBuild.curveTo(696.1,388.7, 705.8,416.8, 705.8,416.8);
		
		frontBuild.lineTo(731.4,416.8);
		
		frontBuild.curveTo(731.4,416.8, 730.5,406.6, 734.6,403.2);
		frontBuild.curveTo(738.8,399.8, 776.4,398.3, 782.4,402.1);
		frontBuild.curveTo(788.4,405.9, 787.9,415.7, 787.9,415.7);
		
		frontBuild.lineTo(800,415.7);
		frontBuild.lineTo(800,458.1);
		
		frontBuild.closePath();
		g2d.setColor(color);
		g2d.fill(frontBuild);
		g2d.draw(frontBuild);
		
		Rectangle2D.Double frontRect = new Rectangle2D.Double(0, 414.2, 800,205.1);
		g2d.fill(frontRect);
		g2d.draw(frontRect);
	}
	

}