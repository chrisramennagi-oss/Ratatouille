import java.awt.*;
import java.awt.geom.*;

public class Rectangle implements DrawingObject {

    private double x, y, width, height, angle;
    private Color color;

    public Rectangle(double x, double y, double width, double height, double angle, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.angle = angle;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g2d) {
        Rectangle2D.Double rectangle = new Rectangle2D.Double(x, y, width, height);
        g2d.setColor(color);

        AffineTransform reset = g2d.getTransform();

        g2d.rotate(Math.toRadians(angle), x + width/2, y + height/2);
        g2d.fill(rectangle);
        g2d.setTransform(reset);
    }
}