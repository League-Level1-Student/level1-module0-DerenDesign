package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 50;
    int y = 100;
    int j = 0;
    int birdYVelocity = -10;
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
    	fill(0, 255, 0);
    	
    	ellipse(x, y+j, 30, 30);
    	j = j + 2;
    	
    	
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
