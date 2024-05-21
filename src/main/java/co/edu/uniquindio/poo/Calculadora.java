package co.edu.uniquindio.poo;

public abstract class Calculadora {
    private final String marcaTeclado;
    private final int filaPantalla;
    private final int columnaPantalla;

    public Calculadora(String marcaTeclado, int filaPantalla, int columnaPantalla) {
        this.marcaTeclado = marcaTeclado;
        this.filaPantalla = filaPantalla;
        this.columnaPantalla = columnaPantalla;
    }

    public String getMarcaTeclado() {
        return marcaTeclado;
    }

    public int getFilaPantalla() {
        return filaPantalla;
    }

    public int getColumnaPantalla() {
        return columnaPantalla;
    }

    public abstract void operacionSuma();
}