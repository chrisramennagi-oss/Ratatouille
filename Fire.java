import java.awt.*;

public class Fire implements DrawingObject{

    private double baseX, baseY, x, y;
    private double heat, size, spacing, flicker; 
    private Circle fire;
    private Color color;

    public Fire(double baseX, double baseY) {
        this.baseX = baseX;
        this.baseY = baseY;
        heat = 1;
    }

    @Override
    public void draw(Graphics2D g2d) {
        for(int i = 1; i <= 20; i++) {
            spacing = i * heat * 3;
            size = (20 - i) * 2 * heat;
            flicker = ((Math.random() * 8 - 4)) * heat;
            x = baseX - size/2 + flicker;
            y = baseY - size - spacing;
            if(i < 4)
                color = new Color(255, 200, 0);      
            else if(i < 8)
                color = new Color(255, 120, 0);      
            else
                color = new Color(255, 60, 0);   
            fire = new Circle(x, y, size, color);
            fire.draw(g2d);
        }

    }

    public void setHeat(double targetHeat) {
        heat = targetHeat;
    }
}