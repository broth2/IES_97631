package lab2_4.frases;

import java.util.concurrent.atomic.AtomicLong;
import java.util.*;

public class DB {
    private static final DB instance = new DB();
    private final AtomicLong counter = new AtomicLong();
    private final AtomicLong counter2 = new AtomicLong();
    public Quotes[] allQuotes;
    public Shows[] allShows;
    public ArrayList<Quotes> smQuotes;


    private DB(){
        this.allQuotes = new Quotes[]{ new Quotes(counter.incrementAndGet(), "ola mundo", 4),
                                new Quotes(counter.incrementAndGet(), "tudo bem contigo", 3),
                                new Quotes(counter.incrementAndGet(), "a vida e bela", 4),
                                new Quotes(counter.incrementAndGet(), "gosto de musica", 1),
                                new Quotes(counter.incrementAndGet(), "random quote desinteressante", 2),
                                new Quotes(counter.incrementAndGet(), "artefacto do museu belho", 2)};

        this.allShows = new Shows[]{ new Shows(counter2.incrementAndGet(), "Show 1"),
                                new Shows(counter2.incrementAndGet(), "Show 2"),
                                new Shows(counter2.incrementAndGet(), "Show 3"),
                                new Shows(counter2.incrementAndGet(), "Show 4"),
                                new Shows(counter2.incrementAndGet(), "Show 5"),
                                new Shows(counter2.incrementAndGet(), "Show 6")};
    }

    public Quotes getRandom() {
        int rnd = new Random().nextInt(allQuotes.length);
        return allQuotes[rnd];
    }

    public Shows[] getShows() {
        return this.allShows;
    }

    public ArrayList<Quotes> spQuotes(int ident){
        smQuotes = new ArrayList<Quotes>();
        for (Quotes qt : allQuotes){
            if(qt.movieID() == ident){
                smQuotes.add(qt);
            }
        }
        return smQuotes;
    }

    public static DB getInstance(){
        return instance;
    }
    
}
