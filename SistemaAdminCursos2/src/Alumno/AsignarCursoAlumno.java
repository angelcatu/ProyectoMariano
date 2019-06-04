package Alumno;

import Curso.Curso;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import sistemaadmincursos2.Util;

/**
 *
 * @author ANDROID
 */
public class AsignarCursoAlumno extends javax.swing.JFrame {

    ArrayList<Alumno> listaAlumno = Util.listaAlumno;
    ArrayList<Curso> listaCurso = Util.listaCurso;
    Alumno alumno;
    Curso curso = new Curso();

    public AsignarCursoAlumno() {
        initComponents();
        ingresoAlumno();
        llenartabla();
        alumno = Util.getAlumno();
        TextId.setText(Util.getAlumno().getCarne());
    }

    private void llenartabla() {
        try {
            TableModel modelo = jTable1.getModel();
            for (int i = 0; i < listaCurso.size(); i++) {
                curso = listaCurso.get(i);
                modelo.setValueAt(curso.getId(), i, 0);
                modelo.setValueAt(curso.getNombre(), i, 1);
                modelo.setValueAt(curso.getSeccion(), i, 2);
                modelo.setValueAt(curso.getInicio(), i, 3);
                modelo.setValueAt(curso.getFin(), i, 4);
                modelo.setValueAt(curso.getHoraInicio(), i, 5);
                modelo.setValueAt(curso.getHoraFin(), i, 6);
                modelo.setValueAt(curso.getProfesor(), i, 7);
            }
        } catch (Exception e) {
            System.out.println("erro de asignacion de curso alumno en alumno:" + e.getMessage());
        }

    }

    public void ingresoAlumno() {
        selecCurso.setModel(new DefaultComboBoxModel(listaCurso.toArray()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnCurso = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        selecCurso = new javax.swing.JComboBox<String>();
        TextId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Carne");

        jLabel3.setText("Curso");

        BtnCurso.setText("Asignar");
        BtnCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCursoActionPerformed(evt);
            }
        });

        jLabel1.setText("Tabla de alumnos:");

        jButton1.setText("Salir");
        jButton1.setName("btnSalirA"); // NOI18N
        jButton1.setSelected(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        selecCurso.setEditable(true);
        selecCurso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        TextId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIdActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Seccion", "Fecha inicio", "Fecha fin", "Horario inicio", "Horario fin", "Profesor"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(TextId, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(selecCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCurso)
                        .addGap(0, 195, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(BtnCurso))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selecCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCursoActionPerformed
        String carne = TextId.getText();

        int idAlumno = buscarAlumno(carne);
        if (idAlumno != -1) {

            int iteradorCursos = listaAlumno.get(idAlumno).getTamañoCursos();

            if (iteradorCursos != 5) {

                int fila = jTable1.getSelectedRow();
                String idCurso = jTable1.getValueAt(fila, 0).toString();

                for (int i = 0; i < listaCurso.size(); i++) {

                    if (idCurso.equals(String.valueOf(listaCurso.get(i).getId()))) {

                        if (listaCurso.get(i).getIteradorAlumno() != 10) {
                            Curso cursoActual = listaCurso.get(i);
                            Alumno alumnoActual[] = listaCurso.get(i).getAlumno();

                            int iterador = listaCurso.get(i).getIteradorAlumno();

                            listaAlumno.get(idAlumno).getCurso()[iteradorCursos] = cursoActual;

                            listaAlumno.get(idAlumno).setCurso(listaAlumno.get(idAlumno).getCurso());

                            int actualizacion = iteradorCursos + 1;

                            listaAlumno.get(idAlumno).setTamañoCursos(actualizacion);

                            JOptionPane.showMessageDialog(null, "Curso asignado. Aún puedes asignarte " + (5 - actualizacion) + " cursos más");

                            //Comienzo de asignación de 10 alumnos al curso
                            alumnoActual[iterador] = listaAlumno.get(idAlumno);
                            listaCurso.get(i).setAlumno(alumnoActual);

                            int updateItAlumno = iterador + 1;
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MenuAlumno cc = new MenuAlumno();
        cc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TextIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIdActionPerformed

    }//GEN-LAST:event_TextIdActionPerformed

    private int buscarAlumno(String carne) {

        int retorno = -1;
        for (int i = 0; i < listaAlumno.size(); i++) {

            if (listaAlumno.get(i).getCarne().equals(carne)) {
                retorno = i;
                i = listaAlumno.size();
            }
        }
        return retorno;
    }

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
            java.util.logging.Logger.getLogger(AsignarCursoAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsignarCursoAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsignarCursoAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsignarCursoAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsignarCursoAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCurso;
    private javax.swing.JTextField TextId;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> selecCurso;
    // End of variables declaration//GEN-END:variables
}
