/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author isaac
 */
public class Conversor {
    public String obterChaveURL(Moeda moedaOrigem, Moeda moedaDestino){
        return moedaOrigem.getNome() + "-" + moedaDestino.getNome();
    }
    
    public String obterChaveJSON(){
        return "";
    }
    
    private double obterValorDaAPI(Moeda moedaOrigem, Moeda moedaDestino)  {
	    double valor = 0.0;
            String chaveURL = obterChaveURL(moedaOrigem, moedaDestino);
            String chaveJSON = chaveURL.replaceAll("-", "");
            
	    try {
	        String urlAPI = "https://economia.awesomeapi.com.br/last/"+ chaveURL; 

	        // Fazendo a requisição GET
	        HttpURLConnection conn = (HttpURLConnection) new URL(urlAPI).openConnection();
	        conn.setRequestMethod("GET");

	        // Lendo a resposta da requisição
	        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	        StringBuilder response = new StringBuilder();
	        String line;
	        while ((line = reader.readLine()) != null) {
	            response.append(line);
	        }
	        reader.close();

	        // Analisando a resposta JSON para obter o valor desejado
	        //System.out.println(response.toString());
	        
	        JSONObject jsonResponse = new JSONObject(response.toString());
                valor = jsonResponse.getJSONObject(chaveJSON).getDouble("bid");
                System.out.println("ok");
                
	    } catch (IOException | JSONException e) {
	        e.printStackTrace();
	    }

	    return valor;
	}
    
    public double converter(Moeda moedaOrigem, Moeda moedaDestino){
        double cambio = obterValorDaAPI(moedaOrigem, moedaDestino);
        return moedaOrigem.getValor() * cambio;
    }
    
    
}