package RmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class ConversionImpl extends UnicastRemoteObject  implements IConversion{
	//public si la classe ConversionServer existe ailleurs du package

	// Constructeur par défaut qui lève une exception RemoteException
	public ConversionImpl() throws RemoteException {
		super();
	}
// Implémentation de la méthode convertirMontant de l'interface IConversion
	@Override
	public double convertirMontant(double mt) throws RemoteException {
// Conversion du montant en multipliant par un taux (ici 33)
		return mt*33;
	}
	
}
