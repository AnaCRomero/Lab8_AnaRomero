package lab6_anaromero;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Ana Romero
 */
public class MAIN extends javax.swing.JFrame {

    public MAIN() {
        initComponents();

        //Valida entradas
        RB_ANIME.setSelected(true);

        //___________________________________________________________________________
        //comboBox GENERO
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) CB_GENERO.getModel();
        modelo.addElement(("Comedia"));
        modelo.addElement(("Romance"));
        modelo.addElement(("Terror"));
        modelo.addElement(("SyFy"));
        modelo.addElement(("Suspenso"));
        modelo.addElement(("Accion"));
        CB_GENERO.setModel(modelo);
        CB_GENERO1.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG_GENERO = new javax.swing.ButtonGroup();
        POP_ADMI = new javax.swing.JPopupMenu();
        JM_MODIFICAR = new javax.swing.JMenuItem();
        JM_ELIMINAR = new javax.swing.JMenuItem();
        JD_MODIFICAR = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BTN_modificar = new javax.swing.JButton();
        TB_NOMBRE1 = new javax.swing.JTextField();
        TF_FECHA1 = new javax.swing.JFormattedTextField();
        SP_PUNTUACION1 = new javax.swing.JSpinner();
        RB_ANIME1 = new javax.swing.JRadioButton();
        RB_SERIE1 = new javax.swing.JRadioButton();
        RB_DOCUMENTAL1 = new javax.swing.JRadioButton();
        RB_PELICULA1 = new javax.swing.JRadioButton();
        CB_GENERO1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPane2 = new javax.swing.JEditorPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JB_ADD = new javax.swing.JButton();
        TB_NOMBRE = new javax.swing.JTextField();
        TF_FECHA = new javax.swing.JFormattedTextField();
        SP_PUNTUACION = new javax.swing.JSpinner();
        RB_ANIME = new javax.swing.JRadioButton();
        RB_SERIE = new javax.swing.JRadioButton();
        RB_DOCUMENTAL = new javax.swing.JRadioButton();
        RB_PELICULA = new javax.swing.JRadioButton();
        CB_GENERO = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JL_PROGRAMAS = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        BTN_CREAR = new javax.swing.JButton();
        TA_1 = new java.awt.TextArea();
        BTN_AGREGAR = new javax.swing.JButton();
        BTN_Eliminar = new javax.swing.JButton();

        JM_MODIFICAR.setText("Modificar");
        JM_MODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_MODIFICARActionPerformed(evt);
            }
        });
        POP_ADMI.add(JM_MODIFICAR);

        JM_ELIMINAR.setText("Eliminar");
        JM_ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_ELIMINARActionPerformed(evt);
            }
        });
        POP_ADMI.add(JM_ELIMINAR);

        jPanel4.setBackground(new java.awt.Color(51, 0, 0));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Nombre:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Puntacion:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Tipo:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Fecha de lanzamiento:");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Genero:");

        BTN_modificar.setText("Modificar");
        BTN_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_modificarMouseClicked(evt);
            }
        });

        TF_FECHA1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));

        SP_PUNTUACION1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        BG_GENERO.add(RB_ANIME1);
        RB_ANIME1.setText("Anime");

        BG_GENERO.add(RB_SERIE1);
        RB_SERIE1.setText("Serie");

        BG_GENERO.add(RB_DOCUMENTAL1);
        RB_DOCUMENTAL1.setText("Documental");

        BG_GENERO.add(RB_PELICULA1);
        RB_PELICULA1.setText("Pelicula");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(SP_PUNTUACION1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(193, 193, 193))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TF_FECHA1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(RB_ANIME1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RB_SERIE1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RB_DOCUMENTAL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RB_PELICULA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CB_GENERO1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(53, 53, 53)
                                    .addComponent(jLabel10))))
                        .addGap(102, 102, 102))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TB_NOMBRE1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTN_modificar)
                .addGap(14, 14, 14))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(TB_NOMBRE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel9))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RB_ANIME1)
                            .addComponent(RB_DOCUMENTAL1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RB_SERIE1)
                            .addComponent(RB_PELICULA1))))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(TF_FECHA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SP_PUNTUACION1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(25, 25, 25)
                        .addComponent(CB_GENERO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(BTN_modificar)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout JD_MODIFICARLayout = new javax.swing.GroupLayout(JD_MODIFICAR.getContentPane());
        JD_MODIFICAR.getContentPane().setLayout(JD_MODIFICARLayout);
        JD_MODIFICARLayout.setHorizontalGroup(
            JD_MODIFICARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_MODIFICARLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        JD_MODIFICARLayout.setVerticalGroup(
            JD_MODIFICARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_MODIFICARLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jEditorPane1);

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jScrollPane3.setViewportView(jEditorPane2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Puntacion:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Tipo:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Fecha de lanzamiento:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Genero:");

        JB_ADD.setText("Agregar");
        JB_ADD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_ADDMouseClicked(evt);
            }
        });

        TF_FECHA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));

        SP_PUNTUACION.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        BG_GENERO.add(RB_ANIME);
        RB_ANIME.setText("Anime");

        BG_GENERO.add(RB_SERIE);
        RB_SERIE.setText("Serie");

        BG_GENERO.add(RB_DOCUMENTAL);
        RB_DOCUMENTAL.setText("Documental");

        BG_GENERO.add(RB_PELICULA);
        RB_PELICULA.setText("Pelicula");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SP_PUNTUACION, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(193, 193, 193))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TF_FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(RB_ANIME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RB_SERIE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RB_DOCUMENTAL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RB_PELICULA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CB_GENERO, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(53, 53, 53)
                                    .addComponent(jLabel5))))
                        .addGap(102, 102, 102))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TB_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JB_ADD)
                .addGap(112, 112, 112))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TB_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RB_ANIME)
                            .addComponent(RB_DOCUMENTAL))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RB_SERIE)
                            .addComponent(RB_PELICULA))))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TF_FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SP_PUNTUACION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(25, 25, 25)
                        .addComponent(CB_GENERO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JB_ADD)
                .addGap(36, 36, 36))
        );

        jTabbedPane1.addTab("Agregar", jPanel1);

        jPanel2.setBackground(new java.awt.Color(51, 0, 0));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("PROGRAMAS");
        jLabel22.setOpaque(true);

        JL_PROGRAMAS.setModel(new DefaultListModel());
        JL_PROGRAMAS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JL_PROGRAMASMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JL_PROGRAMAS);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jTabbedPane1.addTab("Metodos Admi. Programas", jPanel2);

        jPanel5.setBackground(new java.awt.Color(51, 0, 0));

        BTN_CREAR.setText("Crear Lista");
        BTN_CREAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_CREARMouseClicked(evt);
            }
        });

        TA_1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        BTN_AGREGAR.setText("Crear Lista");
        BTN_AGREGAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_AGREGARMouseClicked(evt);
            }
        });

        BTN_Eliminar.setText("Eliminar Lista");
        BTN_Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_EliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(BTN_CREAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_AGREGAR)
                        .addGap(79, 79, 79)
                        .addComponent(BTN_Eliminar))
                    .addComponent(TA_1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(TA_1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_CREAR)
                    .addComponent(BTN_AGREGAR)
                    .addComponent(BTN_Eliminar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ClaudiList", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_ADDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_ADDMouseClicked
        try {
            DefaultListModel modelo = (DefaultListModel) JL_PROGRAMAS.getModel();

            String nombre = TB_NOMBRE.getText();
            String fecha = TF_FECHA.getText();
            int puntuacion = (int) SP_PUNTUACION.getValue();
            String tipo = "";

            if (RB_ANIME.isSelected()) {
                tipo = "Anime";
            } else if (RB_DOCUMENTAL.isSelected()) {
                tipo = "Documental";
            } else if (RB_SERIE.isSelected()) {
                tipo = "Serie";
            } else if (RB_PELICULA.isSelected()) {
                tipo = "Pelicula";
            }

            String genero = (String) CB_GENERO.getSelectedItem().toString();;

            modelo.addElement(new PROGRAMAS(nombre, fecha, tipo, genero, puntuacion));  //JLIST
            JOptionPane.showMessageDialog(this, "Creado exitosamente!");

            TB_NOMBRE.setText("");
            TF_FECHA.setText("");
            CB_GENERO.setSelectedIndex(0);
            SP_PUNTUACION.setValue(0);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Algo saio mal, intente nuevamente!");
        }

    }//GEN-LAST:event_JB_ADDMouseClicked

    private void JL_PROGRAMASMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JL_PROGRAMASMouseClicked
        if (JL_PROGRAMAS.getSelectedIndex() >= 0) {
            if (evt.isMetaDown()) {
                POP_ADMI.show(evt.getComponent(), evt.getX(), evt.getY());
            }//valida que sea click derecho
        }//que seleccione algo
    }//GEN-LAST:event_JL_PROGRAMASMouseClicked

    private void JM_ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_ELIMINARActionPerformed
        if (JL_PROGRAMAS.getSelectedIndex() >= 0) {
            int response = JOptionPane.showConfirmDialog(this, "Seguro de Eliminar?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.OK_OPTION) {
                DefaultListModel modelo = (DefaultListModel) JL_PROGRAMAS.getModel();
                modelo.remove(JL_PROGRAMAS.getSelectedIndex());
                JL_PROGRAMAS.setModel(modelo);
                JOptionPane.showMessageDialog(this, "Eliminado exitosamente!");
            }
        }
    }//GEN-LAST:event_JM_ELIMINARActionPerformed

    private void JM_MODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_MODIFICARActionPerformed
        MOD_PROGRAMA();
    }//GEN-LAST:event_JM_MODIFICARActionPerformed

    private void BTN_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_modificarMouseClicked
        try {
            String nombre = TB_NOMBRE1.getText();
            String fecha = TF_FECHA1.getText();
            int puntuacion = (int) SP_PUNTUACION1.getValue();
            String tipo = "";

            if (RB_ANIME1.isSelected()) {
                tipo = "Anime";
            } else if (RB_DOCUMENTAL1.isSelected()) {
                tipo = "Documental";
            } else if (RB_SERIE1.isSelected()) {
                tipo = "Serie";
            } else if (RB_PELICULA1.isSelected()) {
                tipo = "Pelicula";
            }

            String genero = (String) CB_GENERO1.getSelectedItem().toString();
            DefaultListModel modeloLista = (DefaultListModel) JL_PROGRAMAS.getModel();

            //CAMBIA
            ((PROGRAMAS) modeloLista.get(JL_PROGRAMAS.getSelectedIndex())).setNombre(nombre);
            ((PROGRAMAS) modeloLista.get(JL_PROGRAMAS.getSelectedIndex())).setFechaLanzamiento(fecha);
            ((PROGRAMAS) modeloLista.get(JL_PROGRAMAS.getSelectedIndex())).setPuntuacion(puntuacion);
            ((PROGRAMAS) modeloLista.get(JL_PROGRAMAS.getSelectedIndex())).setTipo(tipo);
            ((PROGRAMAS) modeloLista.get(JL_PROGRAMAS.getSelectedIndex())).setGenero(genero);
            
            JL_PROGRAMAS.setModel(modeloLista);
            JOptionPane.showMessageDialog(this, "Modificacion exitosa!");
            
            //limpia
            TB_NOMBRE.setText("");
            TF_FECHA.setText("");
            CB_GENERO.setSelectedIndex(0);
            SP_PUNTUACION.setValue(1);
            RB_ANIME.setSelected(true);
            
            //sale
            JD_MODIFICAR.dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Algo saio mal, intente nuevamente!");
        }
    }//GEN-LAST:event_BTN_modificarMouseClicked

    private void BTN_CREARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_CREARMouseClicked
        JFileChooser FC = new JFileChooser();
        int select = FC.showSaveDialog(this);
        if (select == JFileChooser.APPROVE_OPTION) {
            File dir = FC.getSelectedFile();
            boolean existe = dir.mkdir();
            if (existe) {
                JOptionPane.showMessageDialog(this, "Directorio creado exitosamente");
            } else {
                JOptionPane.showMessageDialog(this, "El directorio no fue creado");
            }//si se realizo
        }//hasta que le de click
    }//GEN-LAST:event_BTN_CREARMouseClicked

    private void BTN_AGREGARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_AGREGARMouseClicked
        try {
            String nombre = TB_NOMBRE.getText();
            ListModel d = JL_PROGRAMAS.getModel();
            ArrayList<PROGRAMAS> paso = new ArrayList();
            
            for (int i = 0; i < d.getSize(); i++) {
                paso.add((PROGRAMAS) d.getElementAt(i));
            }

            ARCHIVOS clau = new ARCHIVOS(nombre, paso);

            JOptionPane.showMessageDialog(this, "Agregado correctamente");

            claudiaList.add(clau);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR");
        }
    }//GEN-LAST:event_BTN_AGREGARMouseClicked

    private void BTN_EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_EliminarMouseClicked

    }//GEN-LAST:event_BTN_EliminarMouseClicked

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
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAIN().setVisible(true);
            }
        });
    }

    public void MOD_PROGRAMA() {
        JD_MODIFICAR.pack();
        JD_MODIFICAR.setModal(true);
        JD_MODIFICAR.setLocationRelativeTo(this);
        JD_MODIFICAR.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BG_GENERO;
    private javax.swing.JButton BTN_AGREGAR;
    private javax.swing.JButton BTN_CREAR;
    private javax.swing.JButton BTN_Eliminar;
    private javax.swing.JButton BTN_modificar;
    private javax.swing.JComboBox<String> CB_GENERO;
    private javax.swing.JComboBox<String> CB_GENERO1;
    private javax.swing.JButton JB_ADD;
    private javax.swing.JDialog JD_MODIFICAR;
    private javax.swing.JList<String> JL_PROGRAMAS;
    private javax.swing.JMenuItem JM_ELIMINAR;
    private javax.swing.JMenuItem JM_MODIFICAR;
    private javax.swing.JPopupMenu POP_ADMI;
    private javax.swing.JRadioButton RB_ANIME;
    private javax.swing.JRadioButton RB_ANIME1;
    private javax.swing.JRadioButton RB_DOCUMENTAL;
    private javax.swing.JRadioButton RB_DOCUMENTAL1;
    private javax.swing.JRadioButton RB_PELICULA;
    private javax.swing.JRadioButton RB_PELICULA1;
    private javax.swing.JRadioButton RB_SERIE;
    private javax.swing.JRadioButton RB_SERIE1;
    private javax.swing.JSpinner SP_PUNTUACION;
    private javax.swing.JSpinner SP_PUNTUACION1;
    private java.awt.TextArea TA_1;
    private javax.swing.JTextField TB_NOMBRE;
    private javax.swing.JTextField TB_NOMBRE1;
    private javax.swing.JFormattedTextField TF_FECHA;
    private javax.swing.JFormattedTextField TF_FECHA1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JEditorPane jEditorPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
    ArrayList claudiaList = new ArrayList();
}
