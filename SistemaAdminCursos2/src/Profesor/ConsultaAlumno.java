package Profesor;

import Alumno.Alumno;
import Curso.Curso;
import Notas.Nota;
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import sistemaadmincursos2.Util;

public class ConsultaAlumno extends javax.swing.JFrame {

    ArrayList<Alumno> listaAlumno = Util.listaAlumno;
    ArrayList<Curso> listaCurso = Util.listaCurso;
    ArrayList<Profesor> lista = Util.lista;
    ArrayList<Nota> listaNotas = Util.listaNotas;

    Profesor profesor = Util.profesor;

    public ConsultaAlumno() {
        initComponents();
        llenartabla();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.gray);

    }

    private void llenartabla() {

        try {

            TableModel modelo = jTable1.getModel();

            int ite = 0;

            //Buscamos los curso que el profesor imparte
            for (int i = 0; i < listaNotas.size(); i++) {

                //Buscamos que cursos tiene el profesor actual con la listaNotas
                if (profesor.getUsuario().equals(listaNotas.get(i).getCurso().getProfesor().getUsuario())) {

                    //Como encontramos al profesor solo llamamos toda la información de la lista de notas porque
                    //Curso, Alumno y nota están en la misma posición
                    modelo.setValueAt(listaNotas.get(i).getAlumno().getCarne(), ite, 0);
                    modelo.setValueAt(listaNotas.get(i).getAlumno().getNom(), ite, 1);
                    modelo.setValueAt(listaNotas.get(i).getAlumno().getApe(), ite, 2);
                    modelo.setValueAt(listaNotas.get(i).getCurso().getNombre(), ite, 3);
                    modelo.setValueAt(listaNotas.get(i).getNota(), ite, 4);
                    ite++;
                }
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
        btnNota = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Carné", "Nombre", "Apellido", "Curso", "Nota"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnNota.setText("Ingresar nota");
        btnNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotaActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Instrucciones: Seleccionar la fila y presione el botón Ingresar nota para actualizar");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnNota))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(129, 129, 129)
                        .addComponent(jButton2)
                        .addGap(56, 56, 56)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(179, 179, 179))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNota, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MenuProfesor mp = new MenuProfesor();
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotaActionPerformed

        try {
            int rowIndex = jTable1.getSelectedRow();

            String nombre = jTable1.getValueAt(rowIndex, 1).toString();
            String apellido = jTable1.getValueAt(rowIndex, 2).toString();
            String carne = jTable1.getValueAt(rowIndex, 0).toString();
            String curso = jTable1.getValueAt(rowIndex, 3).toString();

            String nota = JOptionPane.showInputDialog(null, "Inserte la nota para el estudiante " + nombre + " " + apellido);

            int numNota = Integer.valueOf(nota);

            if (numNota >= 0 && numNota <= 100) {
                for (int i = 0; i < listaNotas.size(); i++) {

                    if (carne.equals(listaNotas.get(i).getAlumno().getCarne())
                            && curso.equals(listaNotas.get(i).getCurso().getNombre())) {

                        listaNotas.get(i).setNota(nota);
                        jTable1.setValueAt(listaNotas.get(i).getNota(), rowIndex, 4);
                    }

                }
            }else{
                JOptionPane.showMessageDialog(null, "La nota debe ser un número entre 0 y 100");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccionar una fila para insertar nota");
        }
    }//GEN-LAST:event_btnNotaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        descargarArchivo();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaAlumno().setVisible(true);
            }
        });
    }

    private Alumno buscarAlumno(String clave) {

        for (int i = 0; i < listaAlumno.size(); i++) {
            Alumno a = listaAlumno.get(i);
            if (a.getCarne().equals(clave)) {
                return a;
            }
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNota;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void descargarArchivo() {
        try {
            String nombre = "";
            String contenido = "carne,nombre,apellido,curso, nota" + "\n";
            JFileChooser file = new JFileChooser();
            file.showSaveDialog(this);

            File guardar = file.getSelectedFile();

            if (guardar != null) {
                FileWriter archivo = new FileWriter(guardar + ".csv");

                             
                for (int i = 0; i < listaNotas.size(); i++) {
                    if(profesor.getUsuario().equals(listaNotas.get(i).getCurso().getProfesor().getUsuario())){
                        
                        Alumno alumno = listaNotas.get(i).getAlumno();
                        Curso curso = listaNotas.get(i).getCurso();
                        
                        contenido += alumno.getCarne() + ","
                                + alumno.getNom() + ","
                                + alumno.getApe()+ ","
                                + curso.getNombre() + ","
                                + listaNotas.get(i).getNota() + "\n";
                        
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
