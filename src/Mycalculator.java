import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;

public class Mycalculator extends Frame {
	public boolean setClear=true;  
	double number, memValue;  
	char op;  
	  
	String digitButtonText[] = {"7", "8", "9", "4", "5", "6", "1", "2", "3", "0", "+/-", "." };  
	String operatorButtonText[] = {"/", "sqrt", "*", "%", "-", "1/X", "+", "=" };  
	String memoryButtonText[] = {"MC", "MR", "MS", "M+" };  
	String specialButtonText[] = {"Backspc", "C", "CE" };  
	  
	MydigitButton digitButton[]=new MydigitButton[digitButtonText.length];  
	MyOperatorButton operatorButton[]=new MyOperatorButton[operatorButtonText.length];  
	MyMemoryButton memoryButton[]=new MyMemoryButton[memoryButtonText.length];  
	MySpecialButton specialButton[]=new MySpecialButton[specialButtonText.length];  
	  
	Label displayLabel=new Label("0",Label.RIGHT);  
	Label memLabel=new Label(" ",Label.RIGHT);  
	  
	final int FRAME_WIDTH=325,FRAME_HEIGHT=325;  
	final int HEIGHT=30, WIDTH=30, H_SPACE=10,V_SPACE=10;  
	final int TOPX=30, TOPY=50;  

	Mycalculator(String frameText){
		super();  
		
		int tempX=TOPX, y=TOPY;  
		
		displayLabel.setBounds(tempX, TOPY, 240, HEIGHT);
		displayLabel.setBackground(Color.BLUE);
		displayLabel.setForeground(Color.WHITE);
		add(displayLabel);
		memLabel.setBounds(tempX,TOPY+HEIGHT+V_SPACE, WIDTH, HEIGHT);
	}

}
