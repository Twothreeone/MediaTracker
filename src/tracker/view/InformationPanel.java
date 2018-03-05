package tracker.view;

import javax.swing.JPanel;
import tracker.controller.TrackerController;

public class InformationPanel extends JPanel
{
	private TrackerController appController;
	
	public InformationPanel(TrackerController appController)
	{
		super();
		this.appController = appController;
	}
}
