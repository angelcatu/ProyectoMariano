package Curso;

import Profesor.Profesor;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import sistemaadmincursos2.Util;

public class BuscarCurso extends javax.swing.JFrame {

    ArrayList<Profesor> lista = Util.lista;
    ArrayList<Curso> listaCurso = Util.listaCurso;
    Curso curso = new Curso();

    public BuscarCurso() {
        initComponents();
        ingresoProfeso();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.gray);
    }

    public void ingresoProfeso() {
        selecProfe.setModel(new DefaultComboBoxModel(lista.toArray()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextFin = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        selecProfe = new javax.swing.JComboBox<String>();
        jLabel9 = new javax.swing.JLabel();
        TextHorarioInico = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TextHorarioFin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BtnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        TextId = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        TextNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextSeccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Btnsalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TextInicio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        jLabel8.setText("Hora fin:");
        jLabel8.setFocusCycleRoot(true);

        selecProfe.setEditable(true);
        selecProfe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Profesor:");
        jLabel9.setFocusCycleRoot(true);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID:");
        jLabel1.setFocusCycleRoot(true);

        jLabel2.setText("Nombre:");
        jLabel2.setFocusCycleRoot(true);

        BtnModificar.setText("Modifcar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnBuscar.setText("buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        TextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNombreActionPerformed(evt);
            }
        });

        jLabel3.setText("Sección:");
        jLabel3.setFocusCycleRoot(true);

        TextSeccion.setText(" ");

        jLabel4.setText("Fecha Inicio:");
        jLabel4.setFocusCycleRoot(true);

        Btnsalir.setText("salir");
        Btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsalirActionPerformed(evt);
            }
        });

        jLabel6.setText("Fecha fin: ");
        jLabel6.setFocusCycleRoot(true);

        jLabel7.setText("Hora inicio:");
        jLabel7.setFocusCycleRoot(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Btnsalir)
                    .addComponent(BtnBuscar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnEliminar)
                        .addGap(33, 33, 33)
                        .addComponent(BtnModificar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TextHorarioInico, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextId, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextSeccion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextInicio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selecProfe, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextHorarioFin, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btnsalir)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(BtnBuscar)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(TextSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(TextHorarioInico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TextHorarioFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(selecProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnModificar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        if (curso != null) {

            Profesor profe = buscarProfesor(selecProfe.getSelectedItem().toString());

            if (profe.getIteradorCurso() != 3) {
                curso.setNombre(TextNombre.getText());
                curso.setSeccion(TextSeccion.getText());
                curso.setInicio(TextInicio.getText());
                curso.setFin(TextFin.getText());
                curso.setHoraInicio(TextHorarioInico.getText());
                curso.setHoraFin(TextHorarioFin.getText());
                curso.setProfesor(profe);

                JOptionPane.showMessageDialog(this, "Curso modificado.");
            }else{
                JOptionPane.showMessageDialog(this, "No se puede modificar porque el profesor ya tiene asignado 3 cursos");
            }
        }
    }//GEN-LAST:event_BtnModificarActionPerformed

    private Profesor buscarProfesor(String profe) {
        Profesor profesor = null;

        for (int i = 0; i < lista.size(); i++) {
            if (profe.equals(lista.get(i).getUsuario())) {
                profesor = lista.get(i);
            }
        }

        return profesor;
    }


    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        int idBusqueda = Integer.parseInt(TextId.getText());

        curso = buscarCurso(idBusqueda);

        if (curso != null) {
            TextNombre.setText(curso.getNombre());
            TextSeccion.setText(curso.getSeccion());
            TextInicio.setText(curso.getInicio());
            TextFin.setText(curso.getFin());
            TextHorarioInico.setText(curso.getHoraInicio());
            TextHorarioFin.setText(curso.getHoraFin());
            selecProfe.setSelectedItem(curso.getProfesor().getUsuario());
        } else {
            JOptionPane.showMessageDialog(this, "Curso no existente.");
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void TextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNombreActionPerformed

    private void BtnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnsalirActionPerformed
        CrearCurso curso = new CrearCurso();
        curso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnsalirActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        if (curso != null) {
            int indice = listaCurso.indexOf(curso);
            listaCurso.remove(indice);
            JOptionPane.showMessageDialog(this, "Curso eliminado");
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private Curso buscarCurso(int id) {
        String di = null;
        for (int i = 0; i < listaCurso.size(); i++) {
            Curso c = listaCurso.get(i);

            if (c.getId() == id) {
                return c;
            }
        }

        return null;
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
            java.util.logging.Logger.getLogger(BuscarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton Btnsalir;
    private javax.swing.JTextField TextFin;
    private javax.swing.JTextField TextHorarioFin;
    private javax.swing.JTextField TextHorarioInico;
    private javax.swing.JTextField TextId;
    private javax.swing.JTextField TextInicio;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JTextField TextSeccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> selecProfe;
    // End of variables declaration//GEN-END:variables
}
