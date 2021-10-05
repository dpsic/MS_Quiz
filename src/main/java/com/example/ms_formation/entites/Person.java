package com.example.ms_formation.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    @ManyToMany(fetch=FetchType.EAGER)
    private Collection<Formation> formations=new ArrayList<>();

}
