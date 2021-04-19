package week2;

import acm.util.RandomGenerator;
import java.awt.Color;
import acm.graphics.*;
import acm.program.GraphicsProgram;


public class RandomCircles extends GraphicsProgram {
	
	//Constants for constructing the circles/
    private static final int NCIRCLES = 10;
    private static final double MIN_RADIUS = 5;
    private static final double MAX_RADIUS = 50;
    private RandomGenerator rgen = RandomGenerator.getInstance();

    public void run(){
    	for (int i = 0; i < NCIRCLES; i++) {
    		double r = rgen.nextDouble(MIN_RADIUS, MAX_RADIUS);
    		double x = rgen.nextDouble(0, getWidth() - 2 * r);
    		double y = rgen.nextDouble(0, getHeight() - 2 * r);
    	
    	//How to construct the circle and color/	
    		GOval circle = new GOval(x, y, 2 * r, 2 * r);
    		circle.setFilled(true);
    		circle.setColor(rgen.nextColor());
    		add(circle);
    	}
    }
}




