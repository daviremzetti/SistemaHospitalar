/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
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
public class ConexaoBancoTest {

    private ConexaoBanco con;

    public ConexaoBancoTest() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        con = new ConexaoBanco();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getConexao method, of class ConexaoBanco.
     */
    @Test
    public void testGetConexao() throws Exception {

        assertFalse(con.getConexao() == null);
    }

}
