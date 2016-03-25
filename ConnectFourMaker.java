package connectfour;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ConnectFourMaker {

	//panel that will be built with the game
	JPanel connectfour;
	
	/**ConnectFourMaker
	 * connect fours constructor
	 */
	public ConnectFourMaker(int dim)
	{
		connectfour=new JPanel();
		makeConnectFour(dim);
	}
	
	/**makeConnectFour
	 * sets the layout of the game
	 * @param dimension 
	 */
	private void makeConnectFour(int dimension)
	{
		connectfour.setLayout(new GridLayout(dimension+1, dimension));
		addCircles(dimension);
	}
	
	/**addCircles
	 * adds the circles/slots
	 */
	private void addCircles(int dim)
	{
		int a = dim*dim;
		for(int i =0; i<a;i++)
		{
			connectfour.add(new Circle());
		}
		addButtons(dim);
	}
	
	/**addButtons
	 * adds the buttons to the game board
	 */
	private void addButtons(int dim)
	{
		for(int i =0;i<dim;i++)
		{
			connectfour.add(new PressButton());
		}
	}
	
	/**getConnectFourPanel
	 * returns the connect four game
	 * @return the conectfour 
	 */
	public JPanel getConnectFourPanel()
	{
		return connectfour;
	}
	
}
