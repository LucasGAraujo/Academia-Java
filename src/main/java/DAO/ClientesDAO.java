/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelo.Clientes;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @author NIT0298147
 */
public class ClientesDAO {

    public void cadastrarClientes(Clientes clientes) throws ExceptionDAO, SQLException {
        String sql = "INSERT INTO cliente (nome, idade, dataEntrada, dataTermino, peso, altura, observacao, conducao) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement pStatement = null;

        try {
            connection = new ConnectionMvc().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, clientes.getNome());
            pStatement.setInt(2, clientes.getIdade());
            pStatement.setDate(3, Date.valueOf(clientes.getDataEntrada()));
            pStatement.setDate(4, Date.valueOf(clientes.getDataTermino()));
            pStatement.setInt(5, clientes.getPeso());
            pStatement.setInt(6, clientes.getAltura());
            pStatement.setString(7, clientes.getObservacao());
            pStatement.setString(8, clientes.getConducao());
            pStatement.execute();
        } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao cadastrar Cliente! " + e);
        } finally {
            try {
                if (pStatement != null) {
                    pStatement.close();
                }
            } catch (SQLException e) {
                throw new ExceptionDAO("Erro ao fechar conexão: " + e);
            }
        }
    }
}
