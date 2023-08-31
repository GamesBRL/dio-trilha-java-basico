public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTv = new SmartTV();
        smartTv.ligar();
        smartTv.ajustarVolume(25);
        smartTv.ajustarCanal(8);

        System.out.println("TV ligada? " + smartTv.ligado);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
    }
}
