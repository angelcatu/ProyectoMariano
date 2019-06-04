package Profesor;

import Curso.Curso;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.TableModel;
import sistemaadmincursos2.Util;

public class ConsultaCurso extends javax.swing.JFrame {

    ArrayList<Profesor> lista = Util.lista;
    ArrayList<Curso> listaCurso = Util.listaCurso;
    Curso curso = new Curso();
    Profesor profesor = Util.profesor;

    public ConsultaCurso() {
        initComponents();
        llenartabla();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.gray);
    }

    private void llenartabla() {
        TableModel modelo = jTable1.getModel();
        int d = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (profesor.getUsuario().equals(lista.get(i).getUsuario())) {

                Curso curso[] = lista.get(i).getCurso();
                int iterador = 0;

                do {

                    modelo.setValueAt(curso[iterador].getId(), d, 0);
                    modelo.setValueAt(curso[iterador].getNombre(), d, 1);
                    modelo.setValueAt(curso[iterador].getSeccion(), d, 2);
                    modelo.setValueAt(curso[iterador].getInicio(), d, 3);
                    modelo.setValueAt(curso[iterador].getFin(), d, 4);
                    modelo.setValueAt(curso[iterador].getHoraInicio(), d, 5);
                    modelo.setValueAt(curso[iterador].getHoraFin(), d, 6);
                    d++;

                    iterador++;
                } while (iterador != lista.get(i).getIteradorCurso());                                                      
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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Seccion", "Fecha inicio", "Fecha fin", "Horario inicio", "Horario fin"
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Btnsalir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnsalirActionPerformed
        MenuProfesor mp = new MenuProfesor();
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnsalirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaCurso().setVisible(true);
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
