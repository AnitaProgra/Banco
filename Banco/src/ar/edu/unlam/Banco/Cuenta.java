package ar.edu.unlam.Banco;

public class Cuenta extends Cliente {

	protected Cliente cliente; 
	protected TipoDeCuenta cuenta; 
	protected double saldo; 
    protected double descubierto;
    

    
    
    public Cuenta(Cliente cliente, double saldo, double descubierto) {
    	this.cliente=cliente; 
    	this.saldo=saldo; 
    	this.descubierto=descubierto; 
    }



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public double getDescubierto() {
		return descubierto;
	}



	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}
    

	public boolean queLaCuentaSueldoMeDejeExtraerDinero(double montoAExtraer){
		if(cliente.getTipo_cuenta()==TipoDeCuenta.CUENTA_SUELDO && saldo>= montoAExtraer) { 
			return true;
			}
		else return false; 
    }
	
	
	
	
}
	
	





