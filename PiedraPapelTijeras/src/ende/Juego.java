package ende;

/**
 * Simula el juego de Piedra, Papel o tijera
 */


public class Juego {
    public static void main(String[] args) {
        Jugador p1=new Jugador();
        Jugador p2=new Jugador();
        boolean fin_de_juego=false;  
        int Rondasjugadas = 0;    // Número de rondas jugadas
        int empates = 0;
        String opcion_JUGADOR1;
        String opcion_JUGADOR2;
        
        // Bucle de juego
        do
        {
            System.out.println("***** Ronda: " + Rondasjugadas+" *********************\n");
            System.out.println("Numero de empates: "+ empates + "\n");
            opcion_JUGADOR1=p1.opcion_al_azar();
            System.out.println("p1.setExitos()Jugador 1: " + opcion_JUGADOR1+"\t p1.setExitos()Jugador 1 - Partidas ganadas: " + p1.getExitos());
            opcion_JUGADOR2 = p2.opcion_al_azar();
            System.out.println("p1.setExitos()Jugador 2: " + opcion_JUGADOR2+"\t p1.setExitos()Jugador 2 - Partidas ganadas: " + p2.getExitos());
            
            if((opcion_JUGADOR1.equals("piedra"))&&(opcion_JUGADOR2.equals("papel")))
            {
                System.out.println("p1.setExitos()Jugador 2 GANA");
                p2.setExitos();
                
            }
            else if((opcion_JUGADOR1.equals("papel"))&&(opcion_JUGADOR2.equals("piedra")))
            {
            	p1.setExitos();
                System.out.println("p1.setExitos()Jugador 1 GANA");
            }
            else if((opcion_JUGADOR1.equals("piedra"))&&(opcion_JUGADOR2.equals("tijeras")))
            {
            	p1.setExitos();
                System.out.println("p1.setExitos()Jugador 1 GANA");
            }
            else if((opcion_JUGADOR1.equals("tijeras"))&&(opcion_JUGADOR2.equals("piedra")))
            {
            	p2.setExitos();
                System.out.println("p1.setExitos()Jugador 2 GANA");
            }
            else if((opcion_JUGADOR1.equals("tijeras"))&&(opcion_JUGADOR2.equals("papel")))
            {
            	p1.setExitos();
                System.out.println("p1.setExitos()Jugador 1 GANA");
            }
            else if((opcion_JUGADOR1.equals("papel"))&&(opcion_JUGADOR2.equals("tijeras")))
            {
            	p2.setExitos();
                System.out.println("p1.setExitos()Jugador 2 GANA");
            }
            if(opcion_JUGADOR1.equals(opcion_JUGADOR2))
            {
            	empates++;
                System.out.println("\n\t\t\t Empate \n");
            }
            Rondasjugadas++;
            if((p1.exitos >=3)||(p2.exitos >=3))
            {
            	fin_de_juego=true;
                System.out.println("FIN DEL JUEGO!!");
            }
            System.out.println();
        } while(!fin_de_juego);
    }
}

