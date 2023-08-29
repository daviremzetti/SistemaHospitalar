/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package dao;

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
public class DAOFactoryTest {
    
    private DAOFactory dao;
    
    public DAOFactoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPacienteDAO method, of class DAOFactory.
     */
    @Test
    public void testGetPacienteDAO() {
       PacienteDAO daoPac = DAOFactory.getPacienteDAO();
       assertFalse(daoPac == null);
    }

    /**
     * Test of getConvenioDAO method, of class DAOFactory.
     */
    @Test
    public void testGetConvenioDAO() {
        ConvenioDAO daoConv = DAOFactory.getConvenioDAO();
        assertFalse(daoConv == null);
    }
    
}
