package ep.rs.bckndepumpe.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ep.rs.bckndepumpe.dao.GradDAO;
import ep.rs.bckndepumpe.dto.Grad;

@Repository("gradDAO")
@Transactional
public class GradDAOImpl implements GradDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	private static List<Grad> gradovi = new ArrayList<>();

	
	@Override
	public List<Grad> list() {

		String izaberiAktivneGradove = "FROM Grad WHERE aktivan = :aktivan";
		
		Query query = sessionFactory.getCurrentSession().createQuery(izaberiAktivneGradove);
				
		query.setParameter("aktivan", true);
						
		return query.getResultList();
	}

	@Override
	public Grad get(int id) {
		
		return sessionFactory.getCurrentSession().get(Grad.class, Integer.valueOf(id));
	}

	@Override
	
	public boolean dodaj(Grad grad) {
		try {
			// add the category to the database table
			sessionFactory.getCurrentSession().persist(grad);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean izmeni(Grad grad) {
		try {
			// add the category to the database table
			sessionFactory.getCurrentSession().update(grad);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean obrisi(Grad grad) {
		
	grad.setAktivan(false);
		try {
			// add the category to the database table
			sessionFactory.getCurrentSession().update(grad);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
}
