package lab2_4.frases;

public class Shows {
    private final int id;
	private final String filme;

	public Shows(String filme, int id) {
		this.id = id;
		this.filme = filme;
	}

	public int getId() {
		return id;
	}

	public String getFilme() {
		return filme;
	}
}
