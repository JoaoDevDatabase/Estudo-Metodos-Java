public class Usuario {
    public static void main(String[] args) {
        // acumulando o arquivo na memoria
        SmartTv smarttv = new SmartTv();

        // inicio de meu programa
        System.out.println("\n" + "/**********SmartTVSimulator**********/\n");
        System.out.println("TELEVISÃO LIGADA? : " + smarttv.ligartv);
        System.out.println("CANAL ? " + smarttv.canal);
        System.out.println("VOLUME : " + smarttv.volume);

        // aumentando o volume da televisão
        smarttv.aumentarVolume();
        smarttv.aumentarVolume();
        smarttv.aumentarVolume();
        smarttv.aumentarVolume();
        smarttv.aumentarVolume();
        System.out.printf("Aumentando o volume de 25, para : %d%n \n", +smarttv.volume);

        // mudando de canal
        System.out.println("Deseja mudar o canal ? ");
        smarttv.passarCanal();
        smarttv.passarCanal();
        smarttv.passarCanal();
        System.out.println("Mudando o canal, para o canal : " + smarttv.canal + "\n");

        // voltando para o canal principal de origem
        System.out.println("Deseja voltar o canal para o canal padrão?");
        smarttv.voltarCanal();
        smarttv.voltarCanal();
        smarttv.voltarCanal();
        System.out.println("CANAL ATUAL : " + smarttv.canal + "\n");

        // FIM DE MEU PROGRAMA
    }
}
