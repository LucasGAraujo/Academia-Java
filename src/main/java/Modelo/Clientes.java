/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author NIT0298147
 */
public class Clientes {
    private Integer codCliente;
    private String nome;
    private Integer idade;
    private LocalDate dataEntrada; 
     private LocalDate dataTermino; 
     private Integer peso;
     private Integer altura;
     private String observacao;
     private String conducao;
        
     
     public Clientes(String nome, Integer idade,LocalDate dataEntrada, LocalDate dataTermino,Integer peso,Integer altura, String observacao, String conducao){
     this.nome = nome;
     this.idade = idade;
     this.dataEntrada = dataEntrada;
     this.dataTermino = dataTermino;
     this.peso = peso;
     this.altura = altura;
     this.observacao = observacao;
     this.conducao = conducao;
     }
     
     
     
    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getConducao() {
        return conducao;
    }

    public void setConducao(String conducao) {
        this.conducao = conducao;
    }

    public void cadastrarClientes(Clientes vet) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     
}
