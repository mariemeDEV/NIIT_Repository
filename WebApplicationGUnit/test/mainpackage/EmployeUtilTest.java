/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author suley
 */
public class EmployeUtilTest {
    
     EmployeUtil salAnnuel ;
     EmployeClass employesalaire;
     double salaire =550000 ;
     double salaireannuelle ;
     @Before
     public void setUp() {
        employesalaire = new EmployeClass("nom", "prenom", salaire, 0);
        salAnnuel = new EmployeUtil();
        salaireannuelle = salAnnuel.calculerSalaireAnnuel(employesalaire);   
    }
    /**
     * Test of calculerSalaireAnnuel method, of class EmployeUtil.
     */
    @Test
    public void testCalculerSalaireAnnuel() {
        assertEquals("Erreur dans calcuer salaire annuel", 6600000,salaireannuelle,0.0);
        assertEquals("Erreur dans calcuer salaire annuel", 0, salaireannuelle-6600000,0.0);
        assertEquals("Erreur dans calcuer salaire annuel", -100000, salaireannuelle-6700000,0.0);
        System.out.println(salaireannuelle);
}
}