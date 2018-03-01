package tracker.controller;

import tracker.view.TrackerFrame;

public class TrackerController
{
	private TrackerFrame appFrame;
	
	public TrackerController()
	{
		appFrame = new TrackerFrame(this);
	}
}
