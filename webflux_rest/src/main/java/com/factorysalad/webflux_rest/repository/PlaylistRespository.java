package com.factorysalad.webflux_rest.repository;

import com.factorysalad.webflux_rest.document.Playlist;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import reactor.core.publisher.Flux;

/*
ReactiveMongoRepository<Class, Id Type>
 */
public interface PlaylistRespository extends ReactiveMongoRepository<Playlist, String>, ReactiveQueryByExampleExecutor<Playlist> {

}
