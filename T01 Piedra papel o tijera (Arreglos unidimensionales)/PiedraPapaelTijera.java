public class PiedraPapaelTijera {
    /*
    Programa
    Piedra -> 1
    Papel -> 2
    Tijera -> 3
    */
    public static void main (String[] args){

        int jugador1[] = new int[10];
        int jugador2[] = new int[10];
        int contadorJugador1=0, contadorJugador2=0, contadorEmpates=0, conta=0;
                    
        for(int i = 0; i<jugador1.length; i++){
            jugador1[i] = (int) (Math.random()*3) + 1;
            jugador2[i] = (int) (Math.random()*3) + 1;
        }
            
        for(int i = 0; i<jugador1.length;i++){            
            if(jugador2[i]==jugador1[i]){
                contadorEmpates++;
            }
            if(jugador1[i]==3 && jugador2[i]==2){
                contadorJugador1++;
            }
            if(jugador1[i]==3 && jugador2[i]==1){
                contadorJugador2++;
            }
            if(jugador1[i]==2 && jugador2[i]==1){
                contadorJugador1++;
            }
            if(jugador1[i]==2 && jugador2[i]==3){
                contadorJugador2++;
            }
            if(jugador1[i]==1 && jugador2[i]==3){
                contadorJugador1++;
            }
            if(jugador1[i]==1 && jugador2[i]==2){
                contadorJugador2++;
            }     
        }

        System.out.println("------------------------------");
        System.out.println("Resultados juego:");
        System.out.println("               \t     Victorias:");
        System.out.println("Jugador 1 -> \t\t" + contadorJugador1);
        System.out.println("Jugador 2 -> \t\t" + contadorJugador2);
        System.out.println("Empates   -> \t\t" + contadorEmpates);
        System.out.println("------------------------------");

        if(contadorJugador1>contadorJugador2 && contadorJugador1>contadorEmpates){
            System.out.println("El jugador 1 gano!!!");
            conta=1;
        }
        if(contadorJugador2>contadorJugador1 && contadorJugador2>contadorEmpates){
            System.out.println("El jugador 2 gano!!!");
            conta=1;
        }
        if(contadorJugador1==contadorJugador2){
            System.out.println("Juego Igualado!!!");
            conta=1;
        }

        if(contadorEmpates>contadorJugador1 && contadorEmpates>contadorJugador2){
            if(contadorJugador1>contadorJugador2){
                System.out.println("El jugador 1 gano!!!");
                conta=1;
            }else if(contadorJugador1<contadorJugador2){
                System.out.println("El jugador 2 gano!!!");
                conta=1;
            }else{
                if(conta==0){
                    System.out.println("Juego Igualado!!!");
                }
            }
        }

        if(conta == 0){
            if(contadorJugador1==contadorEmpates){
                if(contadorJugador1>contadorJugador2){
                    System.out.println("El jugador 1 gano!!!");                
                }else{
                    System.out.println("El jugador 2 gano!!!");                
                }
            }
    
            if(contadorJugador2==contadorEmpates){
                if(contadorJugador2>contadorJugador1){
                    System.out.println("El jugador 2 gano!!!");                
                }else{
                    System.out.println("El jugador 1 gano!!!");                
                }
            }
        }
    }
}