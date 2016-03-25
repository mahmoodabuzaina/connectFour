package connectfour;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;

public class Circle extends JComponent{
	
	Color color;//color of circle
	int diameter;//diameter of circle
	boolean empty;//is the circle empty
	
	/**
	 * Circle constructor
	 */
	public Circle()
	{
		color = Color.WHITE;
		diameter = 40;
		empty=true;
		
		
	}
	
	/**
	 * circle constructor
	 * @param c the color for the circle
	 */
	public Circle(Color c)
	{
		color=c;
		diameter=40;
		empty=true;
		

	}
	
	/**
	 * circle constructor
	 * @param c the color of the circle
	 * @param d the diameter of the circle
	 */
	public Circle(Color c, int d)
	{
		color=c;
		diameter=d;
		empty=true;
		

	}
	
	/**
	 * draws the circle
	 */
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(color);
		g.fillOval(20, 0, diameter, diameter);
	}
	
	/**
	 * colors the circle
	 * @param player1 whether player 1 or player2
	 */
	public void fill(boolean player1)
	{
		if(player1)
		{
			color=Color.red;
		}
		else
		{
			color=Color.yellow;
		}
	}
	
	/**
	 * checks if empty
	 * @return empty
	 */
	public boolean isEmpty()
	{
		if(empty)
		{
			empty=false;
			return true;
		}
		return false;
	}
	
	/**
	 * checks the color
	 * @return the color of circle
	 */
	public Color getColor()
	{
		return color;
	}
	
	@Override
	public int hashCode()
	{
		return color.hashCode();
	}
	
	
	@Override
	public Color getBackground()
	{
		
		color =Color.red;
		
		return null;
	}
	
	
	@Override
	public void setBackground(Color c)
	{
		color=Color.yellow;
	}
	
	
	
	

}
