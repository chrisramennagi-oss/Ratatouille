import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SceneCanvas extends JComponent {
    
    private int width, height;
    private Background bg;
    private Stove stove;
    private Pan pan;
    private Fire leftFlame, centerFlame, rightFlame;
    private StoveSlider stoveSlider;
    private Knob knob;
    private float dayCounter;

    public SceneCanvas(int width, int height) {
        this.width = width;
        this.height = height;

        bg = new Background(width, height);
        stove = new Stove(0*width/800, 500*height/600, 440*width/800, 140*height/600);
        double burner1X = stove.getBurner1CenterX();
        double burner1Y = stove.getBurner1CenterY();
        pan = new Pan(burner1X - 0.2*burner1X, burner1Y - 0.15*burner1Y,  186*width/800, 80*height/600, 45);
        centerFlame = new Fire(burner1X, burner1Y + 0.03*burner1Y, height);
        leftFlame = new Fire(burner1X - 0.1*burner1X, burner1Y + 0.03*burner1Y, height);
        rightFlame = new Fire(burner1X + 0.1*burner1X, burner1Y + 0.03*burner1Y, height);
        stoveSlider = new StoveSlider(burner1X - 0.1*burner1X, 510*height/600, 60*width/800, 26*height/600);
        double sliderX = stoveSlider.getX();
        double sliderY = stoveSlider.getY();
        double sliderWidth = stoveSlider.getWidth();
        double sliderHeight = stoveSlider.getHeight();
        knob = new Knob(sliderX, sliderY + sliderHeight, 10*sliderWidth/60, 20*sliderHeight/26, sliderWidth);
        setPreferredSize(new Dimension(width, height));

        Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                bg.update();
                dayCounter = bg.getDayCounter();
                stove.update(dayCounter);

                repaint();
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON
        );
        g2d.setRenderingHints(rh);
        
        bg.draw(g2d);
        stove.draw(g2d);
        pan.draw(g2d);
        leftFlame.draw(g2d);
        rightFlame.draw(g2d);
        centerFlame.draw(g2d);
        stoveSlider.draw(g2d);
        knob.draw(g2d);
    }

    public Knob getKnob() {
        return knob;
    }

    public Fire getCenterFlame() {
        return centerFlame;
    }

    public Fire getLeftFlame() {
        return leftFlame;
    }

    public Fire getRightFlame() {
        return rightFlame;
    }
}