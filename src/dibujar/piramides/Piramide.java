package dibujar.piramides;

public class Piramide {
	private int altura;
	private int opcion;

	public Piramide(int altura, int opcion) {
		this.altura = altura;
		this.opcion = opcion;
	}

	public void menu() {

		switch (opcion) {
		case 1:
			System.out.println("\n>>Piramide Abajo");
			abajo();
			break;
		case 2:
			System.out.println("\n>>Piramide Arriba");
			arriba();
			break;
		case 3:
			System.out.println("\n>>Piramide Derecha");
			derecha();
			break;
		case 4:
			System.out.println("\n>>Piramide Izquierda");
			izquierda();
			break;
		case 5:
			System.out.println("\n>>Rombo");
			rombo();
			break;
		case 6:
			System.out.println("\nCerrando Sistema....");
			System.exit(0);
			break;
		default:
			System.out.println("\nOpción Inválida. Intente de nuevo");
			break;
		}
		System.out.println("---------------------");

	}

	private void arriba() {
		for (int filas = 1; filas <= altura; filas++) {
			for (int espacio = altura - 1; espacio >= filas; espacio--) {
				System.out.print(" ");
			}
			for (int x = 0; x < (2 * filas) - 1; x++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	private void abajo() {
		for (int filas = altura; filas >= 1; filas--) {
			for (int espacio = altura - 1; espacio >= filas; espacio--) {
				System.out.print(" ");
			}
			for (int x = 0; x < (2 * filas) - 1; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private void derecha() {
		for (int filas = 1; filas < altura; filas++) {
			for (int x = 0; x < filas; x++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int filas = altura; filas >= 1; filas--) {
			for (int x = 0; x < filas; x++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

	private void izquierda() {
		for (int filas = altura; filas > 1; filas--) {
			for (int x = 0; x < filas; x++) {
				System.out.print(" ");
			}
			for (int espacio = altura; espacio >= filas; espacio--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int filas = 1; filas <= altura; filas++) {
			for (int x = 0; x < filas; x++) {
				System.out.print(" ");
			}
			for (int espacio = altura; espacio >= filas; espacio--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private void rombo() {
		int y = altura / 2;
		if (altura % 2 != 0)
			y = (altura / 2) + 1;

		for (int filas = 0; filas <= (altura / 2); filas++) {
			for (int espacio = altura - 1; espacio >= filas; espacio--) {
				System.out.print(" ");
			}
			for (int x = 0; x < (2 * filas) - 1; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int filas = y; filas >= 1; filas--) {
			for (int espacio = altura - 1; espacio >= filas; espacio--) {
				System.out.print(" ");
			}
			for (int x = 0; x < (2 * filas) - 1; x++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
