package ep.rs.bckndepumpe.dao;

import java.util.List;

import ep.rs.bckndepumpe.dto.Pumpa;

public interface PumpaDAO {

	
	Pumpa get(int pumpaId);
	List<Pumpa> list();
	boolean dodaj(Pumpa pumpa);
	boolean izmeni(Pumpa pumpa);
	boolean obrisi(Pumpa pumpa);
	
	List<Pumpa> listaAktivnihPumpi();
	List<Pumpa> listaAktivnihPumpuPoGradu(int gradId);
	List<Pumpa> getPoslednjaAktivnaPumpa(int brojac);
	
}
