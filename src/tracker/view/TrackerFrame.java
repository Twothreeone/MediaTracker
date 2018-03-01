package tracker.view;

import javax.swing.JFrame;
import tracker.controller.TrackerController;

public class TrackerFrame extends JFrame
{
	private static final long serialVersionUID = 1L;
	private TrackerController appController;
	private TrackerPanel appPanel;
	
	public TrackerFrame(TrackerController appController)
	{
		super();
		this.appController = appController;
		appPanel = new TrackerPanel(appController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(500, 500);
		this.setVisible(true);
	}
}
