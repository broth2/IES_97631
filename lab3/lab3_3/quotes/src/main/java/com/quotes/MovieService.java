package com.quotes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository repository;

    public Movie saveMovie(Movie movie) {
        return repository.save(movie);
    }
    
    public List<Movie> saveMovies(List<Movie> movies) {
        return repository.saveAll(movies);
    }

    public List<Movie> getMovies() {
        return repository.findAll();
    }

    public Movie getMoviesById(long id) {
        return repository.findById(id).orElse(null);
    }


    public Movie updateProduct(Movie movie) {
        Movie existingMovies = repository.findById(movie.getId()).orElse(null);
        existingMovies.setName(movie.getName());
        return repository.save(existingMovies);
    }
}