package interfaz;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;


public interface InterfazRemota extends Remote{

	public boolean abrirMesa(String nombreSucursal, List<Integer> nrosMesas, String nombreMozo, int cantComenzales) throws RemoteException;

}
