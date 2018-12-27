/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

/**
 *
 * @author suley
 */
public class CalculatorImpl implements calculatorInterface{
/*
  ce test additionne deux entier a & b et on a deux condition a verifier si b<0 ou b>0
    cas ou b>0 [1 , +infini] : temps que b-- different de 0 ((b-1)!=0) ou b!=1 faite a++ (a+1) 
    cas ou b<0 : temps que b++ different de 0 ((b+1)!=0) faite a-- (a-1)
  */
    @Override
    public int addition(int a, int b) {
        int res = a ;
        if (b>0)/*[1 , +infini]*/ {
            while (b-- != 0)/*[2 , +infini]*/ {                
             res++  ;   /* res++ = res +1 */
            }
            
        } else if (b<0) {
            while (b++ != 0) {                
               res-- ; 
            }
        }
        return res;
        
    }

    @Override
    public int soustrat(int a, int b) {
         int res = a -b ;
        
        return res;
         }

    @Override
    public int multiply(int a, int b) {
        int res = a* b ;
        return res ;
    }

    @Override
public int division(int a, int b) {
	if (b == 0) {
		throw new ArithmeticException();
        }
	boolean resEstNegatif = false;
	int res = 0;
	if ( a < 0) {
		resEstNegatif = !resEstNegatif;
		a = -a;
	}
	if ( b < 0) {
		resEstNegatif = !resEstNegatif;
		b = -b;
	}
	while (a > 0) {
	        a = soustrat(a, b);
		res++;
	}
	if (resEstNegatif) {
		res = -res;
        }
	return res;
}

    
}
