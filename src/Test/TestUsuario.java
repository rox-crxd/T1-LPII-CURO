package Test;

import java.util.List;

import Dao.TblUsuariot1Imp;
import Model.TblUsuariot1;

public class TestUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		TblUsuariot1 tblusuario=new TblUsuariot1();
		TblUsuariot1Imp tblusuarioimp=new TblUsuariot1Imp();
		
		/*****TEST DE METODO REGISTRAR
		//ASIGNAMOS VALORES
		tblusuario.setUsuariot1("carbajal");
		tblusuario.setPasswordt1("1852");
		//INVOCAMOS EL METODO REGISTRAR
		tblusuarioimp.RegistrarUsuario(tblusuario);
		//EMITIREMOS MENSAJE POR CONSOLA
		System.out.println("Dato registrado correctamente en BD");*/
		
		/*****TEST DE METODO ACTUALIZAR
		//ASIGNAMOS EL CODIGO A ACTUALIZAR
		tblusuario.setIdusuario(6);
		tblusuario.setUsuariot1("romero");
		tblusuario.setPasswordt1("1845");
		//Invocamos al metodo actualizar
		tblusuarioimp.ActualizarUsuario(tblusuario);
		//Emitimos mensaje por consola
		System.out.println("Dato actualizado correctamente en BD");*/
		
		/*****TEST DE METODO ELIMINAR
		//ELIMINAMOS EL CODIGO DE N° 5
		tblusuario.setIdusuario(6);
		//Invoco el metodo a eliminar
		tblusuarioimp.EliminarUsuario(tblusuario);
		//Emitimos mensaje por consola
		System.out.println("Dato eliminado correctamente en la BD");*/
		
		/*****TEST DE METODO BUSCAR
		//BUSCAR EL CODIGO 4
		tblusuario.setIdusuario(1);
		TblUsuariot1 tblusu=tblusuarioimp.BuscarUsuario(tblusuario);
		//Imprimimos por consola
		System.out.println(" Codigo: "+tblusu.getIdusuario()+ "\n" +
				" Usuario: "+tblusu.getUsuariot1()+ "\n" +
				" Password: "+tblusu.getPasswordt1() );*/
		
		/*****TEST DE METODO LISTAR
		//LISTANDO DATOS 
		List<TblUsuariot1> listado=tblusuarioimp.ListadoUsuario();
		
		for(TblUsuariot1 lis:listado){
			//Imprimimos por consola
			System.out.println(" Codigo: "+lis.getIdusuario()+ "\n" +
					" Usuario: "+lis.getUsuariot1()+ "\n" +
					" Password: "+lis.getPasswordt1()+ "\n" +
					"-------------------------------------------------");
		}*/
		
	} //fin del metodo principal...

}
