/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumno;

import Curso.Curso;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.TableModel;
import sistemaadmincursos2.Util;

/**
 *
 * @author kevin
 */
public class ConsultarCursoAlumno extends javax.swing.JFrame {

    ArrayList<Curso> listaCurso = Util.listaCurso;
    ArrayList<Alumno> listaAlumno = Util.listaAlumno;
    Curso curso = new Curso();
    Alumno alumno = Util.alumno;

    public ConsultarCursoAlumno() {
        initComponents();
        llenartabla();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.gray);
    }

    private void llenartabla() {
        TableModel modelo = jTable1.getModel();

        int fila = 0;
        int iteradorCursos = 0;

        for (int i = 0; i < listaAlumno.size(); i++) {

            if (alumno.getCarne().equals(listaAlumno.get(i).getCarne())) {
                System.out.println("Logueado ---> " + alumno.getCarne());
                System.out.println("La comparación ---> " + listaAlumno.get(i).getCarne());
                do {
                    System.out.println("Arreglo: " + listaAlumno.get(i).getCurso()[0]);
                    System.out.println("Arreglo: " + listaAlumno.get(i).getCurso()[1]);

                    iteradorCursos++;
                } while (iteradorCursos != listaAlumno.get(i).getTamañoCursos());

                for (int k = 0; k < listaCurso.size(); k++) {

                    /*
                    
                     if (listaAlumno.get(i).getCurso()[iteradorCursos].equals(listaCurso.get(k).getNombre())) {

                     curso = listaCurso.get(k);
                     modelo.setValueAt(curso.getId(), fila, 0);
                     modelo.setValueAt(curso.getNombre(), fila, 1);
                     modelo.setValueAt(curso.getSeccion(), fila, 2);
                     modelo.setValueAt(curso.getInicio(), fila, 3);
                     modelo.setValueAt(curso.getFin(), fila, 4);
                     modelo.setValueAt(curso.getHoraInicio(), fila, 5);
                     modelo.setValueAt(curso.getHoraFin(), fila, 6);
                     modelo.setValueAt(curso.getProfesor(), fila, 7);
                     modelo.setValueAt(listaAlumno.get(i).getNota(), fila, 8);

                     fila++;

                     iteradorCursos++;
                     if (iteradorCursos == listaAlumno.get(i).getCurso().length) {
                     break;
                     }
                     }
                    
                     */
                }

            }

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Btnsalir = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 483, Short.MAX_VALUE)
                        .addComponent(Btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Btnsalir))
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
