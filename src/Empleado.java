public class Empleado extends Persona {
  private double sueldoBruto;

  public Empleado() {
  }

  public Empleado(String nombre, int edad, double sueldoBruto) {
    super(nombre, edad);
    this.sueldoBruto = sueldoBruto;
  }

  public double getSueldoBruto() {
    return sueldoBruto;
  }

  public void setSueldoBruto(double sueldoBruto) {
    this.sueldoBruto = sueldoBruto;
  }

  public void calcularSalarioNeto(){
    System.out.println("El salario neto es " + sueldoBruto * 1.1);
  }

  @Override
  public void mostrar() {
    super.mostrar();
    System.out.println(" y es un empleado con un sueldo bruto de " + sueldoBruto);
  }
}
