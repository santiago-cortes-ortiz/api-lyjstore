package com.lyjstore.apilyjstore.controller;

import com.lyjstore.apilyjstore.model.ProductosPedidos;
import com.lyjstore.apilyjstore.service.ServicioProductoPedido;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("productos-pedidos")
public class ProductoPedidoController {

    private final ServicioProductoPedido servicioProductoPedido;

    public ProductoPedidoController(ServicioProductoPedido servicioProductoPedido) {
        this.servicioProductoPedido = servicioProductoPedido;
    }

    @PostMapping("/guardarProductoPedido")
    public ResponseEntity guardarProductoPedido(@RequestBody ProductosPedidos productosPedidos){
        return new ResponseEntity(
                servicioProductoPedido.guardarProductosPedidos(productosPedidos),
                HttpStatus.CREATED);
    }

    @GetMapping("/listarProductosPedidos")
    public ResponseEntity listarProductosPedidos(){
        return new ResponseEntity(servicioProductoPedido.listarProductosPedidos(),
                HttpStatus.OK);
    }

    @DeleteMapping("/eliminarProductosPedidos/{idProducto}/{idPedido}")
    public ResponseEntity eliminarProductosPedidos(@PathVariable("idProducto") Long idProducto,@PathVariable("idPedido") Long idPedido)
    {
        return new ResponseEntity(servicioProductoPedido.elimiarProductoPedidosPorIds(idProducto,idPedido),
                HttpStatus.OK);
    }


    @GetMapping("/buscarProductosPedidosPorID/{idProducto}/{idPedido}")
    public ResponseEntity BuscarProductosPedidosPorID(@PathVariable("idProducto") Long idProducto,@PathVariable("idPedido") Long idPedido)
    {
        return new ResponseEntity(servicioProductoPedido.buscarProductosPedidosPorIds(idProducto,idPedido),
                HttpStatus.OK);
    }


    @PutMapping("/actualizarProductosPedidosPorID/{idProducto}/{idPedido}/{cantidad}")
    public ResponseEntity actualizarProductosPedidosPorID(@PathVariable("idProducto") Long idProducto,@PathVariable("idPedido") Long idPedido, @PathVariable("cantidad") Short cantidad )
    {
        return new ResponseEntity(servicioProductoPedido.actualizarProductosPedidos(idProducto,idPedido, cantidad ),
                HttpStatus.OK);
    }

}
