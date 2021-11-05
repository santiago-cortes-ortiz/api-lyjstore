package com.lyjstore.apilyjstore.repository;

import com.lyjstore.apilyjstore.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProductoRepository extends JpaRepository<Producto,Long> {
    List<Producto> findAllByNombreContains(String nombre);
}
