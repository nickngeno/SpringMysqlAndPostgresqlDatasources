package com.kimmy.mysqlpostgres.models.player;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table()
public class Player implements Serializable {
    @Id
    @SequenceGenerator(name="auto-gen",sequenceName = "my_sequence")
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "auto-gen")
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="age")
    private int age;
    @Column(name="position")
    private String position;
    @Column(name="club")
    String club;

}
