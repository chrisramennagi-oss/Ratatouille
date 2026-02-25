import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SceneFrame {

    private int width, height;
    private SceneCanvas sc;
    private JFrame frame;
    private double endX, knobValue;

    public SceneFrame(int width, int height) {
        this.width = width;
        this.height = height;
        frame = new JFrame();
        sc = new SceneCanvas(width, height);
    }

    public void setUpGUI() {
        Container contentPane = frame.getContentPane();

        contentPane.add(sc, "Center");
        frame.setTitle("Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void setUpMouseListener() {
        Knob knob = sc.getKnob();
        double minX = knob.getMinX();
        double maxX = knob.getMaxX();

        MouseAdapter ma = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(knob.contains(e.getX(), e.getY())) {
                    e.getX();
                }
            }
            @Override
            public void mouseDragged(MouseEvent e) {
                endX = e.getX();                
                if (endX > minX && endX < maxX) {
                    knob.setLocation(endX);
                    knobValue = 1 - (endX - minX) / (maxX - minX);
                } else if (endX >= maxX) {
                    knob.setLocation(maxX);
                    knobValue = 0;
                } else if (endX <= minX) {
                    knob.setLocation(minX);
                    knobValue = 1;
                }
                sc.getCenterFlame().setHeat(knobValue);
                sc.getLeftFlame().setHeat(knobValue);
                sc.getRightFlame().setHeat(knobValue);

                sc.repaint();
            }
        };
        frame.addMouseListener(ma);
        frame.addMouseMotionListener(ma);
    }
}