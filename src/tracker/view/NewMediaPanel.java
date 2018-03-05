package tracker.view;

import javax.swing.JPanel;
import tracker.controller.TrackerController;

public class NewMediaPanel extends JPanel
{
	private TrackerController appController;
	
	public NewMediaPanel(TrackerController appController)
	{
		super();
		this.appController = appController;
	}
}
