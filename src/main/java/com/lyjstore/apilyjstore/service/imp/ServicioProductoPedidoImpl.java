package com.lyjstore.apilyjstore.service.imp;

import com.lyjstore.apilyjstore.model.ProductosPedidos;
import com.lyjstore.apilyjstore.model.ProductosPedidosPK;
import com.lyjstore.apilyjstore.repository.ProductoPedidoRepository;
import com.lyjstore.apilyjstore.service.ServicioProductoPedido;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioProductoPedidoImpl implements ServicioProductoPedido {

    private final ProductoPedidoRepository productoPedidoRepository;

    public ServicioProductoPedidoImpl(ProductoPedidoRepository productoPedidoRepository) {
        this.productoPedidoRepository = productoPedidoRepository;
    }

    @Override
    public boolean guardarProductosPedidos(ProductosPedidos productosPedidos) {
        try{
            productoPedidoRepository.save(productosPedidos);
            return true;
        }catch (Exception ex){
            return false;
        }
    }

    @Override
    public ProductosPedidos buscarProductosPedidosPorIds(Long idProducto, Long idPedido) {
        return productoPedidoRepository.
                findByProductosPedidosPKIdProductoAndProductosPedidosPKIdPedido(idProducto,idPedido)
                .orElseThrow(() -> {throw new RuntimeException("No se encontro :(");});
    }

    @Override
    public List<ProductosPedidos> listarProductosPedidos() {
        return productoPedidoRepository.findAll();
    }

    @Override
    public boolean elimiarProductoPedidosPorIds(Long idProducto, Long idPedido)
    {
        try
        {
            ProductosPedidosPK test = new ProductosPedidosPK(idProducto,idPedido);
            productoPedidoRepository.deleteById(test);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }

    @Override
    public boolean actualizarProductosPedidos(Long idProducto, Long idPedido, Short cantidad) {

        try
        {
            ProductosPedidos buscado = buscarProductosPedidosPorIds(idProducto, idPedido);

            buscado.setCantidad(cantidad);

            productoPedidoRepository.save(buscado);

            return true;

        }
        catch(Exception e)
        {
            return false;
        }
    }


}
