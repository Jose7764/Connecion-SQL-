package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    public void inserir(String nome , String email){
        String sql = "INSERT INTO usuarios (nome , email) VALUES (?,?)";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.executeUpdate();

            System.out.println("Usuario inserido com sucesso!");

        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    public void MostrarUsuarios(){
        String sql = "SELECT id , nome from usuarios;";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()){


            while (rs.next()) {
                String nome = rs.getString("nome");
                int id = rs.getInt("id");
                System.out.println(id +" - " + nome);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }



    }

    public void deletarUsuarios(int opcao){
        String sql = "DELETE FROM usuarios WHERE id = ?";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setInt(1, opcao);

            stmt.executeUpdate();

            System.out.println("Usuario deletado com sucesso!");

        }catch (SQLException e){
            e.printStackTrace();
        }

    }


}
