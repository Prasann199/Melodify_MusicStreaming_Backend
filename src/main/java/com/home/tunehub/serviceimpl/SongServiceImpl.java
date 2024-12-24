package com.home.tunehub.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.tunehub.entity.Song;
import com.home.tunehub.model.ArtistData;
import com.home.tunehub.model.GenreData;
import com.home.tunehub.model.SongData;
import com.home.tunehub.repository.SongRepository;
import com.home.tunehub.service.SongService;

@Service
public class SongServiceImpl implements SongService {

    @Autowired
    SongRepository songRepository;

    @Override
    public void addSong(SongData song) {
        Song sng = new Song();
        sng.setName(song.getName());
        sng.setArtist(song.getArtist());
        sng.setGenre(song.getGenre());
        sng.setAudioUrl(song.getAudioUrl());
        sng.setImgUrl(song.getImgUrl());
        songRepository.save(sng);
    }

    @Override
    public List<Song> viewSong() {
        return songRepository.findAll();
    }

    public List<ArtistData> getArtistsWithRandomImage() {
        List<String> artists = songRepository.findArtists();
        return artists.stream()
                .map(artist -> {
                    List<Song> songsByArtist = songRepository.findByArtist(artist);
                    if (songsByArtist.isEmpty()) {
                        return new ArtistData(artist, ""); // Fallback to empty image URL
                    }
                    String randomImageUrl = songsByArtist.get((int) (Math.random() * songsByArtist.size())).getImgUrl();
                    return new ArtistData(artist, randomImageUrl);
                })
                .collect(Collectors.toList());
    }

    public List<GenreData> getGenresWithRandomImage() {
        List<String> genres = songRepository.findGenres();
        return genres.stream()
                .map(genre -> {
                    List<Song> songsByGenre = songRepository.findByGenre(genre);
                    if (songsByGenre.isEmpty()) {
                        return new GenreData(genre, ""); // Fallback to empty image URL
                    }
                    String randomImageUrl = songsByGenre.get((int) (Math.random() * songsByGenre.size())).getImgUrl();
                    return new GenreData(genre, randomImageUrl);
                })
                .collect(Collectors.toList());
    }

    @Override
    public List<Song> getSongByArtist(String artist) {
        return songRepository.findByArtist(artist);
    }

    @Override
    public List<Song> getSongByGenre(String genre) {
        return songRepository.findByGenre(genre);
    }
}
