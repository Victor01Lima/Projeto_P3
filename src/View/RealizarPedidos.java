/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import model.Entidades.Pedido;
import Controller.Controladora_Pedidos;
import javax.swing.JOptionPane;
/**
 *
 * @author Victor
 */
public class RealizarPedidos extends javax.swing.JFrame {

    /**
     * Creates new form RealizarPedidos
     */
    public RealizarPedidos(String NomeFuncionario) {    
        initComponents();
        Logado.setText("Logado como "+NomeFuncionario.replace("Bem Vindo",""));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logadoComo = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        TAMANHO = new javax.swing.JLabel();
        tamanhoPedido = new javax.swing.JComboBox<>();
        Tipo_Massa = new javax.swing.JComboBox<>();
        panel3 = new java.awt.Panel();
        molho1 = new javax.swing.JRadioButton();
        Molho2 = new javax.swing.JRadioButton();
        molho3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        panel4 = new java.awt.Panel();
        Ingred4 = new javax.swing.JRadioButton();
        Ingred5 = new javax.swing.JRadioButton();
        Ingred6 = new javax.swing.JRadioButton();
        Ingred7 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        panel5 = new java.awt.Panel();
        Extra1 = new javax.swing.JRadioButton();
        Extra2 = new javax.swing.JRadioButton();
        Extra3 = new javax.swing.JRadioButton();
        Extra4 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        panel6 = new java.awt.Panel();
        Ingred16 = new javax.swing.JRadioButton();
        Ingred17 = new javax.swing.JRadioButton();
        Ingred18 = new javax.swing.JRadioButton();
        Ingred19 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        panel7 = new java.awt.Panel();
        Ingred1 = new javax.swing.JRadioButton();
        Ingred2 = new javax.swing.JRadioButton();
        Ingred3 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        panel8 = new java.awt.Panel();
        Ingred8 = new javax.swing.JRadioButton();
        Ingred9 = new javax.swing.JRadioButton();
        Ingred10 = new javax.swing.JRadioButton();
        Ingred11 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        panel9 = new java.awt.Panel();
        Ingred12 = new javax.swing.JRadioButton();
        Ingred13 = new javax.swing.JRadioButton();
        Ingred14 = new javax.swing.JRadioButton();
        Ingred15 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Bebida = new javax.swing.JComboBox<>();
        Confirmar_pedido = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Logado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1130, 570));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("REALIZAR PEDIDO");

        panel2.setBackground(new java.awt.Color(204, 204, 204));

        TAMANHO.setBackground(new java.awt.Color(0, 0, 0));
        TAMANHO.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        TAMANHO.setForeground(new java.awt.Color(255, 153, 0));
        TAMANHO.setText("ESCOLHA SEUS INGREDIENTES");

        tamanhoPedido.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        tamanhoPedido.setForeground(new java.awt.Color(255, 153, 0));
        tamanhoPedido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TAMANHO", "P", "M", "G" }));
        tamanhoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamanhoPedidoActionPerformed(evt);
            }
        });

        Tipo_Massa.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        Tipo_Massa.setForeground(new java.awt.Color(255, 153, 0));
        Tipo_Massa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MASSA", "Talharim", "Penne", "Parafuso", "Espaguete", "Integral " }));
        Tipo_Massa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tipo_MassaActionPerformed(evt);
            }
        });

        panel3.setForeground(new java.awt.Color(255, 255, 255));

        molho1.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        molho1.setForeground(new java.awt.Color(255, 153, 0));
        molho1.setText("Rosé");
        molho1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                molho1ActionPerformed(evt);
            }
        });

        Molho2.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        Molho2.setForeground(new java.awt.Color(255, 153, 0));
        Molho2.setText("Vermelho");

        molho3.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        molho3.setForeground(new java.awt.Color(255, 153, 0));
        molho3.setText("Branco");
        molho3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                molho3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Molho");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(molho3)
                    .addComponent(Molho2)
                    .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(molho1)
                        .addComponent(jLabel2)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(molho1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Molho2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(molho3)
                .addGap(55, 55, 55))
        );

        Ingred4.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        Ingred4.setForeground(new java.awt.Color(255, 153, 0));
        Ingred4.setText("Queijo");

        Ingred5.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        Ingred5.setForeground(new java.awt.Color(255, 153, 0));
        Ingred5.setText("Sal");

        Ingred6.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        Ingred6.setForeground(new java.awt.Color(255, 153, 0));
        Ingred6.setText("Pimenta");

        Ingred7.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        Ingred7.setForeground(new java.awt.Color(255, 153, 0));
        Ingred7.setText("Oregano");

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("INGREDIENTES");

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ingred7)
                            .addComponent(Ingred6)
                            .addComponent(Ingred5)
                            .addComponent(Ingred4)))
                    .addComponent(jLabel3))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ingred4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ingred5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ingred6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ingred7)
                .addGap(15, 15, 15))
        );

        Extra1.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        Extra1.setForeground(new java.awt.Color(255, 153, 0));
        Extra1.setText("Porção Extra Atum (+ R$ 3,50)");

        Extra2.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        Extra2.setForeground(new java.awt.Color(255, 153, 0));
        Extra2.setText("Porção extra Camarão (+ R$ 5,00)");

        Extra3.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        Extra3.setForeground(new java.awt.Color(255, 153, 0));
        Extra3.setText("Porção Extra Bacalhau(+ R$ 4,00)");
        Extra3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Extra3ActionPerformed(evt);
            }
        });

        Extra4.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        Extra4.setForeground(new java.awt.Color(255, 153, 0));
        Extra4.setText("Porção Extra Carne (+ R$ 5,00)");

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("EXTRA");

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Extra4)
                    .addComponent(Extra3)
                    .addComponent(Extra2)
                    .addComponent(Extra1)
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel4)))
                .addGap(16, 16, 16))
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Extra1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Extra2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Extra3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Extra4)
                .addGap(15, 15, 15))
        );

        Ingred16.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        Ingred16.setForeground(new java.awt.Color(255, 153, 0));
        Ingred16.setText("Ervilha");
        Ingred16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingred16ActionPerformed(evt);
            }
        });

        Ingred17.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        Ingred17.setForeground(new java.awt.Color(255, 153, 0));
        Ingred17.setText("Passas");

        Ingred18.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        Ingred18.setForeground(new java.awt.Color(255, 153, 0));
        Ingred18.setText("Alcaparras");

        Ingred19.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        Ingred19.setForeground(new java.awt.Color(255, 153, 0));
        Ingred19.setText("Azeitona");

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("INGREDIENTES");

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(Ingred17)
                    .addComponent(Ingred16)
                    .addComponent(Ingred18)
                    .addComponent(Ingred19))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(Ingred16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ingred17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ingred18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ingred19)
                .addGap(15, 15, 15))
        );

        panel7.setForeground(new java.awt.Color(255, 255, 255));

        Ingred1.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        Ingred1.setForeground(new java.awt.Color(255, 153, 0));
        Ingred1.setText("Calabresa");
        Ingred1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingred1ActionPerformed(evt);
            }
        });

        Ingred2.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        Ingred2.setForeground(new java.awt.Color(255, 153, 0));
        Ingred2.setText("Alho");

        Ingred3.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        Ingred3.setForeground(new java.awt.Color(255, 153, 0));
        Ingred3.setText("Tomate");

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("INGREDIENTES");

        javax.swing.GroupLayout panel7Layout = new javax.swing.GroupLayout(panel7);
        panel7.setLayout(panel7Layout);
        panel7Layout.setHorizontalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ingred3)
                    .addComponent(Ingred2)
                    .addComponent(Ingred1))
                .addGap(37, 37, 37))
            .addGroup(panel7Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel7Layout.setVerticalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ingred1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ingred2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ingred3)
                .addGap(55, 55, 55))
        );

        Ingred8.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        Ingred8.setForeground(new java.awt.Color(255, 153, 0));
        Ingred8.setText("Cebola");
        Ingred8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingred8ActionPerformed(evt);
            }
        });

        Ingred9.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        Ingred9.setForeground(new java.awt.Color(255, 153, 0));
        Ingred9.setText("Bacon");

        Ingred10.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        Ingred10.setForeground(new java.awt.Color(255, 153, 0));
        Ingred10.setText("Presunto");

        Ingred11.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        Ingred11.setForeground(new java.awt.Color(255, 153, 0));
        Ingred11.setText("Milho");

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText("INGREDIENTES");

        javax.swing.GroupLayout panel8Layout = new javax.swing.GroupLayout(panel8);
        panel8.setLayout(panel8Layout);
        panel8Layout.setHorizontalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(Ingred11)
                    .addComponent(Ingred10)
                    .addComponent(Ingred9)
                    .addComponent(Ingred8))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panel8Layout.setVerticalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(Ingred8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ingred9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ingred10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ingred11)
                .addGap(15, 15, 15))
        );

        Ingred12.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        Ingred12.setForeground(new java.awt.Color(255, 153, 0));
        Ingred12.setText("Coentro");

        Ingred13.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        Ingred13.setForeground(new java.awt.Color(255, 153, 0));
        Ingred13.setText("Salsa");

        Ingred14.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        Ingred14.setForeground(new java.awt.Color(255, 153, 0));
        Ingred14.setText("Cebolinha");

        Ingred15.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        Ingred15.setForeground(new java.awt.Color(255, 153, 0));
        Ingred15.setText("Manjericão");
        Ingred15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingred15ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 0));
        jLabel8.setText("INGREDIENTES");

        javax.swing.GroupLayout panel9Layout = new javax.swing.GroupLayout(panel9);
        panel9.setLayout(panel9Layout);
        panel9Layout.setHorizontalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel9Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(Ingred15)
                    .addComponent(Ingred14)
                    .addComponent(Ingred13)
                    .addComponent(Ingred12))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panel9Layout.setVerticalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(Ingred12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ingred13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ingred14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ingred15)
                .addGap(15, 15, 15))
        );

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 0));
        jLabel9.setText("BEBIDA");

        Bebida.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        Bebida.setForeground(new java.awt.Color(255, 153, 0));
        Bebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bebidas", "Aguá Copo 350 ml", "Água Carrafa 1 L", "Água Garrafa 2 L", "Coca Cola Lata 350 ml", "Coca Cola 1 L", "Coca Cola 2 L", "Guaraná 350 ml", "Guaraná 1 L", "Guaraná 2 L", " " }));
        Bebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BebidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(panel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tamanhoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addComponent(Tipo_Massa, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(52, 52, 52)
                                                .addComponent(Bebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(54, 54, 54))
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(116, 116, 116)))
                                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addGap(33, 33, 33)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(TAMANHO)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addComponent(panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(TAMANHO)
                                .addGap(18, 18, 18)
                                .addComponent(tamanhoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Tipo_Massa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Bebida, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)))
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Confirmar_pedido.setBackground(new java.awt.Color(255, 153, 0));
        Confirmar_pedido.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        Confirmar_pedido.setText("Confirmar");
        Confirmar_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirmar_pedidoActionPerformed(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(255, 153, 0));
        cancelar.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N

        Logado.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        Logado.setText("jLabel11");

        javax.swing.GroupLayout logadoComoLayout = new javax.swing.GroupLayout(logadoComo);
        logadoComo.setLayout(logadoComoLayout);
        logadoComoLayout.setHorizontalGroup(
            logadoComoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logadoComoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logadoComoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(logadoComoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(logadoComoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Logado, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logadoComoLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Confirmar_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        logadoComoLayout.setVerticalGroup(
            logadoComoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logadoComoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logadoComoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(logadoComoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(logadoComoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Confirmar_pedido, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logadoComo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logadoComo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void Confirmar_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirmar_pedidoActionPerformed
        Pedido P = new Pedido();
        double Valor_Total_Pedido=0;
        P.setNome_Funcionario(Logado.getText());
        P.setBebida(Bebida.getSelectedItem().toString());
        Controladora_Pedidos CP = new Controladora_Pedidos();
        P.setTamanho_Pedido(tamanhoPedido.getSelectedItem().toString());

        if(Bebida.getSelectedItem().toString().equals("Aguá Copo 350 ml")){
            Valor_Total_Pedido+=2.0;
            if(Bebida.getSelectedItem().toString().equals("Água Carrafa 1 L")){
                Valor_Total_Pedido+=3.0;
            }
            if(Bebida.getSelectedItem().toString().equals("Água Garrafa 2 L")){
                Valor_Total_Pedido+=4.0;
            }
            if(Bebida.getSelectedItem().toString().equals("Coca Cola Lata 350 ml")){
                Valor_Total_Pedido+=3.0;
            }
            if(Bebida.getSelectedItem().toString().equals("Coca Cola 1 L")){
                Valor_Total_Pedido+=4.0;
            }
        }

        if(tamanhoPedido.getSelectedItem().toString().equals("P")){
            Valor_Total_Pedido+=10.0;
        }
        if(tamanhoPedido.getSelectedItem().toString().equals("M")){
            Valor_Total_Pedido+=15.0;
        }
        if(tamanhoPedido.getSelectedItem().toString().equals("G")){
            Valor_Total_Pedido+=18.0;
        }
        P.setTipo_Massa(Tipo_Massa.getSelectedItem().toString());

        String Ingredientes="Ingredientes\n";
        String Molho = "Molho\n";
        String Extras = "";
        // SELECIONANDO OS MOLHOS
        if(tamanhoPedido.getSelectedItem().toString().equals("TAMANHO") || Tipo_Massa.getSelectedItem().toString().equals("MASSA")){
            JOptionPane.showMessageDialog(null,"Tipo de Massa ou Tamanho não Preenchidos!");
        }
        else{
            if(molho1.isSelected()){
                Molho+= " Rosé \n";
                Valor_Total_Pedido+=2.50;
            }

            if(Molho2.isSelected()){
                Molho+= "Vermelho \n";
                Valor_Total_Pedido+=2.50;
            }

            if(molho3.isSelected()){
                Molho+= "Branco \n";
                Valor_Total_Pedido+=2.50;
            }
            Ingredientes+=Molho;
            // SELECIONANDO OS INGREDIENTES
            if(Ingred1.isSelected()){
                Ingredientes+="Calabresa \n";
                Valor_Total_Pedido+=3.0;
            }
            if(Ingred2.isSelected()){
                Ingredientes+= "Alho \n";
                Valor_Total_Pedido+=3.0;
            }
            if(Ingred3.isSelected()){
                Ingredientes+= "Tomate \n";
                Valor_Total_Pedido+=3.0;
            }
            if(Ingred4.isSelected()){
                Ingredientes+= "Queijo \n";
                Valor_Total_Pedido+=3.0;
            }
            if(Ingred5.isSelected()){
                Ingredientes+= "Sal \n";
                Valor_Total_Pedido+=3.0;
            }
            if(Ingred6.isSelected()){
                Ingredientes+= "Pimenta \n";
                Valor_Total_Pedido+=3.0;
            }
            if(Ingred7.isSelected()){
                Ingredientes+= "Oregano \n";
                Valor_Total_Pedido+=3.0;
            }
            if(Ingred8.isSelected()){
                Ingredientes+= "Cebola \n";
                Valor_Total_Pedido+=3.0;
            }
            if(Ingred9.isSelected()){
                Ingredientes+= "Bacon \n";
                Valor_Total_Pedido+=3.0;
            }
            if(Ingred10.isSelected()){
                Ingredientes+= "Presunto \n";
                Valor_Total_Pedido+=3.0;
            }
            if(Ingred11.isSelected()){
                Ingredientes+= "Milho \n";
                Valor_Total_Pedido+=3.0;
            }
            if(Ingred12.isSelected()){
                Ingredientes+= "Coentro \n";
                Valor_Total_Pedido+=3.0;
            }
            if(Ingred13.isSelected()){
                Ingredientes+= "Salsa \n";
                Valor_Total_Pedido+=3.0;
            }
            if(Ingred14.isSelected()){
                Ingredientes+= "Cebolinha \n";
                Valor_Total_Pedido+=3.0;
            }
            if(Ingred15.isSelected()){
                Ingredientes+= "Manjericão \n";
                Valor_Total_Pedido+=3.0;
            }
            if(Ingred16.isSelected()){
                Ingredientes+= "Ervilha \n";
                Valor_Total_Pedido+=3.0;
            }
            if(Ingred17.isSelected()){
                Ingredientes+= "Passas \n";
                Valor_Total_Pedido+=3.0;
            }
            if(Ingred18.isSelected()){
                Ingredientes+= "Alcaparras \n";
                Valor_Total_Pedido+=3.0;
            }
            if(Ingred19.isSelected()){
                Ingredientes+="Azeitona \n";
                Valor_Total_Pedido+=3.0;
            }
            // SELECIONANDO EXTRAS
            if(Extra1.isSelected()){
                Extras+= "Porção Extra Atum \n";
                Valor_Total_Pedido+=4.0;
            }
            if(Extra2.isSelected()){
                Extras+= "Porção Extra Camarão \n";
                Valor_Total_Pedido+=5.0;
            }
            if(Extra3.isSelected()){
                Extras+= "Porção Extra Bacalhau \n";
                Valor_Total_Pedido+=4.50;
            }
            if(Extra4.isSelected()){
                Extras+= "Porção Extra Carne \n";
                Valor_Total_Pedido+=5.0;
            }
            P.setIngredientes(Ingredientes);
            P.setExtra(Extras);
            P.setValor_Conta(Valor_Total_Pedido);
            P.setStatus("ABERTO");
            if(CP.Realizar_Pedido(P)){
                JOptionPane.showMessageDialog(null, "Pedido Efetuado");
                Tela_Funcionario TL = new Tela_Funcionario(Logado.getText().replace("Logado como",""),"");
        TL.setVisible(true);
        dispose();
            }
            else{
                JOptionPane.showMessageDialog(null,"Erro ao Efetuar Pedido");
                Tela_Funcionario TL = new Tela_Funcionario(Logado.getText().replace("Logado como",""),"");
                    TL.setVisible(true);
                    dispose();
            }
        }       
    }//GEN-LAST:event_Confirmar_pedidoActionPerformed

    private void BebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BebidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BebidaActionPerformed

    private void Ingred15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingred15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ingred15ActionPerformed

    private void Ingred8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingred8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ingred8ActionPerformed

    private void Ingred1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingred1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ingred1ActionPerformed

    private void Ingred16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingred16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ingred16ActionPerformed

    private void Extra3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Extra3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Extra3ActionPerformed

    private void molho3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_molho3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_molho3ActionPerformed

    private void molho1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_molho1ActionPerformed

    }//GEN-LAST:event_molho1ActionPerformed

    private void Tipo_MassaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tipo_MassaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tipo_MassaActionPerformed

    private void tamanhoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamanhoPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tamanhoPedidoActionPerformed

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
            java.util.logging.Logger.getLogger(RealizarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RealizarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RealizarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RealizarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
@Override
           public void run() {
               String teste ="teste";
                new RealizarPedidos(teste).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Bebida;
    private javax.swing.JButton Confirmar_pedido;
    private javax.swing.JRadioButton Extra1;
    private javax.swing.JRadioButton Extra2;
    private javax.swing.JRadioButton Extra3;
    private javax.swing.JRadioButton Extra4;
    private javax.swing.JRadioButton Ingred1;
    private javax.swing.JRadioButton Ingred10;
    private javax.swing.JRadioButton Ingred11;
    private javax.swing.JRadioButton Ingred12;
    private javax.swing.JRadioButton Ingred13;
    private javax.swing.JRadioButton Ingred14;
    private javax.swing.JRadioButton Ingred15;
    private javax.swing.JRadioButton Ingred16;
    private javax.swing.JRadioButton Ingred17;
    private javax.swing.JRadioButton Ingred18;
    private javax.swing.JRadioButton Ingred19;
    private javax.swing.JRadioButton Ingred2;
    private javax.swing.JRadioButton Ingred3;
    private javax.swing.JRadioButton Ingred4;
    private javax.swing.JRadioButton Ingred5;
    private javax.swing.JRadioButton Ingred6;
    private javax.swing.JRadioButton Ingred7;
    private javax.swing.JRadioButton Ingred8;
    private javax.swing.JRadioButton Ingred9;
    private javax.swing.JLabel Logado;
    private javax.swing.JRadioButton Molho2;
    private javax.swing.JLabel TAMANHO;
    private javax.swing.JComboBox<String> Tipo_Massa;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private java.awt.Panel logadoComo;
    private javax.swing.JRadioButton molho1;
    private javax.swing.JRadioButton molho3;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private java.awt.Panel panel4;
    private java.awt.Panel panel5;
    private java.awt.Panel panel6;
    private java.awt.Panel panel7;
    private java.awt.Panel panel8;
    private java.awt.Panel panel9;
    private javax.swing.JComboBox<String> tamanhoPedido;
    // End of variables declaration//GEN-END:variables

}