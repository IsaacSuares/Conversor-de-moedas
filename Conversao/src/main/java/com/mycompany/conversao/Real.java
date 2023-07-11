
package com.mycompany.conversao;

/**
 *
 * @author isaac
 */
public class Real extends Moeda{
    
    private final String nome = "BRL";
    private double valor;
    
    @Override
    public String getNome(){
        return nome;
    }
    
    public void setValor(double valor){
	if(valor <= 0) {
		throw new RuntimeException("Valor inválido");
	}
	this.valor = valor;
    }
    
    @Override
    public double getValor() {
		return valor;
	}
    
}
