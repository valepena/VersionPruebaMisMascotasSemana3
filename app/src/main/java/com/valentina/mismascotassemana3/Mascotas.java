package com.valentina.mismascotassemana3;

public class Mascotas {

    private String nombre;
    private int foto;
    private int likes;

    public Mascotas(int foto, String nombre, int likes) {
        this.nombre = nombre;
        this.foto = foto;
        this.likes = likes;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Mascotas{" +
                "Nombre='" + nombre + '\'' +
                ", foto=" + foto +
                ", likes=" + likes +
                '}';
    }
}

