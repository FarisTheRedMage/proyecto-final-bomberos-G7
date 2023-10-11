package bomberosApp.Enumeraciones;

public enum BomberoNombreClave {
    
    ALFA("Alfa"), BETA("Beta"), GAMA("Gama"), OMEGA("Omega"), ZETTA("Zetta");
    
    private String NombreClave;

    private BomberoNombreClave(String NombreClave) {
        this.NombreClave = NombreClave;
    }

    public String getNombreClave() {
        return NombreClave;
    }

    public void setNombreClave(String NombreClave) {
        this.NombreClave = NombreClave;
    }  
}
