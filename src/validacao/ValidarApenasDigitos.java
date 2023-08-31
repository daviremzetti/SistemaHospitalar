
package validacao;

/**
 *
 * @author davi_
 */
public class ValidarApenasDigitos {
    
    public ValidarApenasDigitos(String texto, String label) throws Exception{
        boolean validado = texto.matches("[0-9]*");
        if(!validado){
            throw new Exception("Digitar apenas números para " + label);
        }
    }
}
