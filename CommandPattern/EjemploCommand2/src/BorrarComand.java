public class BorrarComand extends Command{

    public BorrarComand(Aplicacion app) {
        super(app);
    }

    @Override
    public void execute() {
        app.txtNumero2.setText("");
        app.txtNumero1.setText("");
        app.txtResultado.setText("");
    }
    
}
