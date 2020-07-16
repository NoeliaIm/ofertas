package com.portalofertas.ofertas.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.portalofertas.ofertas.model.OfertaModel;

@Controller
public class OfertasController {

	@GetMapping("/ofertas")
	public String showOfertas(Model model) {
		model.addAttribute("Oferta", "Patinete eléctrico");
		model.addAttribute("fechaInicio", new Date());
		model.addAttribute("precio", 15.25);
		model.addAttribute("tipo", "Hasta fin de existencias");
		return "ofertas";
	}

	@GetMapping("/ofertas/listado")
	public String showOfertasList(Model model) {
		List<String> lista = new LinkedList<String>();
		lista.add("Patinete eléctrico");
		lista.add("Odenador Portátil");
		lista.add("Ipad");
		lista.add("Deshumidificador");
		model.addAttribute("lista", lista);
		return "ofertaslista";
	}

	@GetMapping("/oferta/detalle")
	public String showDetail(Model model) {
		OfertaModel detalle = new OfertaModel();
		detalle.setProducto("Batidora");
		detalle.setFechaInicio(new Locale("10/02/2020"));
		detalle.setTipo("hasta fin de existencias");
		detalle.setPrecio(15);
		model.addAttribute("detalle", detalle);
		return "detalle";
	}

	@GetMapping("formulario")
	public String showForm() {
		return "formulario";
	}

	
	  @PostMapping("/oferta/save") public String save(@RequestParam("nombre")
	  String nombre, @RequestParam("precio") double precio,@RequestParam("fechainic") String fechainic, @RequestParam("fechafin") String
	  fechafin) { OfertaModel oferta = new OfertaModel(); oferta.setFechaInicio(new
	  Locale(fechainic)); oferta.setTipo(fechafin); oferta.setPrecio(precio);
	  oferta.setProducto(nombre); System.out.println(oferta.toString()); return
	  "save"; }
	 
	
	/*
	 * @PostMapping("/oferta/save") public String save(OfertaModel oferta) {
	 * System.out.println(oferta.toString()); return "save"; }
	 */
}
