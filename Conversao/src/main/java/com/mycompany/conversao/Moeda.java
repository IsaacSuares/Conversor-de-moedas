/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversao;

/**
 *
 * @author isaac
 */
public abstract class Moeda {
    private double valor;
    private final String nome = null;
    
    public abstract String getNome();
    public abstract double getValor();
    public void setValor(double valor){
        this.valor = valor;
    };
    
}
