package lab2_4.frases;

public class Shows {
	private final String show;
    private final long id;

	public Shows(long id, String show) {
		this.show = show;
		this.id = id;
	}

	public String getShow() {
		return show;
	}

	public long getId() {
		return id;
	}
}
