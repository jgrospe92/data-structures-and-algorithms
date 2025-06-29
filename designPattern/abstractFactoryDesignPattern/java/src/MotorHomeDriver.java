import common.MotorHomesAbstractFactory;
import common.TypeAFactory;
import common.TypeBFactory;
import common.TypeCFactory;
import core.Engine;
import core.Style;

public class MotorHomeDriver {

    public static void main(String[] args) {
        MotorHomesAbstractFactory mhFactory = null;
        // Simulated user input
        String userTypeInput = "TypeB";

        switch (userTypeInput) {
            case "TypeA" -> {
                System.out.println("Type A motor home selected");
                mhFactory = new TypeAFactory();
            }
            case "TypeB" -> {
                System.out.println("Type B motor home selected");
                mhFactory = new TypeBFactory();
            }
            case "TypeC" -> {
                System.out.println("Type C motor home selected");
                mhFactory = new TypeCFactory();
            }
            default -> {
                System.out.println("Invalid motor home selected.");
            }
        }
        Style mhStyle = mhFactory.createStyle();
        Engine engine = mhFactory.createEngine();

        System.out.println("Component list for " + userTypeInput + " motor home");
        System.out.println(mhStyle.getStyle());
        System.out.println(engine.getEngine());
 }
}
