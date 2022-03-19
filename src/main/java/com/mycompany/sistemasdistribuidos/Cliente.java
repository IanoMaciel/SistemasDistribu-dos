/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemasdistribuidos;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

/**
 *
 * @author IanoM
 */
public class Cliente {
    public static void main(String[] args) throws IOException {
        
        try {
        //Declarar o socket cliente 
        Socket cliente = new Socket("127.0.0.1", 7000);
        
        System.out.println("Cliente Iniciado!");
        
        //Fluxo de dados para envio
        PrintStream ps = new PrintStream(cliente.getOutputStream());
        System.out.println("Sucesso ao se conectar com a rede");
        cliente.close();
        System.out.println("Cliente Finalizado!");
        } catch (IOException erro) {
           System.out.println("Ocorreu um erro durante a execução: " + erro);     
        }
        
    }
}
