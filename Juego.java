import java.util.Scanner;
public class Juego {
    private Jugador jugador;
    private Enemigo[] enemigos;
    private boolean juegoTerminado;
    private int turno;
    public Juego() {
        this.juegoTerminado = false;
        this.turno = 1;
    }
    public void iniciarJuego() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a Battle Space");
        System.out.println("Presiona cualquier tecla para comenzar");
        scanner.nextLine();
        jugador = new Jugador("Jugador1", 100, 20);
        enemigos = generarEnemigos(3);
        System.out.println("¡Juego iniciado!");}
    public void ejecutarTurno() {
        System.out.println("Turno "+turno+" ejecutado.");
        turno++;}
    public void verificarFinDelJuego() {
        juegoTerminado = false;}
    public void mostrarEstado() {
        System.out.println("Jugador: "+jugador.getNombre()+", Salud: "+jugador.getSalud());
        for (int i=0;i<enemigos.length;i++) {
            System.out.println("Enemigo "+i+": "+enemigos[i].getTipo()+",Salud: "+enemigos[i].getSalud());
        }
    }
    private Enemigo[] generarEnemigos(int cantidad) {
        Enemigo[] lista = new Enemigo[cantidad];
        for (int i=0;i<cantidad;i++) {
            lista[i]=new Enemigo("Tipo"+(i+1),30,10);
        }
        return lista;
    }
}
