package com.example.ms_formation.entites;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Builder
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Resultat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private Double note;
@OneToOne
private Reponse reponse;



}
