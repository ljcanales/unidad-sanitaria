package ui;

import javax.swing.JOptionPane;
import dao.MedicamentoDAO;
import dao.PresentacionDAO;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.List;
import model.Medicamento;
import model.Presentacion;
import util.DateUtil;

public class AddMedFrame extends javax.swing.JFrame {
    
    public AddMedFrame() {
        initComponents();
        loadPresentaciones();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nombreLabel = new javax.swing.JLabel();
        stockLabel = new javax.swing.JLabel();
        fechaVLabel = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        stockTextField = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        selectFechaV = new com.toedter.calendar.JDateChooser();
        laboratorioLabel = new javax.swing.JLabel();
        laboratorioTextField = new javax.swing.JTextField();
        dosisLabel = new javax.swing.JLabel();
        presentacionComboBox = new javax.swing.JComboBox<>();
        dosisTextField = new javax.swing.JTextField();
        presentacionLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setName("addFrame"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        nombreLabel.setBackground(new java.awt.Color(0, 0, 0));
        nombreLabel.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        nombreLabel.setText("Nombre: *");

        stockLabel.setBackground(new java.awt.Color(0, 0, 0));
        stockLabel.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        stockLabel.setText("Stock: *");

        fechaVLabel.setBackground(new java.awt.Color(0, 0, 0));
        fechaVLabel.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        fechaVLabel.setText("Fecha de Vencimiento: *");

        stockTextField.setText("0");

        addBtn.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        addBtn.setText("Agregar");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        cancelarButton.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        cancelarButton.setText("Cerrar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        selectFechaV.setBackground(new java.awt.Color(255, 255, 204));

        laboratorioLabel.setBackground(new java.awt.Color(0, 0, 0));
        laboratorioLabel.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        laboratorioLabel.setText("Laboratorio:");

        dosisLabel.setBackground(new java.awt.Color(0, 0, 0));
        dosisLabel.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        dosisLabel.setText("Dosis:");

        presentacionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        presentacionLabel.setBackground(new java.awt.Color(0, 0, 0));
        presentacionLabel.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        presentacionLabel.setText("Presentación:");

        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(nombreLabel)
                    .addComponent(stockLabel)
                    .addComponent(fechaVLabel)
                    .addComponent(dosisLabel)
                    .addComponent(presentacionLabel)
                    .addComponent(laboratorioLabel))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(nombreTextField)
                            .addComponent(stockTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectFechaV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(laboratorioTextField))
                        .addGap(181, 181, 181))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(presentacionComboBox, 0, 223, Short.MAX_VALUE)
                            .addComponent(dosisTextField))
                        .addGap(19, 19, 19)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addBtn)
                .addGap(39, 39, 39)
                .addComponent(cancelarButton)
                .addGap(108, 108, 108))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreLabel))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stockTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockLabel))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaVLabel)
                    .addComponent(selectFechaV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dosisTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dosisLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(presentacionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(presentacionLabel)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laboratorioLabel)
                    .addComponent(laboratorioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarButton)
                    .addComponent(addBtn))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        selectFechaV.setCalendar(new GregorianCalendar());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Evento para agregar un medicamento.
     */
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String nombre = nombreTextField.getText();
        int stock = 0;
        try {
            stock = Integer.parseInt(stockTextField.getText());
        } catch(Exception e) {
            stock= -1;
        }

        SimpleDateFormat fechaFormato = new SimpleDateFormat("yyyy-MM-dd");
        String fechaVencimiento = fechaFormato.format(selectFechaV.getDate());

        String laboratorio = laboratorioTextField.getText();
        String dosis = dosisTextField.getText();
        Presentacion presentacion = presentaciones.get(presentacionComboBox.getSelectedIndex());

        if (!nombre.equals("") && !fechaVencimiento.equals("")) {
            MedicamentoDAO medDAO = new MedicamentoDAO();
            Medicamento med = new Medicamento();

            med.setNombre(nombre);
            med.setStock(stock);
            med.setFechaVencimiento(fechaVencimiento);
            med.setLaboratorio(laboratorio);
            med.setDosis(dosis);
            med.setPresentacion(presentacion.getNombre());
            med.setId_presentacion(presentacion.getId());

            if (!medDAO.exists(med)) {
                if (DateUtil.greaterThanCrntDate(selectFechaV.getDate())) {
                    if (stock >=0) {
                        medDAO.insert(med);
                        JOptionPane.showMessageDialog(
                                this,
                                "¡El medicamento se ha guardado exitosamente!",
                                "Éxito",
                                JOptionPane.INFORMATION_MESSAGE
                        );
                        
                        volverMain();
                    } else {
                        JOptionPane.showMessageDialog(
                        this,
                        "El stock ingresado es invalido.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                        );
                        stockTextField.setText("0");
                    }  
                } else {
                    JOptionPane.showMessageDialog(
                            this,
                            "El medicamento ingresado esta vencido.", 
                            "Error",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                }
            } else {
                JOptionPane.showMessageDialog(
                        this,
                        "¡Ya existe un medicamento con el mismo nombre y presentación!",
                        "Error",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "¡Los campos Nombre y/o Fecha de vencimiento están vacíos o son invalidos!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_addBtnActionPerformed

    /**
     * Evento para cerrar la ventana.
     */
    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        volverMain();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    /**
     * vuelve a la pagina principal
     *
     * @return {@code void}.
     */
    private void volverMain() {
        this.dispose();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombre = JOptionPane.showInputDialog(
                this, 
                "Ingrese nueva presentación:", 
                "Agregar Presentación", 
                JOptionPane.INFORMATION_MESSAGE
        );
        
        if(!nombre.isEmpty()) {
            Presentacion newPresentacion = new Presentacion();
            PresentacionDAO pDAO = new PresentacionDAO();

            newPresentacion.setNombre(nombre);
            pDAO.insert(newPresentacion);

            loadPresentaciones();
            presentacionComboBox.setSelectedItem(nombre);
        }
        else {
            JOptionPane.showMessageDialog(
                    this,
                    "¡La presentación ingresada no es valida!",
                    "Advertencia",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Carga presentaciones desde BD.
     *
     * @return {@code void}.
     */
    private void loadPresentaciones() {
        PresentacionDAO pDAO = new PresentacionDAO();
        presentaciones = pDAO.selectAll();
        String[] itemsList = new String[presentaciones.size()];

        int index = 0;
        for (Presentacion p : presentaciones) {
            itemsList[index] = (String) p.getNombre();
            index++;
        }

        presentacionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(itemsList));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JLabel dosisLabel;
    private javax.swing.JTextField dosisTextField;
    private javax.swing.JLabel fechaVLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel laboratorioLabel;
    private javax.swing.JTextField laboratorioTextField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JComboBox<String> presentacionComboBox;
    private javax.swing.JLabel presentacionLabel;
    private com.toedter.calendar.JDateChooser selectFechaV;
    private javax.swing.JLabel stockLabel;
    private javax.swing.JTextField stockTextField;
    // End of variables declaration//GEN-END:variables
    private List<Presentacion> presentaciones;
}
