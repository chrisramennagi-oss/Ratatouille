import java.awt.*;

public class StoveSlider implements DrawingObject {

    private double x, y, width, height;

    public StoveSlider(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics2D g2d) {
        Color yellow = Color.decode("#fcde0d");
        Color orange = Color.decode("#ff8518");
        Color red = Color.decode("#ff1a21");
        Color barOutlineColor = Color.decode("#dedede");
        Color barColor = Color.decode("#605e61");

        Triangle high = new Triangle(x, y, width, height, 0, red);
        high.draw(g2d);
        Triangle medium = new Triangle(x + 20*width/60, y + 8.6*height/26, 40*width/60, 17.4*height/26, 0, orange);
        medium.draw(g2d);
        Triangle low = new Triangle(x + 40*width/60, y + 17.3*height/26, 20*width/60, 8.7*height/26, 0, yellow);
        low.draw(g2d);

        Line barOutline = new Line(x, y + height + 0.25* height, x + width, y + height + 0.25* height, 8, barOutlineColor);
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