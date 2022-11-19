/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista2tads;

/**
 *
 * @author Gabriel_Egydio
 */
public class RetornoFuncoes {
    private boolean Sucesso;

    public RetornoFuncoes(Boolean Sucesso) {
        this.Sucesso = Sucesso;
    }

    public String RetornaMensagem(){
        if(this.Sucesso){
            return String.format("Operação realizada com sucesso. %s");
        }
        return String.format("Não foi possível completar a operação. %s");
    }
}