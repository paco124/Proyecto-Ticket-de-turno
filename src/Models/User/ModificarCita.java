package Models.User;


public class ModificarCita extends MAgendar{
    private String curp2;

    public ModificarCita(String curp, String nombre, String paterno, String materno, int telefono, int nivel, String municipio, String asunto, String curp2) {
        super(curp, nombre, paterno, materno, telefono, nivel, municipio, asunto);
        this.curp2 = curp2;
    }

    public String getCurp2() {
        return curp2;
    }

    public void setCurp2(String curp2) {
        this.curp2 = curp2;
    }
    
}
