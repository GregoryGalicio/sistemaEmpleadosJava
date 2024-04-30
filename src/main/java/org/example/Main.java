package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------SISTEMA DE GESTION DE EMPLEADOS--------------");

        Scanner scan= new Scanner(System.in);
        //pedimos el ingreso de los datos del empleado

        System.out.println("Ingrese el nombre del empleado:");
        String nombreEmpleado = scan.nextLine();

        System.out.println("Ingrese el sueldo base de los empleados:");
        double sueldoBase = scan.nextDouble();
        scan.nextLine();
        //Crear instancia de Empleado con los datos ingresados

        Empleado empleado1 = new Empleado(nombreEmpleado,sueldoBase);


        // Solicitar al usuario que ingrese los datos del gerente
        System.out.println("Ingrese el nombre del gerente:");
        String nombreGerente = scan.nextLine();

        System.out.println("Ingrese el departamento del gerente:");
        String departamento = scan.nextLine();

        System.out.println("Ingrese el bono del gerente:");
        double bono = scan.nextDouble();
        scan.nextLine();

        //Creamos la instancia del Gerente con los datos ingresados
        Gerente gerente1 = new Gerente(nombreGerente,sueldoBase,departamento,bono);

        // Solicitar al usuario que ingrese los datos del programador
        System.out.println("Ingrese el nombre del programador:");
        String nombreProgramador = scan.nextLine();

        System.out.println("Ingrese el lenguaje de programación del programador:");
        String lenguaje = scan.nextLine();

        System.out.println("Ingrese el número de horas extra del programador:");
        int horasExtras = scan.nextInt();
        scan.nextLine();

        //Creamos las instancias del programador

        Programador programador1 = new Programador(nombreProgramador,sueldoBase, lenguaje,horasExtras);

        //Calculamos e imprimimos el Salario de cada empleado
        System.out.println("El Salario del empleado "+ empleado1.nombre + " es de:  S/" + empleado1.calcularSalario());
        System.out.println("El Salario del gerente "+gerente1.nombre+ " que se desempeña en el departamento de " + gerente1.getDepartamento()+ " es de : S/"+gerente1.calcularSalario());
        System.out.println("El Salario del programador "+programador1.nombre+ " que maneja el lenguaje de programacion " + programador1.getLenguaje()+ " es de : S/"+programador1.calcularSalario());

        scan.close();
    }
}