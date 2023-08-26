public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("--------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada pois ainda tem dinheiro!");
        } else if(this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada pois ainda tem débito!");
        } else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float v){
        if (this.isStatus() == true) {
            this.setSaldo(getSaldo() + v); // ou this.saldo = this.saldo + v
            System.out.println("Depósito realizado com sucesso na conta de " + this.getDono() + "!");
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }
    
    public void sacar(float v){
        if (this.isStatus() == true) {
            if (this.getSaldo() >= v) {
                this.setSaldo(getSaldo() - v);
                System.out.println("Saque realizado com sucesso na conta de " + this.getDono() + "!");
            } else {
                System.out.println("Saldo insuficiente para saque!");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }
    
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if(this.getTipo() == "CP") {
            v = 20;
        }
        
        if (this.isStatus() == true) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono() + "!");
        } else {
            System.out.println("Impossível pagar com uma conta fechada!");
        }
    }

    public ContaBanco() {
        this.setSaldo(0); // this.saldo = 0;
        this.setStatus(false); // this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
