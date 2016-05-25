
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abril
 */
public class RegistroPersonal extends javax.swing.JFrame {

    /**
     * Creates new form RegistroPacientes
     */
    public RegistroPersonal() {
        initComponents();
        this.setSize(781, 600);
        txtConsultorio.setEnabled(false);
    }

    
    private void verificaCampos(){
        if( txtAP.getText().isEmpty() ||
        txtAM.getText().isEmpty() ||
        txtName.getText().isEmpty() ||
        txtDirec.getText().isEmpty() ||
        cmbHora.getSelectedIndex()==0 ||
        txtEspecialidad.getText().isEmpty() ||
         cmbUser.getSelectedIndex()==0 ||
        cmbUser.getSelectedIndex()==0 || 
        cmbClinica.getSelectedIndex()==0 ||
        cmbArea.getSelectedIndex()==0||
         txtFecha.getText().isEmpty()) {
                   
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor verifique, no debe haber campos vacíos");
        }
    }
    
     
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAM = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDirec = new javax.swing.JTextField();
        txtTelCa = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtEspecialidad = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cmbUser = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtpass = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        cmbClinica = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        icono = new javax.swing.JLabel();
        txtCP = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtTelcel = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtConsultorio = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnConsu = new javax.swing.JButton();
        cmbHora = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        cmbArea = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Registro para el personal");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 0, 171, 29);

        jLabel2.setText("Nombre(s)");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(520, 90, 74, 17);

        txtAP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAPKeyTyped(evt);
            }
        });
        getContentPane().add(txtAP);
        txtAP.setBounds(140, 90, 97, 27);

        jLabel3.setText("Datos Personales");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 50, 121, 17);

        jLabel4.setText("Apellido Paterno");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 90, 115, 17);

        jLabel5.setText("Apellido Materno");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(250, 90, 119, 17);

        txtAM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAMKeyTyped(evt);
            }
        });
        getContentPane().add(txtAM);
        txtAM.setBounds(390, 80, 97, 27);

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        getContentPane().add(txtName);
        txtName.setBounds(630, 80, 97, 27);

        jLabel6.setText("Codigo Postal");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(250, 140, 95, 17);

        jLabel7.setText("Telefono Casa");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(510, 140, 100, 17);

        jLabel8.setText("Direccion");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 130, 76, 27);
        getContentPane().add(txtDirec);
        txtDirec.setBounds(140, 140, 97, 27);

        txtTelCa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelCaKeyTyped(evt);
            }
        });
        getContentPane().add(txtTelCa);
        txtTelCa.setBounds(630, 130, 97, 27);

        jLabel10.setText("Datos Laborales");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(12, 241, 112, 17);

        jLabel11.setText("Horario");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(12, 281, 52, 17);

        jLabel12.setText("Especialidad");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(268, 276, 95, 27);
        getContentPane().add(txtEspecialidad);
        txtEspecialidad.setBounds(407, 276, 97, 27);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1463270672_add.png"))); // NOI18N
        btnGuardar.setText("Registrar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(210, 500, 110, 50);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1460672844_Log Out.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(640, 500, 110, 50);

        jLabel14.setText("Puesto");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(540, 340, 49, 17);

        cmbUser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione el puesto", "Administrador", "Medico", "Enfermera", "Laboratorista", "Encargado deFarmacia" }));
        cmbUser.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbUserItemStateChanged(evt);
            }
        });
        cmbUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmbUserMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbUserMouseClicked(evt);
            }
        });
        cmbUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUserActionPerformed(evt);
            }
        });
        getContentPane().add(cmbUser);
        cmbUser.setBounds(620, 330, 190, 27);

        jLabel15.setText("RFC");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(12, 336, 39, 27);

        txtRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRFCKeyTyped(evt);
            }
        });
        getContentPane().add(txtRFC);
        txtRFC.setBounds(117, 336, 120, 27);

        jLabel16.setText("Password");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(268, 341, 68, 17);

        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpassKeyTyped(evt);
            }
        });
        getContentPane().add(txtpass);
        txtpass.setBounds(407, 336, 105, 27);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 220, 863, 10);

        jLabel9.setText("Clinica");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(12, 398, 45, 17);

        cmbClinica.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "1.-Tepic", "2.-Santiago", "3.-San Blas" }));
        getContentPane().add(cmbClinica);
        cmbClinica.setBounds(139, 393, 115, 27);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1460716647_OK.png"))); // NOI18N
        jButton1.setText("Validar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(80, 500, 110, 50);

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono-SIH-ISSSTEico1_phixr1.png"))); // NOI18N
        getContentPane().add(icono);
        icono.setBounds(310, 210, 200, 190);

        txtCP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCPKeyTyped(evt);
            }
        });
        getContentPane().add(txtCP);
        txtCP.setBounds(400, 140, 90, 27);

        jLabel19.setText("Tel. Celular");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(10, 190, 90, 17);

        txtTelcel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelcelKeyTyped(evt);
            }
        });
        getContentPane().add(txtTelcel);
        txtTelcel.setBounds(140, 190, 100, 27);

        jLabel20.setText("Area");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(280, 400, 57, 17);

        jLabel21.setText("Email(opcional)");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(270, 190, 110, 17);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail);
        txtEmail.setBounds(400, 190, 90, 27);

        jLabel13.setText("Consultorio");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(540, 280, 90, 17);
        getContentPane().add(txtConsultorio);
        txtConsultorio.setBounds(630, 270, 140, 27);

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1463270819_Modify.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar);
        btnModificar.setBounds(500, 500, 120, 50);

        btnConsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1463384354_search.png"))); // NOI18N
        btnConsu.setText("Consultar");
        btnConsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsuActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsu);
        btnConsu.setBounds(350, 500, 130, 50);

        cmbHora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Horario", "M", "V" }));
        getContentPane().add(cmbHora);
        cmbHora.setBounds(120, 280, 130, 27);

        jLabel18.setText("Fecha");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(540, 390, 42, 17);

        txtFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFechaMouseClicked(evt);
            }
        });
        getContentPane().add(txtFecha);
        txtFecha.setBounds(620, 380, 150, 27);

        cmbArea.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione el Area", "1.- Administracion", "2.-Medicina", "3.-Enfermería", "4.- Laboratorio", "5.- Farmacia" }));
        getContentPane().add(cmbArea);
        cmbArea.setBounds(400, 390, 110, 27);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/whynot.jpg"))); // NOI18N
        jLabel17.setText("jLabel17");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(0, 0, 850, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    public void txt(){
        if(cmbUser.getSelectedItem().equals("Medico") || cmbUser.getSelectedItem().equals("Enfermera")){
                txtConsultorio.setEnabled(true);
        }else if(cmbUser.getSelectedIndex()!=2|| cmbUser.getSelectedIndex()!=3){
            txtConsultorio.setEnabled(false);
        }
    }
    
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        TDA_Personal tdap=new TDA_Personal();
        tdap.setApellidoPat(txtAP.getText());
        tdap.setAMaterno(txtAM.getText());
        tdap.setNombre(txtName.getText());
        tdap.setRFC(txtRFC.getText());
        tdap.setDir(txtDirec.getText());
        tdap.setPostalCode(txtCP.getText());
        tdap.setPass(txtpass.getText());
        tdap.setTelefonoCasa(txtTelCa.getText());
        tdap.setEmail(icono.getText());
        tdap.setTelefonoCel(txtTelcel.getText());
        tdap.setHora((String)cmbHora.getSelectedItem());
        tdap.setEspecialidad(txtEspecialidad.getText());
        tdap.setPuesto(cmbUser.getSelectedIndex());
        tdap.setClinica(cmbClinica.getSelectedIndex());
        tdap.setFecha(txtFecha.getText());
        tdap.setArea(cmbArea.getSelectedIndex());
        
        tdap.registrar();
       
        /*Connection miCon = (new Conexion_BD()).conexion();
        if(miCon!=null){
            try{
               Statement stmt = miCon.createStatement();
        String sql = "insert into `Sistema_Informacion`.`Personal`(`RFC_Personal`, `Per_password`, `Per_Telefono`, `Per_Horario`, `Per_Especialidad`, `Per_Consultorio`, `Per_Clínica`, `Per_Nombre`, `Per_Apellido`, `Per_Puesto`)values('"
                +RFC+"', '"+pass+"', '"+telefono+"', '"+Horario+"', '"+Especialidad+"', '"
                +Consultorio+"', '"+clinica+"', '"+Name+"', '"+APaterno+"', '"+puesto+"');";
            stmt.executeUpdate(sql);
                 JOptionPane.showMessageDialog(null, "Registro exitoso");
                          
              miCon.close();
            
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error: "+e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }*/
       
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        verificaCampos();
        //validaString(txtAP.getText()); validaString(txtAM.getText()); validaString(txtName.getText()); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbUserActionPerformed

    private void txtAPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAPKeyTyped
        Character e= evt.getKeyChar();
        if(((e>='0') && (e<= '9'))){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor ingrese solo letras");
        }
    }//GEN-LAST:event_txtAPKeyTyped

    private void txtAMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAMKeyTyped
        Character e= evt.getKeyChar();
        if(((e>='0') && (e<= '9'))){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor ingrese solo letras");
        }
    }//GEN-LAST:event_txtAMKeyTyped

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
       Character e= evt.getKeyChar();
        if(((e>='0') && (e<= '9'))){
            evt.consume();
          JOptionPane.showMessageDialog(this, "Por favor ingrese solo letras");
        }
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtCPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCPKeyTyped
        Character e= evt.getKeyChar();
        if(((e< '0') || (e > '9')) && (e!='\b')){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor ingrese solo números");
        }
    }//GEN-LAST:event_txtCPKeyTyped

    private void txtTelCaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelCaKeyTyped
       Character e= evt.getKeyChar();
       if(txtTelCa.getText().length()==10){
        if(((e< '0') || (e > '9')) && (e!='\b')){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor ingrese solo números");
        }
       }
    }//GEN-LAST:event_txtTelCaKeyTyped

    private void txtTelcelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelcelKeyTyped
        Character e= evt.getKeyChar();
        if(((e< '0') || (e > '9')) && (e!='\b')){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor ingrese solo números");
        }
    }//GEN-LAST:event_txtTelcelKeyTyped

    private void txtRFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRFCKeyTyped
        if(txtRFC.getText().length()==14){
            evt.consume();
        }
    }//GEN-LAST:event_txtRFCKeyTyped

    private void txtpassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyTyped
        int limite = 14; int minimo= 7;
        if((txtpass.getText().length()>minimo) && (txtpass.getText().length()==limite)){
            evt.consume();
        }
    }//GEN-LAST:event_txtpassKeyTyped

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnConsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsuActionPerformed
        consultarPersonal();
    }//GEN-LAST:event_btnConsuActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        TDA_Personal tdap=new TDA_Personal();
        tdap.setApellidoPat(txtAP.getText());
        tdap.setAMaterno(txtAM.getText());
        tdap.setNombre(txtName.getText());
        tdap.setRFC(txtRFC.getText());
        tdap.setDir(txtDirec.getText());
        tdap.setPostalCode(txtCP.getText());
        tdap.setPass(txtpass.getText());
        tdap.setTelefonoCasa(txtTelCa.getText());
        tdap.setEmail(txtEmail.getText());
        tdap.setTelefonoCel(txtTelcel.getText());
        tdap.setHora((String)cmbHora.getSelectedItem());
        tdap.setEspecialidad(txtEspecialidad.getText());
        tdap.setPuesto(cmbUser.getSelectedIndex());
        tdap.setClinica(cmbClinica.getSelectedIndex());
        tdap.setFecha(txtFecha.getText());
        tdap.setArea(cmbArea.getSelectedIndex());
         tdap.modificarPersonal();
        
    }//GEN-LAST:event_btnModificarActionPerformed
    
    private void txtFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaMouseClicked
        Calendar c1 = Calendar.getInstance();
        int an=(c1.get(Calendar.YEAR));
        int mes=c1.get(Calendar.MONTH)+1;
        int dia= c1.get(Calendar.DAY_OF_MONTH);
        txtFecha.setText(an +"-"+ mes +"-" +dia);
    }//GEN-LAST:event_txtFechaMouseClicked

    private void cmbUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbUserMouseClicked
        txt();
    }//GEN-LAST:event_cmbUserMouseClicked

    private void cmbUserMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbUserMouseReleased
        txt();
    }//GEN-LAST:event_cmbUserMouseReleased

    private void cmbUserItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbUserItemStateChanged
        txt();
    }//GEN-LAST:event_cmbUserItemStateChanged
    
     public boolean consultarPersonal(){
        Connection miCon = (new Conexion_BD()).conexion();
        if(miCon!=null){
            try{
               Statement stmt = miCon.createStatement();
        String sql = "select * from Personal where RFC_Personal = '"+(txtRFC.getText())+"';";
        ResultSet r = stmt.executeQuery(sql);
                if(r.next()==true){
                    txtAP.setText(r.getString("APaterno_Personal"));
                    txtAM.setText(r.getString("AMaterno_Personal"));
                    txtName.setText(r.getString("Nombre_Personal"));
                    txtDirec.setText(r.getString("Direccion_Personal"));
                    txtCP.setText(r.getString("CodigoPos_Personal"));
                    txtTelCa.setText(r.getString("TelefonoCasa_Personal"));
                    txtTelcel.setText(r.getString("TelefonoCelular_Personal"));
                    txtEmail.setText(r.getString("CorreoElec_Personal"));
                    cmbHora.setSelectedItem(r.getString("HorarioTrab_Personal"));
                    txtpass.setText(r.getString(("Password_Personal")));
                    txtEspecialidad.setText(r.getString("NomEsp_Personal"));
                    cmbClinica.setSelectedIndex(r.getInt("id_Clinica"));
                    cmbArea.setSelectedIndex(r.getInt("id_AreaT"));
                    cmbUser.setSelectedIndex(r.getInt("id_Puesto"));
                    txtRFC.setEditable(false);
                    cmbUser.setEnabled(false);
                    cmbClinica.setEnabled(false);
                    txtConsultorio.setEnabled(false);
                }miCon.close();
    }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error: "+e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(RegistroPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroPersonal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsu;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cmbArea;
    private javax.swing.JComboBox cmbClinica;
    private javax.swing.JComboBox cmbHora;
    private javax.swing.JComboBox cmbUser;
    private javax.swing.JLabel icono;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtAM;
    private javax.swing.JTextField txtAP;
    private javax.swing.JTextField txtCP;
    private javax.swing.JTextField txtConsultorio;
    private javax.swing.JTextField txtDirec;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtTelCa;
    private javax.swing.JTextField txtTelcel;
    private javax.swing.JTextField txtpass;
    // End of variables declaration//GEN-END:variables
}
