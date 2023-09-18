public class SumarCommand extends Command {
    
    public SumarCommand(Aplicacion app) {
        super(app);
    }

    @Override
    public void execute() {

        if (!app.txtNumero1.getText().isEmpty() && !app.txtNumero2.getText().isEmpty()) {
            double a = Double.parseDouble(app.txtNumero1.getText());
            double b = Double.parseDouble(app.txtNumero2.getText());
            app.txtResultado.setText(String.valueOf(a + b));
            guardar();
        }
    }

}

