package com.factorysalad.webflux_rest.services;

import com.factorysalad.webflux_rest.document.Playlist;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PlaylistService {
    Flux<Playlist> findAll();
    Mono<Playlist> findById(String id);
    Mono<Playlist> save(Playlist playlist);
    //void addDummydata();
}
