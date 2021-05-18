package tutorials.ocp.whatarenotocp.example2;

/**
 * @author Waterball (johnny850807@gmail.com)
 */
public class Cat {
    // Violate OCP: directly coupled with "eat"
    public void eat() {
        System.out.println("eat");
    }

    // Violate OCP: directly coupled with "sleep"
    public void sleep() {
        System.out.println("sleep");
    }
}
