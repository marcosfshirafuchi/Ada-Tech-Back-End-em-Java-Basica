import Animais.Cachorro;


public class Main3 {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Rex","Marron",25,5.5,5,"nada");
        System.out.println(cachorro1.getNumeroDeCachorros());
        Cachorro cachorro2 = new Cachorro("Puppy","Marron",25,5.5,5,"nada");
        System.out.println(cachorro2.getNumeroDeCachorros());
        System.out.println(cachorro1.getNumeroDeCachorros());

    }


}
