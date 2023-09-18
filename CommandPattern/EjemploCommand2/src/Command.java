public abstract class Command {
    protected Aplicacion app;
    private String backup;
    protected String numero1;
    protected String numero2;

    public Command(Aplicacion app) {
        this.app = app;
    }
    
    abstract void execute();
    
    void guardar() {
        numero1 = app.txtNumero1.getText();
        numero2 = app.txtNumero2.getText();
        backup = app.txtResultado.getText();
    }
    
    public String devolver() {
        return backup;
    }

    public String getNumero1() {
        return numero1;
    }

    public void setNumero1(String numero1) {
        this.numero1 = numero1;
    }

    public String getNumero2() {
        return numero2;
    }

    public void setNumero2(String numero2) {
        this.numero2 = numero2;
    }
    
}
