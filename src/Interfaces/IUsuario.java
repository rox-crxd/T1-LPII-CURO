package Interfaces;

import java.util.List;

import Model.TblUsuariot1;

public interface IUsuario {
	
	void RegistrarUsuario(TblUsuariot1 tblUsuariot1);
	void ActualizarUsuario(TblUsuariot1 tblUsuariot1);
	void EliminarUsuario(TblUsuariot1 tblUsuariot1);
	TblUsuariot1 BuscarUsuario(TblUsuariot1 tblUsuariot1);
	List<TblUsuariot1> ListadoUsuario();
}
