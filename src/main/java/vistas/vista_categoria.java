
package vistas;

/**
 *
 * @author bipo
 */
public class vista_categoria extends javax.swing.JFrame {

    /**
     * Creates new form vista_categoria
     */
    public vista_categoria() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Panel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        PanelGuardar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnombreguadar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtdescripcionguardar = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnlimpiarguardar = new javax.swing.JButton();
        btnregresarguardar = new javax.swing.JButton();
        PanelBuscar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtidbuscar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtnombrebuscar1 = new javax.swing.JTextField();
        txtdescripcionbuscar = new javax.swing.JTextField();
        btnregresarbuscar = new javax.swing.JToggleButton();
        btnlimpiarbuscar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JToggleButton();
        combobuscar = new javax.swing.JComboBox<>();
        PanelModificar = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        combomodificar = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtnombremodificar = new javax.swing.JTextField();
        txtdescripcionmodificar = new javax.swing.JTextField();
        btnregresarmodificar = new javax.swing.JButton();
        btnlimpiarmodificar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        PanelEliminar = new javax.swing.JPanel();
        btnregresareliminar = new javax.swing.JButton();
        btnlimpiareliminar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        PanelEliminar2 = new javax.swing.JPanel();
        comboeliminar = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTabbedPane1.setForeground(new java.awt.Color(51, 51, 51));

        Panel1.setBackground(new java.awt.Color(227, 229, 201));
        Panel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel15.setFont(new java.awt.Font("Comfortaa", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("ACCEDER A LAS OPCIONES DISPONIBLES");

        jLabel16.setFont(new java.awt.Font("Comfortaa", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 51, 51));
        jLabel16.setText("↑          ↑           ↑          ↑");

        jLabel17.setFont(new java.awt.Font("Comfortaa", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("CLICK EN LA PARTE SUPERIOR PARA");

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel15)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("⎇", Panel1);

        PanelGuardar.setBackground(new java.awt.Color(227, 229, 201));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Comfortaa", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("GUARDE UNA NUEVA CATEGORÍA");

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nombre");

        txtnombreguadar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreguadarActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Descripción");

        btnguardar.setText("GUARDAR");
        btnguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnlimpiarguardar.setText("LIMPIAR");
        btnlimpiarguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlimpiarguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarguardarActionPerformed(evt);
            }
        });

        btnregresarguardar.setText("REGRESAR");
        btnregresarguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnregresarguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarguardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelGuardarLayout = new javax.swing.GroupLayout(PanelGuardar);
        PanelGuardar.setLayout(PanelGuardarLayout);
        PanelGuardarLayout.setHorizontalGroup(
            PanelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGuardarLayout.createSequentialGroup()
                .addGroup(PanelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelGuardarLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(PanelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelGuardarLayout.createSequentialGroup()
                                .addGroup(PanelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(PanelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtdescripcionguardar)
                                    .addGroup(PanelGuardarLayout.createSequentialGroup()
                                        .addComponent(txtnombreguadar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(PanelGuardarLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnregresarguardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnlimpiarguardar)
                        .addGap(43, 43, 43)
                        .addComponent(btnguardar)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        PanelGuardarLayout.setVerticalGroup(
            PanelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGuardarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(PanelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnombreguadar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(PanelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtdescripcionguardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(PanelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnregresarguardar)
                    .addComponent(btnlimpiarguardar)
                    .addComponent(btnguardar))
                .addGap(45, 45, 45))
        );

        jTabbedPane1.addTab("Guardar", PanelGuardar);

        PanelBuscar.setBackground(new java.awt.Color(227, 229, 201));

        jLabel4.setFont(new java.awt.Font("Comfortaa", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("BUSQUE UNA CATEGORÍA");

        jLabel6.setFont(new java.awt.Font("Comfortaa", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("RESULTADOS:");

        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Identificador");

        txtidbuscar.setEditable(false);

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Nombre");

        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Descripción");

        txtnombrebuscar1.setEditable(false);

        txtdescripcionbuscar.setEditable(false);

        btnregresarbuscar.setText("REGRESAR");
        btnregresarbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnlimpiarbuscar.setText("LIMPIAR");
        btnlimpiarbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnbuscar.setText("BUSCAR");
        btnbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        combobuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Click para ver las categorías" }));
        combobuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout PanelBuscarLayout = new javax.swing.GroupLayout(PanelBuscar);
        PanelBuscar.setLayout(PanelBuscarLayout);
        PanelBuscarLayout.setHorizontalGroup(
            PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarLayout.createSequentialGroup()
                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBuscarLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelBuscarLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtidbuscar))
                            .addGroup(PanelBuscarLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtnombrebuscar1))
                            .addGroup(PanelBuscarLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtdescripcionbuscar))
                            .addGroup(PanelBuscarLayout.createSequentialGroup()
                                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(PanelBuscarLayout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(jLabel6))
                                    .addComponent(combobuscar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(13, 13, 13))))
                    .addGroup(PanelBuscarLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(btnlimpiarbuscar)
                        .addGap(38, 38, 38)
                        .addComponent(btnbuscar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBuscarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnregresarbuscar)
                        .addGap(216, 216, 216)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        PanelBuscarLayout.setVerticalGroup(
            PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(combobuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtidbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtnombrebuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtdescripcionbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnregresarbuscar)
                    .addComponent(btnlimpiarbuscar)
                    .addComponent(btnbuscar))
                .addGap(45, 45, 45))
        );

        jTabbedPane1.addTab("Buscar", PanelBuscar);

        PanelModificar.setBackground(new java.awt.Color(227, 229, 201));

        jLabel10.setFont(new java.awt.Font("Comfortaa", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("MODIFIQUE UNA CATEGORÍA");

        combomodificar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Click para ver las categorías" }));
        combomodificar.setToolTipText("");
        combomodificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combomodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combomodificarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Comfortaa", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("↓ COLOQUE LOS DATOS NUEVOS ABAJO ↓");

        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Nombre");

        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Descripción");

        btnregresarmodificar.setText("REGRESAR");
        btnregresarmodificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnlimpiarmodificar.setText("LIMPIAR");
        btnlimpiarmodificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnmodificar.setText("MODIFICAR");
        btnmodificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout PanelModificarLayout = new javax.swing.GroupLayout(PanelModificar);
        PanelModificar.setLayout(PanelModificarLayout);
        PanelModificarLayout.setHorizontalGroup(
            PanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelModificarLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(PanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelModificarLayout.createSequentialGroup()
                        .addComponent(btnregresarmodificar)
                        .addGap(26, 26, 26)
                        .addComponent(btnlimpiarmodificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnmodificar))
                    .addGroup(PanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(combomodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelModificarLayout.createSequentialGroup()
                            .addGroup(PanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel12))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(PanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtdescripcionmodificar)
                                .addGroup(PanelModificarLayout.createSequentialGroup()
                                    .addComponent(txtnombremodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelModificarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelModificarLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelModificarLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(52, 52, 52))))
        );
        PanelModificarLayout.setVerticalGroup(
            PanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelModificarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combomodificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel11)
                .addGap(29, 29, 29)
                .addGroup(PanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtnombremodificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(PanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtdescripcionmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(PanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnregresarmodificar)
                    .addComponent(btnlimpiarmodificar)
                    .addComponent(btnmodificar))
                .addGap(45, 45, 45))
        );

        jTabbedPane1.addTab("Modificar", PanelModificar);

        PanelEliminar.setBackground(new java.awt.Color(227, 229, 201));

        btnregresareliminar.setText("REGRESAR");
        btnregresareliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnlimpiareliminar.setText("LIMPIAR");
        btnlimpiareliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btneliminar.setText("ELIMINAR");
        btneliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        PanelEliminar2.setBackground(new java.awt.Color(180, 207, 180));

        comboeliminar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Click para ver las categorías" }));
        comboeliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel14.setFont(new java.awt.Font("Comfortaa", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("ELIMINE UNA CATEGORÍA");

        javax.swing.GroupLayout PanelEliminar2Layout = new javax.swing.GroupLayout(PanelEliminar2);
        PanelEliminar2.setLayout(PanelEliminar2Layout);
        PanelEliminar2Layout.setHorizontalGroup(
            PanelEliminar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEliminar2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(PanelEliminar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEliminar2Layout.createSequentialGroup()
                        .addComponent(comboeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEliminar2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(31, 31, 31))))
        );
        PanelEliminar2Layout.setVerticalGroup(
            PanelEliminar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEliminar2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comboeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelEliminarLayout = new javax.swing.GroupLayout(PanelEliminar);
        PanelEliminar.setLayout(PanelEliminarLayout);
        PanelEliminarLayout.setHorizontalGroup(
            PanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEliminarLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnregresareliminar)
                .addGap(18, 18, 18)
                .addComponent(btnlimpiareliminar)
                .addGap(18, 18, 18)
                .addComponent(btneliminar)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEliminarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelEliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelEliminarLayout.setVerticalGroup(
            PanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEliminarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(PanelEliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(PanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnregresareliminar)
                    .addComponent(btnlimpiareliminar)
                    .addComponent(btneliminar))
                .addGap(50, 50, 50))
        );

        jTabbedPane1.addTab("Eliminar", PanelEliminar);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 390, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreguadarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreguadarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreguadarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnlimpiarguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarguardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlimpiarguardarActionPerformed

    private void btnregresarguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarguardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnregresarguardarActionPerformed

    private void combomodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combomodificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combomodificarActionPerformed

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
            java.util.logging.Logger.getLogger(vista_categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista_categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista_categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista_categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista_categoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel PanelBuscar;
    private javax.swing.JPanel PanelEliminar;
    private javax.swing.JPanel PanelEliminar2;
    private javax.swing.JPanel PanelGuardar;
    private javax.swing.JPanel PanelModificar;
    private javax.swing.JToggleButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnlimpiarbuscar;
    private javax.swing.JButton btnlimpiareliminar;
    private javax.swing.JButton btnlimpiarguardar;
    private javax.swing.JButton btnlimpiarmodificar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JToggleButton btnregresarbuscar;
    private javax.swing.JButton btnregresareliminar;
    private javax.swing.JButton btnregresarguardar;
    private javax.swing.JButton btnregresarmodificar;
    private javax.swing.JComboBox<String> combobuscar;
    private javax.swing.JComboBox<String> comboeliminar;
    private javax.swing.JComboBox<String> combomodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtdescripcionbuscar;
    private javax.swing.JTextField txtdescripcionguardar;
    private javax.swing.JTextField txtdescripcionmodificar;
    private javax.swing.JTextField txtidbuscar;
    private javax.swing.JTextField txtnombrebuscar1;
    private javax.swing.JTextField txtnombreguadar;
    private javax.swing.JTextField txtnombremodificar;
    // End of variables declaration//GEN-END:variables
}
