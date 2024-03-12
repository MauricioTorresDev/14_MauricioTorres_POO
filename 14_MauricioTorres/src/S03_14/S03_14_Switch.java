
package S03_14;

public class S03_14_Switch {

    public static void main(String[] args) {

        int a = 12;
        switch (a) {
            case 1:
                System.out.println("opcion 1");
                break;
            case 2:
                System.out.println("opcion 2");
                break;
            default:
                System.out.println("No encontre las opciones");
                break;

        }

        String b = "pantalon";

        switch (b) {
            case "polo":
                System.out.println("Estas comprando un polo");
                break;
            case "short":
                System.out.println("Estas comprando un short");
                break;
            case "chompa":
                System.out.println("Estas comprando una chompa");
                break;
            default:
                System.out.println("No encontre la prenda");
                break;
        }

    }
}
