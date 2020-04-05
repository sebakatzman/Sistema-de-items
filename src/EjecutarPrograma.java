
import Controlador.ClaseControl;
import Vista.Login;

public class EjecutarPrograma {
    
    public static void main(String[] args) {
        ClaseControl claseControl = new ClaseControl();
        Login programa = new Login(claseControl);
        
        java.awt.EventQueue.invokeLater(() -> {
           programa.setVisible(true);
        });
    }
}
