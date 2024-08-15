public class SmartTv{
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
        if (canal == 101){
            canal = 100;
            System.out.println("O canal chegou ao seu máximo valor: " + canal);
        }else{
            System.out.println("Aumentando o canal para: " + canal);
        }
    }

    public void diminuirCanal(){
        canal--;
        if (canal == 0) {
            canal = 1;
            System.out.println("O canal chegou ao seu minimo valor: " + canal);
        }else{
            System.out.println("Diminuindo o canal para: " + canal);
        }
    }

    public void aumentarVolume(){
        volume++;
        if (volume == 101){
            volume = 100;
            System.out.println("O volume chegou ao seu máximo valor: " + volume);
        }else{
            System.out.println("Aumentando o volume para: " + volume);
        }
    }

    public void diminuirVolume(){
        volume--;
        if (volume == -1) {
            volume = 0;
            System.out.println("O volume chegou ao seu minimo valor: " + volume);
        }else{
            System.out.println("Diminuindo o volume para: " + volume);
        }
    }


    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
}