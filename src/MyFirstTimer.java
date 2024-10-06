import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class MyFirstTimer extends GraphicsProgram implements ActionListener {
	public static final int PROGRAM_HEIGHT = 600;
	public static final int PROGRAM_WIDTH = 800;
	public static final int MAX_STEPS = 20;
	private GLabel myLabel;
	private int x;
	private int numTimes = 0;
	private Timer myFirstTimer = new Timer(1000, this);

	public void init() {
		setSize(PROGRAM_WIDTH, PROGRAM_HEIGHT);
		requestFocus();
	}
	
	public void run() {
		myLabel = new GLabel("# of times called?", 0, 100);
		
		add(myLabel);
		
		//Timer myFirstTimer = new Timer(1000, this);
        addMouseListeners();
        myFirstTimer.start();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	    //TODO add what we want to do every two seconds
		if (numTimes < 10) {
			numTimes += 1;
			myLabel.setLabel("times called? " + numTimes);
			x += 5;
	        myLabel.setLocation(x, 100);
		}
		else {
			myFirstTimer.stop();
		}
        
		
	}
	
	
	public static void main(String[] args) {
		new MyFirstTimer().start();
	}
}