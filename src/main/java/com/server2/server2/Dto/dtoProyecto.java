
package com.server2.server2.Dto;

import javax.validation.constraints.NotBlank;


public class dtoProyecto {
    @NotBlank
    private String titulo;
    @NotBlank
    private String resumen;
    @NotBlank
    private String enlace;

    public dtoProyecto() {
    }

    public dtoProyecto(String titulo, String resumen, String enlace) {
        this.titulo = titulo;
        this.resumen = resumen;
        this.enlace = enlace;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }
    
}
