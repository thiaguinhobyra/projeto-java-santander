public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal Atual " + smartTv.canal);
        System.out.println("Volume Atual " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Tv ligada? " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Tv ligada? " + smartTv.ligada);
        
        smartTv.aumentarVolume();
        System.out.println("Volume Atual " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume Atual " + smartTv.volume);

        smartTv.mudarCanal(10);
        System.out.println("Canal " + smartTv.canal);

        smartTv.passarCanal();
        System.out.println("Canal " + smartTv.canal);

        smartTv.voltarCanal();
        System.out.println("Canal " + smartTv.canal);
    }
}
