package beans;

import java.io.Serializable;

public class SucursalVO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int idSucursal;
	private String nombre;

	public int getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(int idSucursal) {
		this.idSucursal = idSucursal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public SucursalVO() {

	}
}
