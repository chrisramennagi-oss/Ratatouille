import java.awt.*;
import java.awt.geom.*;

public class Stove implements DrawingObject {

    private double x, y, width, height, scaleX, scaleY;
    private Color tableTopColor, tableSideColor, burnerColor;
    private float brightness;

    public Stove(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        tableTopColor = Color.decode("#3d4450");
        tableSideColor = Color.decode("#313640");
        burnerColor = Color.decode("#a9acbf");
        scaleX = width/440;
        scaleY = height/140;
        brightness = 1f;
    }

    @Override
    public void draw(Graphics2D g2d) {

        Rectangle2D.Double tableSide = new Rectangle2D.Double(x, y, width, 60*scaleY);
        g2d.setColor(tableSideColor);
        g2d.fill(tableSide);
        Trapezoid tableTop = new Trapezoid(x, y, 320*scaleX, width, 50*scaleY, tableTopColor);
        tableTop.draw(g2d);
        Ellipse2D.Double burner1 = new Ellipse2D.Double(x + 240*scaleX, y - 40*scaleY, 125*scaleX, 25*scaleY);
        g2d.setColor(burnerColor);
        g2d.fill(burner1);
        Ellipse2D.Double burner2 = new Ellipse2D.Double(x+ 70*scaleX, y - 40*scaleY, 125*scaleX, 25*scaleY);
        g2d.setColor(burnerColor);
        g2d.fill(burner2);

        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1- brightness));
        g2d.setColor(Color.BLACK);
        Rectangle2D.Double tableSideFilter = new Rectangle2D.Double(x, y, width, 60*scaleY);
        g2d.fill(tableSideFilter);
        Trapezoid tableTopFilter = new Trapezoid(x, y, 320*scaleX, width, 50*scaleY, Color.BLACK);
        tableTopFilter.draw(g2d);
        Ellipse2D.Double burner1Filter = new Ellipse2D.Double(x + 240*scaleX, y - 40*scaleY, 125*scaleX, 25*scaleY);
        g2d.fill(burner1Filter);
        Ellipse2D.Double burner2Filter = new Ellipse2D.Double(x+ 70*scaleX, y - 40*scaleY, 125*scaleX, 25*scaleY);
        g2d.fill(burner2Filter);
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));
    }

    public void update(float dayCounter) {
        brightness = Math.max(dayCounter,0.6f);
    }

    public double getBurner1CenterY() {
        return y - 40*scaleY + (25*scaleY)/2;
    }

    public double getBurner1CenterX() {
        return x + 240*scaleX + (125*scaleX)/2;
    }
}      

