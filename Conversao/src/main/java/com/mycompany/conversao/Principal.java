/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversao;

/**
 *
 * @author isaac
 */
public class Principal {

    public static void main(String[] args) {
        
        Conversor c = new Conversor();
        Real real = new Real();
        Dolar dolar = new Dolar();
        Euro euro = new Euro();
        euro.setValor(83);
        System.out.println(c.converter(euro, real));
        
        
        
    }
}
