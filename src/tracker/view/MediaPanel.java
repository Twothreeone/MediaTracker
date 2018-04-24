package tracker.view;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import tracker.controller.TrackerController;
import tracker.model.*;

public class MediaPanel extends JPanel
{
	private TrackerController appController;
	private Media media;
	private JLabel title, type, rating;
	
	public MediaPanel(TrackerController appController, Media media)
	{
		super();
		this.appController = appController;
		this.media = media;
		title = new JLabel(media.getTitle());
		type = new JLabel(media.getType());
		rating = new JLabel(media.getRating() + "");
		setupPanel();
		setupLayout();
	}
	
	private void setupPanel()
	{
		this.setSize(1000, 50);
		this.add(title);
		this.add(type);
		this.add(rating);
		this.setBackground(Color.DARK_GRAY.brighter());
		this.setBorder(new LineBorder(Color.BLACK, 3));
	}
	
	private void setupLayout()
	{
		
	}
	
	public Dimension getPreferredSize()
	{
		return new Dimension(1000, 50);
	}
}
