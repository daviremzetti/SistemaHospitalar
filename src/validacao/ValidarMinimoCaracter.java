
package validacao;

/**
 *
 * @author davi_
 */
public class ValidarMinimoCaracter {
    
    public ValidarMinimoCaracter(String label, String textField, int tamanho) throws Exception{
        if(textField.length() < tamanho){
            throw new Exception(label + " deve ter " + tamanho + " caracteres");
        }
    }
}
