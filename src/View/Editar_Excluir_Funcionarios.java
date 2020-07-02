/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.ArrayList;
import model.Entidades.Funcionario;
import model.modeloTabela.ModeloTabela;
import Controller.Controladora_Funcionario;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
/**
 *
 * @author Victor
 */
public class Editar_Excluir_Funcionarios extends javax.swing.JFrame {

    /**
     * Creates new form Editar_Excluir_Funcionarios
     */
    public Editar_Excluir_Funcionarios() {
        initComponents();
        
        
        carregarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Funcionarios = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        telefone = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        endereco = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        jButton6.setText("jButton6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Editar ou Excluir Funcionarios");

        Table_Funcionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Table_Funcionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Table_FuncionariosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(Table_Funcionarios);

        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 0));
        jButton1.setText("Novo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        alterar.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        alterar.setForeground(new java.awt.Color(255, 153, 0));
        alterar.setText("Alterar");
        alterar.setEnabled(false);
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        excluir.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        excluir.setForeground(new java.awt.Color(255, 153, 0));
        excluir.setText("Excluir");
        excluir.setEnabled(false);
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 153, 0));
        jButton7.setText("Cancelar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(alterar)
                    .addComponent(excluir)
                    .addComponent(jButton7)))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/images/I maccheroni.png"))); // NOI18N

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 0));
        jLabel8.setText("TELEFONE");

        try {
            telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)# ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefone.setText("");
        telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 0));
        jLabel9.setText("ENDEREÇO");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(5, 5, 5)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Cadastro_Funcionario CF = new Cadastro_Funcionario();
        CF.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
                                 Controladora_Funcionario F= new Controladora_Funcionario();
                                int aux =Integer.parseInt(Table_Funcionarios.getValueAt(Table_Funcionarios.getSelectedRow(),0).toString());
                                System.out.println(aux);
                                if( F.excluirFuncionario(aux)){
                                    JOptionPane.showMessageDialog(null,"Funcionario Excluido");
                                }                       
                
                       dispose();
                       Editar_Excluir_Funcionarios T = new Editar_Excluir_Funcionarios();
                       T.setVisible(true);			
    }//GEN-LAST:event_excluirActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        Controladora_Funcionario CF = new Controladora_Funcionario();
        Funcionario F = new Funcionario();
        
        if(telefone.getText().equals("") || endereco.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Preencha os dados corretamente!");
        }else{
            F.setID_Funcionario(Integer.parseInt(Table_Funcionarios.getValueAt(Table_Funcionarios.getSelectedRow(),0).toString()));
            F.setEndereco_Funcionario(endereco.getText());
            F.setTelefone_Funcionario(telefone.getText());
            if(CF.alterarFuncionario(F)){
                JOptionPane.showMessageDialog(null,"Informações Atualizadas!");
                Editar_Excluir_Funcionarios T = new Editar_Excluir_Funcionarios();
                T.setVisible(true);
                dispose();
            }
        }
        
    }//GEN-LAST:event_alterarActionPerformed

    private void telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneActionPerformed
        
    }//GEN-LAST:event_telefoneActionPerformed

    private void Table_FuncionariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_FuncionariosMousePressed
        Funcionario F = new Funcionario();
        F.setEndereco_Funcionario(Table_Funcionarios.getValueAt(Table_Funcionarios.getSelectedRow(),3).toString());
        F.setTelefone_Funcionario(Table_Funcionarios.getValueAt(Table_Funcionarios.getSelectedRow(),6).toString());
       // telefone.setText(F.getTelefone_Funcionario());
        endereco.setText(F.getEndereco_Funcionario());
    }//GEN-LAST:event_Table_FuncionariosMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Editar_Excluir_Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar_Excluir_Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar_Excluir_Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar_Excluir_Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editar_Excluir_Funcionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_Funcionarios;
    private javax.swing.JButton alterar;
    private javax.swing.JTextField endereco;
    private javax.swing.JButton excluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Panel panel1;
    private javax.swing.JFormattedTextField telefone;
    // End of variables declaration//GEN-END:variables

    private void carregarTabela() {
        ArrayList Linhas = new ArrayList<>();
        Controladora_Funcionario CD = new Controladora_Funcionario();
        String [] colunas = new String[]{"ID" , "Nome ","CPF","Endereço","RG","Telefone", "Sexo"};
        
        for (Funcionario F: CD.listarFuncionarios()) {
            Linhas.add(new Object[]{F.getID_Funcionario(),
                                   F.getNome_Funcionario(),
                                   F.getCPF_Funcionario(),
                                   F.getEndereco_Funcionario(),
                                   F.getRG_Funcionario(),
                                   F.getTelefone_Funcionario(),
                                   F.getSexo_Funcionario()});
        }
        ModeloTabela  tabela = new ModeloTabela(Linhas,colunas);
        Table_Funcionarios.setModel(tabela);        
        Table_Funcionarios.getColumnModel().getColumn(0).setResizable(false);
        Table_Funcionarios.getColumnModel().getColumn(1).setResizable(false);
        Table_Funcionarios.getColumnModel().getColumn(2).setResizable(false);
        Table_Funcionarios.getColumnModel().getColumn(3).setResizable(false);
        Table_Funcionarios.getColumnModel().getColumn(4).setResizable(false);
        Table_Funcionarios.getColumnModel().getColumn(5).setResizable(false);
        Table_Funcionarios.getColumnModel().getColumn(6).setResizable(false);
        
        Table_Funcionarios.getTableHeader().setReorderingAllowed(false);
      
        Table_Funcionarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);     
        
        Table_Funcionarios.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
                            if(e.getClickCount()==1){
                                     
                                excluir.setEnabled(true);
                                alterar.setEnabled(true);
                                              
                            }                       
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
			}
			
		});
    }
}