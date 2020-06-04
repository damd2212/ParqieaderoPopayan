/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.proyecto.parqueaderospop.vistas;

import co.unicauca.proyecto.parqueaderospop.controlador.CtrlRegVehiculo;
import co.unicauca.proyecto.parqueaderospop.modelo.ConsultasFicha;
import co.unicauca.proyecto.parqueaderospop.modelo.ConsultasRegVehiculo;
import co.unicauca.proyecto.parqueaderospop.modelo.ConsultasVehiculo;
import co.unicauca.proyecto.parqueaderospop.modelo.Ficha;
import co.unicauca.proyecto.parqueaderospop.modelo.RegistroVehiculo;
import co.unicauca.proyecto.parqueaderospop.modelo.Vehiculo;

/**
 *
 * @author danny
 */
public class GUIPaginaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form GUIPaginaPrincipal
     */
    public GUIPaginaPrincipal() {
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

        btnRegVehiParque = new javax.swing.JButton();
        btnRegParqueadero = new javax.swing.JButton();
        jDescMenuPrincipal = new javax.swing.JDesktopPane();
        btnCerrarSesion = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnRegVehiculo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        btnRegVehiParque.setText("Registrar Vehiculo en el parqueadero");

        btnRegParqueadero.setText("Registar Parqueadero");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Parqueaderos Popayán");
        setBackground(new java.awt.Color(255, 255, 255));

        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        jDescMenuPrincipal.setLayer(btnCerrarSesion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDescMenuPrincipalLayout = new javax.swing.GroupLayout(jDescMenuPrincipal);
        jDescMenuPrincipal.setLayout(jDescMenuPrincipalLayout);
        jDescMenuPrincipalLayout.setHorizontalGroup(
            jDescMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDescMenuPrincipalLayout.createSequentialGroup()
                .addGap(0, 636, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion))
        );
        jDescMenuPrincipalLayout.setVerticalGroup(
            jDescMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDescMenuPrincipalLayout.createSequentialGroup()
                .addGap(0, 425, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion))
        );

        jMenu1.setText("Opciones");

        btnRegVehiculo.setText("Registrar Vehiculo");
        btnRegVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegVehiculoActionPerformed(evt);
            }
        });
        jMenu1.add(btnRegVehiculo);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayudas");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDescMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDescMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegVehiculoActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                GUIRegistrarVehiculo reg = new GUIRegistrarVehiculo();

                //reg.setLocation(700,200);

                Vehiculo vehi = new Vehiculo();
                ConsultasVehiculo conVehi = new ConsultasVehiculo();
                RegistroVehiculo clsregVehiculo = new RegistroVehiculo();
                ConsultasRegVehiculo conRegVehi = new ConsultasRegVehiculo();
                Ficha fi = new Ficha();
                ConsultasFicha conFi = new ConsultasFicha();
                CtrlRegVehiculo ctrlRegVehiculo = new CtrlRegVehiculo(clsregVehiculo,conRegVehi,vehi,conVehi,fi,conFi,reg);
                ctrlRegVehiculo.iniciar();
                reg.setVisible(true);
                reg.setLocationRelativeTo(null);
                //new GUIPaginaPrincipal().setVisible(false);
            }
        });
    }//GEN-LAST:event_btnRegVehiculoActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                GUIIniciarSesion ini = new GUIIniciarSesion();
                ini.setVisible(true);
                ini.setLocationRelativeTo(null);
                dispose();
            }
        });
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(GUIPaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPaginaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    public javax.swing.JButton btnRegParqueadero;
    public javax.swing.JButton btnRegVehiParque;
    private javax.swing.JMenuItem btnRegVehiculo;
    private javax.swing.JDesktopPane jDescMenuPrincipal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
