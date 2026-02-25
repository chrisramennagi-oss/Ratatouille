import java.awt.*;
import java.awt.geom.*;

public class Background implements DrawingObject {

    private final int day, night;
    private int dayState;
    private float dayCounter, brightness;
    private int width, height;

    public Background(int width, int height) {
        this.width = width;
        this.height = height;
        day = 1;
        night = 0;
        dayState = day;
        dayCounter = 1;
    }

    @Override
    public void draw(Graphics2D g2d) {
        Color daySkyColor1 = new Color(68, 142, 228); //dark sky blue
        Color daySkyColor2 = new Color(253,192,209); //pink
        Color nightSkyColor1 = new Color(19, 24, 98); //midnight blue
        Color nightSkyColor2 = new Color(255, 236, 156);  //warm yellow

        int r1 = (int) (nightSkyColor1.getRed() + dayCounter * (daySkyColor1.getRed() - nightSkyColor1.getRed()));
        int gr1 = (int) (nightSkyColor1.getGreen() + dayCounter * (daySkyColor1.getGreen() - nightSkyColor1.getGreen()));
        int b1 = (int) (nightSkyColor1.getBlue() + dayCounter * (daySkyColor1.getBlue() - nightSkyColor1.getBlue()));
        int r2 = (int) (nightSkyColor2.getRed() + dayCounter * (daySkyColor2.getRed() - nightSkyColor2.getRed()));
        int gr2 = (int) (nightSkyColor2.getGreen() + dayCounter * (daySkyColor2.getGreen() - nightSkyColor2.getGreen()));
        int b2 = (int) (nightSkyColor2.getBlue() + dayCounter * (daySkyColor2.getBlue() - nightSkyColor2.getBlue()));

        Color topColor = new Color(r1, gr1, b1);
        Color bottomColor = new Color(r2, gr2, b2);
        GradientPaint skyColor = new GradientPaint(width/2, height/2, topColor, width/2, 3* height/4, bottomColor);
        g2d.setPaint(skyColor);
        Rectangle2D.Double sky = new Rectangle2D.Double(0, 0, width, height);
        g2d.fill(sky);
        
        Color frameColor = new Color(132, 79, 57);
        Rectangle frame1 = new Rectangle(0, 0, width, 75*height/600, 0, frameColor);
        frame1.draw(g2d);
        Rectangle frame2 = new Rectangle(0, 400*height/600, width, 200*height/600, 0, frameColor);
        frame2.draw(g2d);

        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1 - brightness));
        g2d.setColor(Color.BLACK);
        Rectangle frame1Filter = new Rectangle(0, 0, width, 75*height/600, 0, null);
        frame1Filter.draw(g2d);
        Rectangle frame2Filter = new Rectangle(0, 400*height/600, width, 200*height/600, 0, null);
        frame2Filter.draw(g2d);
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));
    }

    public void update() {
        if (dayState == night) {
            dayCounter += 1f/450f;
            if(dayCounter >= 1f) { //15 sec
                dayCounter = 1f;
                dayState = day;
            }
        }
        if (dayState == day) {
            dayCounter -= 1f/450f;
            if (dayCounter <= 0f) {
                dayCounter = 0f;
                dayState = night;
            }
        }
        brightness = Math.max(dayCounter,0.6f);
    }
    
    public float getDayCounter() {
        return dayCounter;
    }
}