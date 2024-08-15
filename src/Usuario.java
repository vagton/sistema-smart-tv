public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("A tv está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);
        System.out.println("Novo Status -> Canal atual: " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Novo Status -> Canal atual: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Novo Status -> Canal atual: " + smartTv.canal);

        System.out.println("Novo Status -> Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> A tv está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> A tv está ligada? " + smartTv.ligada);



    }
}
