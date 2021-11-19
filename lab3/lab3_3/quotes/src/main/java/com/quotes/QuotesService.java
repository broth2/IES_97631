package com.quotes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuotesService {
    @Autowired
    private QuotesRepository repository;

    public Quotes saveQuote(Quotes quote) {
        return repository.save(quote);
    }
    
    public List<Quotes> saveQuotes(List<Quotes> quotes) {
        return repository.saveAll(quotes);
    }

    public List<Quotes> getQuotes() {
        return repository.findAll();
    }

    public Quotes getQuotesById(long id) {
        return repository.findById(id).orElse(null);
    }


    public Quotes updateProduct(Quotes quote) {
        Quotes existingQuotes = repository.findById(quote.getId()).orElse(null);
        existingQuotes.setTexto(quote.getTexto());
        existingQuotes.setYear(quote.getYear());
        existingQuotes.setOrder(quote.getOrder());
        return repository.save(existingQuotes);
    }
}