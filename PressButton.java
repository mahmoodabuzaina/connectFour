package connectfour;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;

public class PressButton extends JComponent{

	public PressButton()
	{
		
	}
	@Override
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.blue);
		g.fillRect(5, 5, 75, 75);
		g.setColor(Color.white);
		g.drawString("Press", 20, 35);
		
		
		
	}
}
