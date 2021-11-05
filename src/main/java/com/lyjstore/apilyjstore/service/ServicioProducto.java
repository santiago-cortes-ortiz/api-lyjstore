package com.lyjstore.apilyjstore.service;

import com.lyjstore.apilyjstore.model.Producto;

import java.util.List;

public interface ServicioProducto {

    boolean guardarProducto(Producto producto);

    Producto buscarPorId(Long idProducto);


    List<Producto> listarProductos();

    List<Producto> listarProductosPorNombre(String nombre);

    boolean actualizarProducto(Long idProducto, Double precioVenta);

    boolean eliminarProductoPorId(Long id);


}
