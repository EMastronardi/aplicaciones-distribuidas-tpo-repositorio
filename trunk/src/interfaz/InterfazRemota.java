package interfaz;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import beans.SucursalVO;


public interface InterfazRemota extends Remote{

	public boolean abrirMesa(String nombreSucursal, List<Integer> nrosMesas, String nombreMozo, int cantComenzales) throws RemoteException;
	
	public List<SucursalVO> getSucursales() throws RemoteException;
}
