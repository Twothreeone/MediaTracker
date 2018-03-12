package tracker.view;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;
import javax.swing.border.LineBorder;
import tracker.controller.TrackerController;

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
	}

	private void setupScrollPane()
	{
		scrollPane.setViewportView(new JPanel()); // Placeholder
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
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
}
