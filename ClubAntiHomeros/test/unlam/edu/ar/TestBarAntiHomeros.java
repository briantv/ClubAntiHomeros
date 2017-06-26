package unlam.edu.ar;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Test;

public class TestBarAntiHomeros {

	@Test
	public void test1OrdenarClientesPorNombre() throws Exception {
		
		BarAntiHomeros bar1=new BarAntiHomeros();
		Cliente cliente1=new Cliente("Jose", 10);
		Cliente cliente2=new Cliente("Homero", 20);
		Cliente cliente3=new Cliente("Pepe", 30);
		Cliente cliente4=new Cliente("Homero", 90);
		
		bar1.admitirClientes(cliente1);
		bar1.admitirClientes(cliente2);
		bar1.admitirClientes(cliente3);
		bar1.admitirClientes(cliente4);
		
		Iterator<Cliente> it=bar1.getClientes().iterator();
		System.out.println("Ordenar los Clientes por Nombre");
		while(it.hasNext()){
			System.out.println(it.next().getNombre());
		}
		System.out.println("\n");
	}
	@Test
	public void test2OredenarClientesPorEdad() throws Exception{
		
		BarAntiHomeros bar2=new BarAntiHomeros();
		
		TreeSet<Cliente> clientePorEdad=new TreeSet<Cliente>(new ClientePorEdad());
		bar2.setClientes(clientePorEdad);
		
		Cliente cliente1=new Cliente("Jose", 10);
		Cliente cliente2=new Cliente("Homero", 40);
		Cliente cliente3=new Cliente("Pepe", 30);
		Cliente cliente4=new Cliente("Pedro", 40);
		
		bar2.admitirClientes(cliente1);
		bar2.admitirClientes(cliente2);
		bar2.admitirClientes(cliente3);
		bar2.admitirClientes(cliente4);
		
		Iterator<Cliente> it=bar2.getClientes().iterator();
		System.out.println("Ordenar los Clientes por Edad");
		while(it.hasNext()){
			System.out.println(it.next().getEdad());
		}
	}

}
