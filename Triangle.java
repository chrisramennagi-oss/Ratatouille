import java.awt.*;
import java.awt.geom.*;

public class Triangle implements DrawingObject {
    
    private double x, y, width, height, angle;
    private Color color;

    public Triangle(double x, double y, double width, double height, double angle, Color color) { 
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        this.angle = angle;
    }

    @Override
    public void draw(Graphics2D g2d) {
        Path2D.Double triangle = new Path2D.Double();
        triangle.moveTo(x, y);
        triangle.lineTo(x, y + height);
        triangle.lineTo(x + width, y + height);
        triangle.closePath();
        g2d.setColor(color);

        AffineTransform reset = g2d.getTransform();

        g2d.rotate(Math.toRadians(angle), (x + x + x + width)/3, (y+ y + height + y + height)/3);
        g2d.fill(triangle);
        g2d.setTransform(reset);
    }
}