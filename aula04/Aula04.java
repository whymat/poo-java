public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("Stabilo", "Amarela", 0.4f, true);
        c1.status();
        
        Caneta c2 = new Caneta("Zebra", "Vermelha", 0.7f, false);
        c2.status();
    }
}
