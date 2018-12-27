/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

/**
 *
 * @author suley        laravel
 */
// creation dela classe Message
public class Message {
    
                private String message ;//la classe comporte un attribut message de type String

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        System.out.println(message);
        return message;
    }
}
              