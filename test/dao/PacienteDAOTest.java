/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.Date;
import modelo.Paciente;
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
public class PacienteDAOTest {
    private PacienteDAO dao;
    private Date nasc;
    private Paciente pac;
    
    public PacienteDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        dao = new PacienteDAO();
        nasc = new Date();
        pac = new Paciente();
        pac.setNome("Savana");
        pac.setEndereco("Rua GG");
        pac.setDataNascimento(nasc);
        pac.setTelefone("11111111");
        pac.setCpf("111.111.111-11");
        pac.setRg("111111");
        pac.setEmail("savana@gmail.com");
        pac.setConvenio(2);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of cadastrarPaciente method, of class PacienteDAO.
     */
    @Test
    public void testCadastrarPaciente() throws Exception {
        
        boolean cadastrado = dao.cadastrarPaciente(pac);
        assertTrue(cadastrado);
        
    }

    /**
     * Test of buscarPacienteFiltro method, of class PacienteDAO.
     */
    @Test
    public void testBuscarPacienteFiltroNome() throws Exception {
        ArrayList<Paciente> lista = dao.buscarPacienteFiltro("where NOME like '%avi%'");
        assertFalse(lista == null);
    }
    
    @Test
    public void testBuscarPacienteFiltroId() throws Exception {
        ArrayList<Paciente> lista = dao.buscarPacienteFiltro("where ID_PACIENTE = 10");
        assertFalse(lista == null);
    }
    
    @Test
    public void testBuscarPacienteFiltroCPF() throws Exception {
        ArrayList<Paciente> lista = dao.buscarPacienteFiltro( "where CPF = '050.733.729-80'");
        assertFalse(lista == null);
    }

    /**
     * Test of buscarPaciente method, of class PacienteDAO.
     */
    @Test
    public void testBuscarPaciente() throws Exception {
        ArrayList<Paciente> lista = dao.buscarPaciente();
        assertFalse(lista==null);
    }
    
}
