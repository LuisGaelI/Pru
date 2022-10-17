import java.util.Scanner;


public class CajeroATM {

    public static void main(String[] args) {
     int PinO = 1235;
     int i;
     boolean bandera = true;
     int PinP;
     int SaldoIni = 1000;
     int SaldoRet;
      Scanner sc=new Scanner(System.in); 
     
    
     
        for ( i = 1; i <= 3; i++) {
            System.out.println("Por favor ingrese su NIP:");
            PinP = sc.nextInt();

            if(PinP == PinO){
                System.out.println("Bienvenido Luis Gael");
                bandera = true;
                break;

            }
            else{
                    if(i<=2){
                        System.out.println("Su NIP es incorrecto, digite de nuevo");
                    }
                    else{
                        System.out.println("La tarjeta ha sido bloqueada");
                        break;
                    }
            bandera = false;
                
            }
        }
        if(bandera){
            char answer = 'y';
            while (answer == 'y') {
                System.out.println("Elige una opcion: \n1. Consulta de saldo \n2. Retiro de efectivo \n3. Consultar movimientos \n4. Salir");
                int opc = sc.nextInt();

                    switch(opc){
                        case 1:
                            System.out.println("Consulta de saldo");
                            System.out.println("Su saldo es de: $" + SaldoIni);
                        break;
                        
                        case 2:
                            System.out.println("Retiro de efectivo \nCuanto desea retirar? (En multiplos de 50)");
                            SaldoRet = sc.nextInt();
                                if (SaldoRet <= SaldoIni){
                                    int EfecivoRet = SaldoIni - SaldoRet;
                                    System.out.println("Su retiro fue de $" + SaldoRet );
                                    System.out.println("Su saldo actual es de: $" +EfecivoRet);
                                }
                                else{
                                    System.out.println("Saldo insuficiente, digite otra cantidad");
                                    return;
                                }
                        break;

                        case 3:
                            System.out.println("Consulta de movimientos");
                        break;

                        case 4:
                            System.out.println("Hasta luego");
                        return;

                        default:
                            System.out.println("Opcion invalida, digite otra opcion");

                    }
                
            }    
        }    
    }
}
