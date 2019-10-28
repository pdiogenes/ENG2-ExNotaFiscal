import java.util.*;

final class GeraIdentificador{
    private static GeraIdentificador instance = null;

    private GeraIdentificador(){
        
    }

    public static GeraIdentificador getInstance(){
        if(instance == null){
            instance = new GeraIdentificador();
        }
        return instance;
    }

    public static int getId(){
        Random rand = new Random();
        return rand.nextInt(99999999);
    }
}