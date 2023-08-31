
package validacao;

import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author davi_
 */
public class ValidarMaximoCaracter extends PlainDocument {
    
    private String campo;
    private int limite;
    
    public ValidarMaximoCaracter(int limite, String campo) {
        super();
        this.limite = limite;
        this.campo = campo;
    }
    /**
     *
     * @param offs
     * @param str
     * @param a
     * @throws BadLocationException
     */
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException, StringIndexOutOfBoundsException {
        try {
            int tamanho = this.getLength() + str.length();
            if (tamanho <= limite) {
                super.insertString(offs, str, a);
            } else {
                String novaStr = str.substring(0, limite);
                super.insertString(offs, novaStr, a);
            }
        } catch (BadLocationException | StringIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Campo " + campo + " deve ter no máximo " + limite + " caracteres");
        }

    }
}
