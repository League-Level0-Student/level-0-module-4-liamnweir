package charAt_scanners_optionDialogs;
import java.lang.reflect.Method;

import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happienessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String petAmount; JOptionPane.showInputDialog("What kind of pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		int happinessLevel=0;
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
		for (int i = 0; i < 3; i++) {
			
		
		
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Happy Pet", 1, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Take a walk", "Groom", "Feed" }, null);
			
			happinessLevel=+5;
if (i > 2) {
				JOptionPane.showMessageDialog(null, "Your pet loves you!");
				break;
			}
			// 5. Use user input to call the appropriate method created in step 4.
			if (task==0) {
				takeAWalk();
				happinessLevel();
			}
			if (task==1) {
				Groom();
				happinessLevel();
			}
			if (task==2) {
				Feed();
				happinessLevel();
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			
	}

	}
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level. 

	static void takeAWalk() {
	JOptionPane.showMessageDialog(null, "She is very playful!");
	}
	
	static void Groom() {
		JOptionPane.showMessageDialog(null, "You really get along with your pet!");
	}
	
	static void Feed() {
		JOptionPane.showMessageDialog(null, "Your pet seems full and happy!");
	}
	
	static void happinessLevel() {
		JOptionPane.showMessageDialog(null, "Your pets happiness is +5");
		int happinessLevel = +5;
	}}


