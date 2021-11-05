package com.lyjstore.apilyjstore.service.imp;

import com.lyjstore.apilyjstore.model.Producto;
import com.lyjstore.apilyjstore.repository.ProductoRepository;
import com.lyjstore.apilyjstore.service.ServicioProducto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioProductoImpl implements ServicioProducto {

    private final ProductoRepository productoRepository;

    public ServicioProductoImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public boolean guardarProducto(Producto producto) {
        try{
            productoRepository.save(producto);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    @Override
    public Producto buscarPorId(Long idProducto) {
        return productoRepository.findById(idProducto).orElseThrow(() -> new RuntimeException("No se encontro"));
    }

    @Override
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    @Override
    public List<Producto> listarProductosPorNombre(String nombre) {
        return productoRepository.findAllByNombreContains(nombre);
    }

    @Override
    public boolean actualizarProducto(Long idProducto, Double precioVenta) {
        try{
            Producto productoBuscado = productoRepository.findById(idProducto).get();
            productoBuscado.setPrecioVenta(precioVenta);
            productoRepository.save(productoBuscado);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    @Override
    public boolean eliminarProductoPorId(Long id) {
        try{
            productoRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
