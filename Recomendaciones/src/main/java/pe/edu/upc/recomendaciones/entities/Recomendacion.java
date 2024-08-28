package pe.edu.upc.recomendaciones.entities;
import jakarta.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "Recomendacion")
public class Recomendacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_recomendacion;
    private int id_usuario;
    private int id_tendencia;
    @Column(name = "descripcion",nullable = false,length = 150)
    private String descripcion;
    @Column(name = "fecha_creacion",nullable = false)
    private LocalDate fecha_creacion;
    @Column(name = "fecha_modificacion",nullable = false)
    private LocalDate fecha_modificacion;

    public Recomendacion() {
    }

    public Recomendacion(int id_recomendacion, int id_usuario, int id_tendencia, String descripcion, LocalDate fecha_creacion, LocalDate fecha_modificacion) {
        this.id_recomendacion = id_recomendacion;
        this.id_usuario = id_usuario;
        this.id_tendencia = id_tendencia;
        this.descripcion = descripcion;
        this.fecha_creacion = fecha_creacion;
        this.fecha_modificacion = fecha_modificacion;
    }

    public int getId_recomendacion() {
        return id_recomendacion;
    }

    public void setId_recomendacion(int id_recomendacion) {
        this.id_recomendacion = id_recomendacion;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_tendencia() {
        return id_tendencia;
    }

    public void setId_tendencia(int id_tendencia) {
        this.id_tendencia = id_tendencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(LocalDate fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public LocalDate getFecha_modificacion() {
        return fecha_modificacion;
    }

    public void setFecha_modificacion(LocalDate fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }
}
