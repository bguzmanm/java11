import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    List<IMostrar> lista = new ArrayList<IMostrar>();

    lista.add(new Persona("Pepito", 54));
    lista.add(new Empleado("Rojelio", 43, 500000));
    lista.add(new Cliente("Guadalupe", 34, "The Enterprise", "555"));
    lista.add(new Directivo("María Ignacia", 68, 5600000, "Apitutado"));
    lista.add(new Proveedor("Alfonsina", 27));

    lista.add(new Perro("Batato", 4));

    for (IMostrar p: lista) {
      p.mostrar();
    }


  }
}