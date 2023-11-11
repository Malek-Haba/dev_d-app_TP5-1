package RmiServer;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import RmiService.ConversionImpl;

//Classe responsable du démarrage du serveur RMI pour le service de conversion
public class ConversionServer  {

	public static void main(String[] args) {
		try {
	   // Création d'un registre RMI sur le port 1099
		LocateRegistry.createRegistry(1099);
	  // Création d'une instance de la classe d'implémentation ConversionImpl
		ConversionImpl od = new ConversionImpl ();
	 // Affichage de la représentation textuelle de l'objet créé (utile pour le débogage)
		System.out.println(od.toString());
		//publication de la ref de objet distant
		Naming.rebind("rmi://localhost:1099/OD",od);
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	}

}
