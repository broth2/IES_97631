package com.quotes;

// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.Table;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {
	private String name;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;	



	public Movie(){}

	public Movie(String name) {
		this.name = name;
	}





	public void setName(String name) {
		this.name = name;
	}
	
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	
	@Column(name = "name", nullable = false)
	public String getName() {
		return name;
	}
	
	@Override
    public String toString() {

	   return "[id=" + id + ", name=" + name + "]" ;
    }

	
}
