/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemasdistribuidos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author IanoM
 */
public class Servidor {
    public static void main(String args[]) {
        try {
            ServerSocket servidor = new ServerSocket(7000);
            System.out.println("Servidor iniciado");
            
            //recebe os clientes 
            while(true) {
                Socket cliente = servidor.accept();
                System.out.println("Cleinte conectato. Cliente: " + cliente.getInetAddress());
                InputStreamReader fluxoDados = new InputStreamReader(cliente.getInputStream());
                BufferedReader dado = new BufferedReader(fluxoDados);
                System.out.println(dado.readLine());
                
                cliente.close();
            }
         } catch (IOException erro) {
            System.out.println("Erro ao inicar o servidor: " + erro);
        }
    }
}
