package org.example;

public class Gerente extends Empleado{
    //Atributos adicionales de Gerente
    private String departamento;
    private double bono;

    //Constructor

    public Gerente(String nombre, double sueldoBase, String departamento, double bono) {
        super(nombre, sueldoBase);
        this.departamento = departamento;
        this.bono = bono;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    //Metodo especial para calculo de salario de los gerentes

    @Override
    public double calcularSalario() {
        return sueldoBase +bono;
    }
}
