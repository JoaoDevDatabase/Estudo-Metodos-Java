public class Usuario {
    public static void main(String[] args) {

        SmartTv smarttv = new SmartTv();

        System.out.println("TELEVISÃO LIGADA? : " + smarttv.ligartv);
        System.out.println("CANAL ? " + smarttv.canal);
        System.out.println("VOLUME : " + smarttv.volume);

        smarttv.aumentarVolume();
        smarttv.aumentarVolume();
        smarttv.aumentarVolume();
        smarttv.aumentarVolume();
        smarttv.aumentarVolume();
        System.out.printf("Aumentando o volume de 25, para : %d%n", +smarttv.volume);
        System.out.println("Deseja mudar o canal ? ");

        smarttv.passarCanal();
        smarttv.passarCanal();
        smarttv.passarCanal();
        System.out.println("Mudando o canal, para o canal : " + smarttv.canal);

    }
}
