package ep.rs.epumpe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ep.rs.bckndepumpe.dao.PumpaDAO;
import ep.rs.bckndepumpe.dto.Pumpa;


@Controller
@RequestMapping("/json/podaci")
public class JsonController {

	@Autowired
	private PumpaDAO pumpaDAO;
	

/*	@RequestMapping("/admin/sve/pumpe")
	@ResponseBody
	public List<Pumpa> getAllPumpaList() {		
		return pumpaDAO.list();
				
	}	*/
	
	
	@RequestMapping("/sve/pumpe")
	@ResponseBody
	public List<Pumpa> getAllPumpa() {
		
		return pumpaDAO.listaAktivnihPumpi();
				
	}
	
		@RequestMapping("/grad/{id}/pumpe")
	@ResponseBody
	public List<Pumpa> getPumpaPoGradu(@PathVariable int id) {
		
		return pumpaDAO.listaAktivnihPumpuPoGradu(id);
				
	}
	
	
/*	@RequestMapping("/mv/products")
	@ResponseBody
	public List<Product> getMostViewedProducts() {		
		return productDAO.getProductsByParam("views", 5);				
	}
		
	@RequestMapping("/mp/products")
	@ResponseBody
	public List<Product> getMostPurchasedProducts() {		
		return productDAO.getProductsByParam("purchases", 5);				
	}*/
	
	
	
	
}