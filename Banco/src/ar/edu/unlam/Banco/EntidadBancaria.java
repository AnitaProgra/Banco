package ar.edu.unlam.Banco;

import java.util.HashSet;


public class EntidadBancaria extends Cliente {
    protected String nombreEntidad; 
    protected Integer cod_entidad; 
	protected HashSet <Cliente> listaClientesVip; 
	protected HashSet <Cliente> listaClientes; 
	
	
	public EntidadBancaria(int cod_entidad) {
		listaClientesVip= new HashSet<Cliente>();
	}

	
	public EntidadBancaria() {
		listaClientes= new HashSet<Cliente>();
	}
	
	
	public void addCliente(Cliente cliente) {
	    listaClientes.add(cliente);
	}
	
	public void addClienteVip(Cliente cliente) {
	    listaClientesVip.add(cliente);
	}

	
	
	public HashSet<Cliente> getListaClientesVip() {
		return listaClientesVip;
	}


	public void setListaClientesVip(HashSet<Cliente> listaClientesVip) {
		this.listaClientesVip = listaClientesVip;
	}


	public HashSet<Cliente> getListaClientes() {
		return listaClientes;
	}


	public void setListaClientes(HashSet<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	
	
	
	
}
