import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SceneFrame{
	private JFrame frame;
	//Canvas
	private SceneCanvas sc;
	private int width, height;
	private Timer timer;
	private ActionListener al;
	
	public SceneFrame(int width, int height){
		this.width = width;
		this.height = height;
		frame = new JFrame();
		sc = new SceneCanvas(width, height);
	}
	
	public void setUpGUI(){
		Container cp = frame.getContentPane();
		sc.setPreferredSize(new Dimension(width, height));
		frame.setTitle("Midterm Project - Acevedo - Ngo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.add(sc);
		frame.pack();
		frame.setVisible(true);
	}
	
	public void setUpActionListener(){
		al = new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent ae){
				CityGlare cg = sc.getCityGlare();
				cg.fade();
				sc.repaint();
			}
		};
		timer = new Timer(50, al);
		timer.start();
		//don't forget the ; after actionPerformed
	}
	
	
	
	
}