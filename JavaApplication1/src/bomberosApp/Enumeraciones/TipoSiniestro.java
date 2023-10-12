
package bomberosApp.Enumeraciones;


public enum TipoSiniestro {
    INCENDIO("Incendios en viviendas o en Industrias. "), 
    DERRUMBE("Salvamiento en derrumbes. "),
    RESCATE_MONTANIA("Rescates en Ámbitos de Montaña. "), 
    RESCATE_ACCIDENTE("Rescate de personas en Accidentes. "), 
    INUNDACION("Socorrer Inundaciones. "), 
    PREVENCION("Operativos de Prevención. ") ;
   
    private String incidencia;

    private TipoSiniestro(String incidencia) {
        this.incidencia = incidencia;
    }

    public String getIncidencia() {
        return incidencia;
    }

    public void setIncidencia(String incidencia) {
        this.incidencia = incidencia;
    }   
}
