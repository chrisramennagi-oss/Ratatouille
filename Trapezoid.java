import java.awt.*;
import java.awt.geom.*;

public class Trapezoid implements DrawingObject {
    
    private double x, y, base1, base2, height;
    private Color color;
    
    public Trapezoid(double x, double y, double base1, double base2, double height, Color color) {
        this.x = x;
        this.y = y;
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.color = color;
    } 

    @Override
    public void draw(Graphics2D g2d) {
        double xPoints[] = {x, x + (base2 - base1)/2, x + base1 + (base2 - base1)/2, x + base2};
        double yPoints[] = {y, y - height, y - height, y};
        double nPoints = 4;
        
        Path2D.Double polygon = new Path2D.Double();
        polygon.moveTo(xPoints[0], yPoints[0]);

        for (int i = 1; i <= nPoints - 1; i++) {
            polygon.lineTo(xPoints[i], yPoints[i]);
        }
        polygon.closePath();
        g2d.setColor(color);
        g2d.fill(polygon);
    }


}