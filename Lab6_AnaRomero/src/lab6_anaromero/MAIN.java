package lab6_anaromero;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Ana Romero
 */
public class MAIN extends javax.swing.JFrame {

    public MAIN() {
        initComponents();

        JT_YEAR.setVisible(false);
        JT_TIPO.setVisible(false);
        JT_GENERO.setVisible(false);

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

        //___________________________________________________________________________
        //comboBox FILTROS
        DefaultComboBoxModel filtro = (DefaultComboBoxModel) CB_FILTROS.getModel();
        filtro.addElement(("--------"));
        filtro.addElement(("Año"));
        filtro.addElement(("Tipo"));
        filtro.addElement(("Genero"));
        CB_FILTROS.setModel(filtro);
        CB_FILTROS.setModel(filtro);

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
        jScrollPane4 = new javax.swing.JScrollPane();
        JL_M = new javax.swing.JList<>();
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
        BTN_CARGAR = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TF_NOMBREP = new javax.swing.JTextField();
        CB_PROGRAMAS = new javax.swing.JComboBox<>();
        BTN_PASAR = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        JL_P = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        TA_1 = new javax.swing.JTextArea();
        BTN_ABRIR = new javax.swing.JButton();
        BTN_ADD = new javax.swing.JButton();
        BTN_DELETE = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        CB_FILTROS = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        JT_YEAR = new javax.swing.JTree();
        jScrollPane8 = new javax.swing.JScrollPane();
        JT_TIPO = new javax.swing.JTree();
        jScrollPane9 = new javax.swing.JScrollPane();
        JT_GENERO = new javax.swing.JTree();
        jLabel14 = new javax.swing.JLabel();

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
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Puntacion:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tipo:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fecha de lanzamiento:");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
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

        JL_M.setModel(new DefaultListModel());
        jScrollPane4.setViewportView(JL_M);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Puntacion:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha de lanzamiento:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Genero:");

        JB_ADD.setForeground(new java.awt.Color(255, 255, 255));
        JB_ADD.setText("Agregar");
        JB_ADD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_ADDMouseClicked(evt);
            }
        });

        TF_FECHA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));

        SP_PUNTUACION.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        BG_GENERO.add(RB_ANIME);
        RB_ANIME.setForeground(new java.awt.Color(255, 255, 255));
        RB_ANIME.setText("Anime");

        BG_GENERO.add(RB_SERIE);
        RB_SERIE.setForeground(new java.awt.Color(255, 255, 255));
        RB_SERIE.setText("Serie");

        BG_GENERO.add(RB_DOCUMENTAL);
        RB_DOCUMENTAL.setForeground(new java.awt.Color(255, 255, 255));
        RB_DOCUMENTAL.setText("Documental");

        BG_GENERO.add(RB_PELICULA);
        RB_PELICULA.setForeground(new java.awt.Color(255, 255, 255));
        RB_PELICULA.setText("Pelicula");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JB_ADD)
                .addGap(112, 112, 112))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SP_PUNTUACION, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(TB_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(TF_FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 505, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(RB_ANIME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(RB_SERIE, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(RB_DOCUMENTAL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(RB_PELICULA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CB_GENERO, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel5)))))
                        .addGap(91, 91, 91))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
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
                .addGap(82, 82, 82)
                .addComponent(JB_ADD)
                .addGap(36, 36, 36))
        );

        jTabbedPane1.addTab("Agregar", jPanel1);

        jPanel2.setBackground(new java.awt.Color(51, 0, 0));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
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
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 1048, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel22)
                .addGap(81, 81, 81)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Metodos Admi. Programas", jPanel2);

        jPanel5.setBackground(new java.awt.Color(51, 0, 0));

        BTN_CARGAR.setText("Guardar Archivo");
        BTN_CARGAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_CARGARMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nombre:");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Programas a agregar:");

        BTN_PASAR.setText("Pasar a Lista");
        BTN_PASAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_PASARMouseClicked(evt);
            }
        });

        JL_P.setModel(new DefaultListModel());
        jScrollPane5.setViewportView(JL_P);

        TA_1.setColumns(20);
        TA_1.setRows(5);
        jScrollPane6.setViewportView(TA_1);

        BTN_ABRIR.setText("Abrir Archivo");
        BTN_ABRIR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_ABRIRMouseClicked(evt);
            }
        });

        BTN_ADD.setText("Agregar Programa");
        BTN_ADD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_ADDMouseClicked(evt);
            }
        });

        BTN_DELETE.setText("Eliminar  Programa");
        BTN_DELETE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_DELETEMouseClicked(evt);
            }
        });

        jButton1.setText("Crear Archivo");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(CB_PROGRAMAS, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTN_PASAR))
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TF_NOMBREP, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(176, 176, 176)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(BTN_ABRIR, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTN_ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(BTN_CARGAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_DELETE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(TF_NOMBREP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addComponent(jLabel12)
                        .addGap(62, 62, 62)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CB_PROGRAMAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_PASAR)
                            .addComponent(BTN_ABRIR)
                            .addComponent(BTN_ADD)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTN_CARGAR)
                            .addComponent(BTN_DELETE)
                            .addComponent(jButton1))))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ClaudiList", jPanel5);

        jPanel6.setBackground(new java.awt.Color(51, 0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CB_FILTROS.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CB_FILTROSItemStateChanged(evt);
            }
        });
        jPanel6.add(CB_FILTROS, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 70, 200, -1));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Programas");
        JT_YEAR.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane7.setViewportView(JT_YEAR);

        jPanel6.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 260, 296));

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Programas");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Anime");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Documental");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Serie");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Pelicula");
        treeNode1.add(treeNode2);
        JT_TIPO.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        JT_TIPO.setFocusTraversalPolicyProvider(true);
        jScrollPane8.setViewportView(JT_TIPO);

        jPanel6.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 260, 296));

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Programas");
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Comedia");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Romance");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Terror");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("SyFy");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Suspenso");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Accion");
        treeNode1.add(treeNode2);
        JT_GENERO.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane9.setViewportView(JT_GENERO);

        jPanel6.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 260, 296));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Filtros:");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 69, -1, -1));

        jTabbedPane1.addTab("Arbol", jPanel6);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        ADMI ap = new ADMI("./" + TF_NOMBREP + ".txt");
        ap.cargarArchivo();

        DefaultListModel mp = (DefaultListModel) JL_P.getModel();

        for (int i = 0; i < mp.getSize(); i++) {
            PROGRAMAS p1 = (PROGRAMAS) mp.get(i);
            ap.getListaProgramas().add(p1);
        }
        try {
            ap.escribirArchivo();
        } catch (IOException ex) {
            Logger.getLogger(MAIN.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1MouseClicked

    private void BTN_DELETEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_DELETEMouseClicked
        ADMI admi = new ADMI(TF_NOMBREP.getText());

        int indice = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el indice que desea eliminar"));
        admi.cargarArchivo();
        admi.getListaProgramas().remove(indice);
        JOptionPane.showMessageDialog(this, "Eliminado correctamente!");
        TA_1.setText("");

        try {
            admi.escribirArchivo();
        } catch (IOException ex) {
            Logger.getLogger(MAIN.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_BTN_DELETEMouseClicked

    private void BTN_ADDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_ADDMouseClicked
        try {
            ADMI ap = new ADMI("./");
            ap.cargarArchivo();

            PROGRAMAS e = (PROGRAMAS) CB_PROGRAMAS.getSelectedItem();

            ap.getListaProgramas().add(e);
            ap.escribirArchivo();
            JOptionPane.showMessageDialog(this, "Agregado exitosamente!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Algo salio mal, mantenga selecionado un item de comboBox!");
        }
    }//GEN-LAST:event_BTN_ADDMouseClicked

    private void BTN_ABRIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_ABRIRMouseClicked
        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;
        TA_1.setText("");

        try {
            JFileChooser jfc = new JFileChooser("./");
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de Texto", "txt");

            //marcar filtro y dejarlo como seleccionado
            jfc.setFileFilter(filtro);

            int select = jfc.showOpenDialog(this);
            if (select == JFileChooser.APPROVE_OPTION) {

                fichero = jfc.getSelectedFile();
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);
                String info = "";
                TA_1.setText("");

                while ((info = br.readLine()) != null) {
                    TA_1.append(info);
                    TA_1.append("\n");
                }//fin de recorrer todo el archivo

            }//fin si seleciona algo
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            br.close();
            fr.close();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_BTN_ABRIRMouseClicked

    private void BTN_PASARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_PASARMouseClicked
        if (CB_PROGRAMAS.getSelectedIndex() >= 0) {
            DefaultComboBoxModel cbc = (DefaultComboBoxModel) CB_PROGRAMAS.getModel();
            DefaultListModel modeloA = (DefaultListModel) JL_P.getModel();
            PROGRAMAS programas = (PROGRAMAS) CB_PROGRAMAS.getSelectedItem();
            modeloA.addElement(programas);
            JL_P.setModel(modeloA);
            cbc.removeElement((PROGRAMAS) CB_PROGRAMAS.getSelectedItem());
            CB_PROGRAMAS.setModel(cbc);
        } else {
            JOptionPane.showMessageDialog(null, "Selleccione una clase primero, si no aparecen clases entonces cree una");
        }
    }//GEN-LAST:event_BTN_PASARMouseClicked

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

            String genero = (String) CB_GENERO.getSelectedItem().toString();
            PROGRAMAS p1 = new PROGRAMAS(nombre, fecha, tipo, genero, puntuacion);

            modelo.addElement(p1);  //JLIST

            //COMBOBOX
            DefaultComboBoxModel modelo2 = (DefaultComboBoxModel) CB_PROGRAMAS.getModel();
            modelo2.addElement(p1);
            CB_PROGRAMAS.setModel(modelo2);
            JOptionPane.showMessageDialog(this, "Creado exitosamente!");

            TB_NOMBRE.setText("");
            TF_FECHA.setText("");
            CB_GENERO.setSelectedIndex(0);
            SP_PUNTUACION.setValue(0);

            //-----------------------------------------------------------------------------------------------------------------------------
            //ARBOL POR TIPO
            DefaultTreeModel modeloARBOL = (DefaultTreeModel) JT_TIPO.getModel();   //agarra modelo
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modeloARBOL.getRoot();   //agarra raiz del arbol
            for (int i = 0; i < raiz.getChildCount(); i++) {

                if (raiz.getChildAt(i).toString().equals(tipo)) {

                    DefaultMutableTreeNode p = new DefaultMutableTreeNode(p1);  //crea el nuevo nodo dentro del arbol (P es mi nodo)
                    ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(p);       //solo agrego el nodo
                    tree2 = true;
                }//valida  que el child sea igual al tipo del programa

            }//recorre la raiz del arbol donde estan los childs de dicho arbol (programas)

            modeloARBOL.reload();   //hace refresh para que se vaya updetiando solo

            //-----------------------------------------------------------------------------------------------------------------------------
            //ARBOL POR GENERO
            DefaultTreeModel modeloARBOL2 = (DefaultTreeModel) JT_GENERO.getModel();   //agarra modelo
            DefaultMutableTreeNode raiz2 = (DefaultMutableTreeNode) modeloARBOL2.getRoot();   //agarra raiz del arbol
            for (int i = 0; i < raiz2.getChildCount(); i++) {

                if (raiz2.getChildAt(i).toString().equals(genero)) {

                    DefaultMutableTreeNode n1 = new DefaultMutableTreeNode(p1);  //crea el nuevo nodo dentro del arbol 
                    ((DefaultMutableTreeNode) raiz2.getChildAt(i)).add(n1);       //solo agrego el nodo
                    tree3 = true;
                }//valida  que el child sea igual al tipo del programa

            }//recorre la raiz del arbol donde estan los childs de dicho arbol (programas)

            modeloARBOL2.reload();   //hace refresh para que se vaya updetiando solo

            //-----------------------------------------------------------------------------------------------------------------------------
            //ARBOL POR YEAR
            DefaultTreeModel modeloARBOL3 = (DefaultTreeModel) JT_YEAR.getModel();   //agarra modelo
            DefaultMutableTreeNode raiz3 = (DefaultMutableTreeNode) modeloARBOL3.getRoot();   //agarra raiz del arbol
            int aux = -1;  //valida si ya esta hecho el nodo 
            for (int i = 0; i < raiz3.getChildCount(); i++) {

                if (raiz3.getChildAt(i).toString().equals(fecha)) {

                    DefaultMutableTreeNode n2 = new DefaultMutableTreeNode(p1);  //crea el nuevo nodo dentro del arbol 
                    ((DefaultMutableTreeNode) raiz3.getChildAt(i)).add(n2);       //solo agrego el nodo
                    aux = 1;
                    tree1 = true;
                }//valida  que el child sea igual al tipo del programa

            }//recorre la raiz del arbol donde estan los childs de dicho arbol (programas)

            if (aux == -1) {

                DefaultMutableTreeNode n = new DefaultMutableTreeNode(fecha);   //crea carpeta con nombre de la fecha
                DefaultMutableTreeNode n2 = new DefaultMutableTreeNode(p1);  //crea el programa
                n.add(n2);  //agrega el nodo dentro de la raiz
                raiz3.add(n);   //crea carpeta fecha
                tree1 = true;

            }//si no existe el archivo de dicha fecha
            modeloARBOL3.reload();   //hace refresh para que se vaya updetiando solo

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

    private void BTN_CARGARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_CARGARMouseClicked

    }//GEN-LAST:event_BTN_CARGARMouseClicked

    private void CB_FILTROSItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CB_FILTROSItemStateChanged
        if (CB_FILTROS.getSelectedIndex() == 0) {
            
            JT_GENERO.setVisible(false);
            JT_YEAR.setVisible(false);
            JT_TIPO.setVisible(false);
            
        }else if (CB_FILTROS.getSelectedIndex() == 1) {
            if (tree1) {
                JT_YEAR.setVisible(true);
                JT_TIPO.setVisible(false);
                JT_GENERO.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "El Arbol esta vacio, primero agregue algo");
            }
            
        } else if (CB_FILTROS.getSelectedIndex() == 2) {
            if (tree2) {
                JT_YEAR.setVisible(false);
                JT_TIPO.setVisible(true);
                JT_GENERO.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "El Arbol esta vacio, primero agregue algo");
            }
            
        } else if(CB_FILTROS.getSelectedIndex() == 3) {
            if (tree3) {
                JT_YEAR.setVisible(false);
                JT_TIPO.setVisible(false);
                JT_GENERO.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "El Arbol esta vacio, primero agregue algo");
            }
            
        }//valida que sea visible o no
    }//GEN-LAST:event_CB_FILTROSItemStateChanged

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
    private javax.swing.JButton BTN_ABRIR;
    private javax.swing.JButton BTN_ADD;
    private javax.swing.JButton BTN_CARGAR;
    private javax.swing.JButton BTN_DELETE;
    private javax.swing.JButton BTN_PASAR;
    private javax.swing.JButton BTN_modificar;
    private javax.swing.JComboBox<String> CB_FILTROS;
    private javax.swing.JComboBox<String> CB_GENERO;
    private javax.swing.JComboBox<String> CB_GENERO1;
    private javax.swing.JComboBox<String> CB_PROGRAMAS;
    private javax.swing.JButton JB_ADD;
    private javax.swing.JDialog JD_MODIFICAR;
    private javax.swing.JList<String> JL_M;
    private javax.swing.JList<String> JL_P;
    private javax.swing.JList<String> JL_PROGRAMAS;
    private javax.swing.JMenuItem JM_ELIMINAR;
    private javax.swing.JMenuItem JM_MODIFICAR;
    private javax.swing.JTree JT_GENERO;
    private javax.swing.JTree JT_TIPO;
    private javax.swing.JTree JT_YEAR;
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
    private javax.swing.JTextArea TA_1;
    private javax.swing.JTextField TB_NOMBRE;
    private javax.swing.JTextField TB_NOMBRE1;
    private javax.swing.JFormattedTextField TF_FECHA;
    private javax.swing.JFormattedTextField TF_FECHA1;
    private javax.swing.JTextField TF_NOMBREP;
    private javax.swing.JButton jButton1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JEditorPane jEditorPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
    ArrayList claudiaList = new ArrayList();
    boolean tree1 = false;
    boolean tree2 = false;
    boolean tree3 = false;
}
