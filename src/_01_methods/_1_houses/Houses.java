package _01_methods._1_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	public static void main(String[] args) {
		Random ran = new Random();
		Robot rob = new Robot();
		rob.setSpeed(30);
		rob.setWindowSize(500, 500);
		rob.setX(50);
		rob.setY(450);
		for(int i = 1; i < 11; i++) {
			int height =  ran.nextInt(100-60 + 1) + 60; 
			rob.setPenColor(Color.PINK);
			rob.penDown();
			rob.move(height);
			rob.turn(90);
			rob.move(50);
			rob.turn(90);
			rob.move(height);
			rob.setPenColor(Color.GREEN);
			rob.turn(-90);
			rob.move(50);
			rob.turn(-90);
		}
	}	
	public void run() {
		
	}
}
