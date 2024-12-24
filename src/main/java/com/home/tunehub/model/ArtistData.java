package com.home.tunehub.model;

public class ArtistData {
	String artist;
    String imageUrl;
	@Override
	public String toString() {
		return "ArtistData [artist=" + artist + ", imageUrl=" + imageUrl + "]";
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public ArtistData(String artist, String imageUrl) {
		super();
		this.artist = artist;
		this.imageUrl = imageUrl;
	}
	public ArtistData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ArtistData(String artist2, byte[] randomImageUrl) {
		// TODO Auto-generated constructor stub
	}
}
