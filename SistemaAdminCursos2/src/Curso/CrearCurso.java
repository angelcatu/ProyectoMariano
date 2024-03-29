package Curso;

import Admin.Menu;
import Alumno.Alumno;
import Notas.Nota;
import Profesor.Profesor;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import sistemaadmincursos2.Util;

public class CrearCurso extends javax.swing.JFrame {

    ArrayList<Profesor> lista = Util.lista;
    ArrayList<Curso> listaCurso = Util.listaCurso;
    ArrayList<Alumno> listaAlumno = Util.listaAlumno;        
    ArrayList<AsignacionMasiva> asignacionMasiva = Util.asignacionMasiva;
    
    ArrayList<Nota> listaNotas = Util.listaNotas;

    File fileAlumno;
    private Scanner entradaAlumno;
    private String datosAlumnos;
    private String[] valoresAlumnos;

    public CrearCurso() {
        initComponents();
        ingresoProfeso();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.gray);
        TextId.setEditable(false);
        TextId.setEnabled(false);
    }

    public void ingresoProfeso() {
        selecProfe.setModel(new DefaultComboBoxModel(lista.toArray()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnAgregar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TextHorarioInico = new javax.swing.JTextField();
        TextSeccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextHorarioFin = new javax.swing.JTextField();
        Btnsalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtnVer = new javax.swing.JButton();
        TextInicio = new javax.swing.JTextField();
        BtnAsignar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TextId = new javax.swing.JTextField();
        TextFin = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        TextNombre = new javax.swing.JTextField();
        selecProfe = new javax.swing.JComboBox<String>();
        btnCargaCursos = new javax.swing.JButton();
        btnAsignacionMasiva = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnAgregar.setText("agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Profesor:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sección:");

        TextSeccion.setText(" ");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Inicio:");

        Btnsalir.setText("salir");
        Btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsalirActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha fin: ");

        BtnVer.setText("ver datos");
        BtnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerActionPerformed(evt);
            }
        });

        BtnAsignar.setText("asignar alumno");
        BtnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAsignarActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Hora inicio:");

        BtnBuscar.setText("buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Hora fin:");

        TextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNombreActionPerformed(evt);
            }
        });

        selecProfe.setEditable(true);
        selecProfe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selecProfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecProfeActionPerformed(evt);
            }
        });

        btnCargaCursos.setText("Cargar cursos");
        btnCargaCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaCursosActionPerformed(evt);
            }
        });

        btnAsignacionMasiva.setText("Asignación masiva");
        btnAsignacionMasiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignacionMasivaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
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
                            .addComponent(TextHorarioFin, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnCargaCursos)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnAgregar)
                    .addComponent(BtnBuscar)
                    .addComponent(BtnVer)
                    .addComponent(BtnAsignar)
                    .addComponent(Btnsalir)
                    .addComponent(btnAsignacionMasiva))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btnsalir)
                    .addComponent(btnCargaCursos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnBuscar)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(TextSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(BtnAgregar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(TextHorarioInico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnVer)
                        .addGap(15, 15, 15)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TextHorarioFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAsignar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(selecProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAsignacionMasiva)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed

        if (TextNombre.getText().length() > 0 && TextHorarioFin.getText().length() > 0
                && TextFin.getText().length() > 0 && TextHorarioInico.getText().length() > 0
                && TextInicio.getText().length() > 0 && TextSeccion.getText().length() > 0) {

            Profesor profesor = buscarProfesor(selecProfe.getSelectedItem().toString());

            if (profesor != null) {

                if (profesor.getIteradorCurso() != 3) {

                    Curso curso = new Curso(Util.getIdCurso(), TextNombre.getText(), TextSeccion.getText(), TextInicio.getText(),
                            TextFin.getText(), TextHorarioInico.getText(), TextHorarioFin.getText(), profesor);
                    listaCurso.add(curso);

                    Util.setIdCurso(Util.getIdCurso() + 1);

                    TextId.setText("");
                    TextNombre.setText("");
                    TextSeccion.setText("");
                    TextInicio.setText("");
                    TextFin.setText("");
                    TextHorarioInico.setText("");
                    TextHorarioFin.setText("");

                    asignarCursoAProfesorEncontrado(profesor, curso, false);

                } else {
                    JOptionPane.showMessageDialog(null, "El profesor ya tiene cargados 3 cursos en su horario");
                }

            } else {
                JOptionPane.showMessageDialog(null, "El profesor no existe");
            }
            //selecProfe.addActionListener((ActionListener) lista);

        }
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnsalirActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnsalirActionPerformed

    private void BtnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerActionPerformed
        ConsultaCurso curso = new ConsultaCurso();
        curso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnVerActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        BuscarCurso bc = new BuscarCurso();
        bc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void TextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNombreActionPerformed

    private void BtnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAsignarActionPerformed
        AsignarCurso ac = new AsignarCurso();
        ac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnAsignarActionPerformed

    private void btnCargaCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaCursosActionPerformed
        cargarCursos();

    }//GEN-LAST:event_btnCargaCursosActionPerformed

    private void btnAsignacionMasivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignacionMasivaActionPerformed
        asignacionMasivaEstudiateCurso();
    }//GEN-LAST:event_btnAsignacionMasivaActionPerformed

    private void selecProfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecProfeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selecProfeActionPerformed

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
            java.util.logging.Logger.getLogger(CrearCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnAsignar;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnVer;
    private javax.swing.JButton Btnsalir;
    private javax.swing.JTextField TextFin;
    private javax.swing.JTextField TextHorarioFin;
    private javax.swing.JTextField TextHorarioInico;
    private javax.swing.JTextField TextId;
    private javax.swing.JTextField TextInicio;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JTextField TextSeccion;
    private javax.swing.JButton btnAsignacionMasiva;
    private javax.swing.JButton btnCargaCursos;
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

    private void cargarCursos() {
        String aux = "";
        String texto = "";

        JFileChooser file = new JFileChooser();
        file.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        //Filtro
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.JSON", "json");

        file.setFileFilter(filtro);

        int seleccion = file.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = file.getSelectedFile();

            insertarCursos(fichero.getPath());

        }
    }

    private void insertarCursos(String path) {

        JsonParser parser = new JsonParser();
        FileReader fr;
        try {
            fr = new FileReader(path);
            JsonElement element = parser.parse(fr);

            dumpJSONElement(element);

            JOptionPane.showMessageDialog(null, "Archivo cargado correctamente");

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se puede abrir este archivo");
        }

    }

    private String id = "";
    private String nombre = "";
    private String seccion = "";
    private String fecha_inicio = "";
    private String fecha_fin = "";
    private String hora_inicio = "";
    private String hora_fin = "";
    private String profesor = "";

    private void dumpJSONElement(JsonElement element) {
        if (element.isJsonObject()) {

            //System.out.println("Es objeto");
            JsonObject obj = element.getAsJsonObject();
            java.util.Set<java.util.Map.Entry<String, JsonElement>> entradas = obj.entrySet();
            java.util.Iterator<java.util.Map.Entry<String, JsonElement>> iter = entradas.iterator();

            while (iter.hasNext()) {
                java.util.Map.Entry<String, JsonElement> entrada = iter.next();

                if (entrada.getKey().equals("id")) {
                    id = entrada.getValue().toString();
                } else if (entrada.getKey().equals("nombre")) {
                    nombre = entrada.getValue().toString();
                } else if (entrada.getKey().equals("seccion")) {
                    seccion = entrada.getValue().toString();
                } else if (entrada.getKey().equals("fecha_inicio")) {
                    fecha_inicio = entrada.getValue().toString();
                } else if (entrada.getKey().equals("fecha_fin")) {
                    fecha_fin = entrada.getValue().toString();
                } else if (entrada.getKey().equals("hora_inicio")) {
                    hora_inicio = entrada.getValue().toString();
                } else if (entrada.getKey().equals("hora_fin")) {
                    hora_fin = entrada.getValue().toString();
                } else if (entrada.getKey().equals("profesor")) {
                    profesor = entrada.getValue().toString();
                }

                dumpJSONElement(entrada.getValue());
            }

            //lISTAR                                    
            if (!id.equals("") || !nombre.equals("") || !seccion.equals("")
                    || !fecha_inicio.equals("") || !fecha_fin.equals("")
                    || !hora_inicio.equals("") || !hora_fin.equals("")
                    || !profesor.equals("")) {

                listarCurso(id.replace("\"", ""), nombre.replace("\"", ""),
                        seccion.replace("\"", ""), fecha_inicio.replace("\"", ""),
                        fecha_fin.replace("\"", ""), hora_inicio.replace("\"", ""),
                        hora_fin.replace("\"", ""), profesor.replace("\"", ""));

            }

        } else if (element.isJsonArray()) {

            JsonArray array = element.getAsJsonArray();
            System.out.println("Es array. Numero de elementos: " + array.size());
            java.util.Iterator<JsonElement> iter = array.iterator();
            while (iter.hasNext()) {
                JsonElement entrada = iter.next();
                dumpJSONElement(entrada);
            }

        } else if (element.isJsonPrimitive()) {

        } else if (element.isJsonNull()) {
            System.out.println("ES nulo");
        } else {
            JOptionPane.showMessageDialog(null, "No es un archivo Json");
        }
    }

    private void listarCurso(String id, String nombre, String seccion, String fecha_inicio, String fecha_fin, String hora_inicio, String hora_fin, String profesor) {

        Profesor actualProfesor = buscarProfesor(profesor);

        if (actualProfesor != null) {

            if (actualProfesor.getIteradorCurso() != 3) {
                Curso curso = new Curso(Util.getIdCurso(), nombre, seccion, fecha_inicio, fecha_fin, hora_inicio, hora_fin, actualProfesor);
                listaCurso.add(curso);

                Util.setIdCurso(Util.getIdCurso() + 1);

                asignarCursoAProfesorEncontrado(actualProfesor, curso, true);

            }

        }

    }

    private void asignacionMasivaEstudiateCurso() {
        String aux = "";
        String texto = "";

        JFileChooser file = new JFileChooser();
        file.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        //Filtro
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.PROGRA1", "progra1");

        file.setFileFilter(filtro);

        int seleccion = file.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = file.getSelectedFile();

            asignacionMasiva(fichero.getPath());

        }
    }

    private void asignacionMasiva(String path) {
        fileAlumno = new File(path);

        try {
            entradaAlumno = new Scanner(fileAlumno);

            entradaAlumno.next();

            while (entradaAlumno.hasNext()) {

                datosAlumnos = entradaAlumno.next();
                valoresAlumnos = datosAlumnos.split("#");

                asignacionMasiva.add(new AsignacionMasiva(valoresAlumnos[0], valoresAlumnos[1]));

                asignarEstudianteACurso(valoresAlumnos[0], valoresAlumnos[1]);

            }

            entradaAlumno.close();

            JOptionPane.showMessageDialog(null, "Archivo cargado existosamente");

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado");
        }
    }

    private void asignarEstudianteACurso(String curso, String carne_estudiante) {

        Curso idCurso = buscarCurso(curso);

        if (idCurso != null) {
            Alumno alumno = buscarEstudiante(carne_estudiante);

            if (alumno != null) {
                asignarCurso(idCurso, alumno);
            }
        }

    }

    private Curso buscarCurso(String curso) {

        Curso encontrado = null;

        for (int i = 0; i < listaCurso.size(); i++) {
            if (String.valueOf(listaCurso.get(i).getId()).equals(curso)) {
                encontrado = listaCurso.get(i);
                break;
            }
        }

        return encontrado;
    }

    private Alumno buscarEstudiante(String carne_estudiante) {
        Alumno encontrado = null;

        for (int i = 0; i < listaAlumno.size(); i++) {
            if (listaAlumno.get(i).getCarne().equals(carne_estudiante)) {
                encontrado = listaAlumno.get(i);
            }
        }
        return encontrado;
    }

    private void asignarCurso(Curso idCurso, Alumno alumno) {

        int idAlumno = buscarAlumno(alumno.getCarne());

        if (idAlumno != -1) {

            //Obtenemos la posición del arreglo de cursos
            int numCursos = listaAlumno.get(idAlumno).getTamañoCursos();

            //Se verifica si ya tiene asignado 5 cursos el estudiante
            if (numCursos != 5) {

                for (int i = 0; i < listaCurso.size(); i++) {

                    if (idCurso.getNombre().toString().equals(listaCurso.get(i).getNombre())) {

                        if (listaCurso.get(i).getIteradorAlumno() != 10) {
                            Curso cursoActual = listaCurso.get(i);
                            Alumno alumnoActual[] = listaCurso.get(i).getAlumno();

                            if (!cursoAsignado(cursoActual, listaAlumno.get(idAlumno).getCurso())) {
                                int iteradorAlumno = listaCurso.get(i).getIteradorAlumno();

                                listaAlumno.get(idAlumno).getCurso()[numCursos] = new Curso(cursoActual.getId(),
                                        cursoActual.getNombre(), cursoActual.getSeccion(), cursoActual.getInicio(),
                                        cursoActual.getFin(), cursoActual.getHoraInicio(),
                                        cursoActual.getHoraFin(), cursoActual.getProfesor());

                                listaAlumno.get(idAlumno).setCurso(listaAlumno.get(idAlumno).getCurso());

                                int actualizacion = numCursos + 1;

                                listaAlumno.get(idAlumno).setTamañoCursos(actualizacion);

                                //Comienzo de asignación de 10 alumnos al curso
                                alumnoActual[iteradorAlumno] = listaAlumno.get(idAlumno);
                                listaCurso.get(i).setAlumno(alumnoActual);

                                int updateItAlumno = iteradorAlumno + 1;
                                listaCurso.get(i).setIteradorAlumno(updateItAlumno);
                                
                                
                                //Crear nota para el alumno y curso
                                Nota nota = new Nota(cursoActual, listaAlumno.get(idAlumno), "0");
                                listaNotas.add(nota);
                                
                            }

                        }
                    }
                }

            }
        }

    }

    private int buscarAlumno(String carne) {
        for (int i = 0; i < listaAlumno.size(); i++) {

            if (listaAlumno.get(i).getCarne().equals(carne)) {

                return i;
            }
        }
        return -1;
    }

    private Profesor buscarProfesor(String profe) {

        Profesor profesor = null;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getUsuario().equals(profe)) {
                profesor = lista.get(i);
                i = lista.size();
            }
        }

        return profesor;
    }

    private void asignarCursoAProfesorEncontrado(Profesor profesor, Curso curso, boolean masiva) {

        for (int i = 0; i < lista.size(); i++) {
            if (profesor.getUsuario().equals(lista.get(i).getUsuario())) {

                Curso[] arregloCursos = lista.get(i).getCurso();
                int iterador = lista.get(i).getIteradorCurso();

                arregloCursos[iterador] = curso;
                lista.get(i).setCurso(arregloCursos);

                int actualizacion = iterador + 1;

                lista.get(i).setIteradorCurso(actualizacion);

                //Variable masiva para saber mostrar mensaje o no cuando se asigna 1 a 1 
                if (!masiva) {
                    JOptionPane.showMessageDialog(null, "El profesor tiene aún " + (3 - lista.get(i).getIteradorCurso()) + " cursos disponibles");
                }
            }
        }

    }

    private boolean cursoAsignado(Curso cursoActual, Curso[] curso) {
        for (int i = 0; i < curso.length; i++) {
            if(curso[i] != null){
                if(cursoActual.getNombre().equals(curso[i].getNombre())){
                    return true;
                }
            }
        }
        return false;
    }
}
