/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package dao;

import java.sql.SQLException;
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
public class ConvenioDAOTest {
    
    private ConvenioDAO dao;
    
    public ConvenioDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        dao = new ConvenioDAO();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testaBuscarConvenios() throws SQLException{
        ArrayList<Convenio> lista = dao.buscarcConvenios();
        assertTrue(lista != null);
    }
    
    @Test
    public void testaBuscarConvenioFiltro() throws SQLException{
        Convenio busca = dao.buscarConvenioFiltro("med");
        String nomeBuscado = busca.getNomeConvenio();
        String nomeEsperado = "Unimed";
        assertEquals(nomeEsperado, nomeBuscado);
    }
}
