/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista2tads;

/**
 *
 * @author Gabriel_Egydio
 */
public class Conta {
    public float Saldo;
    public String NomeCliente;
    private String CpfCliente;
    private String NroConta;
    private String Agencia;

    public Conta() {
        this.Agencia = "0001";
        this.NroConta = "12345-1";
        this.CpfCliente = "123.123.123-12";
        this.NomeCliente = "Gabriel Egydio";
        this.Saldo = 10000;
    }

    public boolean Depositar(int valor){
        if(valor <= 0){
            return false;
        }
        this.Saldo += valor;
        System.out.print("Valor atual da conta: " + this.Saldo);
        return true;
    }

    public boolean Sacar(int valor){
        if(valor <= 0 || valor > this.Saldo){
            System.out.print("Saldo insuficiente" + "\n");
            return false;
        } else {
            this.Saldo -= valor;
            System.out.print("Valor atual da conta: " + this.Saldo);
            return true;
        }
    }

    public double retornaSaldo(){
        return this.Saldo;
    }

    public boolean Transferir(double valor, Conta pagador, Conta receptor){
        if(pagador.Saldo < valor || valor <= 0){
            return false;
        }

        pagador.Saldo -= valor;
        receptor.Saldo += valor;
        return true;
    }

}

