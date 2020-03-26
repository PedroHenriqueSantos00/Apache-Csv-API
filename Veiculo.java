public class Veiculo{
    private String placa;
    private String marca;
    private String cor;
    private String categoria;

    public Veiculo(String placa, String marca, String cor, String categoria){
        this.placa = placa;
        this.marca = marca;
        this.cor = cor;
        this.categoria = categoria;
    }
    

    public String getPlaca(){
        return placa;
    }

    public String getMarca(){
        return marca;
    }

    public String getCor(){
        return cor;
    }

    public String getCategoria(){
        return categoria;
    }

    public String toString(){
        return "[placa: " + placa + ", marca: " + marca + ", cor: " + cor + ", categoria: " + categoria + "]";
    }
}