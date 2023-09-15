public class Usuario {
    public static void main(String[] args) throws Exception{

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        
        System.out.println("Volume do Atual:  " +smartTv.volume);
        System.out.println("canal Atual: " +smartTv.canal);
        
        smartTv.mudarCanal(13);
        System.out.println("canal Atual: " +smartTv.canal);

        System.out.println("Televisão ligada?  " +smartTv.ligada);
        System.out.println("Canal Atual:  " +smartTv.canal);
        System.out.println("Volume do Dispositivo:  " +smartTv.volume);


        smartTv.ligar ();
        System.out.println("Novo Status -> Tv Ligada " +smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv Desligada " +smartTv.ligada);
        }


    }


            




