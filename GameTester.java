package connectfour;

import javax.swing.JFrame;

public class GameTester {

	/**GameTester
	 * tests and plays the connect four game
	 * @param args 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame test = new GameMaker(8);
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		test.setTitle("Connect Four");
		test.setVisible(true);
		
		

	}

}
