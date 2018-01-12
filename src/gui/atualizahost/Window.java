/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.atualizahost;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author henrique
 */

public class Window extends javax.swing.JFrame {

    /**
     * Creates new form Window
     */
    public Window() {
        initComponents();
        new JSONRW().leArquivo("./vpn_ini.json");
        
        jTextFieldServer.setText(JSONRW.nome);
        jTextFieldAlias.setText(JSONRW.alias);
        jTextFieldIP.setText(JSONRW.ip);
        jTextFieldStatus.setText("Não verificado!");
        
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldServer = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneMensagens = new javax.swing.JTextPane();
        jTextFieldStatus = new javax.swing.JTextField();
        jButtonSair = new javax.swing.JButton();
        jTextFieldAlias = new javax.swing.JTextField();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonTestPing = new javax.swing.JButton();
        jTextFieldIP = new javax.swing.JTextField();
        jProgressBar = new javax.swing.JProgressBar();
        jButtonVerificar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 204, 255));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jTextFieldServer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome Srrvidor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 204))); // NOI18N
        jTextFieldServer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldServerMouseClicked(evt);
            }
        });
        jTextFieldServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldServerActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTextPaneMensagens);

        jTextFieldStatus.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Status", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(51, 102, 255))); // NOI18N
        jTextFieldStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStatusActionPerformed(evt);
            }
        });

        jButtonSair.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSair.setForeground(new java.awt.Color(102, 102, 255));
        jButtonSair.setMnemonic('F');
        jButtonSair.setText("Fechar");
        jButtonSair.setToolTipText("");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jTextFieldAlias.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 204))); // NOI18N
        jTextFieldAlias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldAliasMouseClicked(evt);
            }
        });

        jButtonAtualizar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAtualizar.setForeground(new java.awt.Color(102, 102, 255));
        jButtonAtualizar.setMnemonic('A');
        jButtonAtualizar.setText("Atualizar hosts");
        jButtonAtualizar.setToolTipText("Atualiza informações de Configuração");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonTestPing.setBackground(new java.awt.Color(255, 255, 255));
        jButtonTestPing.setForeground(new java.awt.Color(102, 102, 255));
        jButtonTestPing.setMnemonic('T');
        jButtonTestPing.setText("Testar");
        jButtonTestPing.setToolTipText("Executa Ping no IP");
        jButtonTestPing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTestPingActionPerformed(evt);
            }
        });

        jTextFieldIP.setEditable(false);
        jTextFieldIP.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldIP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IP:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(51, 51, 255))); // NOI18N
        jTextFieldIP.setFocusable(false);
        jTextFieldIP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldIPMouseClicked(evt);
            }
        });
        jTextFieldIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIPActionPerformed(evt);
            }
        });

        jProgressBar.setForeground(new java.awt.Color(0, 0, 255));
        jProgressBar.setToolTipText("");
        jProgressBar.setStringPainted(true);

        jButtonVerificar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonVerificar.setForeground(new java.awt.Color(102, 102, 255));
        jButtonVerificar.setMnemonic('C');
        jButtonVerificar.setText("Consultar Alias");
        jButtonVerificar.setToolTipText("Verifica se o IP gravado no hosts está correto");
        jButtonVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldIP, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAlias, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldServer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonVerificar, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(jButtonAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButtonTestPing)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonSair))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldServer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAlias, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldIP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTestPing)
                    .addComponent(jButtonSair))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Atualiza Hosts");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 153));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Versão 1.2  ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(jLabel6)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarActionPerformed
        
        String servidor = jTextFieldAlias.getText();
        String ip = "";
        try {
            jTextPaneMensagens.setText("Consultando ...");
            ip = new ConectaServidor().leIp(servidor);

        } catch (IOException ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            jTextPaneMensagens.setText("Verifique sua conexão com a internet\nReinicie o serviço de openvpn");
            jTextFieldStatus.setText("Erro ao conectar o servidor");
        }
        if (ip.equals("0.0.0.0")) {
            jTextFieldIP.setText(ip);
            jTextPaneMensagens.setText("O alias " + jTextFieldAlias.getText()
                    + " não foi encontrado!\nVerifique se está correto");
        } else {
            jTextFieldIP.setText(ip);
            jTextFieldAlias.setText(servidor);
            jTextFieldStatus.setText("O Alias " + jTextFieldAlias.getText() + " responde pelo IP:"
                    + ip);
            jTextPaneMensagens.setText("Terminado.");
        }
    }//GEN-LAST:event_jButtonVerificarActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        String servidor = jTextFieldServer.getText();
        final String alias = jTextFieldAlias.getText();
        final String ip = jTextFieldIP.getText();
        //System.out.println("\n" + servidor 
        //+ "\n" + ip + "\n" + alias);

        try {
            jTextPaneMensagens.setText("Gravando arquivo de configurações...");
            new JSONRW().criarArquivo(servidor, alias, ip);
        } catch (IOException ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Erro ao criar o arquivo", "Erro", 64);
        }

        new Thread() {
            
            @Override
            public void run() {
                jProgressBar.setValue(0);
                jProgressBar.setForeground(Color.blue);
                for (int i = 0; i < 101; i++) {
                    jProgressBar.setValue(i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
                }
                    if (i < 25) {
                        jTextPaneMensagens.setText("Lendo Arquivo hosts...");

                    } else if (i == 80) {

                        try {
                            new AtualizaHost().gravaHosts(alias, ip);
                            jTextPaneMensagens.setText(jTextPaneMensagens.getText() + 
                                 "\nGravando dados...");
                        } catch (IOException ex) {
                            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
                            jTextPaneMensagens.setForeground(Color.red);
                            jTextPaneMensagens.setText("Erro ao gravar dados no arquivo hosts!"
                                    + ex);
                            
                            break;
                        }

                    } else if (i == 100) {
                        jTextPaneMensagens.setText("Dados gravados no arquivo hosts com sucesso!");
                    }
                }
            } 
        }.start();
//        } catch (IOException e){
//            e.printStackTrace();
//            jTextPaneMensagens.setText("Erro ao salvar as informações no arquivo hosts!\n"
//                    + "Verifique se você tem permissão para gravar no diretório: \n"
//                    + "C:\\windows\\system32\\drivers\\etc\\");
//            
//            
//            }

    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonTestPingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTestPingActionPerformed
        jProgressBar.setValue(0);
        jProgressBar.setForeground(Color.decode("#008B8B"));//darkcyan
        jProgressBar.setForeground(Color.decode("#191970"));//midnightblue

        jTextPaneMensagens.setText("Consultando o endereço: " + jTextFieldAlias.getText()
                + ".iconeweb.com.br");
        new Thread() {
            @Override
            public void run() {
                boolean online = false;
                for (int i = 1; i < 6; i++) {
                    jTextFieldStatus.setText("Consultando o IP ....");
                    jProgressBar.setValue(i * 20);
                    if (new ConectaServidor().isReachableByPing(jTextFieldIP.getText())) {
                        online = true;

                    } else {
                        online = false;
                    }
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (online) {
                    jTextFieldStatus.setText("Servidor ativo");
                } else {
                    jTextFieldStatus.setText("Servidor não responde!");

                }

            }

        }.start();
    }//GEN-LAST:event_jButtonTestPingActionPerformed

    private void jTextFieldServerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldServerMouseClicked
        // TODO add your handling code here:
        jTextFieldServer.setText("");
    }//GEN-LAST:event_jTextFieldServerMouseClicked

    private void jTextFieldAliasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldAliasMouseClicked
        // TODO add your handling code here:
        jTextFieldAlias.setText("");
        
    }//GEN-LAST:event_jTextFieldAliasMouseClicked

    private void jTextFieldIPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldIPMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jTextFieldIPMouseClicked

    private void jTextFieldStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldStatusActionPerformed

    private void jTextFieldIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIPActionPerformed

    private void jTextFieldServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldServerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldServerActionPerformed

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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
         /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Window win = new Window();
                
                win.setIconImage(new ImageIcon(getClass().getResource("/img/icone.png"))
                        .getImage());
                win.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonTestPing;
    private javax.swing.JButton jButtonVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldAlias;
    private javax.swing.JTextField jTextFieldIP;
    public static javax.swing.JTextField jTextFieldServer;
    public static javax.swing.JTextField jTextFieldStatus;
    public static javax.swing.JTextPane jTextPaneMensagens;
    // End of variables declaration//GEN-END:variables
}
