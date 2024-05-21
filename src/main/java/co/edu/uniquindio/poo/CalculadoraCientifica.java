package co.edu.uniquindio.poo;

public class CalculadoraCientifica extends Calculadora {
    private final double operando1;
    private final double operando2;

    public CalculadoraCientifica(String marcaTeclado, int filaPantalla, int columnaPantalla, double operando1, double operando2) {
        super(marcaTeclado, filaPantalla, columnaPantalla);
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public double getOperando1() {
        return operando1;
    }

    public double getOperando2() {
        return operando2;
    }

    @Override
    public void operacionSuma() {
        System.out.println((operando1 + operando2));
    }

}