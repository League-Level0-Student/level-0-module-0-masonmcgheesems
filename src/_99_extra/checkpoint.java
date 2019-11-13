package _99_extra;

import org.jointheleague.graphical.robot.Robot;

import javax.swing.JOptionPane;

public class checkpoint {
public static void main(String[] args) {
	
	String input = JOptionPane.showInputDialog("what is your favorite color?");
	JOptionPane.showMessageDialog(null, input+ "thats also my favorite color!");
	
	Robot v = new Robot();
	v.setSpeed(100);
	v.setPenWidth(50);
	v.setRandomPenColor();
	v.penDown();
	v.turn(120);
	v.move(100);
	v.turn(120);
	v.move(100);
	v.turn(120);
	v.move(100);




}
}
