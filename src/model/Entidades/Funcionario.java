/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Entidades;

/**
 *
 * @author victo
 */
public class Funcionario {
    private int ID_Funcionario;
    private String Nome_Funcionario;
    private String CPF_Funcionario;
    private String RG_Funcionario;
    private String Endereco_Funcionario;
    private String sexo_Funcionario;
    private String Telefone_Funcionario;

    public int getID_Funcionario() {
        return ID_Funcionario;
    }

    public void setID_Funcionario(int ID_Funcionario) {
        this.ID_Funcionario = ID_Funcionario;
    }

    public String getNome_Funcionario() {
        return Nome_Funcionario;
    }

    public void setNome_Funcionario(String Nome_Funcionario) {
        this.Nome_Funcionario = Nome_Funcionario;
    }

    public String getCPF_Funcionario() {
        return CPF_Funcionario;
    }

    public void setCPF_Funcionario(String CPF_Funcionario) {
        this.CPF_Funcionario = CPF_Funcionario;
    }

    public String getRG_Funcionario() {
        return RG_Funcionario;
    }

    public void setRG_Funcionario(String RG_Funcionario) {
        this.RG_Funcionario = RG_Funcionario;
    }

    public String getEndereco_Funcionario() {
        return Endereco_Funcionario;
    }

    public void setEndereco_Funcionario(String Endereco_Funcionario) {
        this.Endereco_Funcionario = Endereco_Funcionario;
    }

    public String getSexo_Funcionario() {
        return sexo_Funcionario;
    }

    public void setSexo_Funcionario(String sexo_Funcionario) {
        this.sexo_Funcionario = sexo_Funcionario;
    }

    public String getTelefone_Funcionario() {
        return Telefone_Funcionario;
    }

    public void setTelefone_Funcionario(String Telefone_Funcionario) {
        this.Telefone_Funcionario = Telefone_Funcionario;
    }

    
    
}
