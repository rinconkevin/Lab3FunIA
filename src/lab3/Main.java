/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    Grafica g = new Grafica();

    public Main() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Txt_Variables = new javax.swing.JTextField();
        Btn_Variables = new javax.swing.JButton();
        Lb_Variables = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Txt_Combinacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Txt_ResultadoI = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Btn_Regla = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Txt_ResultadosS = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Btn_atras = new javax.swing.JButton();
        Btn_adelante = new javax.swing.JButton();
        Txt_BH = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setText("Variables");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 61, 70, 20);
        jPanel1.add(Txt_Variables);
        Txt_Variables.setBounds(150, 110, 210, 30);

        Btn_Variables.setText("Ingresar");
        Btn_Variables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_VariablesActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Variables);
        Btn_Variables.setBounds(200, 173, 110, 30);

        Lb_Variables.setText("......");
        jPanel1.add(Lb_Variables);
        Lb_Variables.setBounds(148, 242, 210, 30);

        jLabel5.setText("Nota: Separar las Variables con un \"-\"");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(180, 300, 220, 30);

        jTabbedPane1.addTab("Varibles", jPanel1);

        jPanel2.setLayout(null);
        jPanel2.add(Txt_Combinacion);
        Txt_Combinacion.setBounds(31, 69, 215, 30);

        jLabel2.setText("Combinaci??n");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(99, 44, 80, 14);
        jPanel2.add(Txt_ResultadoI);
        Txt_ResultadoI.setBounds(310, 69, 136, 30);

        jLabel3.setText("Resultado");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(351, 44, 80, 14);

        Btn_Regla.setText("Agregar Regla");
        Btn_Regla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ReglaActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_Regla);
        Btn_Regla.setBounds(190, 140, 130, 40);

        jLabel4.setText("Nota: Separar las combinaciones con un \",\"");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(180, 300, 250, 30);

        jButton1.setText("Mostrar Reglas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(180, 210, 150, 40);

        jTabbedPane1.addTab("Reglas", jPanel2);

        jPanel3.setLayout(null);
        jPanel3.add(Txt_ResultadosS);
        Txt_ResultadosS.setBounds(140, 90, 199, 30);

        jLabel6.setText("Nota: separar las varibles con \"-\"");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(170, 300, 180, 20);

        jLabel7.setText("BH");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(230, 10, 94, 14);

        Btn_atras.setText("Enrutamiendo hacia atras");
        jPanel3.add(Btn_atras);
        Btn_atras.setBounds(140, 220, 200, 50);

        Btn_adelante.setText("Enrutamiendo hacia adelante");
        Btn_adelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_adelanteActionPerformed(evt);
            }
        });
        jPanel3.add(Btn_adelante);
        Btn_adelante.setBounds(140, 150, 200, 50);
        jPanel3.add(Txt_BH);
        Txt_BH.setBounds(140, 30, 199, 30);

        jLabel8.setText("Posibles Resultados");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(190, 70, 94, 14);

        jTabbedPane1.addTab("Procedimiento", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_VariablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_VariablesActionPerformed
        String[] lista = Txt_Variables.getText().split("-");
        for (String lista1 : lista) {
            Variable v = new Variable(lista1);
            g.agregarVariable(v);
        }
        Txt_Variables.setText("");

        Lb_Variables.setText(g.MostrarVariables());
    }//GEN-LAST:event_Btn_VariablesActionPerformed

    private void Btn_ReglaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ReglaActionPerformed
        g.agregarCombinacion(Txt_Combinacion.getText(), Txt_ResultadoI.getText());
        Txt_Combinacion.setText("");
        Txt_ResultadoI.setText("");

    }//GEN-LAST:event_Btn_ReglaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        g.MostrarCombinaciones();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Btn_adelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_adelanteActionPerformed
        String[] bhsplit = Txt_BH.getText().split("-");
        List<String> Hb = new ArrayList<>();
        for (int i = 0; i < bhsplit.length; i++) {
            Hb.add(bhsplit[i]);
        }
        String[] Resultados = Txt_ResultadosS.getText().split("-");
        
        for (int i = 0; i < 6; i++) {
            System.out.println("----------------BH--------------------");
            for (String m : Hb) {
                System.out.println(m);
            }
            for (Variable V : g.getLista()) {
                for (String C : V.getCombinacion()) {
                    String[] t = C.split(",");
                    int contador = 0;
                    for (String conp : t) {
                        if (Hb.contains(conp)) {
                            contador++;
                        }
                    }
                    if (contador == t.length) {
                        if (!Hb.contains(V.getNombre())) {
                            Hb.add(V.getNombre());
                        }
                    }
                }
            }
        }
        
        String h = "";
        for (String c1 : Resultados) {
            if(Hb.contains(c1)){
                h = h +"-" + c1;
            }
        }
        
        System.out.println("Posibles Enfermedades segun los sintomas");
        System.out.println(h);
        

    }//GEN-LAST:event_Btn_adelanteActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Regla;
    private javax.swing.JButton Btn_Variables;
    private javax.swing.JButton Btn_adelante;
    private javax.swing.JButton Btn_atras;
    private javax.swing.JLabel Lb_Variables;
    private javax.swing.JTextField Txt_BH;
    private javax.swing.JTextField Txt_Combinacion;
    private javax.swing.JTextField Txt_ResultadoI;
    private javax.swing.JTextField Txt_ResultadosS;
    private javax.swing.JTextField Txt_Variables;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
