import Animais.Cachorro;

public class Main2 {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Rex","Marron",25,5.5,5,"nada");
        Cachorro cachorro2 = new Cachorro("Puppy","Marron",25,5.5,5,"nada");
        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());

        System.out.println("---------------------------------------");
        //cachorro2 = cachorro1;
        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());
    }
}
