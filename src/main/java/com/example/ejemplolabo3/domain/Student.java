package com.example.ejemplolabo3.domain;

public class Student {
    private String nombre;
    private String apellido;
    private String fEntrada;
    private String carrera;
    private Boolean estado;


    public Student() {
    }

    public Student(String nombre, String apellido, String fEntrada, String carrera, Boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fEntrada = fEntrada;
        this.carrera = carrera;
        this.estado = estado;
    }
    


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFEntrada() {
        return this.fEntrada;
    }

    public void setFEntrada(String fEntrada) {
        this.fEntrada = fEntrada;
    }

    public String getCarrera() {
        return this.carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Boolean isEstado() {
        return this.estado;
    }

    public Boolean getEstado() {
        return this.estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String delegateStado() {
        return this.estado ? "Activo" : "Inactivo";
    }
}
