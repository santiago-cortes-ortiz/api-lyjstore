package com.lyjstore.apilyjstore.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "pedidos")
public class Pedido implements Serializable {
    @Id
    private Long id;

    private LocalDate fecha;

    private Double precioEnvio;

    private Double precioImpuestos;

    private String guia;


    public Long getId() {
        return this.id;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public Double getPrecioEnvio() {
        return this.precioEnvio;
    }

    public Double getPrecioImpuestos() {
        return this.precioImpuestos;
    }

    public String getGuia() {
        return this.guia;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setPrecioEnvio(Double precioEnvio) {
        this.precioEnvio = precioEnvio;
    }

    public void setPrecioImpuestos(Double precioImpuestos) {
        this.precioImpuestos = precioImpuestos;
    }

    public void setGuia(String guia) {
        this.guia = guia;
    }
}
