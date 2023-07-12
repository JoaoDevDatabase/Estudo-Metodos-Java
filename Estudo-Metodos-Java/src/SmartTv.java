public class SmartTv {
    boolean ligartv = true;
    boolean desligartv = false;
    int canal = 1;
    int volume = 25;

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void passarCanal() {
        canal++;
    }

    public void voltarCanal() {
        canal--;
    }

    public void ligartv() {
        boolean ligar = true;
    }

    public void desligartv() {
        boolean desligar = false;
    }

}
