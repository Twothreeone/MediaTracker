package tracker.view;

import java.util.List;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;
import javax.swing.border.LineBorder;
import tracker.controller.TrackerController;
import tracker.model.*;

public class TrackerPanel extends JPanel
{
	private TrackerController appController;
	private SpringLayout appLayout;
	private SideBar sideBar;
	private JScrollPane scrollPane;

	public TrackerPanel(TrackerController appController)
	{
		super();
		this.appController = appController;
		appLayout = new SpringLayout();
		sideBar = new SideBar(appController);
		scrollPane = new JScrollPane();
		setupScrollPane();
		setupPanel();
		setupLayout();
		List<Media> list = new ArrayList<Media>();
		for (int i = 0; i < 18; i++)
		{
			list.add(new Book(null, null, null, null, null, 0));

		}
		addMediaPanels(list);
	}

	private void setupScrollPane()
	{
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPane.getVerticalScrollBar().setUnitIncrement(16);
		scrollPane.getViewport().setBackground(Color.DARK_GRAY.brighter());
		scrollPane.setBorder(new LineBorder(Color.BLACK, 5));
	}

	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.add(sideBar);
		this.add(scrollPane);
		this.setBackground(Color.DARK_GRAY);
		this.setBorder(new LineBorder(Color.BLACK, 3));
	}

	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, sideBar, 0, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, sideBar, 0, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, sideBar, 0, SpringLayout.WEST, scrollPane);
		appLayout.putConstraint(SpringLayout.WEST, sideBar, 0, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, scrollPane, 0, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, scrollPane, 0, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, scrollPane, 0, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, scrollPane, 200, SpringLayout.WEST, this);
	}
	
	private void addMediaPanels(List<Media> media)
	{
		JPanel panel;
		panel = new JPanel();
		empty = new JPanel();
		List<JPanel> emptys = new ArrayList<JPanel>();
		if (media.size() > 20) 
		{
			panel.setLayout(new GridLayout(media.size(), 1));
		}
		else
		{
			panel.setLayout(new GridLayout(20, 1));
		}
		for (Media med : media)
		{
			panel.add(new MediaPanel(appController, med));
		}
		for (int i = 0; i < 20 - media.size(); i++)
		{
			emptys.add(new JPanel);
		}
		for (JPanel empty : emptys)
		{
			panel.add(empty);
		}
		scrollPane.setViewportView(panel);
		panel.setBackground(Color.BLACK);
		empty.setBackground(Color.DARK_GRAY.brighter());
		empty.setBorder(new LineBorder(Color.BLACK, 3));
	}
}
