package co.edu.uniquindio.poo;

public class CalculadoraGraficadora extends Calculadora {
    private final Vector3D operando1;
    private final Vector3D operando2;

    public CalculadoraGraficadora(String marcaTeclado, int filaPantalla, int columnaPantalla, Vector3D operando1,
            Vector3D operando2) {
                
        super(marcaTeclado, filaPantalla, columnaPantalla);

        this.operando1 = operando1;
        this.operando2 = operando2;

        assert operando1 != null : "No se aceptan datos null";
        assert operando2 != null : "No se aceptan datos null";

    }

    public Vector3D getOperando1() {
        return operando1;
    }

    public Vector3D getOperando2() {
        return operando2;
    }

    @Override
    public void operacionSuma() {
        System.out.println((operando1.getElementoX() + operando2.getElementoX()) + ", " + (operando1.getElementoY() + operando2.getElementoY())  + ", " + (operando1.getElementoZ()  +  operando2.getElementoZ()));
    }

    @Override
    public String toString() {
        return "CalculadoraGraficadora: (" + operando1 + ")" + "(" + operando2 + ")"
        + "\n" + "Marca Teclado: " + getMarcaTeclado()
        + "\n" + "numero de filas en pantalla: " + getFilaPantalla() 
        + "\n" + "numero de Columnas en Pantalla: " + getColumnaPantalla();
    }
}