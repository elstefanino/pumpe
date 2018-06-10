/*package ep.rs.epumpe.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {

	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ModelAndView handlerNoHandlerFoundException() {
		
		ModelAndView mv = new ModelAndView("greska");
		
		mv.addObject("greskaNaslov", "Stranica nije napravljena!");
		
		mv.addObject("greskaOpis", "Stranica trenunto nije dostupna!");
		
		mv.addObject("naslov", "404 Error Page");
		
		return mv;
	}*/
	
/*	
	@ExceptionHandler(PumpaNotFoundException.class)
	public ModelAndView handlerProductNotFoundException() {
		
		ModelAndView mv = new ModelAndView("greska");
		
		mv.addObject("greskaNaslov", "Pumpa nije dostupna!");
		
		mv.addObject("greskaOpis", "Pumpa koju trenutno trazite nije dostupna!");
		
		mv.addObject("naslov", "Pumpa nije dostupna");
		
		return mv;
	}*/
		
	
/*	@ExceptionHandler(Exception.class)
	public ModelAndView handlerException(Exception ex) {
		
		ModelAndView mv = new ModelAndView("greska");
		
		mv.addObject("greskaNaslov", "Kontaktirajte administratora!!");
		
		
		 only for debugging your application
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		
		ex.printStackTrace(pw);
						
		mv.addObject("greskaOpis", sw.toString());
		
		mv.addObject("naslov", "Greska");
		
		return mv;
	}}*/
			
	
