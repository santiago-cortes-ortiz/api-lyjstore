package com.lyjstore.apilyjstore.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "productos")
public class Producto implements Serializable {
    @Id
    private Long id;

    private String nombre;

    private Double precioVenta;

    private Long upc;

    public Producto(Long id, String nombre, Double precioVenta, Long upc) {
        this.id = id;
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.upc = upc;
    }

    public Producto() {
    }

    public Long getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Double getPrecioVenta() {
        return this.precioVenta;
    }

    public Long getUpc() {
        return this.upc;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setUpc(Long upc) {
        this.upc = upc;
    }
}
