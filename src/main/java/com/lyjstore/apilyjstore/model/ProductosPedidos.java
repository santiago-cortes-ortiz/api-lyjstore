package com.lyjstore.apilyjstore.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "productos_pedidos")
public class ProductosPedidos implements Serializable {

    @EmbeddedId
    private ProductosPedidosPK productosPedidosPK;

    private short cantidad;

    private Double precio;

    private LocalDate fecha;

    @JoinColumn(name = "id_producto",referencedColumnName = "id",insertable = false,updatable = false)
    @ManyToOne
    private Producto producto;

    @JoinColumn(name = "id_pedido",referencedColumnName = "id",insertable = false,updatable = false)
    @ManyToOne
    private Pedido pedido;


    public ProductosPedidos(ProductosPedidosPK productosPedidosPK, short cantidad, Double precio, LocalDate fecha) {
        this.productosPedidosPK = productosPedidosPK;
        this.cantidad = cantidad;
        this.precio = precio;
        this.fecha = fecha;

    }

    public ProductosPedidos() {
    }

    public ProductosPedidosPK getProductosPedidosPK() {
        return this.productosPedidosPK;
    }

    public short getCantidad() {
        return this.cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public Producto getProducto() {
        return this.producto;
    }

    public Pedido getPedido() {
        return this.pedido;
    }

    public void setProductosPedidosPK(ProductosPedidosPK productosPedidosPK) {
        this.productosPedidosPK = productosPedidosPK;
    }

    public void setCantidad(short cantidad) {
        this.cantidad = cantidad;
    }



    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
