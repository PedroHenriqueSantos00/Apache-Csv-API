import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class PersistenciaMotoristas{
    public static final String SAMPLE_CSV_FILE_PATH = "motoristas.dat";
    public List<Motorista> motoristas;

    public PersistenciaMotoristas(){
        motoristas = new ArrayList<Motorista>();
    }

    public List<Motorista> carrega() throws IOException{
        try (
            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
        ) {
            int flag = 0;
            for (CSVRecord csvRecord : csvParser) {
                String cpf = csvRecord.get(0);
                String nome = csvRecord.get(1);
                Veiculo veiculo = csvRecord.get(2);
                FormaPagamento pagamento = csvRecord.get(3);

                if(flag == 1){
                    Motorista novoMotorista = new Motorista(cpf, nome, veiculo, pagamento);
                    motoristas.add(novoMotorista);
                } else {
                    flag++;
                }
            }
            return motoristas;
        } catch (IOException e){
            System.err.format("Erro de E/S: %s%n", e);
        }
    }
    public void persiste(){
        String fileName = "motoristas.dat";
        String currDir = Paths.get("").toAbsolutePath().toString();
        String nameComplete = currDir + "\\" + fileName;
        Path path = Paths.get(nameComplete);
        try(PrintWriter w = new PrintWriter(Files.newBufferedWriter(path, StandardCharsets.UTF_8))) {
            String linha = "cpf,nome,veiculo,pagamento";
            w.println(linha);
            for(Motorista m : motoristas){
                linha = m.getCPF() + "," + m.getNome() + "," + m.getVeiculo() + "," + m.pagamento();
                w.println(linha);
            }
        } catch (IOException e) {
            System.err.format("Erro de E/S: sn", e);
        }
    }
}