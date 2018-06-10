package ep.rs.epumpe.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ep.rs.bckndepumpe.dao.GradDAO;
import ep.rs.bckndepumpe.dao.PumpaDAO;
import ep.rs.bckndepumpe.dto.Grad;
import ep.rs.bckndepumpe.dto.Pumpa;
import ep.rs.epumpe.exception.PumpaNotFoundException;

@Controller
public class StranicaController {
	
	private static final Logger logger = LoggerFactory.getLogger(StranicaController.class);

	@Autowired
	private GradDAO gradDAO;
	
	@Autowired PumpaDAO pumpaDAO;
	
	@RequestMapping(value = {"/", "/pocetna"})
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("stranica");
		mv.addObject("naslov" , "pocetna");
		
		logger.info("Inside StranicaController index method - INFO");
		logger.debug("Inside StranicaController index method - DEBUG");
		
		// prosledjivanje liste gradova
		mv.addObject("gradovi" , gradDAO.list());
		
		mv.addObject("korisnikKliknePocetna" , true);
		return mv;
	}
	
	@RequestMapping(value = "/opis")
	public ModelAndView opis() {
		
		ModelAndView mv = new ModelAndView("stranica");
		mv.addObject("naslov" , "Opis");
		mv.addObject("korisnikKlikneOpis" , true);
		return mv;
	}
	
	@RequestMapping(value = "/kontakt")
	public ModelAndView kontakt() {
		
		ModelAndView mv = new ModelAndView("stranica");
		mv.addObject("naslov" , "Kontakt");
		mv.addObject("korisnikKlikneKontakt" , true);
		return mv;
	}
	
	@RequestMapping(value = "/prikazi/sve/epumpe")
	public ModelAndView prikaziSvePumpe() {
		
		ModelAndView mv = new ModelAndView("stranica");
		mv.addObject("naslov" , "Sve ePumpe");
		mv.addObject("korisnikKliknePumpe" , true);
		return mv;
	}
	
	@RequestMapping(value = "/prikazi/grad/{id}/epumpe")
	public ModelAndView prikaziSveGradovePumpe(@PathVariable("id") int id) {
		
		//gradDAO pojedinacno
		Grad grad = null;
		
		grad = gradDAO.get(id);
		
		ModelAndView mv = new ModelAndView("stranica");
		mv.addObject("naslov" , grad.getIme());
		
		mv.addObject("grad" , gradDAO.list());
		
		mv.addObject("grad", grad);
		mv.addObject("korisnikKlikneGradovePumpe" , true);
		return mv;
	}
	
	/*
	 * Pregled pumpe
	 * */
	
	@RequestMapping(value = "/prikazi/{id}/pumpa") 
	public ModelAndView prikaziPumpa(@PathVariable int id)throws PumpaNotFoundException  {
		
		ModelAndView mv = new ModelAndView("stranica");
		
		Pumpa pumpa = pumpaDAO.get(id);
		
		if(pumpa == null) throw new PumpaNotFoundException();
		
		// update the view count
		pumpa.setPoseta(pumpa.getPoseta() + 1);
		pumpaDAO.izmeni(pumpa);
		
		//---------------------------
		
		mv.addObject("naslov", pumpa.getNaziv());
		mv.addObject("pumpa", pumpa);
		
		mv.addObject("korisnikKliknePrikaziPumpa", true);
		
		
		return mv;
		
	}
}
