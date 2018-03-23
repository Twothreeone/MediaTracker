package tracker.view;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import tracker.controller.TrackerController;
import tracker.model.*;

public class MediaPanel extends JPanel
{
	private TrackerController appController;
	private Media media;
	
	public MediaPanel(TrackerController appController, Media media)
	{
		super();
		this.appController = appController;
		setupPanel();
	}
	
	private void setupPanel()
	{
		this.setSize(1000, 50);
		this.setBackground(Color.DARK_GRAY.brighter());
		this.setBorder(new LineBorder(Color.BLACK, 3));
		this.getPreferredSize();
	}
	
	public Dimension getPreferredSize()
	{
		return new Dimension(1000, 50);
	}
}
