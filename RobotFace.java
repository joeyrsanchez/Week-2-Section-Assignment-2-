package week2;

import java.awt.Color;
import acm.graphics.*;
import acm.program.*;
import acm.program.GraphicsProgram;

public class RobotFace extends GraphicsProgram {
	
	// Constants for the RobotFace construction/
	private static final int HEAD_WIDTH = 150;
	private static final int HEAD_HEIGHT = 250;
	private static final int EYE_RADIUS = 30;
	private static final int MOUTH_WIDTH = 100;
	private static final int MOUTH_HEIGHT = 40;
	
    public void run() {
        addHead();
        addLeftEye();
        addRightEye();
        addMouth();
    }
    private void addHead() {
        double x = ((getWidth()/2) - (HEAD_WIDTH/2));
        double y = ((getHeight()/2) - (HEAD_HEIGHT/2));
        GRect face = new GRect (x, y, HEAD_WIDTH, HEAD_HEIGHT);
        add(face);
        face.setFilled(true);
        face.setFillColor(Color.GRAY);
    }
    private void addLeftEye() {
        double x = getWidth()/2 - HEAD_WIDTH/4 - EYE_RADIUS/2;
        double y = getHeight()/2 - HEAD_HEIGHT/4 - EYE_RADIUS/2;
        GOval leftEye = new GOval (x, y, EYE_RADIUS, EYE_RADIUS);
        add(leftEye);
        leftEye.setColor(Color.YELLOW);
        leftEye.setFilled(true);
        leftEye.setFillColor(Color.YELLOW);
    }
    private void addRightEye() {
        double x = getWidth()/2 + HEAD_WIDTH/4 - EYE_RADIUS/2;
        double y = getHeight()/2 - HEAD_HEIGHT/4 - EYE_RADIUS/2;
        GOval rightEye = new GOval (x, y, EYE_RADIUS, EYE_RADIUS);
        add(rightEye);
        rightEye.setColor(Color.YELLOW);
        rightEye.setFilled(true);
        rightEye.setFillColor(Color.YELLOW);
    }
    private void addMouth() {
        double x = getWidth()/2 - MOUTH_WIDTH/2;
        double y = getHeight()/2 + HEAD_HEIGHT/4 - MOUTH_HEIGHT/2;
        GRect mouth = new GRect (x, y,MOUTH_WIDTH, MOUTH_HEIGHT);
        add(mouth);
        mouth.setColor(Color.WHITE);
        mouth.setFilled(true);
        mouth.setFillColor(Color.WHITE);
    }
	
	
}