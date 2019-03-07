package doubles_and_booleans;

import javax.swing.JOptionPane;

public class testScores {
public static void main(String[] args) {
	

	String testscore=JOptionPane.showInputDialog("What is your test score?");
	double testScore=Integer.parseInt(testscore);
	if (testScore > 90) {
		JOptionPane.showMessageDialog(null, "Wow! You must have studied really hard for that test!");
		
	if (testScore > 75 && testScore < 90) {
		JOptionPane.showMessageDialog(null, "You did ok. You can do better than that!");
	}
	if (testScore < 75) {
		JOptionPane.showMessageDialog(null, "You can do better than that");
	}
	}
	
}
}
