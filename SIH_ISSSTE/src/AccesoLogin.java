
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class AccesoLogin {
  private String usuario, password;
  
  public AccesoLogin(){
      
  }
  
  public AccesoLogin(String rfc, String pass){
      setUsuario(rfc);
      setPass(pass);
      usuario=rfc;
      password=pass;
  }
  
  public String getUsuario(){
      return usuario;
  }
  
  public void setUsuario(String usuario){
      this.usuario=usuario;
  }
    
  public String getPass(){
      return password;
  }
  
  public void setPass(String password){
      this.password=password;
  }
  
  public boolean conectar(){
      Connection miCon = (new Conexion_BD()).conexion();
        if(miCon!=null){
            try{
               Statement stmt = miCon.createStatement();
        String sql = "select * from Personal where RFC_Personal ='"+usuario+"' and Password_Personal = '" +password +"'"; 
        ResultSet r = stmt.executeQuery(sql);//consultas regresa algo executeUpdate
                    if(r.next()==true){
                        if(usuario.equals(password)){
                            CambiarContra c= new CambiarContra();
                            c.setVisible(true);
                            c.setUsuario(usuario);
                            return true;
                        }else{
                        if(r.getString("id_Puesto").equals("1")){//diferentes if para diferentes puestos de usuario :v
                         Administrador repers=new Administrador();
                            repers.setVisible(true);
                         
                        }
                         if(r.getString("id_Puesto").equals("2")){
                          VentanaDoctor vd=new VentanaDoctor();
                            vd.setRFCMed(usuario);
                             vd.setVisible(true);
                          
                         }
                         if(r.getString("id_Puesto").equals("3")){
                             MenuEnfermera rs=new MenuEnfermera();
                             rs.setVisible(true);
                         }
                         if(r.getString("id_Puesto").equals("4")){
                             VentanaLaboratorista vl=new VentanaLaboratorista();
                             vl.setVisible(true);
                         }
                         if(r.getString("id_Puesto").equals("5")){
                             VentanaFarmacologo vf=new VentanaFarmacologo();
                             vf.setVisible(true);
                         }
                         miCon.close();
                         return true;
                        }}
                       else{
                           //JOptionPane.showMessageDialog(null,"Su RFC o su contraseña no es valida"); 
                        miCon.close();
                        return false;
                }
                
            }
            catch(Exception e){
               // JOptionPane.showMessageDialog(null, "Error: "+e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            
        }
     return false;  
  }
  
  public boolean cambiarContra(){
      Connection miCon = (new Conexion_BD()).conexion();
      if(miCon!=null){
          try{
              Statement stmt = miCon.createStatement();
              
              String sql= "Update `sihissste_db`.`Personal` set Password_Personal = '"+password+"' where RFC_Personal = '"+usuario+"';";
            int a=stmt.executeUpdate(sql);
            
            /*if(a>0){
                accesOtraContra();
            }
            else{
                return false;
            }*/
          }catch(Exception e){
              
          }
      }
      return true;
  }
  
  public void accesOtraContra(){
       Connection miCon = (new Conexion_BD()).conexion();
      if(miCon!=null){
          try{
              Statement stmt = miCon.createStatement();
              
              String sql= "select * from `sihissste_db`.`Personal` where RFC_Personal='"+usuario+"';";
              ResultSet r=stmt.executeQuery(sql);
              if(r.next()==true){
                  if(r.getString("id_Puesto").equals("1")){
                      Administrador a= new Administrador();
                      a.setVisible(true);
                     
                  } 
                if(r.getString("id_Puesto").equals("2")){
                    VentanaDoctor vd=new VentanaDoctor();
                    vd.setVisible(true);
                }
                if(r.getString("id_Puesto").equals("3")){
                    RegistroSignos rs=new RegistroSignos();
                    rs.setVisible(true);
                }if(r.getString("id_Puesto").equals("4")){
                             VentanaLaboratorista vl=new VentanaLaboratorista();
                             vl.setVisible(true);
                         }
                         if(r.getString("id_Puesto").equals("5")){
                             VentanaFarmacologo vf=new VentanaFarmacologo();
                             vf.setVisible(true);
                         }
              }
              
  }catch(Exception e){
      
  }
    }
  }
}
