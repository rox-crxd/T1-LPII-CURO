package Interfaces;

import java.util.List;
import Model.TblProductot1;

public interface IProducto {

	void RegistrarProducto(TblProductot1 tblProductot1);
	void ActualizarProducto(TblProductot1 tblProductot1);
	void EliminarProducto(TblProductot1 tblProductot1);
	TblProductot1 BuscarProducto(TblProductot1 tblProductot1);
	List<TblProductot1> ListadoProductos();
}
