import java.awt.*;

public class StoveSlider implements DrawingObject {

    private double x, y, width, height, scaleX, scaleY;
    private Color yellow, orange, red, barOutlineColor, barColor;

    public StoveSlider(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        yellow = Color.decode("#fcde0d");
        orange = Color.decode("#ff8518");
        red = Color.decode("#ff1a21");
        barOutlineColor = Color.decode("#dedede");
        barColor = Color.decode("#605e61");

        scaleX = width/60;
        scaleY = height/26;
    }

    @Override
    public void draw(Graphics2D g2d) {

        Triangle high = new Triangle(x, y, width, height, 0, red);
        high.draw(g2d);
        Triangle medium = new Triangle(x + 20*scaleX, y + 8.6*scaleY, 40*scaleX, 17.4*scaleY, 0, orange);
        medium.draw(g2d);
        Triangle low = new Triangle(x + 40*scaleX, y + 17.3*scaleY, 20*scaleX, 8.7*scaleY, 0, yellow);
        low.draw(g2d);

        Line barOutline = new Line(x, y + height + 0.25*height, x + width, y + height + 0.25*height, 8, barOutlineColor);
        barOutline.draw(g2d);
        Line bar = new Line(x, y + height + 0.25*height, x + width, y + height + 0.25*height, 4, barColor);
        bar.draw(g2d);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}