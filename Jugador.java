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
        System.out.println(nombre + " realiza un ataque de " + ataque + " puntos.");
    }
    public void recibirDanio(int cantidad) {
        salud -= cantidad;
        if (salud < 0) salud = 0;
        System.out.println(nombre + " recibió " + cantidad + " de daño. Salud restante: " + salud);}
    public boolean estaVivo() {
        return salud > 0;}
    public void usarMejora(Mejora m) {
        if (m.getTipo().equalsIgnoreCase("vida")) {
            salud += m.getValor();
            System.out.println(nombre + " usó mejora de vida. Salud aumentó a: " + salud);
        } else if (m.getTipo().equalsIgnoreCase("ataque")) {
            ataque += m.getValor();
            System.out.println(nombre + " usó mejora de ataque. Ataque aumentó a: " + ataque);
        }
    }
    public String getNombre() {
        return nombre;}
    public int getSalud() {
        return salud;}
    public int getAtaque() {
        return ataque;}
    public int getPuntaje() {
        return puntaje;}
}

