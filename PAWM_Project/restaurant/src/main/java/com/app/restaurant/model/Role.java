package com.app.restaurant.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false, unique = true, columnDefinition = "BINARY(16)")
    private UUID id;

    @Column
    private String description;

    @Column
    private String name;

    protected Role(){
        id = UUID.randomUUID();
    }

}
