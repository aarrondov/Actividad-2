package ende;

public class Jugador{
    private int exitos;      // número de partidas ganadas

    public Jugador() {
        this.exitos = 0;
    }

    /**
     * Escoge piedra, papel o tijera al azar
     */
    public String opcion_al_azar()
    {
        String opcion="";
        int c = (int)(Math.random()*3);
        switch (c) {
            case 0 -> opcion = ("piedra");
            case 1 -> opcion = ("papel");
            case 2 -> opcion = ("tijeras");
        }
        return opcion;
    }

    public void setExitos()
    {
        exitos++;
    }

    public int getExitos()
    {
        return(exitos);
    }


}
