package unlam.edu.ar;

import java.util.TreeSet;

public class BarAntiHomeros {
	private TreeSet<Cliente> clientes=new TreeSet();
	
	public BarAntiHomeros(){}
	
	public void admitirClientes(Cliente cliente) throws Exception{
		if(!clientes.add(cliente)){
			System.out.println("No se puede agregar Cliente = "+cliente.getNombre());
		}
		else{
			clientes.add(cliente);
		}
	}

	public TreeSet<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(TreeSet<Cliente> clientes) {
		this.clientes = clientes;
	}
}
