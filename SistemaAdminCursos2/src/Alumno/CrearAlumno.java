package Alumno;

import Admin.Login;
import Admin.Menu;
import Alumno.ConsultaAlumno;
import Alumno.BuscarAlumno;
import Alumno.Alumno;
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import sistemaadmincursos2.Util;

public class CrearAlumno extends javax.swing.JFrame {

    ArrayList<Alumno> listaAlumno = Util.listaAlumno;

    public CrearAlumno() {
        initComponents();
        setLocationRelativeTo(null);
        txtCarneA.setFocusable(true);
        this.getContentPane().setBackground(Color.gray);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCarneA = new javax.swing.JTextField();
        txtNomA = new javax.swing.JTextField();
        txtApeA = new javax.swing.JTextField();
        txtPassA = new javax.swing.JTextField();
        btnBuscarA = new javax.swing.JButton();
        btnAgregarA = new javax.swing.JButton();
        btnDatosA = new javax.swing.JButton();
        bntSalirA = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_cargarAlumnos = new javax.swing.JButton();
        btn_guardarAlumnos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Carné:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Contraseña:");

        btnBuscarA.setText("Buscar");
        btnBuscarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAActionPerformed(evt);
            }
        });

        btnAgregarA.setText("Agregar");
        btnAgregarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAActionPerformed(evt);
            }
        });

        btnDatosA.setText("Ver datos");
        btnDatosA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatosAActionPerformed(evt);
            }
        });

        bntSalirA.setText("Salir");
        bntSalirA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bntSalirAMouseClicked(evt);
            }
        });
        bntSalirA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSalirAActionPerformed(evt);
            }
        });

        jLabel6.setText("ALUMNO");

        btn_cargarAlumnos.setText("Cargar alumnos");
        btn_cargarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargarAlumnosActionPerformed(evt);
            }
        });

        btn_guardarAlumnos.setText("Guardar alumnos");
        btn_guardarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarAlumnosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(116, 116, 116))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btn_cargarAlumnos)
                                .addGap(18, 18, 18)
                                .addComponent(btn_guardarAlumnos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)))
                        .addComponent(bntSalirA))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCarneA)
                            .addComponent(txtNomA)
                            .addComponent(txtApeA)
                            .addComponent(txtPassA, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregarA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDatosA)
                            .addComponent(btnBuscarA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(bntSalirA)
                        .addGap(43, 43, 43)
                        .addComponent(btnBuscarA)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarA)
                        .addGap(18, 18, 18)
                        .addComponent(btnDatosA))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btn_cargarAlumnos)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCarneA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNomA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtApeA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPassA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_guardarAlumnos)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAActionPerformed

        if (txtCarneA.getText().length() == 8) {

            listaAlumno.add(new Alumno(txtCarneA.getText(), txtNomA.getText(), txtApeA.getText(), txtPassA.getText()));

            txtCarneA.setText("");
            txtNomA.setText("");
            txtApeA.setText("");
            txtPassA.setText("");

            JOptionPane.showMessageDialog(this, "Alumno agregado exitosamente");
        } else {
            JOptionPane.showMessageDialog(this, "El carne debe ser de 8 caracteres alfanumericos");
        }

        //Mensaje de dialogo

    }//GEN-LAST:event_btnAgregarAActionPerformed

    private void btnDatosAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosAActionPerformed
        ConsultaAlumno ca = new ConsultaAlumno();
        ca.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDatosAActionPerformed

    private void btnBuscarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAActionPerformed
        BuscarAlumno ba = new BuscarAlumno();
        ba.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarAActionPerformed

    private void bntSalirAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalirAActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bntSalirAActionPerformed

    private void bntSalirAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntSalirAMouseClicked
        this.dispose();
    }//GEN-LAST:event_bntSalirAMouseClicked

    private void btn_cargarAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargarAlumnosActionPerformed
        cargarArchivoAlumnos();
    }//GEN-LAST:event_btn_cargarAlumnosActionPerformed

    private void btn_guardarAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarAlumnosActionPerformed
        guardarAlumno();

    }//GEN-LAST:event_btn_guardarAlumnosActionPerformed

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
            java.util.logging.Logger.getLogger(CrearAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntSalirA;
    private javax.swing.JButton btnAgregarA;
    private javax.swing.JButton btnBuscarA;
    private javax.swing.JButton btnDatosA;
    private javax.swing.JButton btn_cargarAlumnos;
    private javax.swing.JButton btn_guardarAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtApeA;
    private javax.swing.JTextField txtCarneA;
    private javax.swing.JTextField txtNomA;
    private javax.swing.JTextField txtPassA;
    // End of variables declaration//GEN-END:variables

    private void cargarArchivoAlumnos() {
        String aux = "";
        String texto = "";

        JFileChooser file = new JFileChooser();
        file.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        //Filtro
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.XML", "xml");

        file.setFileFilter(filtro);

        int seleccion = file.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = file.getSelectedFile();

            insertarAlumnos(fichero.getPath());

        }
    }

    private void insertarAlumnos(String path) {

        //Se cargará con la librería JDOM
        SAXBuilder builder = new SAXBuilder();
        File archivo = new File(path);

        try {
            Document document = (Document) builder.build(archivo);

            Element rootNode = document.getRootElement();

            //Lista de alumno que contiene todos los datos 
            List list = rootNode.getChildren("alumno");

            for (int i = 0; i < list.size(); i++) {

                //Variable campo que nos servirá para obtener los datos del xml 
                Element campo = (Element) list.get(i);

                String carne = campo.getChildTextTrim("carne");
                String nombre = campo.getChildTextTrim("nombre");
                String apellido = campo.getChildTextTrim("apellido");
                String password = campo.getChildTextTrim("password");

                listaAlumno.add(new Alumno(carne, nombre, apellido, password));
            }

            JOptionPane.showMessageDialog(null, "Arhivo leído correctamente");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No se pudo leer el archivo");
        } catch (JDOMException jdomex) {
            JOptionPane.showMessageDialog(null, "Hubo un problema con Jdomex");
        }
    }

    private void guardarAlumno() {
        try {
            String nombre = "";
            String contenido = "";
            JFileChooser file = new JFileChooser();
            file.showSaveDialog(this);

            File guardar = file.getSelectedFile();

            if (guardar != null) {
                FileWriter archivo = new FileWriter(guardar + ".xml");

                
                contenido += "<?xml version='1.0' encoding='UTF-8'?\n"
                        +"<alumnos>";
                
                for (int i = 0; i < listaAlumno.size(); i++) {
                    contenido
                            +="<alumno>"
                            + "<carne>"+listaAlumno.get(i).getCarne()+"</carne>"
                            + "<nombre>"+listaAlumno.get(i).getNom()+"</nombre>"
                            + "<apellido>"+listaAlumno.get(i).getApe()+"</apellido>"
                            + "<password>"+listaAlumno.get(i).getPass()+"</password>"                            
                            + "</alumno>"
                            +"\n";
                                                                                         
                }
                
                contenido += "</alumnos>";

                archivo.write(contenido);

                archivo.close();

                JOptionPane.showMessageDialog(null, "Archivo guardado correctamente");

            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar el archivo correctamente");
        }

    }
}
