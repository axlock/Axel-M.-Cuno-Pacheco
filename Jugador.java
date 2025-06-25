public class Jugador {
    private String nombre;
    private int salud;
    private int ataque;
    private int puntaje;
    public Jugador(String nombre, int salud, int ataque) {
        this.nombre = nombre;
        this.salud = salud;
        this.ataque = ataque;
        this.puntaje = 0;
    }
    public void atacar() {
        System.out.println(nombre+" provoco "+ataque+" daño");
    }
    public void recibirDanio(int cantidad) {
        salud -= cantidad;
        if (salud < 0) salud = 0;
        System.out.println(nombre + " recibió " + cantidad + " de daño.);}
    public boolean estaVivo() {
        return salud > 0;}
    public String getNombre() {
        return nombre;}
    public int getSalud() {
        return salud;}
    public int getAtaque() {
        return ataque;}
    public int getPuntaje() {
        return puntaje;}
}

