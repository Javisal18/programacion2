/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

/**
 *
 * javier salcedo
 */
class Empleado extends Persona {
    private double salario;
    private String jefeInmediato;
    private int anosExperiencia;
    private String nombreCargo;

    // Constructor
    public Empleado(String nombre, String apellido, String direccion, String telefono, int edad, String email, double salario, String jefeInmediato, int anosExperiencia) {
        super(nombre, apellido, direccion, telefono, edad, email);
        this.salario = salario;
        this.jefeInmediato = jefeInmediato;
        this.anosExperiencia = anosExperiencia;
        this.nombreCargo = calcularCargo();
    }

    // GET
    public double getSalario() {
        return salario;
    }

    public String getJefeInmediato() {
        return jefeInmediato;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    // SET
    public void setSalario(double salario) {
        this.salario = salario;
        this.nombreCargo = calcularCargo();
    }

    public void setJefeInmediato(String jefeInmediato) {
        this.jefeInmediato = jefeInmediato;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
        this.nombreCargo = calcularCargo();
    }

    private String calcularCargo() {
        if (salario >= 5000000 && anosExperiencia >= 5 && getEdad() >= 25 && getEdad() <= 45) {
            return "Senior";
        } else if (salario >= 900000 && salario <= 1200000 && anosExperiencia >= 1 && anosExperiencia <= 2 && getEdad() >= 18 && getEdad() <= 22) {
            return "Junior";
        } else {
            return "No clasificado";
        }
    }
}
