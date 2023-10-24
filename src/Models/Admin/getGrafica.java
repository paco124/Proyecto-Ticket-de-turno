package Models.Admin;


public class getGrafica {
    private String mmunicipio;
    private int conteo;

    public getGrafica(String mmunicipio, int conteo) {
        this.mmunicipio = mmunicipio;
        this.conteo = conteo;
    }

    public String getMmunicipio() {
        return mmunicipio;
    }

    public void setMmunicipio(String mmunicipio) {
        this.mmunicipio = mmunicipio;
    }

    public int getConteo() {
        return conteo;
    }

    public void setConteo(int conteo) {
        this.conteo = conteo;
    }
    
    
}
