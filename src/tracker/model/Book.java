package tracker.model;

import java.util.Date;

public class Book extends Media
{
	public Book(String title, String type, String[] genres, Date startDate, Date endDate, int rating)
	{
		super(title, type, genres, startDate, endDate, rating);
	}
}
