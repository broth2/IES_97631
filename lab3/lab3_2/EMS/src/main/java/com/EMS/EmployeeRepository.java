package com.EMS;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

    List<Employee> findByEmailId(String email);
    //Employee findById(long id);
}