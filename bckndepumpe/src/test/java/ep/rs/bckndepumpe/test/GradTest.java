package ep.rs.bckndepumpe.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ep.rs.bckndepumpe.dao.GradDAO;
import ep.rs.bckndepumpe.dto.Grad;

public class GradTest {

	private static AnnotationConfigApplicationContext context;
	
	private static GradDAO gradDAO;
	
	private Grad grad;
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("ep.rs.bckndepumpe");
		context.refresh();
		gradDAO = (GradDAO)context.getBean("gradDAO");
	}
	
/*	@Test
	public void testDodajGrad() {
		
		grad = new Grad();
		
		grad.setIme("Subotica");
		grad.setOpis("neki ipis");
		grad.setSlikaURL("a.png");
		
		assertEquals("Successfully added a category inside the table!",true,gradDAO.dodaj(grad));
		
		
	}*/
	
	/*@Test
	public void testGetGrad() {
		
		grad = gradDAO.get(1);
		
		
		assertEquals("Successfully fetched a single category from the table!","test2",grad.getIme());
		
		
	}*/
	
	/*@Test
	public void testIzmeniGrad() {
		
		grad = gradDAO.get(1);
		grad.setIme("ime");
		
		assertEquals("Successfully fetched a single category from the table!",true, gradDAO.izmeni(grad));
		
		
	}*/
	
/*	@Test
	public void testObrisiGrad() {
		
		grad = gradDAO.get(2);
		
		
		assertEquals("Successfully fetched a single category from the table!",true, gradDAO.obrisi(grad));
		
		
	}*/
	@Test
	public void testizaberiGradove() {
		
	
		
		
		assertEquals("Successfully fetched a single category from the table!",1, gradDAO.list().size());
		
		
	}
}
