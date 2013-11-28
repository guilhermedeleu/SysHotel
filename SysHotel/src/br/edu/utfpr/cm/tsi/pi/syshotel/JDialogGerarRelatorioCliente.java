/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.pi.syshotel;

import br.edu.utfpr.cm.tsi.pi.syshotel.Util.Util;

/**
 *
 * @author JoaoPaulo
 */
public class JDialogGerarRelatorioCliente extends javax.swing.JDialog {

    /**
     * Creates new form JDialogGerarRelatorioCliente
     */
    public JDialogGerarRelatorioCliente(java.awt.Frame parent, boolean modal) {
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

        jLabelRelHosp = new javax.swing.JLabel();
        jLabelRelClienteImage = new javax.swing.JLabel();
        jFormattedTextFieldRelClienteData = new javax.swing.JFormattedTextField();
        jLabelrelClienteInicio = new javax.swing.JLabel();
        jLabelRelClienteNome = new javax.swing.JLabel();
        jTextFieldRelClienteCliente = new javax.swing.JTextField();
        jFormattedTextFieldRelClienteDataFim = new javax.swing.JFormattedTextField();
        jLabelRelClienteFim = new javax.swing.JLabel();
        jButtonCancelarRelatorioCliente = new javax.swing.JButton();
        jButtonGerarRelatorioCliente = new javax.swing.JButton();
        jButtonRelClientePesquisar = new javax.swing.JButton();
        jSeparator1RelHosp = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(420, 220));
        setMinimumSize(new java.awt.Dimension(420, 220));
        setPreferredSize(new java.awt.Dimension(420, 220));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelRelHosp.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelRelHosp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRelHosp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/RelCliente_1.png"))); // NOI18N
        getContentPane().add(jLabelRelHosp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 320, 40));

        jLabelRelClienteImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRelClienteImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/Cliente_32.png"))); // NOI18N
        getContentPane().add(jLabelRelClienteImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 40));

        try {
            jFormattedTextFieldRelClienteData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldRelClienteData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldRelClienteData.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        getContentPane().add(jFormattedTextFieldRelClienteData, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 80, -1));

        jLabelrelClienteInicio.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabelrelClienteInicio.setText("Início:");
        getContentPane().add(jLabelrelClienteInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabelRelClienteNome.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabelRelClienteNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRelClienteNome.setText("Cliente:");
        getContentPane().add(jLabelRelClienteNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jTextFieldRelClienteCliente.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTextFieldRelClienteCliente.setMaximumSize(new java.awt.Dimension(250, 20));
        jTextFieldRelClienteCliente.setMinimumSize(new java.awt.Dimension(250, 20));
        jTextFieldRelClienteCliente.setPreferredSize(new java.awt.Dimension(250, 20));
        getContentPane().add(jTextFieldRelClienteCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 240, -1));

        try {
            jFormattedTextFieldRelClienteDataFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldRelClienteDataFim.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldRelClienteDataFim.setPreferredSize(new java.awt.Dimension(48, 20));
        getContentPane().add(jFormattedTextFieldRelClienteDataFim, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 80, -1));

        jLabelRelClienteFim.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabelRelClienteFim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRelClienteFim.setText("Fim:");
        getContentPane().add(jLabelRelClienteFim, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        jButtonCancelarRelatorioCliente.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jButtonCancelarRelatorioCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/Close_.png"))); // NOI18N
        jButtonCancelarRelatorioCliente.setToolTipText("Cancelar");
        jButtonCancelarRelatorioCliente.setMaximumSize(new java.awt.Dimension(24, 24));
        jButtonCancelarRelatorioCliente.setMinimumSize(new java.awt.Dimension(24, 24));
        jButtonCancelarRelatorioCliente.setPreferredSize(new java.awt.Dimension(24, 24));
        jButtonCancelarRelatorioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarRelatorioClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarRelatorioCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 24, 24));

        jButtonGerarRelatorioCliente.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jButtonGerarRelatorioCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/Ok_.png"))); // NOI18N
        jButtonGerarRelatorioCliente.setToolTipText("Gerar Relatório");
        jButtonGerarRelatorioCliente.setMaximumSize(new java.awt.Dimension(24, 24));
        jButtonGerarRelatorioCliente.setMinimumSize(new java.awt.Dimension(24, 24));
        jButtonGerarRelatorioCliente.setPreferredSize(new java.awt.Dimension(24, 24));
        getContentPane().add(jButtonGerarRelatorioCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 24, 24));

        jButtonRelClientePesquisar.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jButtonRelClientePesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/DocumentIconAd.png"))); // NOI18N
        jButtonRelClientePesquisar.setToolTipText("Pesquisar Cliente");
        jButtonRelClientePesquisar.setPreferredSize(new java.awt.Dimension(24, 24));
        getContentPane().add(jButtonRelClientePesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 24, 24));

        jSeparator1RelHosp.setMaximumSize(new java.awt.Dimension(440, 1));
        jSeparator1RelHosp.setMinimumSize(new java.awt.Dimension(440, 1));
        jSeparator1RelHosp.setPreferredSize(new java.awt.Dimension(494, 1));
        getContentPane().add(jSeparator1RelHosp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 440, 1));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-436)/2, (screenSize.height-259)/2, 436, 259);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarRelatorioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarRelatorioClienteActionPerformed
        if (Util.imprimirConfirmacao("Deseja Sair?")) {
            dispose();
        }
    }//GEN-LAST:event_jButtonCancelarRelatorioClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarRelatorioCliente;
    private javax.swing.JButton jButtonGerarRelatorioCliente;
    private javax.swing.JButton jButtonRelClientePesquisar;
    private javax.swing.JFormattedTextField jFormattedTextFieldRelClienteData;
    private javax.swing.JFormattedTextField jFormattedTextFieldRelClienteDataFim;
    private javax.swing.JLabel jLabelRelClienteFim;
    private javax.swing.JLabel jLabelRelClienteImage;
    private javax.swing.JLabel jLabelRelClienteNome;
    private javax.swing.JLabel jLabelRelHosp;
    private javax.swing.JLabel jLabelrelClienteInicio;
    private javax.swing.JSeparator jSeparator1RelHosp;
    private javax.swing.JTextField jTextFieldRelClienteCliente;
    // End of variables declaration//GEN-END:variables
}
