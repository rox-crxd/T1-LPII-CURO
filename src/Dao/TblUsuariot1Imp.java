package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IUsuario;
import Model.TblProductot1;
import Model.TblUsuariot1;

public class TblUsuariot1Imp implements IUsuario{

	@Override
	public void RegistrarUsuario(TblUsuariot1 tblUsuariot1) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_T1_CUROROMEROROXANA");
		EntityManager em=emf.createEntityManager();
		
		try {
			
			em.getTransaction().begin();
			
			em.persist(tblUsuariot1);
			
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			e.getMessage();
		}finally{
			em.close();
		}
	}

	@Override
	public void ActualizarUsuario(TblUsuariot1 tblUsuariot1) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_T1_CUROROMEROROXANA");
		EntityManager em=emf.createEntityManager();
		
		try {
			
			em.getTransaction().begin();
			
			em.merge(tblUsuariot1);
			
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			
			e.getMessage();
		}finally{
		
			em.close();
		}
	}

	@Override
	public void EliminarUsuario(TblUsuariot1 tblUsuariot1) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_T1_CUROROMEROROXANA");
		EntityManager em=emf.createEntityManager();
		
		try {
			
			em.getTransaction().begin();
			
			TblUsuariot1 tblusuarioelim=em.find(TblUsuariot1.class, tblUsuariot1.getIdusuario());
			
			if(tblUsuariot1!=null){
				
				em.remove(tblusuarioelim);
				
				em.getTransaction().commit();
			} 
		} catch (RuntimeException e) {
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			e.getMessage();
			
		}finally{
			em.close();
		}
	}

	@Override
	public TblUsuariot1 BuscarUsuario(TblUsuariot1 tblUsuariot1) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_T1_CUROROMEROROXANA");
		EntityManager em=emf.createEntityManager();
		
		TblUsuariot1 bustblusuario=null;
				try {
					
					em.getTransaction().begin();
					
					bustblusuario=em.find(TblUsuariot1.class, tblUsuariot1.getIdusuario());
					
					em.getTransaction().commit();
				} catch (RuntimeException e) {
					
					if(em.getTransaction().isActive()) em.getTransaction().rollback();
					
					e.getMessage();
				}finally{
					
					em.close();
				}
		return bustblusuario;
	}

	@Override
	public List<TblUsuariot1> ListadoUsuario() {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_T1_CUROROMEROROXANA");
		EntityManager em=emf.createEntityManager();
		
		List<TblUsuariot1> listado=null;
		try {
			
			em.getTransaction().begin();
			//Aplicamos consultas JPQL
			listado=em.createQuery("select c from TblUsuariot1 c", TblUsuariot1.class).getResultList();
			
		} catch (RuntimeException e) {
			
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			e.getMessage();
		}finally{
		
			em.close();
		}
		return listado;
	}

}
