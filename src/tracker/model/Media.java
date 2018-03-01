package tracker.model;

import java.io.Serializable;
import java.util.Date;

public abstract class Media implements Serializable
{
	protected String title, type;
	protected String[] genres;
	protected Date startDate, endDate;
	protected int rating;
	
	public Media(String title, String type, String[] genres, Date startDate, Date endDate, int rating)
	{
		this.title = title;
		this.type = type;
		this.genres = genres;
		this.startDate = startDate;
		this.endDate = endDate;
		this.rating = rating;
	}
}
