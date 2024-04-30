package org.example;

public class Empleado {
    //Atributo
    protected String nombre;
    protected double sueldoBase;

    //Constructor

    public Empleado(String nombre, double sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    //Metodo para calcular el salario

    public double calcularSalario(){
        return sueldoBase;
    }
}
