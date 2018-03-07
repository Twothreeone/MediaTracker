package tracker.view;

import java.awt.Color;
import javax.swing.JTable;
import tracker.controller.TrackerController;

public class MediaTable extends JTable
{
	private TrackerController appController;
	
	public MediaTable(TrackerController appController)
	{
		super();
		this.setRowHeight(50);
		this.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		this.setBackground(Color.DARK_GRAY.brighter());
		this.setForeground(Color.WHITE);
		this.setOpaque(false);
		this.setGridColor(Color.BLACK);
		this.appController = appController;
		setupTable();
	}
	
	private void setupTable()
	{
		
		MediaPanel panel = new MediaPanel(appController);
		
	}
}
