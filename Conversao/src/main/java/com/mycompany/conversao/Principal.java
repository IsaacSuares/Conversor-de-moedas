/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversao;

/**
 *
 * @author isaac
 */
public class Conversao {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Conversor c = new Conversor();
        Real r = new Real();
        Dolar d = new Dolar();
        Euro e = new Euro();
        e.setValor(83);
        System.out.println(c.converter(e, r));
        
        
        
    }
}
