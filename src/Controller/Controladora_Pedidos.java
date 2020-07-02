/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import model.conexao.Controladora_Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Entidades.Pedido;
/**
 *
 * @author Victor
 */
public class Controladora_Pedidos  {
    private Controladora_Conexao conexao;

    public Controladora_Pedidos() {
        this.conexao= new Controladora_Conexao();
    }
    
    public boolean Realizar_Pedido(Pedido P){
        try{
            String sql="INSERT INTO Pedido(Nome_Funcionario,Tamanho_Prato,Tipo_Massa,Ingredientes,Extra_,Bebidas,Valor_Total_Conta,Status_Pedido)"+"VALUES (?,?,?,?,?,?,?,?);";
            
            PreparedStatement stm = conexao.getConexao().prepareStatement(sql);
            stm.setString(1,P.getNome_Funcionario());
            stm.setString(2,P.getTamanho_Pedido());
            stm.setString(3,P.getTipo_Massa());
            stm.setString(4,P.getIngredientes());
            stm.setString(5,P.getExtra());
            stm.setString(6,P.getBebida());
            stm.setDouble(7,P.getValor_Conta());
            stm.setString(8,P.getStatus());
                        stm.execute();
			conexao.getConexao().commit();
			conexao.desconecta();
        }    
        catch(Exception e){
            System.out.println("Erro: " + e);
        }
        
    
        return true;
    }
    public List<Pedido> ListarPedidos(){
        List<Pedido> ListaPedidos = new ArrayList<>();
        
        try{
                String sql = "SELECT *FROM Pedido";
                PreparedStatement stm = conexao.getConexao().prepareStatement(sql);
                ResultSet rs = stm.executeQuery();
                
                while(rs.next()){
                    Pedido P = new Pedido();
                    P.setNome_Funcionario(rs.getString("Nome_Funcionario"));
                    P.setNumero_Pedido(rs.getInt("Numero_do_Pedido"));
                    P.setTipo_Massa(rs.getString("Tipo_Massa"));
                    P.setTamanho_Pedido(rs.getString("Tamanho_Prato"));
                    P.setIngredientes(rs.getString("Ingredientes"));
                    P.setExtra(rs.getString("Extra_"));
                    P.setBebida(rs.getString("Bebidas"));
                    P.setValor_Conta(rs.getDouble("Valor_Total_Conta"));
                    P.setStatus(rs.getString("Status_Pedido"));
                    ListaPedidos.add(P); 
                }
                   conexao.desconecta();
                    return ListaPedidos;
        }catch(Exception e){
            System.out.println("Erro: " + e);
            conexao.desconecta();
        }

        
        return ListaPedidos;
}
    public void Pago(int ID){
        try {
			String sql = "UPDATE Pedido SET Status_Pedido =\"Pago\"" +
                                    "   WHERE Numero_do_Pedido=?;";
                                    
			PreparedStatement stm = conexao.getConexao().prepareStatement(sql);
                        stm.setInt(1, ID);
			stm.execute();
			conexao.getConexao().commit();
			conexao.desconecta();
		} catch (Exception e) {			
                    System.out.println("Erro: " + e);
                }
    }

}