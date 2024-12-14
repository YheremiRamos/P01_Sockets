/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.dswii_u01_t02_socketsstreams_usuario.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class Rol implements Serializable {
    private Long id;
    private String nombre;
    private String descripcion;
    private LocalDateTime fechaCreacion;
    private List<Permiso> permisos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public List<Permiso> getPermisos() {
        return permisos;
    }

    public void setPermisos(List<Permiso> permisos) {
        this.permisos = permisos;
    }

    public Rol(Long id, String nombre, String descripcion, LocalDateTime fechaCreacion, List<Permiso> permisos) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.permisos = permisos;
    }

    @Override
    public String toString() {
        return "Rol{" + "id=" + id + ", nombre=" +
                nombre + ", descripcion=" + descripcion
                + ", fechaCreacion=" + fechaCreacion +
                ", permisos=" + permisos + '}';
    }

    
    
}
