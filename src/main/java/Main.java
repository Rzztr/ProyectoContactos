import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        ArrayList <Contacto> contactos = new ArrayList<Contacto>();
        
        
        contactos.add(new Contacto("Carlos Olmos", "", "Olimpo"));
        contactos.add(new Contacto("Isaac Saucedo", "449 465 0069", "Olimpo"));
        contactos.add(new Contacto("Ricardo Lopez", "449 540 3154", "Olimpo"));
        contactos.add(new Contacto("Jose Balderas", " 449 550 5524", "CEH"));
        
        for(Contacto i: contactos){
            System.out.println("------------------");
            System.out.println(i.toString());
        }

//        for (int i = 0; i < contactos.size(); i++) {
//            System.out.println(contactos.get(i));
//        }

    }
}
