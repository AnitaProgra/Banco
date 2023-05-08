package ar.edu.unlam.TestBanco;

import static org.junit.Assert.*;
import org.junit.Test;

import ar.edu.unlam.Banco.Cliente;
import ar.edu.unlam.Banco.Cuenta;
import ar.edu.unlam.Banco.EntidadBancaria;
import ar.edu.unlam.Banco.TipoDeCuenta;




public class TestBanco {

	@Test
	public void queSePuedaInstanciarUnClienteEnUnBancoYQueSePuedaVerTipoDeCuentaCreada() {

		EntidadBancaria santander = new EntidadBancaria(); 
		
		Cliente cliente1 =new Cliente("pepe", "diaz", 123456, 555, TipoDeCuenta.CUENTA_CORRIENTE); 
		
		santander.addCliente(cliente1);
		
	    String cuenta_nueva_creada= "CUENTA_CORRIENTE"; 
	    
		//el primer assert se fija que la cantidad de clientes esperados coincidan con el hashset de clientes creado de la entidad
		assertEquals(1, santander.getListaClientes().size()); 
		
		//el segundo assert devuelve que la cuenta creada sea la esperada
		assertEquals(cuenta_nueva_creada, cliente1.getTipo_cuenta().toString()); 	
	}

 
	@Test
	public void queSePuedaExtraerDineroDeUnaCuentaSueldo() {
		Cliente cliente1 =new Cliente("pepe", "diaz", 123456, 555, TipoDeCuenta.CUENTA_SUELDO);
		Cuenta cuenta1 = new Cuenta(cliente1, 200.0, 100.0); 
		
		assertTrue(cuenta1.queLaCuentaSueldoMeDejeExtraerDinero(199.0)); 

	}

	
	
	

}
