import java.awt.*;

public class Knob implements DrawingObject {

    private double x, y, width, height;
    private Color topColor, bottomColor;
    private final double minX, maxX;

    public Knob(double x, double y, double width, double height, double sliderEndPoint) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        topColor = Color.decode("#fcaa1d");
        bottomColor = Color.decode("#ed8300");
        minX = x;
        maxX = x + sliderEndPoint - width;
    }

    @Override
    public void draw(Graphics2D g2d) {
        float xF = (float)x;
        float yF = (float)y;
        float widthF = (float)width;
        float heightF = (float)height;

        GradientPaint knobColor = new GradientPaint(xF + widthF/2, yF, topColor, xF + widthF/2, yF + heightF, bottomColor);
        g2d.setPaint(knobColor);

        Rectangle knob = new Rectangle(x, y, width, height, 0, null);
        knob.draw(g2d);
    }

    public double getMinX() {
        return minX;
    }

    public double getMaxX() {
        return maxX;
    }

    public void setLocation(double endX) {
        x = endX;
    }

    public boolean contains(double X, double Y) {
        return X >= x && X <= x + width && Y >= y && Y <= y + height;
    }
}

