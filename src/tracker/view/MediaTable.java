package tracker.view;

import java.awt.Color;
import java.util.List;
import javax.swing.JTable;
import tracker.controller.TrackerController;

public class MediaTable extends JTable
{
	private TrackerController appController;
	
	public MediaTable(TrackerController appController, List<MediaPanel> panels)
	{
		super(new MediaTableModel(panels));
		this.setRowHeight(50);
		this.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		this.setBackground(Color.DARK_GRAY.brighter());
		this.setForeground(Color.WHITE);
		this.setOpaque(false);
		this.setGridColor(Color.BLACK);
		this.setTableHeader(null);
		this.setDefaultRenderer(MediaPanel.class, new MediaCell());
		this.appController = appController;
		setupTable();
	}
	
	private void setupTable()
	{
		
	}
}
