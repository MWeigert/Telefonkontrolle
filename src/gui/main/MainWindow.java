/**
 * 
 */
package gui.main;

import gui.painel.TablePanel;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author MWeigert
 *
 */
public class MainWindow {
	
	public MainWindow() {
		JFrame frame = new JFrame("Telefonkontrolle");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		TablePanel tpanel = new TablePanel();
		
		panel = tpanel.getPanel();
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
	}

}
