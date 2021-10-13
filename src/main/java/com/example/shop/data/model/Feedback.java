package com.example.shop.data.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Feedback {

    @Id
    private long id;
    private String comment;
    private String rating;

}
