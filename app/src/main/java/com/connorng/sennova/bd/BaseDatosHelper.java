package com.connorng.sennova.bd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BaseDatosHelper extends SQLiteOpenHelper {

    public static final int VERSION_BASE_DATOS = 1;
    public static final String NOMBRE_BASE_DATOS = "sennova.db";

    private static final String CREAR_TABLA_CULTIVOS =
            "CREATE TABLE " + TablaDatos.TablaCultivos.NOMBRE_TABLA + " ("+
                    TablaDatos.TablaCultivos.CULTIVO_ID + " INTEGER PRIMARY KEY," +
                    TablaDatos.TablaCultivos.COLUMNA_NOMBRE + " TEXT," +
                    TablaDatos.TablaCultivos.COLUMNA_DESCRIPCION + "TEXT)";

    private static final String CREAR_TABLA_ENFERMEDADES =
            "CRETE TABLE " + TablaDatos.TablaEnfermedades.NOMBRE_TABLA + " ("+
                    TablaDatos.TablaEnfermedades.ENFERMEDAD_ID + " INTEGER PRIMARY KEY,"+
                    TablaDatos.TablaEnfermedades.ENFERMERDAD_TIPO + " TEXT,"+
                    TablaDatos.TablaEnfermedades.ENFERMEDAD_NOMBRE + " TEXT,"+
                    TablaDatos.TablaEnfermedades.ENFERMEDAD_DESCRIPCION + " TEXT,"+
                    TablaDatos.TablaEnfermedades.ENFERMEDAD_SINTOMAS + " TEXT,"+
                    TablaDatos.TablaEnfermedades.ENFERMEDAD_TRATAMIENTO + " TEXT,"+
                    " FOREING KEY " + TablaDatos.TablaEnfermedades.FK_CULTIVO + " REFERENCES " + TablaDatos.TablaCultivos.CULTIVO_ID + " )";

    private static final String CREAR_TABLA_IMAGENES =
            "CREATE TABLE " + TablaDatos.TablaImagenes.NOMBRE_TABLA + " ("+
                    TablaDatos.TablaImagenes.IMAGENES_ID + " INTEGER PRIMARY KEY,"+
                    TablaDatos.TablaImagenes.IMAGENES_NOMBRE + " TEXT,"+
                    TablaDatos.TablaImagenes.IMAGENES_URL + " TEXT,"+
                    TablaDatos.TablaImagenes.IMAGENES_TIPO + " TEXT,"+
                    TablaDatos.TablaImagenes.FK_TABLA + " )";




    public BaseDatosHelper(Context context) {
        super(context, NOMBRE_BASE_DATOS, null, VERSION_BASE_DATOS);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREAR_TABLA_CULTIVOS);
        db.execSQL(CREAR_TABLA_ENFERMEDADES);
        db.execSQL(CREAR_TABLA_IMAGENES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ TablaDatos.TablaCultivos.NOMBRE_TABLA);
        db.execSQL("DROP TABLE IF EXISTS "+ TablaDatos.TablaEnfermedades.NOMBRE_TABLA);
        db.execSQL("DROP TABLE IF EXISTS "+ TablaDatos.TablaImagenes.NOMBRE_TABLA);
    }
}
