package com.arief.mvc.domain;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Min;

/**
 * Created by Arief on 9/3/2017.
 */
public class User {


    @Min(message = "tidak boleh kurang dari 0",value = 0)
    private int id;


    @NotBlank(message = "nama tidak boleh kosong")
    private String nama;


    public User() {
    }

    public User(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
