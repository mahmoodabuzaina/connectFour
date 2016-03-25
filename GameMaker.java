package connectfour;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameMaker extends JFrame{
	
	
	ConnectFourMaker cfmaker;//the connect four maker
	JPanel panel;// panel that will set gameboard visible
	boolean player1;// determines what player is next
	
	final int final_Dim=70;
	
	/**GameMaker constructor
	 * constructs the gameboard, and sets the operations of buttons first-seventh
	 */
	public GameMaker(final int dim)
	{
		
		player1=true;
		
		cfmaker=new ConnectFourMaker(dim);
		panel=cfmaker.getConnectFourPanel();
		add(panel);
		setSize(final_Dim*dim,final_Dim*dim);
		
		panel.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(e.getY()>=panel.getComponent(dim*dim).getY())
				{
					buttonAction(dim, e.getX()/panel.getComponent(1).getX());
				}
			}
		});
		
	}
	
	
	/**switchPlayer
	 * switches the players turn
	 */
	private void switchPlayer()
	{
		if(player1)player1=false;
		else player1=true;
	}
	
	
	
	
	/**addChip
	 * adds the red or yellow chip into the next slot
	 * @param numberOfSlot the index of the slot that will be occupied
	 */
	private void addChip(int numberOfSlot)
	{
		if(player1)
		{
		panel.getComponent(numberOfSlot).getBackground();
		}
		else
		{
			panel.getComponent(numberOfSlot).setBackground(Color.yellow);
		}
		panel.update(panel.getGraphics());
		switchPlayer();
	}
	
	/**
	 * determines to what column the chip will be added
	 * @param dim the dimension of the connectfour game
	 * @param extra the column number
	 */
	public void buttonAction(int dim, int extra)
	{
		int a = (dim*(dim-1))+extra;
		for(int i = a;i>=0;i=i-dim )
		{
			if(panel.getComponent(i).hashCode()==Color.WHITE.hashCode())
			{
				addChip(i);
				return;
			}
		}
	}
	
	
	
	
	
	
}
