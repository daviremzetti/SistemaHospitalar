/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package servicos;

import java.util.ArrayList;
import modelo.Convenio;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas
 */
public class ConvenioServicosTest {
    
    private ConvenioServicos cs;
    
    public ConvenioServicosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        cs = new ConvenioServicos();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of buscarConvenio method, of class ConvenioServicos.
     */
    @Test
    public void testBuscarConvenio() throws Exception {
        ArrayList<Convenio> result = cs.buscarConvenio();
        assertFalse(result == null);
    }
    
}
