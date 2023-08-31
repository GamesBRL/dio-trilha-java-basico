public class SmartTV {

    boolean ligado=false;
    int canal=1;
    int volume=0;

    public void ligar(){
        ligado=true;
    }

    public void desligar(){
        ligado=false;
    }

    public void ajustarVolume(int volume){
        this.volume = volume;
    }

    public void ajustarCanal(int canal){
        this.canal = canal;
    }

}