public class Caneta {
    String modelo; // foi declarado o tipo dos atributos
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status() { // um método para mostrar o estado dos objetos (c1 e c2 / this)
        System.out.println("Modelo: " + this.modelo); // this é o nome do objeto que chamou (c1 ou c2)
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    
    void tampar(){ // um método para que o objeto que chamou (c1 ou c2 / this) seja tampado
        this.tampada = true;
    }
    
    void destampar(){ // um método para que o objeto que chamou (c1 ou c2 / this) seja destampado
        this.tampada = false;
    }
    
    void rabiscar(){ // um método para rabiscar com o objeto, dependendo se ele está tampado ou não
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }
}
