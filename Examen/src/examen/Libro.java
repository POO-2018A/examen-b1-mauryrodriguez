/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author ESFOT
 */
public class Libro {
    private String titulo;
    private String autor;
    private int año;
    private boolean favorito;

    public Libro(String titulo, String autor, int año, boolean favorito) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.favorito = favorito;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    @Override
    public String toString() {
        return "titulo: " + titulo + ", autor: " + autor + ", \nAño: " + año + ", Favorito: " + favorito ;
    }

    
    
    
    
}
