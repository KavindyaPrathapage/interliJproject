package com.company.empmgmtsystem.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Entity
@Setter
@Getter

public class Employee {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private long id;
        private String name;
        private String email;
        private String position;
        private double salary;

}

