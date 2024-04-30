package org.example;

public class Programador extends Empleado {
    //Atributos de Programador adicionales
    private String lenguaje;
    private int horasExtras;

    //Constructor de programador
    public Programador(String nombre, double sueldoBase, String lenguaje, int horasExtras) {
        super(nombre, sueldoBase);
        this.lenguaje = lenguaje;
        this.horasExtras = horasExtras;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    //Metodo de calculo de salario de programador
    @Override
    public double calcularSalario(){
        //supongamos que gana el doble por cada hora extra y que el sueldoBase es mensual
        return sueldoBase+2*(sueldoBase/30/8)*horasExtras;
    }
}
