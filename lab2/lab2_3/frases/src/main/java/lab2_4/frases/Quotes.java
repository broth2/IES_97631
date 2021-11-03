package lab2_4.frases;

import java.util.*;

public class Quotes {
    private final String texto;
	private final long id;
    private final String[] allquotes = {"quote1", "quote2", "quote3", "quote4", "quote5", "quote6"};

	public Quotes(String texto, long id) {
		this.texto = getRandom(getQuotes());
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public long getId() {
		return id;
	}

    public String[] getQuotes(){
        return allquotes;
    }

    public String getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }
}
