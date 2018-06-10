package ep.rs.bckndepumpe.dao;

import java.util.List;

import ep.rs.bckndepumpe.dto.Grad;

public interface GradDAO {

	
	List<Grad> list();
	Grad get(int id);
	boolean dodaj(Grad grad);
	boolean izmeni(Grad grad);
	boolean obrisi(Grad grad);
}
