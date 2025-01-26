package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Interfaces.IProducto;
import Model.TblProductot1;

public class TblProductot1Imp implements IProducto{

	@Override
	public void RegistrarProducto(TblProductot1 tblProductot1) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_T1_CUROROMEROROXANA");
		EntityManager em=emf.createEntityManager();
		
		try {
			
			em.getTransaction().begin();
			
			em.persist(tblProductot1);
			
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			e.getMessage();
		}finally{
			em.close();
		}
	}

	@Override
	public void ActualizarProducto(TblProductot1 tblProductot1) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_T1_CUROROMEROROXANA");
		EntityManager em=emf.createEntityManager();
		
		try {
			
			em.getTransaction().begin();
			
			em.merge(tblProductot1);
			
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			
			e.getMessage();
		}finally{
		
			em.close();
		}
		
	}

	@Override
	public void EliminarProducto(TblProductot1 tblProductot1) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_T1_CUROROMEROROXANA");
		EntityManager em=emf.createEntityManager();
		
		try {
			
			em.getTransaction().begin();
			
			TblProductot1 tblprodelim=em.find(TblProductot1.class, tblProductot1.getIdproducto());
			
			if(tblProductot1!=null){
				
				em.remove(tblprodelim);
				
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
	public TblProductot1 BuscarProducto(TblProductot1 tblProductot1) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_T1_CUROROMEROROXANA");
		EntityManager em=emf.createEntityManager();
		
	
			TblProductot1 bustblprod=null;
				try {
					
					em.getTransaction().begin();
					
					bustblprod=em.find(TblProductot1.class, tblProductot1.getIdproducto());
					
					em.getTransaction().commit();
				} catch (RuntimeException e) {
					
					if(em.getTransaction().isActive()) em.getTransaction().rollback();
					
					e.getMessage();
				}finally{
					
					em.close();
				}
		return bustblprod;
	}

	@Override
	public List<TblProductot1> ListadoProductos() {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_T1_CUROROMEROROXANA");
		EntityManager em=emf.createEntityManager();
		
		List<TblProductot1> listado=null;
		try {
			
			em.getTransaction().begin();
			//Aplicamos consultas JPQL
			listado=em.createQuery("select c from TblProductot1 c", TblProductot1.class).getResultList();
			
		} catch (RuntimeException e) {
			
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			e.getMessage();
		}finally{
		
			em.close();
		}
		return listado;
	}

}
