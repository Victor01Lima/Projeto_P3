/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Entidades;

import model.Entidades.Funcionario;

/**
 *
 * @author victo
 */
public class Pedido  extends Funcionario{
    private int Numero_Pedido;
    private String Bebida;
    private String tamanho_Pedido;
    private String Tipo_Massa;
    private String Ingredientes;
    private String Extra;
    private double Valor_Conta;
    private String Status;

    public void setStatus(String Status) {
        this.Status = Status;
    }
    public String getStatus(){
        return Status;
    }

    @Override
    public void setNome_Funcionario(String Nome_Funcionario) {
        super.setNome_Funcionario(Nome_Funcionario); 
    }

    @Override
    public String getNome_Funcionario() {
        return super.getNome_Funcionario(); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    public void setNumero_Pedido(int Numero_Pedido) {
        this.Numero_Pedido = Numero_Pedido;
    }

    public int getNumero_Pedido() {
        return Numero_Pedido;
    }

    
    public void setValor_Conta(double Valor_Conta) {
        this.Valor_Conta = Valor_Conta;
    }

    public double getValor_Conta() {
        return Valor_Conta;
    }
    
    
    public String getTamanho_Pedido() {
        return tamanho_Pedido;
    }

    public void setTamanho_Pedido(String tamanho_Pedido) {
        this.tamanho_Pedido = tamanho_Pedido;
    }

    public String getTipo_Massa() {
        return Tipo_Massa;
    }

    public void setTipo_Massa(String Tipo_Massa) {
        this.Tipo_Massa = Tipo_Massa;
    }

    public String getIngredientes() {
        return Ingredientes;
    }

    public void setIngredientes(String Ingredientes) {
        this.Ingredientes = Ingredientes;
    }

    public String getBebida() {
        return Bebida;
    }

    public void setBebida(String Bebida) {
        this.Bebida = Bebida;
    }

    public String getExtra() {
        return Extra;
    }

    public void setExtra(String Extra) {
        this.Extra = Extra;
    }
    
    
}
