
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Conexion_BD{
    
         
    public static Connection conexion()
    {
        Connection con=null;
     
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/sihissste_db", "vmcc", "sih-issste");
            System.out.println("Conexion exitosa");
        }
        catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error1 en la Conexión con la BD "
                    +ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            con=null;
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error2 en la Conexión con la BD "+
                    ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            con=null;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error3 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            con=null;
        }
        finally
        {
            return con;
        }
    }
    
    
    public int obtenerIDClinica(String nombre){
        Connection cn = conexion();
        Statement st;
        ResultSet rs = null;
        String SQL = "SELECT id_Clinica FROM Clinica WHERE Nombre_Clinica = '"+ nombre +"'";  
        try{
            st = cn.createStatement();
            rs = st.executeQuery(SQL);
            
            if(rs.first()){
                return rs.getInt("id_Clinica");
            }else{
                return 0;
            }
            
            
        }catch(SQLException ex){
            System.out.println("Error al obtener id de la clinica: " + ex.getMessage());
            return 0;
        }
        
        
        
    }
   
    public boolean ingresarDerechohabiente(String[] conten){
        Connection cn = conexion();
        String SQL = "INSERT INTO Derechohabiente VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement pst = cn.prepareStatement(SQL);
            
            pst.setString(1, conten[0]);
            pst.setString(2, conten[1]);
            pst.setString(3, conten[2]);
            pst.setString(4, conten[3]);
            pst.setString(5, conten[4]);
            pst.setString(6, conten[5]);
            pst.setInt(7, Integer.parseInt(conten[6]));
            pst.setString(8, conten[7]);
            pst.setString(9, conten[8]);
            pst.setString(10, conten[9]);
            pst.setString(11, conten[10]);
            pst.setString(12, conten[11]);
            
            int n = pst.executeUpdate();
            
            if(n != 0){
               return true;
            }else{
                return false;
            }
            
        }catch(SQLException ex){
            System.out.println(ex);
        }
        
        return false;
    }
    
    
    public ResultSet obtenerRFCDerechohabienteRegistroHijos(String rfcDerechoh){
        Connection cn = conexion();
        Statement st;
        ResultSet rs = null;
        try{
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM Derechohabiente WHERE RFC_Derechoh LIKE '"+ rfcDerechoh +"%'");
        }catch(SQLException ex){
            System.out.println("Error al obtener RFC de derechohabiente: " + ex.getMessage());
        }
        
        return rs;
    }
    
    
    public ResultSet obtenerDatosporIDEstudioLaboratorio(int id){
        Connection cn = conexion();
        Statement st;
        ResultSet rs = null;
        try{
            st = cn.createStatement();
            rs = st.executeQuery("SELECT Caracter_EstuLab, Tipo_EstuLab FROM EstudioLaboratorio WHERE id_EstuLab = " + id +"");
            
        }catch(SQLException ex){
            System.out.println("Error al obtener registro de estudio de laboratorio " + ex.getMessage());
        }
        
        return rs;
    }
    
    public ResultSet obtenerExpedienteClinico(String RFC){
        Connection cn = conexion();
        Statement st;
        ResultSet rs = null;
        try{
            st = cn.createStatement();
            rs = st.executeQuery("SELECT id_ExpedienteClinico FROM ExpedienteClinico WHERE RFC_Derechoh = '" + RFC +"'");
            
        }catch(SQLException ex){
            System.out.println("Error al obtener el expediente clinico " + ex.getMessage());
        }
        
        return rs;
    }
    
    public boolean insertarNuevoAnalisisClinicoDoctor(String fecha, String caracter, String tipo, int numExp){
        try{
            Connection cn = conexion();
            Statement st = cn.createStatement();
            st.executeUpdate("INSERT INTO EstudioLaboratorio (Estado_EstuLab, FechaOrden_EstuLab, Caracter_EstuLab, Tipo_EstuLab, id_ExpedienteClinico) "
                    + "VALUES ('P','" + fecha +"', '"+ caracter +"', '"+ tipo +"', 1)");
            cn.close();
            return true;
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    
    public void prueba(){
        System.out.println("Hola");
        boolean estado = false;
    }
    
    public ResultSet SeleccionarTodoMedicamento(){
        Connection cn = conexion();
        Statement st;
        ResultSet rs = null;
        try{
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM Medicamentos;");
        }catch(SQLException ex){
            System.out.println("Error al llenar la tabla de medicamentos");
        }
        return rs;
    }
    
    public ResultSet buscarPorNombreMedicamento(String cadena){
        Connection cn = conexion();
        Statement st;
        ResultSet rs = null;
        try{
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM Medicamentos WHERE NombreGen_Medicamentos LIKE '"+ cadena +"%'");
        }catch(SQLException ex){
            System.out.println("Error" + ex.getMessage());
        }
        return rs;
    }
    
    
    
    public ResultSet buscarMedicamento(String id){
        Connection cn = conexion();
        Statement st;
        ResultSet rs = null;
        try{
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM Medicamentos WHERE id_Medicamentos = '"+ id +"'");
        }catch(SQLException ex){
            System.out.println("Error al realiza consulta");
        }
        return rs;
    }
    
    
    public int actualizarMedicamentos(String idAct, String nombreAct, String descripAct, int cantAct, String presenAct, int id){
    int resultado = 0;
    String SQL = "UPDATE Medicamentos SET id_Medicamentos = '"+ idAct +"', NombreGen_Medicamentos = '"+ nombreAct +"', Descripcion_Medicamentos = '"+ descripAct +"',Cantidad_Medicamento = "+ cantAct +", Presentacion = '"+ presenAct +"' WHERE id_Medicamento = "+ id +"";
    try{
            Connection cn = conexion();
            Statement comando=cn.createStatement();
            resultado = comando.executeUpdate(SQL);
        }catch(Exception e){}
        
        return resultado;
    }
    
    public int actualizarCantidadMedicamento(int cantidad, String id){
        int resultado = 0;
        String SQL = "UPDATE Medicamentos SET Cantidad_Medicamento = "+ cantidad +" WHERE id_Medicamentos = '"+ id +"'";
        try{
            Connection cn = conexion();
            Statement comando=cn.createStatement();
            resultado = comando.executeUpdate(SQL);
        }catch(Exception e){}
        
        return resultado;
    }
    
    public boolean InsertarMedicamentos(String codigo, String nombre, String descripcion, int cantidad, String presentacion, float precio){
        Connection cn = conexion();
        String SQL = "INSERT INTO Medicamentos VALUES (?,?,?,?,?,?);";
        try{
            PreparedStatement pst = cn.prepareStatement(SQL);
            
            pst.setString(1, codigo);
            pst.setString(2, nombre);
            pst.setString(3, descripcion);
            pst.setInt(4, cantidad);
            pst.setString(5, presentacion);
            pst.setFloat(6, precio);
            
            int n = pst.executeUpdate();
            
            if(n != 0){
               return true;
            }else{
                return false;
            }
            
        }catch(SQLException ex){
            System.out.println(ex);
        }
        
        return false;
    }
}