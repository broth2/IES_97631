package com.quotes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import com.quotes.errors.ResourceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
public class QuotesController {
    @Autowired
    private QuotesService quotesService;
    @Autowired
    private MovieService moviesService;
    @Autowired
    private QuotesRepository quotesRepository;
    @Autowired
    private MovieRepository moviesRepository;

    

    @GetMapping("/quotes")
    public List<Quotes> getAllQuotes() {
        return quotesService.getQuotes();
    }


    @GetMapping("/quotes/{id}")
    public Quotes getQuotesById(@PathVariable(value = "id") Long quotesId){
        return quotesService.getQuotesById(quotesId);
    }
    
    @PostMapping("/quotes")
    public Quotes createQuotes(@RequestBody Quotes quote) {
        return quotesService.saveQuote(quote);
    }


    @PutMapping("/quotes/{id}")
    public Quotes updateQuotes(@RequestBody Quotes product) {
        return quotesService.updateProduct(product);
    }

    @DeleteMapping("/quotes/{id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
         throws ResourceNotFoundException {
        Quotes employee = quotesRepository.findById(employeeId)
       .orElseThrow(() -> new ResourceNotFoundException("Quote not found for this id :: " + employeeId));

        quotesRepository.delete(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }


    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return moviesService.getMovies();
    }


    @GetMapping("/movies/{id}")
    public Movie getMoviesById(@PathVariable(value = "id") Long movieId){
        return moviesService.getMoviesById(movieId);
    }
    
    @PostMapping("/movies")
    public Movie createMovie(@RequestBody Movie movie) {
        return moviesService.saveMovie(movie);
    }




}