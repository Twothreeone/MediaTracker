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
		// appFrame = new TrackerFrame(this);
		String test = "uejfuejfuejeuekaeoidkdoeodlf";
		media = new ArrayList<Media>();
		for (int i = 0; i < test.length(); i++)
		{
			media.add(new Game(test.substring(i, i + 1), null, null, null, null, (int) (Math.random() * 10)));
		}
		media.sort((obj1, obj2) -> 
		{
			if (obj1.getRating() - obj2.getRating() == 0)
			{
				return obj1.getTitle().compareTo(obj2.getTitle());
			}
			return obj1.getRating() - obj2.getRating();
		});
		for (int i = 0; i < media.size(); i++)
		{
			System.out.println(media.get(i).getTitle() + " " + media.get(i).getRating());
		}
	}
}
