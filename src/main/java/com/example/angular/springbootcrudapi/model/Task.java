package com.example.angular.springbootcrudapi.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;


@Data//LOMBOK
@Entity
@Table(name = "task")
public class Task implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;


    @Column(name = "name", nullable = false)
    private String name;


    @Column(name = "description", nullable = false)
    private String description;

    public Task() {

    }

    //getters and


    public void setDescription(String description) {
        this.description = description;
    }
}


/*

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 */