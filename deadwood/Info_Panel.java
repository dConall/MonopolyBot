package deadwood;


import javax.swing.*;
import java.awt.Font;


public class Info_Panel
{

	private static JPanel MyPanel;
	private static JTextArea MyTextArea;

	public Info_Panel()
	{
		LoadInfoPanel();
	}

 public static void LoadInfoPanel()
 {

   MyPanel = new JPanel();
   MyTextArea = new JTextArea(60, 40);
   MyTextArea.setFont(new Font("Serif", Font.BOLD, 21));
	 JScrollPane MyScrollPane = new JScrollPane(MyTextArea);
   MyTextArea.setLineWrap(true);
	 MyTextArea.setBounds(0, 0, 500, 800);
   MyTextArea.setWrapStyleWord(true);
   MyTextArea.setEditable(false);
	 MyTextArea.append("");
	 MyPanel.add(MyTextArea);
	 MyPanel.add(MyScrollPane);
   MyPanel.setVisible(true);

 }
 public JPanel getInfoPanel(){
	 return MyPanel;
 }


 public String DiceRollCounter(String DiceRoll)
 {

	 String Roll = ("Congratulations, you rolled a " + DiceRoll+"!\n");

	 return Roll;
 }

 public void UserInput(String UserText)
 {
	 MyTextArea.append(UserText+"\n");
 }


}
