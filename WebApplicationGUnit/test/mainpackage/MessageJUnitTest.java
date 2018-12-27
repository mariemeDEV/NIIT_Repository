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
import org.junit.Ignore;

/**
 *
 * @author suley
 */
public class MessageJUnitTest {
    String message ,message1 ,message2 ,tt;
    Message unMessage ,unMessage1 ,unMessage2 ;
    @Before
    public void setUp() {
         message = "Salut les guy de niit" ;
         message1  = "je suis de Niit";
         tt = "je suis toto"; // il faut eviter les espaces a la fin des chaines de caracters
         message2  = "je suis en licence 7";
        
         unMessage  = new Message(message) ;// ici on initialise la classe Message deja definis avec la clsse Messagejava en lui donnant nos parametre a tester
         unMessage1 = new Message("je suis toto") ;// Message unMessage1 = new Message(tt)
         unMessage2 = new Message(message2) ;
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
      @Test
        public void testerLeMessageAfficher () throws Exception
        {
            // il faut bien comprendre que avec junit si la 1er test ne marche pas alors il va s'arreter et donc le test des autres methodes suivants ne seront pas verifier
            assertEquals(message, unMessage.getMessage());
            assertEquals("ce messsage a echouer","je suis", unMessage1.getMessage());// le getMessage indique a notre methode quelle sera la methode utiliser au niveau de la claase Message
            assertEquals("ce messsage va echouer", unMessage2.getMessage());
        }
      
        @Ignore("je suis pas prete") 
        @Test
        public void testerLeMessageAfficher2 () throws Exception
        {
            // il faut bien comprendre que avec junit si la 1er test ne marche pas alors il va s'arreter et donc le test des autres methodes suivants ne seront pas verifier
            assertEquals(message, unMessage.getMessage());
            assertEquals("ce messsage a echouer","je suis toto", unMessage1.getMessage());// le getMessage indique a notre methode quelle sera la methode utiliser au niveau de la claase Message
            assertEquals(message2, unMessage2.getMessage());
        }
}
