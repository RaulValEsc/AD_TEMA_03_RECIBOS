/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Ctrl_BD;
import Modelo.FormaPago;
import Modelo.Prestamo;
import Modelo.Recibo;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raulv
 */
public class VMain extends javax.swing.JFrame {

    DefaultTableModel modeloPrestamo, modeloRecibo;
    Ctrl_BD con;
    List<Prestamo> listaPrestamos;
    List<FormaPago> listaFPago;

    /**
     * Creates new form VMain
     */
    public VMain() {
        con = new Ctrl_BD();
        initComponents();
        listaFPago = con.cargarFormasPago();
        listaPrestamos = con.cargarPrestamos();
        modeloPrestamo = (DefaultTableModel) tPrestamos.getModel();
        modeloRecibo = (DefaultTableModel) tRecibos.getModel();
        mostrarFormasPago();
        mostrarPrestamos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tPrestamos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tRecibos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        etNPrestamo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbFormaDePago = new javax.swing.JComboBox<>();
        etFecha = new javax.swing.JFormattedTextField();
        bPagar = new javax.swing.JButton();
        etImporte = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        bmCrear = new javax.swing.JMenu();
        bmBorrar = new javax.swing.JMenu();
        bmModificar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de préstamos");
        setResizable(false);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tPrestamos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tPrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº Prestamo", "Fecha", "Importe", "Importe Pagado", "Forma de Pago"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tPrestamos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tPrestamos.getTableHeader().setReorderingAllowed(false);
        tPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tPrestamosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tPrestamos);
        tPrestamos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tPrestamos.getColumnModel().getColumnCount() > 0) {
            tPrestamos.getColumnModel().getColumn(0).setResizable(false);
            tPrestamos.getColumnModel().getColumn(1).setResizable(false);
            tPrestamos.getColumnModel().getColumn(2).setResizable(false);
            tPrestamos.getColumnModel().getColumn(3).setResizable(false);
            tPrestamos.getColumnModel().getColumn(4).setResizable(false);
        }

        tRecibos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº Recibo", "Fecha", "Importe", "Fecha de pago"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tRecibos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tRecibos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tRecibos);
        if (tRecibos.getColumnModel().getColumnCount() > 0) {
            tRecibos.getColumnModel().getColumn(0).setResizable(false);
            tRecibos.getColumnModel().getColumn(1).setResizable(false);
            tRecibos.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel1.setText("Recibos");

        jLabel2.setText("Préstamos");

        jLabel3.setText("Nº Prestamo");

        jLabel4.setText("Fecha");

        jLabel5.setText("Importe");

        etNPrestamo.setEditable(false);
        etNPrestamo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        etNPrestamo.setEnabled(false);

        jLabel6.setText("Forma de pago");

        cbFormaDePago.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        etFecha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        etFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        etFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                etFechaKeyTyped(evt);
            }
        });

        bPagar.setText("Pagar");
        bPagar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPagarActionPerformed(evt);
            }
        });

        etImporte.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        etImporte.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        etImporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                etImporteKeyTyped(evt);
            }
        });

        bmCrear.setText("Crear");
        bmCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmCrearActionPerformed(evt);
            }
        });
        jMenuBar1.add(bmCrear);

        bmBorrar.setText("Borrar");
        bmBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmBorrarActionPerformed(evt);
            }
        });
        jMenuBar1.add(bmBorrar);

        bmModificar.setText("Modificar");
        bmModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmModificarActionPerformed(evt);
            }
        });
        jMenuBar1.add(bmModificar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etFecha)
                            .addComponent(cbFormaDePago, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etNPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(etImporte))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(etNPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(etFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(etImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbFormaDePago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(bPagar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bmCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bmCrearActionPerformed

    private void bmBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmBorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bmBorrarActionPerformed

    private void bmModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bmModificarActionPerformed

    private void etImporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_etImporteKeyTyped
        char num = evt.getKeyChar();
        if (!Character.isDigit(num) && evt.getKeyChar() != KeyEvent.VK_BACK_SPACE && evt.getKeyChar() != KeyEvent.VK_COMMA) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_etImporteKeyTyped

    private void etFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_etFechaKeyTyped
        char dig = evt.getKeyChar();
        if (!Character.isDigit(dig) && evt.getKeyChar() != KeyEvent.VK_SLASH && evt.getKeyChar() != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_etFechaKeyTyped

    private void tPrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tPrestamosMouseClicked
        if (tPrestamos.getSelectedRow() != -1) {
            mostrarRecibos((Prestamo) tPrestamos.getValueAt(tPrestamos.getSelectedRow(), 0));
        }
    }//GEN-LAST:event_tPrestamosMouseClicked

    private void bPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPagarActionPerformed
        if (tRecibos.getSelectedRow() != -1) {
            Recibo r = (Recibo) tRecibos.getValueAt(tRecibos.getSelectedRow(), 0);
            if (r.getFechaPagado() == null) {
                Date date = new Date(System.currentTimeMillis());
                r.setFechaPagado(date);
                Prestamo p = r.getPrestamo();
                if (!p.getRecibos().isEmpty()) {
                    Iterator i = p.getRecibos().iterator();
                    while (i.hasNext()) {
                        Recibo r1 = (Recibo) i.next();
                        if(r1.getId()==r.getId()){
                            p.getRecibos().remove(r1);
                            p.getRecibos().add(r);
                            BigDecimal total = new BigDecimal(Double.parseDouble(p.getImportePagado().toString()));
                            BigDecimal bd1 = new BigDecimal(Double.parseDouble(r.getImporte().toString()));
                            total = total.add(bd1);
                            p.setImportePagado(total);
                            break;
                        }
                    }
                }
                con.modificarPrestamo(p);
                for(Prestamo p1 : listaPrestamos){
                    if(p1.getNPrestamo()==p.getNPrestamo()){
                        listaPrestamos.remove(p1);
                        listaPrestamos.add(p);
                    }
                }
                mostrarPrestamos();
                mostrarRecibos(p);
            } else {
                getToolkit().beep();
                JOptionPane.showMessageDialog(this, "Este recibo ya se encuentra pagado", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Selecciona un Recibo en la tabla", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bPagarActionPerformed

    private void mostrarPrestamos() {
        modeloPrestamo.setRowCount(0);
        for (Prestamo p : listaPrestamos) {
            Object[] fila = new Object[5];
            fila[0] = p;
            SimpleDateFormat formatter= new SimpleDateFormat("yyyy/MM/dd");
            fila[1] = formatter.format(p.getFecha());
            fila[2] = p.getImporte();
            fila[3] = p.getImportePagado();
            fila[4] = p.getFormaPago().getCodigo();

            modeloPrestamo.addRow(fila);
        }
    }

    private void mostrarRecibos(Prestamo p) {
        modeloRecibo.setRowCount(0);
        if (!p.getRecibos().isEmpty()) {
            Iterator i = p.getRecibos().iterator();
            while (i.hasNext()) {
                Recibo r = (Recibo) i.next();
                Object[] fila = new Object[4];
                fila[0] = r;
                SimpleDateFormat formatter= new SimpleDateFormat("yyyy/MM/dd");
                fila[1] = formatter.format(r.getFecha());
                fila[2] = r.getImporte();
                fila[3] = r.getFechaPagado();
                modeloRecibo.addRow(fila);
            }
        }
    }

    private void mostrarFormasPago() {
        cbFormaDePago.removeAllItems();
        for (FormaPago fp : listaFPago) {
            cbFormaDePago.addItem(fp);
        }
    }

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
            java.util.logging.Logger.getLogger(VMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bPagar;
    private javax.swing.JMenu bmBorrar;
    private javax.swing.JMenu bmCrear;
    private javax.swing.JMenu bmModificar;
    private javax.swing.JComboBox<FormaPago> cbFormaDePago;
    private javax.swing.JFormattedTextField etFecha;
    private javax.swing.JFormattedTextField etImporte;
    private javax.swing.JTextField etNPrestamo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tPrestamos;
    private javax.swing.JTable tRecibos;
    // End of variables declaration//GEN-END:variables
}
