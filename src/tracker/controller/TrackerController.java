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
		String test = "qweoijsadfnvmxcvoeq2435234edaf4324lkjpqofjweio123454536ladfknxcvznalfwe65371iohkremkqnhaddovcx";
		media = new ArrayList<Media>();
		for (int i = 0; i < test.length(); i++)
		{
			media.add(new Game(test.substring(i, i + 1), null, null, null, null, 0));
		}
		media.sort((obj1, obj2) -> obj1.getTitle().compareTo(obj2.getTitle()));
		for (int i = 0; i < media.size(); i++)
		{
			System.out.println(media.get(i).getTitle());
		}
	}
}
