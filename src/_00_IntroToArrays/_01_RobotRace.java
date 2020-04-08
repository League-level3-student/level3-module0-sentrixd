package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		int amountOfRobots = new Random().nextInt(7) + 1;
		
		//2. create an array of 5 robots.
		Robot[] robots = new Robot[amountOfRobots];
		
		int position = 50;
		
		//3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			
			//4. make each robot start at the bottom of the screen, side by side, facing up
			robots[i].setX(position);
			robots[i].setY(500);
			
			position += 125;
		}
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
    	boolean robotHasReached = false;
    	
    	int robotWon = 0;
    	
    	while (!robotHasReached) {
    		for (int i = 0; i < robots.length; i++) {
        		int positionToMove = new Random().nextInt(49) + 1;
        		
        		robots[i].setSpeed(5);
        		robots[i].move(positionToMove);
        		
        		if (robots[i].getY() <= 20) { 
        			robotHasReached = true;
        			robotWon = i;
        			
        			break;
        		}
        	}
    	}
    	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	JOptionPane.showMessageDialog(null, "Robot " + robotWon + " has won the race!!!!!");
	}
}
