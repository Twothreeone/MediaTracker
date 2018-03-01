package tracker.view;

import javax.swing.JPanel;
import tracker.controller.TrackerController;

public class MediaPanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	private TrackerController appController;
	
	public MediaPanel(TrackerController appController)
	{
		super();
		this.appController = appController;
	}
}
