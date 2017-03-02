package com.parasol.core.myclass;

import java.io.Serializable;

import com.parasol.core.tender.Tender;

public class DemandHall implements Serializable {
	

	private Tender tender;
	private String time;
	private String genres;
	private String genre;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Tender getTender() {
		return tender;
	}
	public void setTender(Tender tender) {
		this.tender = tender;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getGenres() {
		return genres;
	}
	public void setGenres(String genres) {
		this.genres = genres;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "DemandHall [tender=" + tender + ", time=" + time + ", genres=" + genres + ", genre=" + genre + "]";
	}
	
	
}
