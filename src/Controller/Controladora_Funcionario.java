/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import model.conexao.Controladora_Conexao;
import model.Entidades.Funcionario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/*
 * @author Victor
 */
public class Controladora_Funcionario {
     private Controladora_Conexao conexao;

	public Controladora_Funcionario() {
		this.conexao = new Controladora_Conexao();
	}

	public boolean salvarFuncionario(Funcionario F) {
		try {
			String sql = "INSERT INTO Funcionários(Nome_Funcionario,CPF_Funcionario,Endereço_Funcionario,Sexo_Funcionario,"
                                + "RG_Funcionario,Telefone_Funcionario)"
					+ " VALUES (?,?,?,?,?,?);";
			
			PreparedStatement stm = conexao.getConexao().prepareStatement(sql);
			stm.setString(1, F.getNome_Funcionario());
			stm.setString(2, F.getCPF_Funcionario());
                        stm.setString(3, F.getEndereco_Funcionario());
                        stm.setString(4 ,F.getSexo_Funcionario());
                        stm.setString(5, F.getRG_Funcionario());
                        stm.setString(6, F.getTelefone_Funcionario());
                        

			stm.execute();
			conexao.getConexao().commit();
			conexao.desconecta();
			return true;
		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}

		return false;
	}

	public boolean alterarFuncionario(Funcionario F) {
		try {
			String sql = "UPDATE Funcionários SET Endereço_Funcionario = ?, Telefone_Funcionario = ?"
                        +"WHERE ID =?";
			PreparedStatement stm = conexao.getConexao().prepareStatement(sql);
                        stm.setString(1, F.getEndereco_Funcionario());
                        stm.setString(2,F.getTelefone_Funcionario());
                        stm.setInt(3,F.getID_Funcionario());
			stm.execute();
			conexao.getConexao().commit();
			conexao.desconecta();
			return true;
		} catch (Exception e) {			
                    System.out.println("Erro: " + e);
                }

		return false;
	}

	public boolean excluirFuncionario(int ID) {
		try {
			String sql = "DELETE FROM Funcionários WHERE ID = ?";

			PreparedStatement stm = conexao.getConexao().prepareStatement(sql);
			stm.setInt(1, ID);

			stm.execute();
			conexao.getConexao().commit();
			conexao.desconecta();
			return true;
		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}finally{
        }

		return false;
	}

	public List<Funcionario> listarFuncionarios() {
		List<Funcionario> ListaFuncionarios = new ArrayList<>();
		try {
			String sql = "SELECT * FROM Funcionários";

			PreparedStatement stm = conexao.getConexao().prepareStatement(sql);
			ResultSet rs = stm.executeQuery();

			while (rs.next()) {
				Funcionario F = new Funcionario();
				F.setID_Funcionario(rs.getInt("ID"));
				F.setNome_Funcionario(rs.getString("Nome_Funcionario"));
				F.setCPF_Funcionario(rs.getString("CPF_Funcionario"));
                                F.setRG_Funcionario(rs.getString("RG_Funcionario"));
                                F.setEndereco_Funcionario(rs.getString("Endereço_Funcionario"));
                                F.setSexo_Funcionario(rs.getString("Sexo_Funcionario"));
                                F.setTelefone_Funcionario(rs.getString("Telefone_Funcionario"));
				ListaFuncionarios.add(F);
			}
			conexao.desconecta();
			return ListaFuncionarios;
		} catch (Exception e) {
			System.out.println("Erro: " + e);
			conexao.desconecta();
		}               

		return ListaFuncionarios;
	}
    
}
