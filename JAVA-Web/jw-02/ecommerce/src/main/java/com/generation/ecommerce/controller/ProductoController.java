package com.generation.ecommerce.controller;

import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.ecommerce.model.Producto;
import com.generation.ecommerce.services.ProductoService;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,
        RequestMethod.PUT })

@RestController //esta notacion le hace a saber que es un controller para soportar metodos http
@RequestMapping(path = "/miOtzo/productos") //esta notacion nos ayuda a mapear la ruta o URL de donde se ejecutan los metodos http

public class ProductoController {
	
	//Inyección de dependencias"
	//Declara la instancia de la Clase ProductService que se utiliza para acceder a los metodos definidos ahí. Se declara como final porque su valor no será cambiado despues de inicializar, para que esta instancia no cambie durante la ejecución del programa. 
	
	private final ProductoService productoServicio; //"No nos llames, nosotros te llamamos"

	
	@Autowired //Se usa para indicar a Spring que inyecte automaticamente una isntancia de productoService en la clase ProductoController. Así nos aseguramos que la instancia esta disponible y lista para usarse cuando se necesite en la clase. 
	
	//Segunda parte de inyección de dependencias
	//Constructor
	public ProductoController (ProductoService productoServicio) {
		this.productoServicio = productoServicio;
	}// constructor
	
	
	//HTTP GET para los productos 
	@GetMapping
	public List <Producto> getProducto() {
		return productoServicio.leerProductos();
	}
	
	//HTTP GET para un producto 
		@GetMapping (path = "{prodId}")
		public Producto getProducto (@PathVariable("prodId")Long prodId) {
			return productoServicio.leerProducto(prodId);
		}
	
	
	//HTTP POST
    @PostMapping
    public void postProducto(@RequestBody Producto prod) { //No agrego un producto, agrego un cuerpo a ese producto
        productoServicio.crearProducto(prod); //disparo la operación CRUD para modificar mi BD
    }
    
	
	//HTTP PUT
	@PutMapping (path = "{prodId}")
	public void putProducto(@PathVariable("prodId")Long prodId,
			@PathVariable(required=false)String nombre,
			@PathVariable(required=false)String descripcion,
			@PathVariable(required=false)String URL_Imagen,
			@PathVariable(required=false)Double precio){
		productoServicio.actualizarProducto(prodId, nombre, descripcion, URL_Imagen, precio);
	}
	// Update Producto
	
	//HTTP DELETE
	@DeleteMapping(path = "{prodId}") //borrare elementos por ID (miOtzo/productos/Id)
	public void deleteProducto(@PathVariable("prodId")Long prodId) {
		productoServicio.borrarProducto(prodId);
	}
	
}
