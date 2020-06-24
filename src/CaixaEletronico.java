
public class CaixaEletronico {
    private int saldoCaixa;
    private int numeroSaques;
    private int numeroDeposito;

    public int getQuantiaDinheiro() {
        return saldoCaixa;
    }

    public void setQuantiaDinheiro(int quantiaDinheiro) {
        this.saldoCaixa = quantiaDinheiro;
    }

    public int getNumerosSaques() {
        return numeroSaques;
    }

    public void setNumerosSaques(int numerosSaques) {
        this.numeroSaques = numerosSaques;
    }

    public int getNumerosDeposito() {
        return numeroDeposito;
    }

    public void setNumerosDeposito(int numerosDeposito) {
        this.numeroDeposito = numerosDeposito;
    }
    
    boolean sacar(int quantia){
    if (quantia <= saldoCaixa) {
            numeroSaques++;
            saldoCaixa -= quantia;
            return true;
        } else {
            return false;
        }
        
    }
    
    boolean depositar(int quantia){
            numeroDeposito++;
        saldoCaixa += quantia;
        return true;
    }
    
}
