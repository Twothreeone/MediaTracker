package tracker.controller;

import tracker.view.TrackerFrame;
import tracker.model.*;
import java.util.List;
import java.util.ArrayList;

public class TrackerController
{
	private TrackerFrame appFrame;
	private List<Media> media;

	public TrackerController()
	{
		appFrame = new TrackerFrame(this);
		media = new ArrayList<Media>();
		for (int i = 0; i < 100000; i++)
		{
			media.add(new Game(null, null, null, null, null, (int) (Math.random() * 200000)));
		}
		for (int i = 0; i < 100000; i++)
		{
			media.add(new Book(null, null, null, null, null, (int) (Math.random() * 200000)));
		}
		for (int i = 0; i < 100000; i++)
		{
			media.add(new Movie(null, null, null, null, null, (int) (Math.random() * 200000)));
		}
		for (int i = 0; i < 100000; i++)
		{
			media.add(new Show(null, null, null, null, null, (int) (Math.random() * 200000)));
		}
		media.sort((obj1, obj2) -> obj1.getRating() - obj2.getRating());
		for (Media med : media)
		{
			System.out.println(med.getRating());
		}
	}
}
