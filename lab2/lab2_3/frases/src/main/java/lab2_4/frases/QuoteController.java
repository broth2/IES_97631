package lab2_4.frases;


import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

	private final AtomicLong counter = new AtomicLong();

    @GetMapping("/quote")
    public Quotes quotes(){
        return new Quotes("texto", counter.incrementAndGet());
    }
}
