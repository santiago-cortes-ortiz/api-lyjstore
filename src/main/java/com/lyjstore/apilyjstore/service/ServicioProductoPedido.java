package com.lyjstore.apilyjstore.service;


import com.lyjstore.apilyjstore.model.ProductosPedidos;

import java.util.List;

public interface ServicioProductoPedido {

    boolean guardarProductosPedidos(ProductosPedidos productosPedidos);

    ProductosPedidos buscarProductosPedidosPorIds(Long idProdducto,Long idPedido);

    List<ProductosPedidos> listarProductosPedidos();

    boolean elimiarProductoPedidosPorIds(Long idProdducto,Long idPedido);

    boolean actualizarProductosPedidos(Long idProducto, Long idPedido, Short cantidad);

}
