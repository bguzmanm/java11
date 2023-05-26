public class Cliente extends Persona{
  private String nombreEmpresa;
  private String telefonoContacto;

  public Cliente() {
  }

  public Cliente(String nombre, int edad, String nombreEmpresa, String telefonoContacto) {
    super(nombre, edad);
    this.nombreEmpresa = nombreEmpresa;
    this.telefonoContacto = telefonoContacto;
  }

  public String getNombreEmpresa() {
    return nombreEmpresa;
  }

  public void setNombreEmpresa(String nombreEmpresa) {
    this.nombreEmpresa = nombreEmpresa;
  }

  public String getTelefonoContacto() {
    return telefonoContacto;
  }

  public void setTelefonoContacto(String telefonoContacto) {
    this.telefonoContacto = telefonoContacto;
  }

  @Override
  public void mostrar() {
    super.mostrar();
    System.out.println(" y es un cliente de la empresa " + nombreEmpresa);
  }
}
