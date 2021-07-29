package com.calc.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class CalculadoraEJB
 */
@Stateless
@LocalBean
public class CalculadoraEJB implements CalculadoraEJBRemote {

    /**
     * Default constructor. 
     */
    public CalculadoraEJB() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public int suma(int x, int y) {
		return x+y;
	}

	@Override
	public int resta(int x, int y) {
		return x-y;
	}

	@Override
	public int multiplicacion(int x, int y) {
		
		return x*y;
	}

}
