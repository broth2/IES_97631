package com.quotes;

// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.Table;
import javax.persistence.*;


@Entity
@Table(name = "quotes")
public class Quotes {
    private String texto;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;


	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_order")
    private Movie order;

	private int year;

	public Quotes(){}

	public Quotes( String texto, int year, Movie order) {
		this.texto = texto;
		this.year = year;
		this.order = order;
	}

	
	public Movie getOrder() {
		return order;
	}

	public void setOrder(Movie order) {
		this.order = order;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "texto", nullable = false)
	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}


	public void setYear(int year) {
		this.year = year;
	}

	@Column(name = "year", nullable = false)
	public int getYear() {
		return year;
	}

	@Override
    public String toString() {

	   return "[id=" + id + ", texto=" + texto + ", movie=" + order + ", year=" + year + "]";
    }

	
}
