package ar.edu.unlam.Banco;

import java.util.HashSet;

public class Cliente {

	protected String nombre;
	protected String apellido;
	protected Integer nro_cliente;
	protected Integer password;
	protected TipoDeCuenta tipo_cuenta; 
	protected boolean cliente_vip;
    protected HashSet <Cuenta> cuentas; 
	
	
	public Cliente() {
		cuentas= new HashSet<Cuenta>();
	}

	
    public Cliente (String nombre, String apellido, int nro_cliente, int password, TipoDeCuenta tipo_cuenta){
	this.nombre=nombre; 
	this.apellido=apellido; 
	this.nro_cliente=nro_cliente; 
	this.password=password; 
	this.tipo_cuenta= tipo_cuenta; 
	}
	
	
    public Cliente (boolean cliente_vip){
		
	} 
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getNro_cliente() {
		return nro_cliente;
	}

	public void setNro_cliente(Integer nro_cliente) {
		this.nro_cliente = nro_cliente;
	}

	public Integer getPassword() {
		return password;
	}
	public void setPassword(Integer password) {
		this.password = password;
	}
	public TipoDeCuenta getTipo_cuenta() {
		return tipo_cuenta;
	}
	public void setTipo_cuenta(TipoDeCuenta tipo_cuenta) {
		this.tipo_cuenta = tipo_cuenta;
	}
	public boolean isCliente_vip() {
		return cliente_vip;
	}
	public void setCliente_vip(boolean cliente_vip) {
		this.cliente_vip = cliente_vip;
	} 
	
	

	
	
}
