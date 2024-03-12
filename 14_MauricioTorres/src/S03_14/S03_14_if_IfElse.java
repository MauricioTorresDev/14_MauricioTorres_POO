
package S03_14;

public class S03_14_if_IfElse {

    public static void main(String[] args) {
        boolean a = false;
        int b = 5;
        //if simple
        if (a) {
            System.out.println("hola");
        }
        //if else
        if (a) {
            System.out.println("ejecucion true");
        } else {
            System.out.println("ejecucion false");
        }
        
      a= true;
        if (b==10) {
            System.out.println("b vale 10");
        } else if(b==20) {
            System.out.println("b vale 20");
        } else if(b==30){
            System.out.println("b vale 30");
        }else{
            System.out.println("no cumple");
        }
        
        
        
        
    }
    
    
}
