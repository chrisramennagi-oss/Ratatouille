import java.awt.*;
import java.awt.geom.*;

public class Line implements DrawingObject {
    
    private double x1, y1, x2, y2;
    private float thickness;
    private Color color;

    public Line(double x1, double y1, double x2, double y2, float thickness, Color color) {
        this.x1 = x1;
        this.y1 = y1;

        this.x2 = x2;
        this.y2 = y2;
        
        this.thickness = thickness;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g2d) {
        Path2D.Double line = new Path2D.Double();
        line.moveTo(x1, y1);
        line.lineTo(x2, y2);
        
        g2d.setStroke(new BasicStroke(thickness));
        g2d.setColor(color);
        g2d.draw(line);
    }
}