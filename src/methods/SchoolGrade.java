package methods;

import javax.swing.JOptionPane;

public class SchoolGrade {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("What is your grade");
	int grade = Integer.parseInt(answer);
	if(grade>=70) {
		JOptionPane.showMessageDialog(null, "Congrats buddy keep it up");
	}	
		else 
			JOptionPane.showMessageDialog(null, "TRY HARDER");
	
}
}
