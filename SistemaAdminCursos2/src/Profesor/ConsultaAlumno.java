package Profesor;

import Alumno.Alumno;
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

public class ConsultaAlumno extends javax.swing.JFrame {

    ArrayList<Alumno> listaAlumno = Util.listaAlumno;
    ArrayList<Curso> listaCurso = Util.listaCurso;
    ArrayList<Profesor> lista = Util.lista;
    Alumno alumno = new Alumno();
    Profesor profesor = Util.profesor;

    public ConsultaAlumno() {
        initComponents();
        llenartabla();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.gray);

        for (int i = 0; i < listaAlumno.size(); i++) {

        }

    }

    private void llenartabla() {

        try {

            TableModel modelo = jTable1.getModel();

            int d = 0;

            for (int j = 0; j < listaCurso.size(); j++) {

                if (profesor.getUsuario().equals(listaCurso.get(j).getProfesor().getUsuario())) {

                    Alumno alumno[] = listaCurso.get(j).getAlumno();
                    int iterador = 0;

                    if (alumno[iterador] != null) {
                        do {

                            modelo.setValueAt(alumno[iterador].getCarne(), d, 0);
                            modelo.setValueAt(alumno[iterador].getNom(), d, 1);
                            modelo.setValueAt(alumno[iterador].getApe(), d, 2);
                            modelo.setValueAt(listaCurso.get(j).getNombre(), d, 3);
                            modelo.setValueAt(alumno[iterador].getNota(), d, 4);
                            d++;
                            iterador++;

                        } while (iterador != listaCurso.get(j).getIteradorAlumno());
                    }
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
        btnbuscar = new javax.swing.JButton();
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

        btnbuscar.setText("buscar nota");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
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
                        .addGap(18, 18, 18)
                        .addComponent(btnbuscar)
                        .addGap(18, 18, 18)
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
                    .addComponent(btnbuscar)
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
        if (alumno != null) {
            //alumno.setNota(Integer.valueOf(txtNota.getText()));
            int rowIndex = jTable1.getSelectedRow();

            String nombre = jTable1.getValueAt(rowIndex, 1).toString();
            String apellido = jTable1.getValueAt(rowIndex, 2).toString();
            String carne = jTable1.getValueAt(rowIndex, 0).toString();
            String curso = jTable1.getValueAt(rowIndex, 3).toString();

            String nota = JOptionPane.showInputDialog(null, "Inserte la nota para el estudiante " + nombre + " " + apellido);

            for (int j = 0; j < listaCurso.size(); j++) {

                if (profesor.getUsuario().equals(listaCurso.get(j).getProfesor().getUsuario())) {

                    Alumno alumno[] = listaCurso.get(j).getAlumno();

                    int iterador = 0;

                    /*
                     do{
                     int iteradorAlumno = 0;
                     int iteradorCurso = 0;      
                        
                     do{
                            
                     JOptionPane.showMessageDialog(null, "El curso seleccionado es: " + curso);
                            
                     if(carne.equals(alumno[iteradorAlumno].getCarne())){
                     JOptionPane.showConfirmDialog(null, "Carne a cambiar " + alumno[iteradorAlumno].getCarne());
                     }
                            
                            
                     if(curso.equals(alumno[iteradorAlumno].getCurso()[iteradorCurso].getNombre())){
                     listaCurso.get(j).getAlumno()[iteradorAlumno].getCurso()[iteradorCurso].setNota(nota);
                     JOptionPane.showMessageDialog(null, "La nota "+nota+" para "+listaCurso.get(j).getAlumno()[iteradorAlumno].getCarne());
                     }
                            
                            
                     JOptionPane.showMessageDialog(null, "Tamaño de listado de cursos "+alumno[iteradorAlumno].getCurso()[iteradorCurso].getIteradorAlumno());
                            
                     iteradorCurso++;
                            
                     }while(iteradorCurso != alumno[iteradorAlumno].getCurso()[iteradorCurso].getIteradorAlumno());                                                                                                
                        
                     iteradorAlumno++;
                     iterador++;
                     }while(iterador != listaCurso.get(j).getIteradorAlumno());
                     */
                }

            }

        }

    }//GEN-LAST:event_btnNotaActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed

        alumno = buscarAlumno("");
        if (alumno != null) {
            //txtNota.setText(String.valueOf(alumno.getNota()));
        } else {
            JOptionPane.showMessageDialog(this, "Alumno no existente.");
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

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
    private javax.swing.JButton btnbuscar;
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

                int d = 0;

                for (int j = 0; j < listaCurso.size(); j++) {

                    if (profesor.getUsuario().equals(listaCurso.get(j).getProfesor().getUsuario())) {

                        Alumno alumno[] = listaCurso.get(j).getAlumno();
                        int iterador = 0;

                        if (alumno[iterador] != null) {
                            do {

                                contenido += alumno[iterador].getCarne() + ","
                                        + alumno[iterador].getNom()+ ","
                                        + alumno[iterador].getApe()+ ","
                                        + listaCurso.get(j).getNombre()+","
                                        +alumno[iterador].getNota()+"\n";
                                
                                d++;
                                iterador++;

                            } while (iterador != listaCurso.get(j).getIteradorAlumno());
                        }
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
