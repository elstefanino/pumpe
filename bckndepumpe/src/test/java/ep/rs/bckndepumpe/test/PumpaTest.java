package ep.rs.bckndepumpe.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ep.rs.bckndepumpe.dao.PumpaDAO;
import ep.rs.bckndepumpe.dto.Pumpa;

public class PumpaTest {

	private static AnnotationConfigApplicationContext context;

	private static PumpaDAO pumpaDAO;

	private Pumpa pumpa;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("ep.rs.bckndepumpe");
		context.refresh();
		pumpaDAO = (PumpaDAO) context.getBean("pumpaDAO");
	}

	@Test
	public void testDodaj() {

		/*pumpa = new Pumpa();

		pumpa.setNaziv("aa");
		pumpa.setAdresa("bb");
		pumpa.setOpis("opis");
		pumpa.setCena(100);
		pumpa.setPoseta(5);
		pumpa.setGrad_id(2);
		pumpa.setKorisnik_id(2);

		assertEquals("Successfully added a category inside the table!", true, pumpaDAO.dodaj(pumpa));*/

	/*	pumpa = pumpaDAO.get(2);
		pumpa.setNaziv("nova");
		assertEquals("bla bla", true, pumpaDAO.izmeni(pumpa));
		
	assertEquals("bla bla", true, pumpaDAO.obrisi(pumpa));
		
		assertEquals("bla bla", 2, pumpaDAO.list().size());*/
		
		assertEquals("bla bla", 1, pumpaDAO.getPoslednjaAktivnaPumpa(1).size());

		
	}
}
