package Profesor;

import Admin.Login;
import Admin.Menu;
import Profesor.BuscarProfe;
import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import sistemaadmincursos2.Util;

public class CrearProfesor extends javax.swing.JFrame {

    ArrayList<Profesor> lista = Util.lista;

    private File fileProfesor;
    private Scanner entradaProfesor;
    private String datosProfesores;
    private String[] valoresProfesores;

    public CrearProfesor() {
        initComponents();
        setLocationRelativeTo(null);
        txtUsuario.setFocusable(true);
        this.getContentPane().setBackground(Color.gray);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnConsultaProf = new javax.swing.JButton();
        btnMP = new javax.swing.JButton();
        btn_CargarCSV = new javax.swing.JButton();
        btn_GuardarProfesores = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario:");

        jLabel2.setText("PROFESOR");

        jLabel3.setText("Nombre:");

        jLabel5.setText("Apellido:");

        jLabel6.setText("Contraseña:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnConsultaProf.setText("Ver datos");
        btnConsultaProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaProfActionPerformed(evt);
            }
        });

        btnMP.setText("Salir");
        btnMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMPActionPerformed(evt);
            }
        });

        btn_CargarCSV.setText("Cargar profesores");
        btn_CargarCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CargarCSVActionPerformed(evt);
            }
        });

        btn_GuardarProfesores.setText("Guardar profesores");
        btn_GuardarProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarProfesoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(44, 44, 44)
                                .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUsuario)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_CargarCSV)
                                .addGap(9, 9, 9)
                                .addComponent(btn_GuardarProfesores)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnConsultaProf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(134, 134, 134)
                        .addComponent(btnMP)
                        .addGap(20, 20, 20)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMP)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_CargarCSV)
                    .addComponent(btn_GuardarProfesores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnBuscar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnAgregar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultaProf)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        if (txtUsuario.getText().length() > 0 && txtNombre.getText().length() > 0
                && txtApellido.getText().length() > 0 && txtPassword.getText().length() > 0) {

            lista.add(new Profesor(txtUsuario.getText(), txtNombre.getText(), txtApellido.getText(), txtPassword.getText()));

            txtUsuario.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            txtPassword.setText("");

            //Mensaje de dialogo
            JOptionPane.showMessageDialog(this, "Profesor agregado exitosamente");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed


    private void btnConsultaProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaProfActionPerformed
        ConsultaProf cp = new ConsultaProf(lista);
        cp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConsultaProfActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        BuscarProfe bp = new BuscarProfe(lista);
        bp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMPActionPerformed
        //this.dispose();
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMPActionPerformed

    private void btn_CargarCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CargarCSVActionPerformed
        abrirChooser();
    }//GEN-LAST:event_btn_CargarCSVActionPerformed

    private void btn_GuardarProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarProfesoresActionPerformed
        guardarCSVProfesores();
    }//GEN-LAST:event_btn_GuardarProfesoresActionPerformed

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
            java.util.logging.Logger.getLogger(CrearProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnConsultaProf;
    private javax.swing.JButton btnMP;
    private javax.swing.JButton btn_CargarCSV;
    private javax.swing.JButton btn_GuardarProfesores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void abrirChooser() {

        String aux = "";
        String texto = "";

        JFileChooser file = new JFileChooser();
        file.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        //Filtro
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.CSV", "csv");

        file.setFileFilter(filtro);

        int seleccion = file.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = file.getSelectedFile();

            insertarProfesores(fichero.getPath());

        }

    }

    private void insertarProfesores(String cadena) {
        fileProfesor = new File(cadena);

        try {
            entradaProfesor = new Scanner(fileProfesor);

            entradaProfesor.next();

            while (entradaProfesor.hasNext()) {

                datosProfesores = entradaProfesor.next();
                valoresProfesores = datosProfesores.split(",");

                //Se agrega a la lista de profesores los valores obtenidos del archivo separado por comas
                lista.add(new Profesor(valoresProfesores[0], valoresProfesores[1], valoresProfesores[2], valoresProfesores[3]));
            }

            entradaProfesor.close();

            JOptionPane.showMessageDialog(null, "Archivo cargado existosamente");

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado");
        }
    }

    private void guardarCSVProfesores() {
        try {
            String nombre = "";
            String contenido = "usuario,nombre,apellido,contraseña" + "\n";
            JFileChooser file = new JFileChooser();
            file.showSaveDialog(this);

            File guardar = file.getSelectedFile();

            if (guardar != null) {
                FileWriter archivo = new FileWriter(guardar + ".csv");

                for (int i = 0; i < lista.size(); i++) {
                    contenido
                            += lista.get(i).getUsuario() + ","
                            + lista.get(i).getNombre() + ","
                            + lista.get(i).getApellido() + ","
                            + lista.get(i).getPassword() + "\n";

                }

                archivo.write(contenido);

                archivo.close();

                JOptionPane.showMessageDialog(null, "Archivo guardado correctamente");

            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar el archivo correctamente");
        }
    }
}
