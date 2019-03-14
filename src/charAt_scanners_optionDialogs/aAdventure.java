package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class aAdventure {
public static void main(String[] args) {
JOptionPane.showMessageDialog(null, "You just woke up and it is weekday!");	
int task1= JOptionPane.showOptionDialog(null, "Where do you want to go?", "To where?", 1, JOptionPane.INFORMATION_MESSAGE, null,
		new String[] { "The Beach", "The Mall", "Stay Home" }, null);


if (task1==0) {
	JOptionPane.showMessageDialog(null, "You arrive at the beach");
	int taskBeach= JOptionPane.showOptionDialog(null, "What do you want to do?", "Fun!", 1, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Go Scubadiving", "Go Boogie Boarding", "Go home" }, null);
	if (taskBeach==0) {
		JOptionPane.showMessageDialog(null, "You get your gear and dive in!");
		JOptionPane.showOptionDialog(null, "What do you want to do?", "Fun!", 1, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Go to a yogurt place", "Go to shore", "Go home" }, null);
		if (taskBeach==1) {
			JOptionPane.showMessageDialog(null, "You get many waves!");
			JOptionPane.showOptionDialog(null, "What do you want to do?", "Fun!", 1, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Go to shore", "Go home", "Go to yogurt place" }, null);
		}
	}
	
}
if (task1==1) {
	JOptionPane.showMessageDialog(null, "You arrived at the mall!");
	int taskMall=JOptionPane.showOptionDialog(null, "What do you want to do?", "Fun!", 1, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Go eat something", "Go shop", "Go home" }, null);
	if (taskMall==0) {
		
	}
	
	
}
if (task1==2) {
	JOptionPane.showMessageDialog(null, "You decide to stay at home. Have some good sleep!");
}
}
}
