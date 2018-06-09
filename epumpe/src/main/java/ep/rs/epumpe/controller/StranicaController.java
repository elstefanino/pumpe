package ep.rs.epumpe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StranicaController {

	@RequestMapping(value = {"/", "/pocetna"})
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("stranica");
		mv.addObject("pozz" , "Testiram");
		return mv;
	}
}
