public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void ligar(){
        ligada = true;
        System.out.println("ON");
    }

    public void desligar(){
        ligada = false;
        System.out.println("OFF");
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void passarCanal(){
        canal++;
        System.out.println("canal="+canal);
    }

    public void voltarCanal(){
        canal--;
        System.out.println("canal="+canal);
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("volume="+volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("volume="+volume);
    }
}
