package com.example.database.entity;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "Kullanicilar")
@Data
public class User1 extends BaseEntity {
    @Id
@SequenceGenerator(name = "seqname",sequenceName = "User_gen",initialValue = 100, allocationSize = 50)
@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seqname")
@Column(name = "ID")
    private Long id;
@Column( name = "Name")
    private String name;
@Column(name = "Surname")
    private String surname;



}
