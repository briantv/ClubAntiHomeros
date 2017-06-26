package unlam.edu.ar;

import java.util.Comparator;

public class ClientePorEdad implements Comparator<Cliente>{

	@Override
	public int compare(Cliente uno, Cliente otro) {
		// TODO Auto-generated method stub
		return uno.getEdad().compareTo(otro.getEdad());
	}

}
