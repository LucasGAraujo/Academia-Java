/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;


import Modelo.Clientes;
import java.time.LocalDate;

/**
 *
 * @author NIT0298147
 */
public class ClientesController {
    public boolean cadastrarClientes(String nome, Integer idade,LocalDate dataEntrada, LocalDate dataTermino,Integer peso,Integer altura, String observacao, String conducao){
    if (nome != null && nome.length() >0 && observacao!= null && observacao.length() >0 && conducao != null && conducao.length() >0 && peso >0&& idade >0){
        Clientes vet = new Clientes (nome,idade,dataEntrada,dataTermino,peso,altura, observacao, conducao);
        vet.cadastrarClientes(vet);
        return true;
    }
        return false;
    }
}
