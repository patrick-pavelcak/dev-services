package com.ibm.quarkus.academy;

import java.time.LocalDate;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Person extends PanacheEntity {

    enum Status {
        ALIVE,
        DECEASED
    }

    public String name;
    public LocalDate birthdate;
    public Status status;

    public Person() {
    }

    public Person(String name, LocalDate birthdate, Status status) {
        this.name = name;
        this.birthdate = birthdate;
        this.status = status;
    }
}
