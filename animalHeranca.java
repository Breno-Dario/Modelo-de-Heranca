// Criando um classe tipo Animal //
 class Animal {
    //Colocando Atribuito para cada animal//
    public void alimentar() {
        System.out.println("O animal veio se alimentar!.");
    }
}
    //Colocando Atribuito para cada animal//
class Cachorror extends Animal {
    public void correr() {
        System.out.println("O cachorror começou a correr sem explicação.");
    }
}
    //Colocando Atribuito para cada animal//
class Passaro extends Animal {
    public void voar() {
        System.out.println("O Pássaro foi embora voando.");
    }
}

 //Colocando Atribuito para cada animal//
class Gato extends Animal {
    public void miar() {
        System.out.println("O Gato começou a miar.");
    }
}

class AnimalDeEstimacao extends Animal {
    public void brincar() {
        System.out.println("O animal de estimação esta brincado");
    }

}

// Chamando atributo de cada animal//
public class animalHeranca {
    public static void main(String[] args) {
        Cachorror cachorror = new Cachorror();
        cachorror.alimentar();
        cachorror.correr();
        //cachorror.brincar(); Vai da erro porque o cachorror não tem o método de brincar, ou seja, não tem herança //

        Passaro passaro = new Passaro();
        passaro.voar();
        passaro.alimentar();
        //passaro.brincar(); Vai da erro porque o passáro não tem o método de brincar, ou seja, não tem herança //


        Gato gato = new Gato();
        gato.alimentar();
        gato.miar();
        //gato.brincar(); Vai da erro porque o gato não tem o método de brincar, ou seja, não tem herança //

        AnimalDeEstimacao animalDeEstimacao = new AnimalDeEstimacao();
        animalDeEstimacao.alimentar();
        animalDeEstimacao.brincar();
    }
}
