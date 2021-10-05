package com.example.ms_formation.doa;

import com.example.ms_formation.entites.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person,Long> {
    Person findPersonById(Long id);
}
