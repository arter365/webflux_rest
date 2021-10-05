package com.factorysalad.webflux_rest.services;

import com.factorysalad.webflux_rest.document.Playlist;
import com.factorysalad.webflux_rest.repository.PlaylistRespository;
import com.factorysalad.webflux_rest.services.PlaylistService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

public class PlaylistServiceImpl implements PlaylistService {

    private final PlaylistRespository playlistRespository;

    public PlaylistServiceImpl(PlaylistRespository playlistRespository) {
        this.playlistRespository = playlistRespository;
    }

    @Override
    public Flux<Playlist> findAll() {
        return playlistRespository.findAll();
    }

    @Override
    public Mono<Playlist> findById(String id) {
        return playlistRespository.findById(id);
    }

    @Override
    public Mono<Playlist> save(Playlist playlist) {
        return playlistRespository.save(playlist);
    }

    // test를 위해 Dummy데이터를 올리는 서비스
//    @Override
//    public void addDummydata() {
//        playlistRespository.deleteAll()
//                .thenMany(
//                        Flux.just("API REST Spring Boot", "Deploy a Java application to the IBM Cloud", "Java 8",
//                                "Github", "Spring Security", "Web Service RESTFULL", "Spring Framework")
//                                .map(name -> new Playlist(UUID.randomUUID().toString(), name))
//                                .flatMap(playlistRespository::save))
//                .subscribe(System.out::println);
//    }
}