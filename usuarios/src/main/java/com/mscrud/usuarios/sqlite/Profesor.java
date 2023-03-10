package com.mscrud.usuarios.sqlite;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Table(name = "profesor")
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

    @JoinColumn(name="subject_id",unique = false)
    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH})
    private Materias subject;

    public Profesor() {
    }

    public Profesor(String name, Materias subject) {
        this.name = name;
        this.subject = subject;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Materias getSubject() {
        return subject;
    }

    public void setSubject(Materias subject) {
        this.subject = subject;
    }
}
