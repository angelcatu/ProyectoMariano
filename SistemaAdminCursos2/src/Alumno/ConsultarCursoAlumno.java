/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumno;

import Curso.Curso;
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import sistemaadmincursos2.Util;

/**
 *
 * @author kevin
 */
public class ConsultarCursoAlumno extends javax.swing.JFrame {

    ArrayList<Curso> listaCurso = Util.listaCurso;
    ArrayList<Alumno> listaAlumno = Util.listaAlumno;
    Alumno alumno = Util.getAlumno();

    public ConsultarCursoAlumno() {
        initComponents();
        llenartabla();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.gray);

        labelUser.setText(Util.getAlumno().getCarne());
    }

    private void llenartabla() {
        try {
            TableModel modelo = jTable1.getModel();

            int fila = 0;
            int iteradorCursos = 0;

            for (int i = 0; i < listaAlumno.size(); i++) {

                if (alumno.getCarne().equals(listaAlumno.get(i).getCarne())) {
                    System.out.println("Logueado ---> " + alumno.getCarne());
                    System.out.println("La comparación ---> " + listaAlumno.get(i).getCarne());
                    do {

                        if (listaAlumno.get(i).getCurso()[iteradorCursos] != null) {
                            System.out.println("Arreglo: " + iteradorCursos + "-->" + listaAlumno.get(i).getCurso()[iteradorCursos].getNombre());
                            Curso curso = listaAlumno.get(i).getCurso()[iteradorCursos];

                            modelo.setValueAt(curso.getId(), fila, 0);
                            modelo.setValueAt(curso.getNombre(), fila, 1);
                            modelo.setValueAt(curso.getSeccion(), fila, 2);
                            modelo.setValueAt(curso.getInicio(), fila, 3);
                            modelo.setValueAt(curso.getFin(), fila, 4);
                            modelo.setValueAt(curso.getHoraInicio(), fila, 5);
                            modelo.setValueAt(curso.getHoraFin(), fila, 6);
                            modelo.setValueAt(curso.getProfesor(), fila, 7);
                            modelo.setValueAt(curso.getNota(), fila, 8);
                            fila++;
                            iteradorCursos++;
                        }

                    } while (iteradorCursos != listaAlumno.get(i).getTamañoCursos());

                }

            }
        } catch (Exception e) {

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Btnsalir = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        labelUser = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Seccion", "Fecha inicio", "Fecha fin", "Horario inicio", "Horario fin", "Profesor", "Nota"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Btnsalir.setText("salir");
        Btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsalirActionPerformed(evt);
            }
        });

        jLabel1.setText("Tabla de cursos:");

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        labelUser.setText("jLabel2");

        jButton2.setText("Descargar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(labelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(jButton1)
                        .addGap(35, 35, 35)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(labelUser))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Btnsalir)
                        .addComponent(jButton1)
                        .addComponent(jButton2)))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnsalirActionPerformed
        MenuAlumno ma = new MenuAlumno();
        ma.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnsalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String carne = labelUser.getText();
        int idAlumno = buscarAlumno(carne);

        if (idAlumno != -1) {

            int iteradorCursos = listaAlumno.get(idAlumno).getTamañoCursos();

            if (iteradorCursos != 5) {

                for (int i = 0; i < listaCurso.size(); i++) {

                    int fila = jTable1.getSelectedRow();
                    String idCurso = jTable1.getValueAt(fila, 0).toString();

                    if (idCurso.equals(String.valueOf(listaCurso.get(i).getId()))) {

                        if (listaCurso.get(i).getIteradorAlumno() != 0) {

                            Alumno alumnoActual[] = listaCurso.get(i).getAlumno();

                            //Desasignación del curso al alumno
                            int iterador = listaCurso.get(i).getIteradorAlumno();

                            listaAlumno.get(idAlumno).getCurso()[iteradorCursos] = null;

                            listaAlumno.get(idAlumno).setCurso(listaAlumno.get(idAlumno).getCurso());

                            int actualizacion = iteradorCursos - 1;

                            listaAlumno.get(idAlumno).setTamañoCursos(actualizacion);

                            JOptionPane.showMessageDialog(null, "Curso desasignado. Puedes asignarte " + (5 - actualizacion) + " cursos más");

                            //Comienzo de la deasignación del alumno al curso
                            alumnoActual[iterador] = null;
                            listaCurso.get(i).setAlumno(alumnoActual);

                            int updateItAlumno = iterador - 1;
                            listaCurso.get(i).setIteradorAlumno(updateItAlumno);

                            JOptionPane.showMessageDialog(null, "Alumno desasignado al curso.  Aún hay " + (10 - updateItAlumno) + " cupos");

                        } else {
                            JOptionPane.showMessageDialog(null, "No te puedes desasignar nada porque no tienes cursos");
                        }
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "No puedes asignarte más de 5 cursos");
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        descargarArchivoCSV();

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarCursoAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarCursoAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarCursoAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarCursoAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarCursoAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Btnsalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelUser;
    // End of variables declaration//GEN-END:variables

    private int buscarAlumno(String carne) {

        for (int i = 0; i < listaAlumno.size(); i++) {
            if (listaAlumno.get(i).getCarne().equals(carne)) {
                return i;
            }
        }

        return -1;
    }

    private void descargarArchivoCSV() {

        try {
            String nombre = "";
            String contenido = "id, nombre, seccion, fecha_inicio, fecha_fin, horario_inicio, horario_fin, profesor, nota";
            JFileChooser file = new JFileChooser();
            file.showSaveDialog(this);

            File guardar = file.getSelectedFile();

            if (guardar != null) {
                FileWriter archivo = new FileWriter(guardar + ".xml");

                int fila = 0;
                int iteradorCursos = 0;

                for (int i = 0; i < listaAlumno.size(); i++) {

                    if (alumno.getCarne().equals(listaAlumno.get(i).getCarne())) {
                        System.out.println("Logueado ---> " + alumno.getCarne());
                        System.out.println("La comparación ---> " + listaAlumno.get(i).getCarne());
                        do {

                            if (listaAlumno.get(i).getCurso()[iteradorCursos] != null) {

                                Curso curso = listaAlumno.get(i).getCurso()[iteradorCursos];

                                contenido += curso.getId() + ","
                                        + curso.getNombre() + ","
                                        + curso.getSeccion() + ","
                                        + curso.getInicio() + ","
                                        + curso.getFin() + ","
                                        + curso.getHoraFin() + ","
                                        + curso.getHoraFin() + ","
                                        + curso.getProfesor().getNombre() + ","
                                        + curso.getNota() + "\n";

                                fila++;
                                iteradorCursos++;
                            }

                        } while (iteradorCursos != listaAlumno.get(i).getTamañoCursos());

                    }
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
