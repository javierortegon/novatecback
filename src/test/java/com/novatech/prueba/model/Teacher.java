package com.novatech.prueba.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "teacher")
@Getter
@Setter
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_teacher", unique = true)
    private Long id;

    @Column(length = 50, nullable = false)
    private String name;
    @Column(length = 50, nullable = false, name = "last_name")
    private String lastName;
    @Column(length = 100, nullable = false)
    private String email;
    @Column(length = 20, nullable = false)
    private String phone;
}
