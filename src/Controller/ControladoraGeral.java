/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;

/**
 *
 * @author Victor
 */
public abstract class ControladoraGeral {
    public abstract Connection getConexao();
    public abstract void desconecta();
}
