package Curso;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import sistemaadmincursos2.Util;
import Alumno.Alumno;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

public class AsignarCurso extends javax.swing.JFrame {

    ArrayList<Alumno> listaAlumno = Util.listaAlumno;
    ArrayList<Curso> listaCurso = Util.listaCurso;

    public AsignarCurso() {
        initComponents();
        ingresoAlumno();

        llenartabla();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.gray);
    }

    public void ingresoAlumno() {
        selecCurso.setModel(new DefaultComboBoxModel(listaCurso.toArray()));
    }

    private void llenartabla() {

        try {
            TableModel modelo = jTable1.getModel();
            for (int i = 0; i < listaAlumno.size(); i++) {
                Alumno a = listaAlumno.get(i);
                modelo.setValueAt(a.getCarne(), i, 0);
                modelo.setValueAt(a.getNom(), i, 1);
                modelo.setValueAt(a.getApe(), i, 2);
                modelo.setValueAt("", i, 3);
            }
        } catch (Exception e) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        selecCurso = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnCurso = new javax.swing.JButton();
        textCarne = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tabla de alumnos:");

        jButton1.setText("Salir");
        jButton1.setName("btnSalirA"); // NOI18N
        jButton1.setSelected(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Carné", "Nombre", "Apellido", "Curso"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        selecCurso.setEditable(true);
        selecCurso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selecCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecCursoActionPerformed(evt);
            }
        });

        jLabel2.setText("Carne");

        jLabel3.setText("Curso");

        BtnCurso.setText("Asignar");
        BtnCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCarne, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(selecCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnCurso)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(selecCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(BtnCurso)
                        .addComponent(textCarne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CrearCurso cc = new CrearCurso();
        cc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    String curso[];

    private void BtnCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCursoActionPerformed
        String carne = textCarne.getText().toString();

        int idAlumno = buscarAlumno(carne);

        if (idAlumno != -1) {

            //Obtenemos la posición del arreglo de cursos
            int numCursos = listaAlumno.get(idAlumno).getTamañoCursos();

            //Se verifica si ya tiene asignado 5 cursos el estudiante
            if (numCursos != 5) {

                for (int i = 0; i < listaCurso.size(); i++) {

                    if (selecCurso.getSelectedItem().toString().equals(listaCurso.get(i).getNombre())) {

                        if (listaCurso.get(i).getIteradorAlumno() != 10) {
                            Curso cursoActual = listaCurso.get(i);
                            Alumno alumnoActual[] = listaCurso.get(i).getAlumno();

                            int iteradorAlumno = listaCurso.get(i).getIteradorAlumno();

                            listaAlumno.get(idAlumno).getCurso()[numCursos] = new Curso(cursoActual.getId(),
                                    cursoActual.getNombre(), cursoActual.getSeccion(), cursoActual.getInicio(),
                                    cursoActual.getFin(), cursoActual.getHoraInicio(),
                                    cursoActual.getHoraFin(), cursoActual.getProfesor());

                            listaAlumno.get(idAlumno).setCurso(listaAlumno.get(idAlumno).getCurso());

                            int actualizacion = numCursos + 1;

                            listaAlumno.get(idAlumno).setTamañoCursos(actualizacion);

                            JOptionPane.showMessageDialog(null, "Curso asignado. Aún puedes asignarte " + (5 - actualizacion) + " cursos más");

                            //Comienzo de asignación de 10 alumnos al curso
                            alumnoActual[iteradorAlumno] = listaAlumno.get(idAlumno);
                            listaCurso.get(i).setAlumno(alumnoActual);

                            int updateItAlumno = iteradorAlumno + 1;
                            listaCurso.get(i).setIteradorAlumno(updateItAlumno);

                            JOptionPane.showMessageDialog(null, "Alumno asignado al curso.  Aún hay " + (10 - updateItAlumno) + " cupos");

                        } else {
                            JOptionPane.showMessageDialog(null, "El curso está lleno, no se puede asignar más");
                        }
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "No puedes asignarte más de 5 cursos");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Alumno no existente.");
        }

    }//GEN-LAST:event_BtnCursoActionPerformed

    private void selecCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selecCursoActionPerformed

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
            java.util.logging.Logger.getLogger(AsignarCurso.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsignarCurso.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsignarCurso.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsignarCurso.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsignarCurso().setVisible(true);
            }
        });
    }

    private int buscarAlumno(String carne) {
        for (int i = 0; i < listaAlumno.size(); i++) {

            if (listaAlumno.get(i).getCarne().equals(carne)) {

                return i;
            }
        }
        return -1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCurso;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> selecCurso;
    private javax.swing.JTextField textCarne;
    // End of variables declaration//GEN-END:variables
}
