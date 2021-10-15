package com.example.ms_formation.entites;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Question {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private  Long id;
        private String label;
        @OneToMany
        private List<Reponse> reponses;


    }
