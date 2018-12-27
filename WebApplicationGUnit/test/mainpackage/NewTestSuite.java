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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author suley
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({mainpackage.EmployeUtilTest.class, mainpackage.MessageJUnitTest.class, mainpackage.CalculatorImplTest.class, mainpackage.CalculClassTest.class})
public class NewTestSuite {

    
    @Before
    public void setUp() throws Exception {
    }

 
    
}
