package aula02;

public class Aula02 {

    public static void main(String[] args) { // void → sem retorno
        Caneta c1 = new Caneta(); // foi criado o objeto "c1" da classe "Caneta"
        
        c1.cor = "azul"; // o atributo "cor" do objeto "c1" recebe "azul"
        c1.ponta = 0.5f; // o atributo "ponta" do objeto "c1" recebe "0.5"
        
        c1.tampar(); // foi chamado um método para tampar o objeto "c1" da classe "Caneta"
        c1.status(); // foi chamado um método para mostrar o status do objeto "c1" da classe "Caneta"
        c1.rabiscar(); // foi chamado um método para rabiscar com o objeto "c1" da classe "Caneta"
        
        Caneta c2 = new Caneta();
        
        c2.modelo = "bic";
        c2.cor = "preta";
        
        c2.destampar(); // a caneta está destampada
        c2.status();
        c2.rabiscar(); // então, é possível rabiscar com ela
    }
}
