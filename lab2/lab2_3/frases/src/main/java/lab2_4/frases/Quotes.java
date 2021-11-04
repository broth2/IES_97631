package lab2_4.frases;

public class Quotes {
    private final String texto;
	private final long id;
    private final int movieid;

	public Quotes(long id, String texto, int movieid) {
		this.texto = texto;
		this.id = id;
        this.movieid = movieid;
	}

	public String getTexto() {
		return texto;
	}

	public long getId() {
		return id;
	}

    public int movieID(){
        return movieid;
    }
}
