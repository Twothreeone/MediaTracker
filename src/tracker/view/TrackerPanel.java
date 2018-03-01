package tracker.view;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.LineBorder;
import tracker.controller.TrackerController;

public class TrackerPanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	private TrackerController appController;
	private SpringLayout appLayout;
	private SideBar sideBar;
	private ScrollPanel scrollPanel;
	
	public TrackerPanel(TrackerController appController)
	{
		super();
		this.appController = appController;
		appLayout = new SpringLayout();
		sideBar = new SideBar(appController);
		scrollPanel = new ScrollPanel(appController);
		setupPanel();
		setupLayout();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.add(sideBar);
		this.add(scrollPanel);
		this.setBackground(Color.DARK_GRAY);
		this.setBorder(new LineBorder(Color.BLACK, 3));
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, sideBar, 0, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, sideBar, 0, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, sideBar, 0, SpringLayout.WEST, scrollPanel);
		appLayout.putConstraint(SpringLayout.WEST, sideBar, 0, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, scrollPanel, 0, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, scrollPanel, 0, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, scrollPanel, 0, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, scrollPanel, 200, SpringLayout.WEST, this);
	}
}
