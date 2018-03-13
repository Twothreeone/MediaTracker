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

	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}

	/**
	 * @return the type
	 */
	public String getType()
	{
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type)
	{
		this.type = type;
	}

	/**
	 * @return the genres
	 */
	public String[] getGenres()
	{
		return genres;
	}

	/**
	 * @param genres the genres to set
	 */
	public void setGenres(String[] genres)
	{
		this.genres = genres;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate()
	{
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate)
	{
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate()
	{
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate)
	{
		this.endDate = endDate;
	}

	/**
	 * @return the rating
	 */
	public int getRating()
	{
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating)
	{
		this.rating = rating;
	}
}
