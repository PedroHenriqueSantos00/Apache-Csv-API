public class Motorista{

 private int cpf;
 private String nome;
 private Veiculo veiculo;
 private FormaPagamento pagamento;

    public Motorista(int cpf, String nome, Veiculo veiculo, FormaPagamento pagamento){
        this.cpf = cpf;
        this.nome = nome;
        this.veiculo = veiculo;
        this.pagamento = pagamento;

    }

    public int getCPF(int cpf){
        return cpf;
    }

    public String getNome(String nome){
        return nome;
    }

    public Veiculo getVeiculo(Veiculo veiculo){
        return veiculo;
    }

    public FormaPagamento pagamento(FormaPagamento pagamento){
        return pagamento;
    }

    
}