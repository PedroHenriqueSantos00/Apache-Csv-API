public class Passageiro{

    private String cpf;
    private String nome;
    private FormaPagamento formaPagto;
    private String nroCartao;

    public Passageiro(String cpf, String nome, FormaPagamento formaPagto, String nroCartao){
        this.cpf = cpf;
        this.nome = nome;
        this.formaPagto = formaPagto;
        this.nroCartao = nroCartao;
    }

    public String getCPF(){
        return this.cpf;
    }

    public String getNome(){
        return this.nome;
    }

    public FormaPagamento getFormaPagto(){
        return this.formaPagto;
    }

    public String getNroCartao(){
        return this.nroCartao;
    }


}