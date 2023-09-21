/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import Modelo.Funcionarios;

/**
 *
 * @author NIT0298147
 */
public class FuncionariosController {
    public boolean cadastrarFuncionarios( String nome, String rg, String tipoCadastro, String email, String cpf) {
        
        if (nome != null && nome.length() > 0 && rg != null && rg.length() > 0 && tipoCadastro != null && tipoCadastro.length() > 0 && email != null && email.length() > 0 &&cpf != null && cpf.length() > 0) {
            Funcionarios a = new Funcionarios (nome, rg,tipoCadastro,email,cpf);
            a.cadastrarFuncionarios(a);
            return true;
        }
        return false;
    }
}
