package com.connorng.sennova.adaptador;

public class CultivosEntidad {
    int urlCultivo;
    String nombreCultivo,descripcionCultivo;

    public CultivosEntidad(int urlCultivo, String nombreCultivo, String descripcionCultivo) {
        this.urlCultivo = urlCultivo;
        this.nombreCultivo = nombreCultivo;
        this.descripcionCultivo = descripcionCultivo;
    }

    public int getUrlCultivo() {
        return urlCultivo;
    }

    public void setUrlCultivo(int urlCultivo) {
        this.urlCultivo = urlCultivo;
    }

    public String getNombreCultivo() {
        return nombreCultivo;
    }

    public void setNombreCultivo(String nombreCultivo) {
        this.nombreCultivo = nombreCultivo;
    }

    public String getDescripcionCultivo() {
        return descripcionCultivo;
    }

    public void setDescripcionCultivo(String descripcionCultivo) {
        this.descripcionCultivo = descripcionCultivo;
    }
}
