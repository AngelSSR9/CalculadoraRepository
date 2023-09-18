public class AnswerCommand extends Command{

    public AnswerCommand(Aplicacion app) {
        super(app);
    }

    @Override
    void execute() {
        app.txtNumero1.setText(app.memory.devolverRespuesta().devolver());
        app.txtNumero2.setText("");
        app.txtResultado.setText("");
    }
    
}
