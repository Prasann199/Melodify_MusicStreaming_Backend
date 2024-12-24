package com.home.tunehub.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.home.tunehub.entity.Playlist;

@Repository
public interface PlaylistRepository extends JpaRepository<Playlist, Integer> {
	Playlist findByName(String name);

    List<Playlist> findByCreatedBy(String createdBy);
//    @Query("SELECT p FROM playlist p WHERE p.name = :name AND p.created_by = :createdBy")
	Playlist findByNameAndCreatedBy(String name, String createdBy);
}
