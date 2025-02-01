import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Loja.Petshop;

public class Main5 {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Rex","Marron",25,5.5,5,"nada");
        Gato gato1 = new Gato("Felix","Preto",4.5);
        Passaro passaro1 = new Passaro("Frajola","Azul",0.5);

        Petshop petshop = new Petshop();

        petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());


        petshop.darBanho(gato1);
        System.out.println(gato1.getEstadoDeEspirito());

        petshop.tosar(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());
    }
}
