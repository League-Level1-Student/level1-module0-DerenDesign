package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 50;
    int y = 100;
    int gravity = 1;
    int birdYVelocity = -10;
    int pipeXPos = 800;
    int upperPipeHeight = 0;
    int pipeGap = 85;
    int score = 0;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
        
    }

    @Override
    public void setup() {
        
    }

    @Override
    public void draw() {
    	
    	background(0, 0, 255);
    	fill (0, 0, 0);
   	   textSize(30);
   	   text(score, 20, 20);
    	fill(0, 255, 0);
    	stroke(0, 0, 225);
    	ellipse(x, y, 30, 30);
    	y= y + birdYVelocity;
    	birdYVelocity += gravity;
    	fill(0, 225, 0);
    	pipeXPos = pipeXPos - 8;
    	rect(pipeXPos,0, 50, upperPipeHeight);
    	teleportPipes();
    	int lowerY = upperPipeHeight + pipeGap;
    	rect(pipeXPos,lowerY, 50, HEIGHT-upperPipeHeight);
    	if (y > HEIGHT || intersectsPipes()) {
    		System.exit(0);
    	}
    	
    	
    	
    	
    }
    @Override
    public void mousePressed() {
        birdYVelocity = -10;
    }
    public void teleportPipes() {
       if (pipeXPos < 0) {
    	   pipeXPos = 800;
    	   upperPipeHeight = (int) random(100, 400);
    	   score++; 
       }
      
    }
    boolean intersectsPipes() { 
        if (y < upperPipeHeight && x > pipeXPos && x < (pipeXPos+50)){
           return true; }
       else if (y>HEIGHT-upperPipeHeight && x > pipeXPos && x < (pipeXPos+50)) {
           return true; }
       else { return false; }
}
    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
