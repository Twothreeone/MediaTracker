package tracker.view;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import tracker.controller.TrackerController;

public class ScrollPanel extends JScrollPane
{
	private TrackerController appController;
	
	public ScrollPanel(TrackerController appController)
	{
		super();
		this.appController = appController;
		setupPanel();
	}
	
	private void setupPanel()
	{
		this.getViewport().setBackground(Color.DARK_GRAY.brighter());
		this.setBorder(new LineBorder(Color.BLACK, 3));
	}
}
