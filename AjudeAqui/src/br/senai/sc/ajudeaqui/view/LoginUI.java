
package br.senai.sc.ajudeaqui.view;

/**
 *
 * @author Jaime Gomes
 */
public class LoginUI extends javax.swing.JFrame {

    /**
     * Creates new form LoginView
     */
    public LoginUI() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        pwdSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        lblBemVindo = new javax.swing.JLabel();
        lblErroLogin = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(":: Portal do Voluntário Ajude Aqui ::");
        setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        setForeground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("frame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        lblLogin.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblLogin.setText("Login:");
        getContentPane().add(lblLogin);
        lblLogin.setBounds(260, 430, 110, 29);

        txtLogin.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        txtLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(txtLogin);
        txtLogin.setBounds(360, 430, 150, 30);

        lblSenha.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblSenha.setText("Senha:");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(260, 480, 110, 29);

        pwdSenha.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        pwdSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(pwdSenha);
        pwdSenha.setBounds(360, 480, 150, 30);

        btnEntrar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ok_16x16.png"))); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.setBorder(new javax.swing.border.MatteBorder(null));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(520, 480, 120, 30);

        lblBemVindo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblBemVindo.setText("Seja Bem Vindo ao Portal do Voluntário :: Ajude Aqui :: ");
        getContentPane().add(lblBemVindo);
        lblBemVindo.setBounds(110, 360, 660, 50);

        lblErroLogin.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblErroLogin.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblErroLogin);
        lblErroLogin.setBounds(140, 558, 550, 0);

        btnRegistrarse.setText("Registrar-se");
        getContentPane().add(btnRegistrarse);
        btnRegistrarse.setBounds(360, 530, 150, 25);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.png"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 810, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrarActionPerformed

    
    public static void main(String args[]) {
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JLabel lblErroLogin;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JPasswordField pwdSenha;
    private javax.swing.JTextField txtLogin;
    // End of variables declaration//GEN-END:variables
}
