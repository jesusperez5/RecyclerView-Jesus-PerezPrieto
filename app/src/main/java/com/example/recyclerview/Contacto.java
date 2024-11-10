package com.example.recyclerview;

public class Contacto {
    private String nombre;
    private String apellidos;
    private int imagen;
    private int numero;

    public Contacto(String nombre, String apellidos, int imagen, int numero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.imagen = imagen;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", imagen=" + imagen +
                ", numero=" + numero +
                '}';
    }
}
