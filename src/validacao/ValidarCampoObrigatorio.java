
package validacao;

/**
 *
 * @author davi_
 */
public class ValidarCampoObrigatorio {
    
    public static void validar(String txtField, String label) throws Exception {
        if (txtField.isEmpty()) {
            throw new Exception("Campo " + label + " deve ser preenchido");
        }
    }
}
