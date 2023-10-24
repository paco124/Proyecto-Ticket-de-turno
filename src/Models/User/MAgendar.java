package Models.User;
public class MAgendar {
    private String curp,nombre, paterno, materno;
    private int telefono,nivel;
    private String municipio,asunto;

    public MAgendar(String curp, String nombre, String paterno, String materno, int telefono, int nivel, String municipio, String asunto) {
        this.curp = curp;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.telefono = telefono;
        this.nivel = nivel;
        this.municipio = municipio;
        this.asunto = asunto;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
    
}
