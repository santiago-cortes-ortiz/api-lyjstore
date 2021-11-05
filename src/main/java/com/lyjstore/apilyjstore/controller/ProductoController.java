package com.lyjstore.apilyjstore.controller;

import com.lyjstore.apilyjstore.model.Producto;
import com.lyjstore.apilyjstore.service.ServicioProducto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("productos")
public class ProductoController {

    private final ServicioProducto servicioProducto;

    public ProductoController(ServicioProducto servicioProducto) {
        this.servicioProducto = servicioProducto;
    }

    @PostMapping("/guardarProducto")
    public ResponseEntity guardarProducto(@RequestBody Producto producto){
        return new ResponseEntity(servicioProducto.guardarProducto(producto), HttpStatus.CREATED);
    }

    @GetMapping("/buscarPorId/{idProducto}")
    public ResponseEntity buscarProductoPorId(@PathVariable("idProducto") Long idProducto){
        return new ResponseEntity(servicioProducto.buscarPorId(idProducto),HttpStatus.OK);
    }

    @GetMapping("/listarProductos")
    public ResponseEntity listarProductos(){
        return new ResponseEntity(servicioProducto.listarProductos(),HttpStatus.OK);
    }

    @GetMapping("/listarProductos/{nombre}")
    public ResponseEntity listarProductos(@PathVariable("nombre") String nombre){
        return new ResponseEntity(servicioProducto.listarProductosPorNombre(nombre),HttpStatus.OK);
    }

    @PutMapping("/actualizarProducto/{idProducto}/{precioDeVenta}")
    public ResponseEntity actualizarProducto(@PathVariable("idProducto") Long idProducto,@PathVariable("precioDeVenta") Double precioVenta){
        return new ResponseEntity(servicioProducto.actualizarProducto(idProducto,precioVenta),HttpStatus.OK);
    }

    @DeleteMapping("/eliminarProductoPorId/{idProducto}")
    public ResponseEntity eliminarProductoPorId(@PathVariable("idProducto") Long idProducto){
        return new ResponseEntity(servicioProducto.eliminarProductoPorId(idProducto),HttpStatus.OK);
    }



}
