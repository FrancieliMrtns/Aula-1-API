package application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table; 
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
@Table(name = "alunos")
public class Aluno {
    @id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private long id;
    @Column(nullale = false)
    private String nome;

    
    
}