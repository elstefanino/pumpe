package ep.rs.bckndepumpe.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ep.rs.bckndepumpe.dao.PumpaDAO;
import ep.rs.bckndepumpe.dto.Pumpa;

@Repository("pumpaDAO")
@Transactional
public class PumpaDAOImpl implements PumpaDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Pumpa get(int pumpaId) {
		try {
			return sessionFactory.getCurrentSession().get(Pumpa.class, Integer.valueOf(pumpaId));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Pumpa> list() {
		return sessionFactory.getCurrentSession().createQuery("FROM Pumpa", Pumpa.class).getResultList();
	}

	@Override
	public boolean dodaj(Pumpa pumpa) {
		try {
			sessionFactory.getCurrentSession().persist(pumpa);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean izmeni(Pumpa pumpa) {
		try {
			sessionFactory.getCurrentSession().update(pumpa);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean obrisi(Pumpa pumpa) {
		try {
			pumpa.setAktivna(false);
			return this.izmeni(pumpa);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Pumpa> listaAktivnihPumpi() {
		String selectAktivnePumpe = "FROM Pumpa WHERE aktivna =:aktivna";
		return sessionFactory.getCurrentSession().createQuery(selectAktivnePumpe, Pumpa.class)
				.setParameter("aktivna", true).getResultList();
	}

	@Override
	public List<Pumpa> listaAktivnihPumpuPoGradu(int gradId) {
		String selectAktivnePumpePoGradu = "FROM Pumpa WHERE aktivna = :aktivna AND grad_id =:grad_id";
		return sessionFactory.getCurrentSession().createQuery(selectAktivnePumpePoGradu, Pumpa.class)
				.setParameter("aktivna", true).setParameter("grad_id", gradId).getResultList();
	}

	@Override
	public List<Pumpa> getPoslednjaAktivnaPumpa(int brojac) {
		return sessionFactory.getCurrentSession()
				.createQuery("FROM Pumpa WHERE aktivna= :aktivna ORDER BY id", Pumpa.class).setParameter("aktivna", true)
				.setFirstResult(0).setMaxResults(brojac).getResultList();

	}
}
