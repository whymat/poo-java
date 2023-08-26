public class Aula05 {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1234);
        p1.setDono("Julio");
        p1.abrirConta("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(5678);
        p2.setDono("Marcia");
        p2.abrirConta("CP");
        
        p1.depositar(150);
        p2.depositar(500);
        p2.sacar(100);
        
        p1.sacar(200);
        p1.fecharConta();
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
}
