package ejercicioAtletas;
import java.util.*;
public class Ejecucion {

	public static void main(String[] args) {

		        Competicion competicion = new Competicion();

		        Scanner scanner = new Scanner(System.in);
		        boolean salir = false;

		        do {
		            System.out.println("==========================");
		            System.out.println("           MENU           ");
		            System.out.println("==========================");
		            System.out.println("Selecciona una opción:");
		            System.out.println("1. Añadir Participante");
		            System.out.println("2. Mostrar Participantes Alfabeticamente");
		            System.out.println("3. Mostrar Participantes por Marcas 2023");
		            System.out.println("4. Mostrar Participantes por Marcas");
		            System.out.println("5. Mostrar Mejor marca por año elegido");
		            System.out.println("6. Salir");
		            System.out.println("==========================");

		            int seleccion = scanner.nextInt();

		            switch (seleccion) {
		                case 1:
		                    System.out.println("Escribe el nombre: ");
		                    String name = scanner.next();
		                    Boolean comprobar = false;
		                    String tipo;
		                    do
		                    {
		                    System.out.println("Escribe el tipo (benjamin, alevin o juvenil): ");
		                    tipo = scanner.next();
		                    if (!tipo.equals("benjamin") && !tipo.equals("alevin") && !tipo.equals("juvenil"))
		                    	System.out.println("Escribe un tipo válido.");
		                    else
		                    	{
		                    		comprobar = true;
		                    	}
		                    	
		                    } while (comprobar == false);
		                    System.out.println("Quieres añadir marcas? si/no");
		                    String sel = scanner.next();
		                    int año = 0;
		                    int marca = 0;
		                    Map<Integer, Integer> dic = new HashMap<>();
		                    if (sel.equals("si")) {
		                        System.out.println("Entra el año: ");
		                        año = scanner.nextInt();
		                        System.out.println("Entra la marca del año: " + año);
		                        marca = scanner.nextInt();
		                        dic.put(año, marca);
		                    }
		                    Participante p = new Participante(name, crearDorsales(), tipo, dic);
		                    competicion.agregarParticipante(p);
		                    System.out.println("Participante añadido correctamente.");
		                    break;
		                case 2:
		                    competicion.mostrarParticipantesAlfabeticamente();
		                    break;
		                case 3:
		                    competicion.mostrarParticipantesPorMarcas2023();
		                    break;
		                case 4:
		                    System.out.println("Introduce el año que quieres ver las marcas: ");
		                    int añomarcas = scanner.nextInt();
		                    competicion.mostrarParticipantesPorMarcas(añomarcas);
		                    break;
		                case 5:
		                    System.out.println("Elige el año: ");
		                    int añoelegido = scanner.nextInt();
		                    competicion.mostrarMejorMarca(añoelegido);
		                    break;
		                case 6:
		                    System.out.println("Saliendo...");
		                    salir = true;
		                    break;
		            }
		        } while (!salir);

		        scanner.close();
		    }

		    public static int crearDorsales() {
				Random rnd = new Random();
		        List<Integer> dorsalesUsados = new ArrayList<>();

		        int dorsalAleatorio = rnd.nextInt(100) + 1;

		        if (dorsalesUsados.size() < 100) {
		            while (dorsalesUsados.contains(dorsalAleatorio)) {
		                dorsalAleatorio = rnd.nextInt(100) + 1;
		            }
		            dorsalesUsados.add(dorsalAleatorio);
		            return dorsalAleatorio;
		        } else {
		            return 0;
		        }
		    
		
	}

}
