/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author NIT0298147
 */
public class Funcionarios {
    private Integer Matricula;
    private String nome;
    private String rg;
    private String tipoCadastro;
    private String email;
    private String cpf;

    public Funcionarios( String nome, String rg, String tipoCadastro, String email, String cpf) {
        
        this.nome = nome;
        this.rg = rg;
        this.tipoCadastro = tipoCadastro;
        this.email = email;
        this.cpf = cpf;
    }

    
    public Integer getMatricula() {
        return Matricula;
    }

    public void setMatricula(Integer Matricula) {
        this.Matricula = Matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTipoCadastro() {
        return tipoCadastro;
    }

    public void setTipoCadastro(String tipoCadastro) {
        this.tipoCadastro = tipoCadastro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void cadastrarFuncionarios(Funcionarios a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
