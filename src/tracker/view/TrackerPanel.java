package tracker.view;

import javax.swing.JPanel;
import tracker.controller.TrackerController;

public class TrackerPanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	private TrackerController appController;
	
	public TrackerPanel(TrackerController appController)
	{
		super();
		this.appController = appController;
	}
}
