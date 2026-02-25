import java.awt.*;
import java.awt.geom.*;

public class Pan implements DrawingObject {
    
    private double x, y, width, height, angle, scaleX, scaleY;

    public Pan(double x, double y, double width, double height, double angle) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.angle = angle;
        scaleX = width/186;
        scaleY = height/80;
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

        Square handleMetal = new Square(x + 120*scaleX, y + 25*scaleY, 15*scaleY, handleMetalColor);
        handleMetal.draw(g2d);

        Rectangle handle = new Rectangle(x + 133*scaleX, y + 20*scaleY, 55*scaleX, 20*scaleY, 175, handleColor);
        handle.draw(g2d);

        Ellipse2D.Double handleRound = new Ellipse2D.Double(x + 170.5*scaleX, y + 17.5*scaleY, 35*scaleX, 20*scaleY);
        g2d.setColor(handleColor);
        g2d.fill(handleRound);

        Circle holeInner = new Circle(x + 185*scaleX, y + 20*scaleY, 10.5*scaleY, holeInnerColor);
        holeInner.draw(g2d);

        Circle hole = new Circle(x + 186*scaleX, y + 22*scaleY, 9*scaleY, holeColor);
        hole.draw(g2d);

        Ellipse2D.Double side = new Ellipse2D.Double(x, y, 125*scaleX, 55*scaleY);
        g2d.setColor(sideColor);
        g2d.fill(side);

        Ellipse2D.Double base = new Ellipse2D.Double(x + 7.5*scaleX, y + 17.5*scaleY, 110*scaleX, 45*scaleY);
        g2d.setColor(baseColor);
        g2d.fill(base);

        Triangle triangleLeftBig = new Triangle(x + 15*scaleX, y + 28.5*scaleY, 20*scaleX, 30*scaleY, 325, sideColor);
        triangleLeftBig.draw(g2d);

        Triangle triangleLeftSmall = new Triangle(x + 2*scaleX, y + 28.5*scaleY, 15*scaleX, 25*scaleY, 350, sideColor);
        triangleLeftSmall.draw(g2d);

        Triangle triangleRightBig = new Triangle(x + 97*scaleX, y + 35.5*scaleY, 30*scaleX, 20*scaleY, 305, sideColor);
        triangleRightBig.draw(g2d);

        Triangle triangleRightSmall = new Triangle(x + 110*scaleX, y + 35.5*scaleY, 25*scaleX, 15*scaleY, 280, sideColor);
        triangleRightSmall.draw(g2d);

        Path2D.Double arc = new Path2D.Double();
        arc.moveTo(x + 3*scaleX, y + 50*scaleY);
        arc.curveTo(x + 3*scaleX, y + 80*scaleY, x + 123*scaleX, y + 80*scaleY, x + 123*scaleX, y + 50*scaleY);
        arc.closePath();
        g2d.setColor(sideColor);
        g2d.fill(arc);

        Ellipse2D.Double rim = new Ellipse2D.Double(x, y, 125*scaleX, 50*scaleY);
        g2d.setColor(rimColor);
        g2d.setStroke(new BasicStroke(4));
        g2d.draw(rim);
    }
}