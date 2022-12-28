
package Telas;

import javax.swing.JOptionPane;


public class AddMovie extends javax.swing.JFrame {

    public AddMovie() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        raGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        edtTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        edtTituloOriginal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSinopse = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        edtDuracao = new javax.swing.JTextField();
        rbLivre = new javax.swing.JRadioButton();
        rb14 = new javax.swing.JRadioButton();
        rb16 = new javax.swing.JRadioButton();
        rb18 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbAcao = new javax.swing.JCheckBox();
        cbAventura = new javax.swing.JCheckBox();
        cbComedia = new javax.swing.JCheckBox();
        cbSuspense = new javax.swing.JCheckBox();
        cbDrama = new javax.swing.JCheckBox();
        cbTerror = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        ccPais = new javax.swing.JComboBox<>();
        btnLimpar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações Basicas\n"));

        jLabel1.setText("Titulo");
        jLabel1.setToolTipText("");

        jLabel3.setText("Titulo Original");

        edtTituloOriginal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtTituloOriginalActionPerformed(evt);
            }
        });

        jLabel4.setText("Sinopse");

        taSinopse.setColumns(20);
        taSinopse.setRows(5);
        jScrollPane1.setViewportView(taSinopse);

        jLabel5.setText("Duração");

        edtDuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtDuracaoActionPerformed(evt);
            }
        });

        raGroup.add(rbLivre);
        rbLivre.setSelected(true);
        rbLivre.setText("Livre");
        rbLivre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLivreActionPerformed(evt);
            }
        });

        raGroup.add(rb14);
        rb14.setText("14 anos");
        rb14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb14ActionPerformed(evt);
            }
        });

        raGroup.add(rb16);
        rb16.setText("16 anos");
        rb16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb16ActionPerformed(evt);
            }
        });

        raGroup.add(rb18);
        rb18.setText("18 anos");
        rb18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb18ActionPerformed(evt);
            }
        });

        jLabel6.setText("Classificação");

        jLabel7.setText("minutos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtTituloOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbLivre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb18)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtTituloOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbLivre)
                    .addComponent(rb16)
                    .addComponent(rb14)
                    .addComponent(rb18)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Outras Informações"));

        jLabel8.setText("Gênero");

        cbAcao.setText("Ação");
        cbAcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAcaoActionPerformed(evt);
            }
        });

        cbAventura.setText("Aventura");
        cbAventura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAventuraActionPerformed(evt);
            }
        });

        cbComedia.setText("Comédia");
        cbComedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbComediaActionPerformed(evt);
            }
        });

        cbSuspense.setText("Suspense");

        cbDrama.setText("Drama");

        cbTerror.setText("Terror");
        cbTerror.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTerrorActionPerformed(evt);
            }
        });

        jLabel9.setText("País de Origem");

        ccPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Brasil", "Uruguai", "Paraguai", "Argentina" }));
        ccPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccPaisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbAcao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbAventura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbComedia, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbDrama)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSuspense)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTerror, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9)
                    .addComponent(ccPais, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAcao)
                    .addComponent(cbAventura)
                    .addComponent(cbComedia)
                    .addComponent(cbSuspense)
                    .addComponent(cbDrama)
                    .addComponent(cbTerror))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ccPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnCadastrar))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb18ActionPerformed

    }//GEN-LAST:event_rb18ActionPerformed

    private void rb16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb16ActionPerformed

    }//GEN-LAST:event_rb16ActionPerformed

    private void rb14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb14ActionPerformed

    }//GEN-LAST:event_rb14ActionPerformed

    private void rbLivreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLivreActionPerformed

    }//GEN-LAST:event_rbLivreActionPerformed

    private void edtDuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtDuracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtDuracaoActionPerformed

    private void edtTituloOriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtTituloOriginalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtTituloOriginalActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String titulo = edtTitulo.getText();
        String tituloOriginal = edtTituloOriginal.getText();
        String sinopse = taSinopse.getText();
        int duracao;
        try {
            duracao = Integer.parseInt(edtDuracao.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "A duração deve ser um número inteiro");
            return;
        } 
        int classificacao;
        String generos = "";
        
        if(rbLivre.isSelected()){
            classificacao = 0;
        } else if(rb14.isSelected()){
            classificacao = 1;
        } else if(rb16.isSelected()){
            classificacao = 2;
        } else {
            classificacao = 3;
        }
        
        if (cbAcao.isSelected()){
            generos += "Ação ";
        }
        if (cbAventura.isSelected()){
            generos += "Aventura ";
        }
        if (cbComedia.isSelected()){
            generos += "Comédia ";
        }
        if (cbDrama.isSelected()){
            generos += "Drama ";
        }
        if (cbSuspense.isSelected()){
            generos += "Suspense ";
        }
        if (cbTerror.isSelected()){
            generos += "Terror ";
        }
        
        int pais = ccPais.getSelectedIndex();
        
        String dadosLidos = "Título: " + titulo + "\n";
        dadosLidos += "Titulo Original: " + tituloOriginal + "\n";
        dadosLidos += "Sinopse: " + sinopse + "\n";
        dadosLidos += "Duração: " + duracao + "\n";
        dadosLidos += "Classificação: " + classificacao + "\n";
        dadosLidos += "Gêneros: " + generos + "\n";
        dadosLidos += "País: " + pais + "\n";

        if(generos.equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione pelo menos um gênero");
            return;
        } else {
            JOptionPane.showMessageDialog(this, dadosLidos);
        }
   

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void ccPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ccPaisActionPerformed

    private void cbTerrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTerrorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTerrorActionPerformed

    private void cbComediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbComediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbComediaActionPerformed

    private void cbAventuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAventuraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAventuraActionPerformed

    private void cbAcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAcaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAcaoActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        edtTitulo.setText("");
        edtTituloOriginal.setText("");
        taSinopse.setText("");
        edtDuracao.setText("");
        rbLivre.setSelected(true);
        cbAcao.setSelected(false);
        cbAventura.setSelected(false);
        cbComedia.setSelected(false);
        cbDrama.setSelected(false);
        cbSuspense.setSelected(false);
        cbTerror.setSelected(false);
        ccPais.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimparActionPerformed

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
            javax.swing.UIManager.setLookAndFeel(
                    javax.swing.UIManager.getSystemLookAndFeelClassName());
      
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | 
                javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMovie.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMovie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JCheckBox cbAcao;
    private javax.swing.JCheckBox cbAventura;
    private javax.swing.JCheckBox cbComedia;
    private javax.swing.JCheckBox cbDrama;
    private javax.swing.JCheckBox cbSuspense;
    private javax.swing.JCheckBox cbTerror;
    private javax.swing.JComboBox<String> ccPais;
    private javax.swing.JTextField edtDuracao;
    private javax.swing.JTextField edtTitulo;
    private javax.swing.JTextField edtTituloOriginal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup raGroup;
    private javax.swing.JRadioButton rb14;
    private javax.swing.JRadioButton rb16;
    private javax.swing.JRadioButton rb18;
    private javax.swing.JRadioButton rbLivre;
    private javax.swing.JTextArea taSinopse;
    // End of variables declaration//GEN-END:variables
}
