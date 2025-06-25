public class Enemigo {
    private String tipo;
    private int salud;
    private int ataque;
    public Enemigo(String tipo, int salud, int ataque) {
        this.tipo = tipo;
        this.salud = salud;
        this.ataque = ataque;
    }
    public void atacar() {
        System.out.println("El enemigo (" + tipo + ") ataca con " + ataque + " de daño.");
    }
    public void recibirDanio(int cantidad) {
        salud -= cantidad;
        if (salud < 0) salud = 0;
        System.out.println("El enemigo (" + tipo + ") recibió " + cantidad + " de daño. Salud restante: " + salud);}
    public boolean estaVivo() {
        return salud > 0;}
    public void mostrarEstado() {
        System.out.println("Enemigo (" + tipo + ") - Salud: " + salud + " | Ataque: " + ataque);}
    public String getTipo() {
        return tipo;}
    public int getSalud() {
        return salud;}
    public int getAtaque() {
        return ataque;}
}

