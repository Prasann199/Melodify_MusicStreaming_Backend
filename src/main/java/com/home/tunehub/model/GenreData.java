package com.home.tunehub.model;

public class GenreData {
	String genre;
    String imageUrl;
	public GenreData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GenreData(String genre, String imageUrl) {
		super();
		this.genre = genre;
		this.imageUrl = imageUrl;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	@Override
	public String toString() {
		return "GenreData [genre=" + genre + ", imageUrl=" + imageUrl + "]";
	}
    
}
