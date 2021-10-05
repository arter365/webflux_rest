package com.factorysalad.webflux_rest.controller;

import com.factorysalad.webflux_rest.document.Playlist;
import com.factorysalad.webflux_rest.services.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class PlaylistController {

    private final PlaylistService playlistService;

    public PlaylistController(PlaylistService playlistService) {
        this.playlistService = playlistService;
    }

    @GetMapping(value = "/playlist")
    public Flux<Playlist> getPlaylist() {
        return playlistService.findAll();
    }

    @GetMapping(value = "/playlist/{id}")
    public Mono<Playlist> getPlaylistId(@PathVariable String id) {
        return playlistService.findById(id);
    }

    @PostMapping(value = "/playlist")
    public Mono<Playlist> save(@RequestBody Playlist playlist) {
        return playlistService.save(playlist);
    }
}
