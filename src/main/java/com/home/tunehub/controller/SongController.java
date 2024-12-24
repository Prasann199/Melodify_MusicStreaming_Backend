package com.home.tunehub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.home.tunehub.entity.Song;
import com.home.tunehub.model.ArtistData;
import com.home.tunehub.model.GenreData;
import com.home.tunehub.model.SongData;
import com.home.tunehub.service.SongService;

@RestController
//@CrossOrigin("*")
public class SongController {
	@Autowired
	SongService songService;
	
	@PostMapping("/addsong")
	public String addSong(@RequestBody SongData song) {
		songService.addSong(song);
		return "Song added Successfully";
	}
	
	@GetMapping("/getsongs")
	public List<Song> viewSong(){
		List<Song> songs=songService.viewSong();
		return songs;		
	}
//	@GetMapping("/getArtists")
//	public List<String> getArtists(){
//		return songService.getArtists();
//	}
	 @GetMapping("/getArtists")
	    public List<ArtistData> getArtists() {
	        return songService.getArtistsWithRandomImage();
	    }
	 
	 @GetMapping("/getGenres")
	    public List<GenreData> getGenres() {
	        return songService.getGenresWithRandomImage();
	    }
	 
	@GetMapping("songs/{artist}")
	public List<Song> getSongByArtist(@PathVariable String artist){
		    List<Song> songs = songService.getSongByArtist(artist);
		return songs;
	}
	
	@GetMapping("songs/genre/{genre}")
    public List<Song> getSongByGenre(@PathVariable String genre) {
        return songService.getSongByGenre(genre);
    }
}
