/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package servicos;

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
public class ServicosFactoryTest {
    
    private ServicosFactory sf;
    private PacienteServicos ps;
    private ConvenioServicos cs;
    
    public ServicosFactoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        sf = new ServicosFactory();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPacienteServicos method, of class ServicosFactory.
     */
    @Test
    public void testGetPacienteServicos() {
        ps = ServicosFactory.getPacienteServicos();
        assertFalse(ps == null);
    }

    /**
     * Test of getConvenioServicos method, of class ServicosFactory.
     */
    @Test
    public void testGetConvenioServicos() {
        cs = ServicosFactory.getConvenioServicos();
        assertFalse(cs == null);
    }
    
}
