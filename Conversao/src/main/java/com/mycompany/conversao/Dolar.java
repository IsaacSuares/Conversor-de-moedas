/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversao;

/**
 *
 * @author isaac
 */
public class Dolar extends Moeda{
    
    private final String nome = "USD";
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
