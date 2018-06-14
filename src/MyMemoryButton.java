import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMemoryButton extends Button implements ActionListener  {
	Mycalculator mc;
	

	public MyMemoryButton(int x, int y, int width, int height, String cap, Mycalculator clc) {
		super(cap);
		this.mc=clc;
		setBounds(x,y,width,height);
		this.mc.add(this);
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
