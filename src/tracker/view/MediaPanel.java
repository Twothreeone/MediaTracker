package tracker.view;

import javax.swing.JPanel;
import tracker.controller.TrackerController;

public class MediaPanel extends JPanel
{
	private TrackerController appController;
	
	public MediaPanel(TrackerController appController)
	{
		super();
		this.appController = appController;
	}
}
