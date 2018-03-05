package dibujar.piramides;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Principal p = new Principal();
		p.menu();
	}

	private void menu() {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int altura, opcion;
		do {
			do {
				System.out.print("Ingrese la altura de la pirámide a dibujar: ");
				try {
					altura = Integer.parseInt(teclado.nextLine());
					break;
				} catch (NumberFormatException e) {
					System.out.println(">>Debe ingresar un número!\n---------------------");
				}

			} while (true);
			System.out.println(
					"\n\tOPCIONES\n 1. Punta abajo\n 2. Punta arriba\n 3. Punta Derecha\n 4. Punta Izquierda\n 5. Rombo\n 6. Salir");
			do {
				System.out.print("Qué piramide quiere dibujar: ");
				try {
					opcion = Integer.parseInt(teclado.nextLine());
					break;
				} catch (NumberFormatException e) {
					System.out.println(">>Debe ingresar un número!\n---------------------");
				}

			} while (true);

			Piramide pir = new Piramide(altura, opcion);
			pir.menu();
		} while (true);

	}

}
