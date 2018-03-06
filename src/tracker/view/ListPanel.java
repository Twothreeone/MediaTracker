package tracker.view;

import java.awt.Color;
import javax.swing.JPanel;
import tracker.controller.TrackerController;

public class ListPanel extends JPanel
{
	TrackerController appController;

	public ListPanel(TrackerController appController)
	{
		super();
		this.appController = appController;
		setupPanel();
	}

	private void setupPanel()
	{
		for (int i = 0; i < 70; i++)
		{
			this.add(new MediaPanel(appController));
		}
		this.setBackground(Color.DARK_GRAY.brighter());
	}
}
