import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldoDisponible = 1599.99;

        System.out.println("\n*******************************************");
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo disponible: " + saldoDisponible);

        System.out.println("\n*********************************************");

        Scanner teclado = new Scanner(System.in);
        int numero = 0;

        while (numero != 9) {
            System.out.println("** Escribe el numero de la opcion deseada **");
            System.out.println(" 1 - Consultar Saldo");
            System.out.println(" 2 - Retirar");
            System.out.println(" 3 - Depositar");
            System.out.println(" 9 - Salir");
            numero = teclado.nextInt();

            switch (numero){
                case 1:
                    System.out.println("El saldo actualizado es: " + saldoDisponible + '$');
                    break;

                case 2:
                    System.out.println("Escribe el monto que desea retirar");
                    double montoRetirar = teclado.nextDouble();
                    if (montoRetirar > saldoDisponible) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        System.out.println("Has retirado: " + montoRetirar);
                        System.out.println("El saldo actualizado es: " + (saldoDisponible - montoRetirar) + '$');
                        saldoDisponible -= montoRetirar;
                    }
                    break;

                case 3:
                    System.out.println("Escribe el monto que desea depositar");
                    double montoDepositar = teclado.nextDouble();
                    System.out.println("Has depositado: " + montoDepositar);
                    System.out.println("El saldo actualizado es: " + (saldoDisponible + montoDepositar) + '$');
                    saldoDisponible += montoDepositar;
                    break;

                case 9:
                    System.out.println("Gracias por usar nuestro servicio");
                    break;

                default:
                    System.out.println("Opcion no valida, intente de nuevo");
            }
        }

        teclado.close();
    }
}
