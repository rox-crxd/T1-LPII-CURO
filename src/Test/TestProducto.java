package Test;


import java.util.List;

import Dao.TblProductot1Imp;
import Model.TblProductot1;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TblProductot1 tblprod=new TblProductot1();
		TblProductot1Imp tblprodimp=new TblProductot1Imp();
		
		/*****TEST DE METODO REGISTRAR
		//ASIGNAMOS VALORES
		tblprod.setNombret1("Baterías");
		tblprod.setPreciot1(130);
		tblprod.setDescripciont1("Marca HP");
		tblprod.setEstadot1("Nuevo");
		java.sql.Date fechasql = new java.sql.Date(System.currentTimeMillis());
		tblprod.setFechavencimt1(fechasql);
		tblprod.setFechafabrit1(fechasql);
		//INVOCAMOS EL METODO REGISTRAR
		tblprodimp.RegistrarProducto(tblprod);
		//EMITIREMOS MENSAJE POR CONSOLA
		System.out.println("Dato registrado correctamente en BD");*/
		
		/*****TEST DE METODO ACTUALIZAR
		//ASIGNAMOS EL CODIGO A ACTUALIZAR
		tblprod.setIdproducto(11);
		tblprod.setNombret1("Cargador");
		tblprod.setPreciot1(140);
		tblprod.setDescripciont1("Marca J");
		tblprod.setEstadot1("Semi nuevo");
		java.sql.Date fechasql = new java.sql.Date(System.currentTimeMillis());
		tblprod.setFechavencimt1(fechasql);
		tblprod.setFechafabrit1(fechasql);
		//Invocamos al metodo actualizar
		tblprodimp.ActualizarProducto(tblprod);
		//Emitimos mensaje por consola
		System.out.println("Dato actualizado correctamente en BD");*/
		
		/*****TEST DE METODO ELIMINAR
		//ELIMINAMOS EL CODIGO DE N° 5
		tblprod.setIdproducto(6);
		//Invoco el metodo a eliminar
		tblprodimp.EliminarProducto(tblprod);
		//Emitimos mensaje por consola
		System.out.println("Dato eliminado correctamente en la BD");*/
		
		/*****TEST DE METODO BUSCAR
		//BUSCAR EL CODIGO 4
		tblprod.setIdproducto(1);
		TblProductot1 tblproducto=tblprodimp.BuscarProducto(tblprod);
		//Imprimimos por consola
		System.out.println(" Codigo: "+tblproducto.getIdproducto()+ "\n" +
				" Nombre del producto: "+tblproducto.getNombret1()+ "\n" +
				" Precio: "+tblproducto.getPreciot1()+ "\n" +
				" Descripción: "+tblproducto.getDescripciont1()+ "\n" +
				" Estado: "+tblproducto.getEstadot1()+ "\n" +
				" Fech. Vencimiento: "+tblproducto.getFechavencimt1() + "\n" + 
				" Fech. Fabricación: "+tblproducto.getFechafabrit1());*/
		
		/*****TEST DE METODO LISTAR
		//LISTANDO DATOS 
		List<TblProductot1> listado=tblprodimp.ListadoProductos();
		
		for(TblProductot1 lis:listado){
			//Imprimimos por consola
			System.out.println(" Codigo: "+lis.getIdproducto()+ "\n" +
					" Nombre del producto: "+lis.getNombret1()+ "\n" +
					" Precio: "+lis.getPreciot1()+ "\n" +
					" Descripción: "+lis.getDescripciont1()+ "\n" +
					" Estado: "+lis.getEstadot1()+ "\n" +
					" Fech. Vencimiento: "+lis.getFechavencimt1()+ "\n" + 
					" Fech. Fabricación: " +lis.getFechafabrit1()+ "\n" +
					"-------------------------------------------------");
		}*/
		
	} //fin del metodo principal...

}
