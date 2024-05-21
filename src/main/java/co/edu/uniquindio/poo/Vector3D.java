package co.edu.uniquindio.poo;

public class Vector3D {
    private final double elementoX;
    private final double elementoY;
    private final double elementoZ;

    public Vector3D(double elementoX, double elementoY, double elementoZ) {
        this.elementoX = elementoX;
        this.elementoY = elementoY;
        this.elementoZ = elementoZ;

    }

    public double getElementoX() {
        return elementoX;
    }

    public double getElementoY() {
        return elementoY;
    }

    public double getElementoZ() {
        return elementoZ;
    }

    @Override
    public String toString() {
        return "Vector3D = (" + elementoX + ", " + elementoY + ", " + elementoZ + ")";
    }

    
}