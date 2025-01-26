package Model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tbl_productot1 database table.
 * 
 */
@Entity
@Table(name="tbl_productot1")
@NamedQuery(name="TblProductot1.findAll", query="SELECT t FROM TblProductot1 t")
public class TblProductot1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproducto;

	private String descripciont1;

	private String estadot1;

	@Temporal(TemporalType.DATE)
	private Date fechafabrit1;

	@Temporal(TemporalType.DATE)
	private Date fechavencimt1;

	private String nombret1;

	private double preciot1;

	public TblProductot1() {
	}

	public int getIdproducto() {
		return this.idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public String getDescripciont1() {
		return this.descripciont1;
	}

	public void setDescripciont1(String descripciont1) {
		this.descripciont1 = descripciont1;
	}

	public String getEstadot1() {
		return this.estadot1;
	}

	public void setEstadot1(String estadot1) {
		this.estadot1 = estadot1;
	}

	public Date getFechafabrit1() {
		return this.fechafabrit1;
	}

	public void setFechafabrit1(Date fechafabrit1) {
		this.fechafabrit1 = fechafabrit1;
	}

	public Date getFechavencimt1() {
		return this.fechavencimt1;
	}

	public void setFechavencimt1(Date fechavencimt1) {
		this.fechavencimt1 = fechavencimt1;
	}

	public String getNombret1() {
		return this.nombret1;
	}

	public void setNombret1(String nombret1) {
		this.nombret1 = nombret1;
	}

	public double getPreciot1() {
		return this.preciot1;
	}

	public void setPreciot1(double preciot1) {
		this.preciot1 = preciot1;
	}

}