/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.pi.syshotel;

import br.edu.utfpr.cm.pi.dao.DaoProduto;
import br.edu.utfpr.cm.pi.modal.Produto;
import br.edu.utfpr.cm.tsi.pi.sessao.Data;
import br.edu.utfpr.cm.tsi.pi.syshotel.Util.Util;
import javax.swing.JDialog;

/**
 *
 * @author JoaoPaulo
 */
public class JDialogCadastrarProduto extends javax.swing.JDialog {

    /**
     * Creates new form JDialogCadastrarProduto
     */
    public JDialogCadastrarProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCadProdImage = new javax.swing.JLabel();
        jSeparatorCadProdut = new javax.swing.JSeparator();
        jLabelCadProdCodigo = new javax.swing.JLabel();
        tfCod = new javax.swing.JTextField();
        tfProduto = new javax.swing.JTextField();
        jLabelCadProdProduto = new javax.swing.JLabel();
        lbMarca = new javax.swing.JLabel();
        tfMarca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonCadProdFechar = new javax.swing.JButton();
        jButtonCadProdExcluir = new javax.swing.JButton();
        jButtonCadProdLimpar = new javax.swing.JButton();
        jButtonCadProdSalvar = new javax.swing.JButton();
        jSeparatorCadProd = new javax.swing.JSeparator();
        btObter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(681, 333));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCadProdImage.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelCadProdImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadProdImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/CadProduto.png"))); // NOI18N
        jLabelCadProdImage.setMaximumSize(new java.awt.Dimension(740, 70));
        jLabelCadProdImage.setMinimumSize(new java.awt.Dimension(740, 70));
        jLabelCadProdImage.setPreferredSize(new java.awt.Dimension(740, 70));
        getContentPane().add(jLabelCadProdImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 350, 60));

        jSeparatorCadProdut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jSeparatorCadProdut.setMaximumSize(new java.awt.Dimension(740, 1));
        jSeparatorCadProdut.setMinimumSize(new java.awt.Dimension(740, 1));
        jSeparatorCadProdut.setPreferredSize(new java.awt.Dimension(740, 1));
        getContentPane().add(jSeparatorCadProdut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 740, 1));

        jLabelCadProdCodigo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelCadProdCodigo.setText("Código:");
        getContentPane().add(jLabelCadProdCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        tfCod.setEditable(false);
        tfCod.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tfCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodActionPerformed(evt);
            }
        });
        getContentPane().add(tfCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 80, 25));

        tfProduto.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tfProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(tfProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 319, 25));

        jLabelCadProdProduto.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelCadProdProduto.setText("Produto:");
        getContentPane().add(jLabelCadProdProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        lbMarca.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lbMarca.setText("Marca:");
        getContentPane().add(lbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        tfMarca.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        getContentPane().add(tfMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 260, 25));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/Product.png"))); // NOI18N
        jLabel2.setToolTipText("Cadastro de Produto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, 110));

        jButtonCadProdFechar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonCadProdFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/Close.png"))); // NOI18N
        jButtonCadProdFechar.setToolTipText("Fachar");
        jButtonCadProdFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadProdFecharActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadProdFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));

        jButtonCadProdExcluir.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonCadProdExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/trash.png"))); // NOI18N
        jButtonCadProdExcluir.setToolTipText("");
        jButtonCadProdExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadProdExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadProdExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        jButtonCadProdLimpar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonCadProdLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/clear02.png"))); // NOI18N
        jButtonCadProdLimpar.setToolTipText("Limpar");
        jButtonCadProdLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadProdLimparActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadProdLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        jButtonCadProdSalvar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonCadProdSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/save01.png"))); // NOI18N
        jButtonCadProdSalvar.setToolTipText("Salvar");
        jButtonCadProdSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadProdSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadProdSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        jSeparatorCadProd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jSeparatorCadProd.setMaximumSize(new java.awt.Dimension(740, 1));
        jSeparatorCadProd.setMinimumSize(new java.awt.Dimension(740, 1));
        jSeparatorCadProd.setPreferredSize(new java.awt.Dimension(740, 10));
        getContentPane().add(jSeparatorCadProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 216, 740, 20));

        btObter.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btObter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/Add.png"))); // NOI18N
        btObter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btObterActionPerformed(evt);
            }
        });
        getContentPane().add(btObter, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 30, 25));

        setBounds(0, 0, 681, 333);
    }// </editor-fold>//GEN-END:initComponents

    private void tfCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodActionPerformed

    private void tfProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfProdutoActionPerformed

    private void jButtonCadProdFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadProdFecharActionPerformed
        if (Util.imprimirConfirmacao("Deseja Sair?")) {
            dispose();
        }
    }//GEN-LAST:event_jButtonCadProdFecharActionPerformed

    private void btObterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btObterActionPerformed
        obter();
    }//GEN-LAST:event_btObterActionPerformed

    private void jButtonCadProdSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadProdSalvarActionPerformed
        if (Util.imprimirConfirmacao("Deseja Dalvar?")) {
            salvar();
        }
    }//GEN-LAST:event_jButtonCadProdSalvarActionPerformed

    private void jButtonCadProdLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadProdLimparActionPerformed
        if (Util.imprimirConfirmacao("Deseja Limpar Dados?")) {
            novo();
        }
    }//GEN-LAST:event_jButtonCadProdLimparActionPerformed

    private void jButtonCadProdExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadProdExcluirActionPerformed
        if (Util.imprimirConfirmacao("Deseja deletar?")) {
            remover();
        }
    }//GEN-LAST:event_jButtonCadProdExcluirActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btObter;
    private javax.swing.JButton jButtonCadProdExcluir;
    private javax.swing.JButton jButtonCadProdFechar;
    private javax.swing.JButton jButtonCadProdLimpar;
    private javax.swing.JButton jButtonCadProdSalvar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCadProdCodigo;
    private javax.swing.JLabel jLabelCadProdImage;
    private javax.swing.JLabel jLabelCadProdProduto;
    private javax.swing.JSeparator jSeparatorCadProd;
    private javax.swing.JSeparator jSeparatorCadProdut;
    private javax.swing.JLabel lbMarca;
    private javax.swing.JTextField tfCod;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfProduto;
    // End of variables declaration//GEN-END:variables

    private void novo() {
        tfCod.setText(null);
        tfProduto.setText(null);
        tfMarca.setText(null);
    }

    private void salvar() {
        if (validar()) {
            Produto produto = new Produto();
            if (!tfCod.getText().isEmpty()) {  //verifica se o campo Codigo esta vazio
                produto.setId(Integer.parseInt(tfCod.getText()));
            }
            produto.setNome(tfProduto.getText().trim());
            produto.setMarca(tfMarca.getText());

            try {
                new DaoProduto().persistir(produto);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            Util.dispayMsg("Salvo com Sucesso!");
            novo();
        } else {
            Util.dispayMsg("Contem campo vazio ou tipo incorreto de dado !");
        }
    }

    private void remover() {
        if (!tfCod.getText().isEmpty()) {
            int id = Integer.parseInt(tfCod.getText());

            try {
                DaoProduto dao = new DaoProduto();
                dao.remover(dao.obterPorId(id));

            } catch (RuntimeException e) {

                Util.dispayMsg("Falha inesperada ao executar");
            }
            novo();
        } else {
            Util.dispayMsg("Nenhum registro selecionando!");
        }

    }

    private boolean validar() {

        if (!tfMarca.getText().isEmpty() && !tfProduto.getText().isEmpty()) {
            return true;
        }
        return false;

    }

    private void obter() {
        JDialog dialog = new JDialogPesquisarProduto(null, true);
        Util.abrirJDialogCentralizado(dialog);
        if (Data.hash.get("prod") == null) {
            return;
        } else {
            if (Data.hash.get("prod") instanceof Produto) {
                Produto produto = (Produto) Data.hash.get("prod");
                Data.hash.remove("prod");
                if (produto == null) {
                    return;
                }
                tfCod.setText(String.valueOf(produto.getId()));
                tfProduto.setText(produto.getNome());
                tfMarca.setText(produto.getMarca());

            } else {
                Util.dispayMsg("Selecione um Produto.");
                Data.hash.remove("prod");//limpra o conteudo do map
            }
        }

    }
}
