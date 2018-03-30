package tracker.view;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JFrame;
import tracker.controller.TrackerController;

public class TrackerFrame extends JFrame
{
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
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setSize(this.getWidth() - 150, this.getHeight() - 150);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(Color.DARK_GRAY);
		this.setVisible(true);
	}
}
