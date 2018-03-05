package tracker.model;

import java.util.Date;

public class Movie extends Media
{
	public Movie(String title, String type, String[] genres, Date startDate, Date endDate, int rating)
	{
		super(title, type, genres, startDate, endDate, rating);
	}
}
