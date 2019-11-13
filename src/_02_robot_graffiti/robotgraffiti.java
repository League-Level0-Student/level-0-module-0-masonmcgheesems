package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class robotgraffiti {
public static void main(String[] args) {
	Robot error = new Robot(); 
		error.setPenWidth(50);
			error.setRandomPenColor();
			error.penDown();
			error.setSpeed(100);
			error.move(200);
			error.turn(150);
			error.move(200);
			error.turn(-150);
			error.move(200);
			error.turn(150);
			error.move(200);
			
           
           
}
}
