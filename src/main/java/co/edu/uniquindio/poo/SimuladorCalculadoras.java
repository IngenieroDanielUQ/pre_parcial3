package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class SimuladorCalculadoras {

    //Creación de la nueva variable de tipo lista, que almacenará las calculadoras que se quieran registrar.
    private final List<Calculadora> calculadoras = new ArrayList<>();

    //método para agregar calculadoras a una lista
    public void registrarCalculadora(Calculadora calculadora) {
        calculadoras.add(calculadora);
    }
    
    //método que retorna e imprime los elementos de una lista, en esta ocasión, tipo calculadora graficadora.
    public List<CalculadoraGraficadora> obtenerCalculadorasGraficadoras() {
        List<CalculadoraGraficadora> graficadoras = new ArrayList<>();
        for (Calculadora calc : calculadoras) {
            if (calc instanceof CalculadoraGraficadora) {
                graficadoras.add((CalculadoraGraficadora) calc);
            }
        }
        System.out.println(graficadoras);
        return graficadoras;
    }
}

