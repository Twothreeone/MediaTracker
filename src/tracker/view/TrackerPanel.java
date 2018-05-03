package tracker.view;

import java.util.List;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import tracker.controller.TrackerController;
import tracker.model.*;

public class TrackerPanel extends JPanel
{
	private TrackerController appController;
	private SpringLayout appLayout;
	private SideBar sideBar;
	private JScrollPane scrollPane;
	private JPanel mediaPanels;

	public TrackerPanel(TrackerController appController)
	{
		super();
		this.appController = appController;
		appLayout = new SpringLayout();
		sideBar = new SideBar(appController);
		scrollPane = new JScrollPane();
		mediaPanels = new JPanel();
		setupScrollPane();
		setupPanel();
		setupLayout();
		List<Media> list = new ArrayList<Media>();
		for (int i = 0; i < 30; i++)
		{
			list.add(new Media("This is a book", "Paper", null, null, null, null, null, 0));

		}
		addMediaPanels(list);
	}

	private void setupScrollPane()
	{
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPane.getVerticalScrollBar().setUnitIncrement(16);
		scrollPane.setViewportView(mediaPanels);
		scrollPane.setBorder(new LineBorder(Color.BLACK, 5));
		mediaPanels.setBackground(Color.BLACK);
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
		mediaPanels.removeAll();
		mediaPanels.setLayout(new GridLayout(0, 1));
		for (Media med : media)
		{
			mediaPanels.add(new MediaPanel(appController, med));
		}
		for (int i = 0; i < (Toolkit.getDefaultToolkit().getScreenSize().getHeight() - 150) / 56 - media.size(); i++)
		{
			JPanel panel = new JPanel();
			panel.setBackground(Color.DARK_GRAY.brighter());
			if (i == 0)
				panel.setBorder(new MatteBorder(3, 3, 0, 3, Color.BLACK));
			else
				panel.setBorder(new MatteBorder(0, 3, 0, 3, Color.BLACK));
			mediaPanels.add(panel);
		}
		mediaPanels.revalidate();
	}
}
