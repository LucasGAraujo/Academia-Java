/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelo.Funcionarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author NIT0298147
 */
public class FuncionariosDAO {
private Object Pstatement;
    public void cadastrarFuncionarios (Funcionarios funcionarios) throws ExceptionDAO,SQLException{
        String sql = "insert into funcionarios (nome, rg,tipoCadastro, email,cpf) value (?,?,?,?,?,)";
        PreparedStatement pStatement = null;
        Connection connection = null;
        try{
            connection = new ConnectionMvc().getConnection();
             pStatement.setString(1, funcionarios.getNome()); 
             pStatement.setString(2, funcionarios.getRg());   
             pStatement.setString(3, funcionarios.getTipoCadastro());  
             pStatement.setString(4, funcionarios.getEmail());  
             pStatement.setString(5, funcionarios.getCpf());
            pStatement.execute();
        }catch (SQLException e){
            throw new ExceptionDAO("Erro ao cadastrar filme!" + e);
        } finally{
            try{
                if (pStatement != null){pStatement.close();}
            }catch (SQLException e){
                throw new ExceptionDAO ("Erro ao fechar conexão: " + e);
            }
        }
        
    }
    
}
