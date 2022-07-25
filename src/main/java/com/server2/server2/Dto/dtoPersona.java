
package com.server2.server2.Dto;

import java.sql.Blob;
import javax.validation.constraints.NotBlank;


public class dtoPersona {
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    @NotBlank
    private String bio;
    @NotBlank
    private Blob img;

    public dtoPersona() {
    }

    public dtoPersona(String nombre, String apellido, String bio, Blob img) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.bio = bio;
        this.img = img;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Blob getImg() {
        return img;
    }

    public void setImg(Blob img) {
        this.img = img;
    }

    

   
    
}