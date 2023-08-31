
package validacao;

/**
 *
 * @author davi_
 */
public class ValidarEmail {
    
    public ValidarEmail(String email) throws Exception{
        if(!email.isEmpty()){
            boolean validado = email.matches("[A-Za-z0-9.]+@[A-Za-z0-9.]+.[A-Za-z0-9.]+");
            if(!validado){
                throw new Exception("E-mail inválido");
            }
        }
        
    }
}
