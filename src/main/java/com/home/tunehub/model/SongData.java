package com.home.tunehub.model;

public class SongData {

	int id;
	String name;
	String artist;
	String genre;
	String imgUrl;
	String audioUrl;
	@Override
	public String toString() {
		return "SongData [id=" + id + ", name=" + name + ", artist=" + artist + ", genre=" + genre + ", imgUrl="
				+ imgUrl + ", audioUrl=" + audioUrl + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getAudioUrl() {
		return audioUrl;
	}
	public void setAudioUrl(String audioUrl) {
		this.audioUrl = audioUrl;
	}
	public SongData(int id, String name, String artist, String genre, String imgUrl, String audioUrl) {
		super();
		this.id = id;
		this.name = name;
		this.artist = artist;
		this.genre = genre;
		this.imgUrl = imgUrl;
		this.audioUrl = audioUrl;
	}
	public SongData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
