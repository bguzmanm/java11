public class Directivo extends Empleado {
  private String categoria;

  public Directivo() {
  }

  public Directivo(String nombre, int edad, double sueldoBruto, String categoria) {
    super(nombre, edad, sueldoBruto);
    this.categoria = categoria;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  @Override
  public void mostrar() {
    super.mostrar();
    System.out.println(" Y es director categoría " + categoria);
  }
}
