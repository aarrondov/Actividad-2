package ende;

/**
 * Simula el juego de Piedra, Papel o tijera
 */


public class Juego {
    public static void main(String[] args) {
        Jugador p1 = new Jugador();
        Jugador p2 = new Jugador();
        boolean fin_de_juego = false;
        int rondasjugadas = 0;    // Número de rondas jugadas
        int empates = 0;
        String opcion_jugador1;
        String opcion_jugador2;
        
        // Bucle de juego
        do
        {
            System.out.println("***** Ronda: " + rondasjugadas+" *********************\n");
            System.out.println("Numero de empates: " + empates + "\n");
            opcion_jugador1=p1.opcion_al_azar();
            System.out.println("Jugador 1: " + opcion_jugador1+ "\tJugador 1 - Partidas ganadas: " + p1.getExitos());
            opcion_jugador2 = p2.opcion_al_azar();
            System.out.println("Jugador 2: " + opcion_jugador2 + "\tJugador 2 - Partidas ganadas: " + p2.getExitos());
            
            if((opcion_jugador1.equals("piedra"))&&(opcion_jugador2.equals("papel")))
            {
                System.out.println("Jugador 2 GANA");
                p2.setExitos();
                
            }
            else if((opcion_jugador1.equals("papel"))&&(opcion_jugador2.equals("piedra")))
            {
            	p1.setExitos();
                System.out.println("Jugador 1 GANA");
            }
            else if((opcion_jugador1.equals("piedra"))&&(opcion_jugador2.equals("tijeras")))
            {
            	p1.setExitos();
                System.out.println("Jugador 1 GANA");
            }
            else if((opcion_jugador1.equals("tijeras"))&&(opcion_jugador2.equals("piedra")))
            {
            	p2.setExitos();
                System.out.println("Jugador 2 GANA");
            }
            else if((opcion_jugador1.equals("tijeras"))&&(opcion_jugador2.equals("papel")))
            {
            	p1.setExitos();
                System.out.println("Jugador 1 GANA");
            }
            else if((opcion_jugador1.equals("papel"))&&(opcion_jugador2.equals("tijeras")))
            {
            	p2.setExitos();
                System.out.println("Jugador 2 GANA");
            }
            if(opcion_jugador1.equals(opcion_jugador2))
            {
            	empates++;
                System.out.println("\n\t\t\t Empate \n");
            }
            rondasjugadas++;
            if((p1.getExitos() >=3)||(p2.getExitos() >=3))
            {
            	fin_de_juego=true;
                System.out.println("FIN DEL JUEGO!!");
            }
            System.out.println();
        } while(!fin_de_juego);
    }
}

