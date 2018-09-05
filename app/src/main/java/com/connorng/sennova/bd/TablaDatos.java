package com.connorng.sennova.bd;

import android.provider.BaseColumns;

public final class TablaDatos {
    private TablaDatos(){}
    public static class TablaCultivos implements BaseColumns{
        public static final String NOMBRE_TABLA = "cultivo";
        public static final String CULTIVO_ID = "id";
        public static final String COLUMNA_NOMBRE = "nombre";
        public static final String COLUMNA_DESCRIPCION = "descripcion";
    }
    public static class TablaEnfermedades implements BaseColumns{
        public static final String NOMBRE_TABLA = "enfermedades";
        public static final String ENFERMEDAD_ID = "id";
        public static final String ENFERMERDAD_TIPO = "tipo";
        public static final String ENFERMEDAD_NOMBRE = "nombre";
        public static final String ENFERMEDAD_DESCRIPCION = "descripcion";
        public static final String ENFERMEDAD_SINTOMAS = "sintomas";
        public static final String ENFERMEDAD_TRATAMIENTO = "tratamiento";
        public static final String FK_CULTIVO = "id_cultivo";
    }
    public static class TablaImagenes implements BaseColumns{
        public static final String NOMBRE_TABLA = "imagenes";
        public static final String IMAGENES_ID = "id";
        public static final String IMAGENES_NOMBRE = "nombre";
        public static final String IMAGENES_URL = "url";
        public static final String IMAGENES_TIPO = "tipo";
        public static final String FK_TABLA = "id_tabla";
    }
    public static class TablaUsuarios implements BaseColumns{
        public static final String NOMBRE_TABLA = "usuarios";
        public static final String USUARIOS_ID = "id";
        public static final String USUARIOS_NOMBRE = "nombre";
        public static final String USUARIOS_APELLIDO = "apellido";
        public static final String USUARIOS_SEXO = "sexo";
        public static final String USUARIOS_CORREO = "correo";
        public static final String USUARIOS_TELEFONO = "telefono";
        public static final String USUARIOS_PASSWORD = "password";
    }

}
