import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){
        Squard squard1 = new Squard();
        Squard squard2 = new Squard(21.6, 13.7);

        System.out.println();
        System.out.println("Quadrilatère 1");
        System.out.println("Périmètre =" +squard1.perimeter());
        System.out.println("Surface =" +squard1.surface());
        System.out.println();
        System.out.println("Quadrilatère 2");
        System.out.println("Périmètre =" +squard2.perimeter());
        System.out.println("Surface =" +squard2.surface());
    }

}