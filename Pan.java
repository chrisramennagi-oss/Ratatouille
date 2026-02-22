import java.awt.*;
import java.awt.geom.*;

public class Pan implements DrawingObject {
    
    private double x, y, width, height, angle;

    public Pan(double x, double y, double width, double height, double angle) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.angle = angle;
    }
    
    @Override
    public void draw(Graphics2D g2d) {
        Color sideColor = Color.decode("#263e4f");
        Color baseColor = Color.decode("#475c70");
        Color handleMetalColor = Color.decode("#8292a8");
        Color handleColor = Color.decode("#6f4934");
        Color holeInnerColor = Color.decode("#5f3c2b");
        Color holeColor = Color.decode("#ad795b");
        Color rimColor = Color.decode("#8292a8");

        Square handleMetal = new Square(300, 505, 15, handleMetalColor);
        handleMetal.draw(g2d);
        Rectangle handle = new Rectangle(313, 500, 55, 20, 175, handleColor);
        handle.draw(g2d);
        Ellipse2D.Double handleRound = new Ellipse2D.Double(350.5, 497.5, 35, 20);
        g2d.setColor(handleColor);
        g2d.fill(handleRound);
        Circle holeInner = new Circle(365, 500, 10.5, holeInnerColor);
        holeInner.draw(g2d);
        Circle hole = new Circle(366, 502, 9, holeColor);
        hole.draw(g2d);

        Ellipse2D.Double side = new Ellipse2D.Double(180, 480, 125, 55); //x=180 y=480
        g2d.setColor(sideColor);
        g2d.fill(side);
        Ellipse2D.Double base = new Ellipse2D.Double(187.5, 497.5, 110, 45);
        g2d.setColor(baseColor);
        g2d.fill(base);
        Triangle triangleLeftBig = new Triangle(195, 508.5, 20, 30, 325, sideColor);
        triangleLeftBig.draw(g2d);
        Triangle triangleLeftSmall = new Triangle(182, 508.5, 15, 25, 350, sideColor);
        triangleLeftSmall.draw(g2d);
        Triangle triangleRightBig = new Triangle(273, 515.5, 30, 20, 305, sideColor);
        triangleRightBig.draw(g2d);
        Triangle triangleRightSmall = new Triangle(290, 515.5, 25, 15, 280, sideColor);
        triangleRightSmall.draw(g2d);
        Path2D.Double arc = new Path2D.Double();
        arc.moveTo(183, 530);
        arc.curveTo(183, 560, 302.5, 560, 302.5, 530);
        arc.closePath();
        g2d.setColor(sideColor);
        g2d.fill(arc);

        Ellipse2D.Double rim = new Ellipse2D.Double(180, 480, 125, 50);
        g2d.setColor(rimColor);
        g2d.setStroke(new BasicStroke(4));
        g2d.draw(rim);
    }
}