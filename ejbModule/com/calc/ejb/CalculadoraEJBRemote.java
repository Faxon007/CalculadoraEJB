package com.calc.ejb;

import javax.ejb.Remote;

@Remote
public interface CalculadoraEJBRemote {
	public int suma(int x,int y);
	
	public int resta(int x,int y);
	
	public int multiplicacion(int x, int y);
	                            

}
