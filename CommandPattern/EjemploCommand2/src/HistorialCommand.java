
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HistorialCommand extends Command{
    
    public HistorialCommand(Aplicacion app) {
        super(app);
    }

    private String obtenerHistorial(){
        
        String historial = "<html>";
        for(Command command : app.memory.getMemories()){
           
            if(command instanceof SumarCommand){
                
                historial += command.numero1 + " + " + command.numero2 + " = " + command.devolver() + "<br><br>";
            }
            else if(command instanceof RestarCommand){
                historial += command.numero1 + " - " + command.numero2 + " = " + command.devolver() + "<br><br>";
            }
            
            
        }
        
        return historial + "</html>";
    }
    
    @Override
    void execute() {
        app.frame = new JFrame("Historial");
        app.label = new JLabel();
        app.label.setSize(new Dimension(200,300));
        app.label.setFont(new Font("Segoe UI", 0, 16));
        app.label.setText(obtenerHistorial());
        app.panel = new JPanel();
        app.panel.add(app.label);
        app.frame.setSize(new Dimension(400,400));
        app.frame.setContentPane(app.panel);
        app.frame.setLocationRelativeTo(null);
        app.frame.setVisible(true);
    }
    
}
