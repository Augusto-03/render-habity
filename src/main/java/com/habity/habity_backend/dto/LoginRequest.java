package com.habity.habity_backend.dto;

public class LoginRequest {
    private String email;
    private String password;
    private Integer edad;
    private Double altura;
    private Double peso;
    private String imagenUrl;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }


    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }


    public Double getPeso() {
        return peso;
    }
    
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
