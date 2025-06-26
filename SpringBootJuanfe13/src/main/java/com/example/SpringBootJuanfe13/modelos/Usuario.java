package com.example.SpringBootJuanfe13.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombres", length = 50)
    private String nombres;
    @Column(name = "contraseña", length = 10)
    private String contraseña;
    @Column(name = "correo", length = 50)
    private String correo;
    @Column(name = "edad")
    private Integer edad;
    @Column(name = "fechaNacimiento")
    private LocalDate fechaNacimiento;

    public Usuario() {
    }

    public Usuario(Integer id, String nombres, String contraseña, String correo, Integer edad, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombres = nombres;
        this.contraseña = contraseña;
        this.correo = correo;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
