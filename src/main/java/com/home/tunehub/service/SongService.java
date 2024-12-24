package com.home.tunehub.service;

import java.util.List;

import com.home.tunehub.entity.Song;
import com.home.tunehub.model.ArtistData;
import com.home.tunehub.model.GenreData;
import com.home.tunehub.model.SongData;

public interface SongService {

	public void addSong(SongData song) ;

	public List<Song> viewSong();

//	public List<String> getArtists();
	
	public List<GenreData> getGenresWithRandomImage() ;

	public List<Song> getSongByArtist(String artist);

	public List<ArtistData> getArtistsWithRandomImage();

	public List<Song> getSongByGenre(String genre);

	

}
