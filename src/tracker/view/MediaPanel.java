package tracker.view;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.TableCellRenderer;
import tracker.controller.TrackerController;

public class MediaPanel extends JPanel implements TableCellRenderer
{
	private TrackerController appController;
	
	public MediaPanel(TrackerController appController)
	{
		super();
		this.appController = appController;
		setupPanel();
	}
	
	private void setupPanel()
	{
		this.setSize(1000, 50);
		this.setBackground(new Color((int)(Math.random() * 256),(int)(Math.random() * 256),(int)(Math.random() * 256)));
		this.setBorder(new LineBorder(Color.BLACK, 3));
	}

	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
	{
		return this;
	}
}
