
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
CUANDO QUIERAS HACER UNA ACTUALIZACION DESPUES DE HABER HECHO MODIFICACIONES COMO AHORITA CON UN 
SIMPLE COMENTARIO HACES LO SIGUIENTE*/

/**
 *
 * @author abril
 */
public class Incapacidad extends javax.swing.JFrame {
    String rfc, derechoh;
    /**
     * Creates new form Incapacidad
     */
    public Incapacidad() {
        initComponents();
        this.setSize(992, 700);
        txtrfc.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
    }

    public void setRFCMed(String rfc){
         this.rfc=rfc;
        txtRFCMed.setText(rfc);
    }
    
    public void setRFCDerech(String derechoh){
        this.derechoh=derechoh;
        txtrfc.setText(rfc);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDiag = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtUM = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cmbMot = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        cmbServicio = new javax.swing.JComboBox();
        txtDia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMedico = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtrfc = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtRFCMed = new javax.swing.JTextField();
        cmbAno1 = new javax.swing.JComboBox();
        cmbMes1 = new javax.swing.JComboBox();
        cmbDia1 = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtFeini = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("Crear PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 650, 140, 50);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1459970446_button_cancel.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(510, 650, 140, 50);

        jLabel1.setText("Serie No.");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(26, 175, 80, 17);

        txtSerie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSerieMouseClicked(evt);
            }
        });
        getContentPane().add(txtSerie);
        txtSerie.setBounds(110, 170, 191, 27);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 236, 771, 22);

        jLabel4.setText("Unidad Médica");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 300, 190, 17);

        jLabel6.setText("Apellido");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(420, 320, 80, 17);

        jLabel7.setText("Nombre(s)");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(420, 260, 90, 17);
        getContentPane().add(txtName);
        txtName.setBounds(530, 250, 240, 27);

        jLabel8.setText("Fecha de Fin");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(780, 360, 110, 17);
        getContentPane().add(txtArea);
        txtArea.setBounds(140, 340, 240, 27);

        jLabel9.setText("Area");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 350, 100, 17);
        getContentPane().add(txtAp);
        txtAp.setBounds(510, 310, 240, 27);

        jLabel10.setText("Diagnostico");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 400, 90, 17);
        getContentPane().add(txtDiag);
        txtDiag.setBounds(140, 390, 240, 27);

        jLabel11.setText("Fecha de  Inicio");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(430, 360, 120, 17);
        getContentPane().add(txtUM);
        txtUM.setBounds(140, 300, 240, 27);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 450, 950, 10);

        jLabel12.setText("Días Otorgados ");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(400, 480, 120, 17);

        jLabel13.setText("Motivos ");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(30, 520, 110, 17);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/issste_login.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 20, 470, 140);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono-SIH-ISSSTEico1_phixr1.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(770, 110, 190, 220);

        jLabel18.setText("Año");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(730, 390, 57, 17);

        jLabel19.setText("Mes");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(810, 390, 29, 17);

        jLabel20.setText("Día");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(880, 390, 57, 17);

        cmbMot.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Motivo", "Riesgo de Trabajo", "Enfermedad Gral", "Maternidad" }));
        getContentPane().add(cmbMot);
        cmbMot.setBounds(160, 520, 230, 27);

        jLabel21.setText("Tipo de Incapacidad");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(410, 520, 136, 17);

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione el tipo", "Incapacidad Temporal", "Incapacidad Permanente Parcial", "Incapacidad Permanente Total", "Muerte" }));
        cmbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbTipo);
        cmbTipo.setBounds(560, 520, 200, 27);

        jLabel22.setText("Servicio Otorgado");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(20, 610, 130, 17);

        cmbServicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Consulta Externa", "Hospitalizacion", "Urgencias" }));
        getContentPane().add(cmbServicio);
        cmbServicio.setBounds(160, 600, 230, 27);

        txtDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaActionPerformed(evt);
            }
        });
        getContentPane().add(txtDia);
        txtDia.setBounds(550, 470, 210, 27);

        jLabel3.setText("Médico que Expide");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 560, 140, 17);
        getContentPane().add(txtMedico);
        txtMedico.setBounds(160, 560, 230, 27);

        jLabel14.setText("RFC");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(20, 260, 26, 17);

        txtrfc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrfcKeyTyped(evt);
            }
        });
        getContentPane().add(txtrfc);
        txtrfc.setBounds(140, 260, 240, 27);

        jLabel23.setText("RFC");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(420, 570, 26, 17);

        txtRFCMed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRFCMedMouseClicked(evt);
            }
        });
        txtRFCMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRFCMedActionPerformed(evt);
            }
        });
        getContentPane().add(txtRFCMed);
        txtRFCMed.setBounds(560, 570, 210, 27);

        cmbAno1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Año", "2016" }));
        getContentPane().add(cmbAno1);
        cmbAno1.setBounds(680, 420, 69, 27);

        cmbMes1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        getContentPane().add(cmbMes1);
        cmbMes1.setBounds(760, 420, 80, 27);

        cmbDia1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cmbDia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDia1ActionPerformed(evt);
            }
        });
        getContentPane().add(cmbDia1);
        cmbDia1.setBounds(860, 420, 79, 27);

        jLabel24.setText("Detalle de Incapacidad");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(30, 470, 180, 17);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/banner.png"))); // NOI18N
        getContentPane().add(jLabel25);
        jLabel25.setBounds(500, 20, 410, 80);

        jLabel26.setText("Fecha");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(420, 170, 42, 17);

        txtFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFechaMouseClicked(evt);
            }
        });
        getContentPane().add(txtFecha);
        txtFecha.setBounds(500, 160, 220, 27);

        txtFeini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFeiniMouseClicked(evt);
            }
        });
        getContentPane().add(txtFeini);
        txtFeini.setBounds(420, 407, 150, 30);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1460672739_floppy_disk_save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(360, 650, 130, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Document documento = new Document();
         try{
         FileOutputStream ficheroPdf = new FileOutputStream("C:\\users\\incapacidad.pdf");
         PdfWriter writer = PdfWriter.getInstance(documento, ficheroPdf);
          
         documento.open();
         Image imagen = Image.getInstance("/home/abril/Documentos/sih-issste/src/issste_login.png");
         imagen.scalePercent(70);
         documento.add(imagen);
         Image imagene = Image.getInstance("/home/abril/Documentos/sih-issste/src/Recursos/recuadro.png");
         imagene.setAbsolutePosition(50, 230);
         imagene.scalePercent(20);
         documento.add(imagene);
         Image i=Image.getInstance("/home/abril/Documentos/sih-issste/src/Recursos/linea.jpg");
         i.setAbsolutePosition(300, 10);
         i.scalePercent(35);
         documento.add(i);
         PdfContentByte cb= writer.getDirectContent();
          BaseFont bf= BaseFont.createFont(BaseFont.COURIER, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);
          cb.setFontAndSize(bf, 12);
          cb.beginText();
         
          cb.setTextMatrix(50, 700);
          cb.showText("No. Incapacidad: "+ txtSerie.getText());
          cb.setTextMatrix(50, 600);
          cb.showText("Clinica: " + txtUM.getText());
          cb.setTextMatrix(50, 540);
          cb.showText("Apellido: " + txtAp.getText());
          cb.setTextMatrix(300, 540);
          cb.showText("Nombre: " +txtName.getText());
          cb.setTextMatrix(50, 570);
          cb.showText("Area de Trabajo: "+ txtArea.getText());
          cb.setTextMatrix(300, 570);
          cb.showText("Tipo de Incapacidad: "+ cmbTipo.getSelectedItem());
          cb.setTextMatrix(50, 510);
          cb.showText("Motivo: " + cmbMot.getSelectedItem());
          cb.setTextMatrix(300, 510);
          cb.showText("RFC: " + txtrfc.getText());
          cb.setTextMatrix(50, 480);
          cb.showText("Dias Otorgados: " + txtDia.getText());
          cb.setTextMatrix(50, 450);
          cb.showText("Fecha Inicio: "+ txtFeini.getText());
          cb.setTextMatrix(300, 450);
          cb.showText("Fecha Final: "+ cmbAno1.getSelectedItem() + "/"+ cmbMes1.getSelectedItem()+
                  "/"+cmbDia1.getSelectedItem());
          cb.setTextMatrix(300,700);
          cb.showText("Fecha Actual: "+txtFecha.getText());
          cb.setTextMatrix(300, 420);
          cb.showText("Servicio Otorgado: "+ cmbServicio.getSelectedItem());
          cb.setTextMatrix(50,420);
          cb.showText("Diagnostico: ");
          cb.setTextMatrix(80, 390);
          cb.showText(txtDiag.getText());
          cb.setTextMatrix(300, 30);
          cb.showText("Expide: "  + txtMedico.getText());
         
          cb.endText();
         documento.close();
         
         }catch(FileNotFoundException e){
             Logger.getLogger(Incapacidad.class.getName()).log(Level.SEVERE, null, e); 
         } catch (DocumentException ex) {
            Logger.getLogger(Incapacidad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Incapacidad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
      
    private boolean validarFecha1(){
        int mes= cmbMes1.getSelectedIndex();

        if(cmbMes1.getSelectedIndex()== 2 && cmbDia1.getSelectedIndex() > 28){
        return false;
}if(cmbMes1.getSelectedIndex()== 4 && cmbDia1.getSelectedIndex()== 31){
    return false;
}if(cmbMes1.getSelectedIndex()==  9 && cmbDia1.getSelectedIndex()==31){
    return false;
}if(cmbMes1.getSelectedIndex()== 11 && cmbDia1.getSelectedIndex()==31){
    return false;
}if(cmbMes1.getSelectedIndex()== 6 && cmbDia1.getSelectedIndex()== 31){
    return false;
}
  return true;
    }  
        
    private void txtRFCMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRFCMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRFCMedActionPerformed

    private void cmbDia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDia1ActionPerformed
      if(validarFecha1()==false){
     cmbAno1.setSelectedIndex(0);
    cmbMes1.setSelectedIndex(0);
    cmbDia1.setSelectedIndex(0);
    JOptionPane.showMessageDialog(this, "La fecha no es válida");
      }
    }//GEN-LAST:event_cmbDia1ActionPerformed

    private void txtFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaMouseClicked
        Calendar c1 = Calendar.getInstance();
        int an=(c1.get(Calendar.YEAR));
        int mes=c1.get(Calendar.MONTH)+1;
        int dia= c1.get(Calendar.DAY_OF_MONTH);
        txtFecha.setText(an +"-"+ mes +"-" +dia);
    }//GEN-LAST:event_txtFechaMouseClicked

    private void txtFeiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFeiniMouseClicked
        Calendar a = Calendar.getInstance();
        int an=(a.get(Calendar.YEAR));
        int mes=a.get(Calendar.MONTH)+1;
        int dia= a.get(Calendar.DAY_OF_MONTH);
        txtFeini.setText(an +"-"+ mes +"-" +dia);
    }//GEN-LAST:event_txtFeiniMouseClicked

    private void txtSerieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSerieMouseClicked
      
    }//GEN-LAST:event_txtSerieMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaActionPerformed

    private void cmbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoActionPerformed

    private void txtRFCMedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRFCMedMouseClicked
       txtRFCMed.setText(rfc);
    }//GEN-LAST:event_txtRFCMedMouseClicked

    private void txtrfcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrfcKeyTyped
        String a= txtrfc.getText();
        if (a.length()==13){
            Connection miCon = (new Conexion_BD()).conexion();
        if(miCon!=null){
            try{
                Statement stmt = miCon.createStatement();
                String sql = "select * from Derechohabiente where RFC_Derechoh='"+a+"'";//
                ResultSet r=stmt.executeQuery(sql);
                if(r.next()){
                    txtName.setText(r.getString("Nombre_Derechoh"));
                    txtAp.setText(r.getString("APaterno_Derechoh")+" "+r.getString("AMaterno_Derechoh"));
                    int id=r.getInt("id_Clinica");
                    sql="select * from Clinica where id_Clinica='"+id+"'";
                    r=stmt.executeQuery(sql);
                    if(r.next()){
                        txtUM.setText(r.getString("Nombre_Clinica"));
                    }//DEJA QUE CARGUE LA CONEXX
                }
                if(!txtRFCMed.getText().equals(null)){
                    sql="select * from Personal where RFC_Personal='"+txtRFCMed.getText()+"'";
                    r=stmt.executeQuery(sql);
                    if(r.next()){
                        txtMedico.setText(r.getString("Nombre_Personal")+" "+r.getString("APaterno_Personal"));
                    }
                //243 306 950
                }
                miCon.close();//SI, SE SUPONE QUE PARA ESO SON :S SI LO OCUPAS DE PERSONAL NADA MAS
                        
            }catch(Exception e){
        
                JOptionPane.showMessageDialog(null, "Error: "+e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            
        }
        else{
            txtName.setText("");
            txtAp.setText("");
        }
        
            
    }//GEN-LAST:event_txtrfcKeyTyped

    public boolean guardar(){
          Connection miCon = (new Conexion_BD()).conexion();
        if(miCon!=null){
            try{
               Statement stmt = miCon.createStatement();
        String sql = "insert into Incapacidad(id_Incapacidades, EstadoInc_Incapacidades, FechaIni_Incapacidades, DiasInc_Incapacidades, id_TipoIncapacidades,id_HistorialClinico) values('"+
                txtSerie.getText()+"','A', '"+txtFeini.getText()+"', '"+txtDia.getText()+"', '"+
                cmbTipo.getSelectedIndex()+"') where id_HistorialClinico =  ;";
               stmt.executeUpdate(sql);
                         miCon.close();
                        return true;//JOpti onPane.showMessageDialog(null, "Actualizado");
            }catch(Exception e){
        return false;
//JOptionPane.showMessageDialog(null, "Error: "+e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return true;
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
            java.util.logging.Logger.getLogger(Incapacidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Incapacidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Incapacidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Incapacidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Incapacidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox cmbAno1;
    private javax.swing.JComboBox cmbDia1;
    private javax.swing.JComboBox cmbMes1;
    private javax.swing.JComboBox cmbMot;
    private javax.swing.JComboBox cmbServicio;
    private javax.swing.JComboBox cmbTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtAp;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtDiag;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFeini;
    private javax.swing.JTextField txtMedico;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRFCMed;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtUM;
    private javax.swing.JTextField txtrfc;
    // End of variables declaration//GEN-END:variables
}
