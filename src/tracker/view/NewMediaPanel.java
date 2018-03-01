package tracker.view;

import javax.swing.JPanel;
import tracker.controller.TrackerController;

public class NewMediaPanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	private TrackerController appController;
	
	public NewMediaPanel(TrackerController appController)
	{
		super();
		this.appController = appController;
	}
}
