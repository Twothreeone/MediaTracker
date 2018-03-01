package tracker.view;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import tracker.controller.TrackerController;

public class SideBar extends JPanel
{
	private static final long serialVersionUID = 1L;
	private TrackerController appController;
	
	public SideBar(TrackerController appController)
	{
		super();
		this.appController = appController;
		setupPanel();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.DARK_GRAY);
		this.setBorder(new LineBorder(Color.BLACK, 3));
	}
}
