/**
 * 
 */
package gui.painel;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * @author Mathias Weigert
 * @version 0.5
 */
public class TablePanel {

	private JPanel tPanel;
	
	public TablePanel() {
		tPanel = new JPanel();
		
		String[] columnNames = {"Datum", 
				"Zeit", 
				"Dienst", 
				"Kostenart", 
				"Zielnummer", 
				"Tarif",
				"Dauer",
				"Einheit",
				"Kosten",
				"Typ"
		};
		
		JTable table = new JTable(null, columnNames);
		
		JScrollPane scrollPane = new JScrollPane(table);
		
		tPanel.add(scrollPane);
	}
	
	public JPanel getPanel() {
		return tPanel;
	}
}
