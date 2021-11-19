package com.quotes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.ArrayList;



@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

    //List<Quotes> findById(Long id);
    //List<Quotes> findByYear(int year);
    //Employee findById(long id);
}