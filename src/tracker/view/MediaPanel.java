package tracker.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.event.MouseEvent;
import tracker.controller.TrackerController;
import tracker.model.*;
import javax.swing.JButton;
import javax.swing.SpringLayout;

public class MediaPanel extends JPanel
{
	private TrackerController appController;
	private Media media;
	private JLabel title, type, rating;
	private JButton button;
	private SpringLayout springLayout;

	public MediaPanel(TrackerController appController, Media media)
	{
		super();
		this.appController = appController;
		this.media = media;
		title = new JLabel(media.getTitle());
		type = new JLabel(media.getType());
		rating = new JLabel(media.getRating() + "");
		button = new JButton();
		button.setBorderPainted(false);
		springLayout = new SpringLayout();
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setSize(1000, 50);
		this.setLayout(springLayout);
		this.add(title);
		this.add(type);
		this.add(rating);
		this.add(button);
		this.setBackground(Color.DARK_GRAY.brighter());
		this.setBorder(new LineBorder(Color.BLACK, 3));
	}

	private void setupLayout()
	{
		springLayout.putConstraint(SpringLayout.NORTH, button, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, button, 0, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, button, 0, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.WEST, button, 0, SpringLayout.WEST, this);
	}

	private void setupListeners()
	{
		button.addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent onClick)
			{
				setBackground(Color.DARK_GRAY);
			}

			public void mouseReleased(MouseEvent offClick)
			{
				setBackground(Color.DARK_GRAY.brighter());
			}

			public void mouseEntered(MouseEvent enter)
			{
				setBorder(new LineBorder(Color.WHITE, 3));
			}

			public void mouseExited(MouseEvent exit)
			{
				setBorder(new LineBorder(Color.BLACK, 3));
			}
		});
	}

	public Dimension getPreferredSize()
	{
		return new Dimension(1000, 50);
	}
}
