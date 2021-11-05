package com.lyjstore.apilyjstore.repository;

import com.lyjstore.apilyjstore.model.ProductosPedidos;
import com.lyjstore.apilyjstore.model.ProductosPedidosPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductoPedidoRepository extends JpaRepository<ProductosPedidos, ProductosPedidosPK> {

    Optional<ProductosPedidos> findByProductosPedidosPKIdProductoAndProductosPedidosPKIdPedido(Long idProducto, Long idPedido);
    
}
