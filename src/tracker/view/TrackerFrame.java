package tracker.view;

import java.awt.Color;
import java.awt.Dimension;
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
		this.setTitle("Media Tracker");
		this.setSize(500, 500);
		this.setMinimumSize(new Dimension(400, 400));
		this.setLocationRelativeTo(null);
		this.setLocation(this.getX(), this.getY() - 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(Color.DARK_GRAY);
		this.setVisible(true);
	}
}
