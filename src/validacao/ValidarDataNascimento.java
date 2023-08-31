package validacao;

import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author davi_
 */
public class ValidarDataNascimento {
    
    private static Date dataValidada;
    
    public static void validar(String data) throws Exception, DateTimeException {
        if (data.isEmpty()) {
            throw new Exception("Campo data de nascimento deve ser preenchido");
        }
        String[] lista = data.split("/");
        int dia = Integer.parseInt(lista[0]);
        int mes = Integer.parseInt(lista[1]);
        int ano = Integer.parseInt(lista[2]);
        try {
            LocalDate dataValidacao = LocalDate.of(ano, mes, dia);
            SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
            dataValidada = formatador.parse(data);
        } catch (DateTimeException e) {
            throw new DateTimeException("Data inválida");
        }
    }
    
    public static Date getDataValidada(){
        return dataValidada;
    }

}
