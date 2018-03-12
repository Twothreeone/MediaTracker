package tracker.view;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import tracker.controller.TrackerController;

public class MediaPanel extends JPanel
{
	private TrackerController appController;
	
	public MediaPanel(TrackerController appController)
	{
		super();
		this.appController = appController;
		setupPanel();
	}
	
	private void setupPanel()
	{
		this.setSize(1000, 50);
		this.setBackground(new Color((int)(Math.random() * 256),(int)(Math.random() * 256),(int)(Math.random() * 256)));
		this.setBorder(new LineBorder(Color.BLACK, 3));
	}
}
