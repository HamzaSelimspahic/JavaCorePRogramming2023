package ba.smoki.tree.operator;

/**
 * <p>
 *     Unarni operatori:
 *     <li> +</li>
 *     <li> - </li>
 *     <li> ++ </li>
 *     <li> -- </li>
 *     <li> ! logicki komplement operator</li>
 * </p>
 */
public class UnaryDemo {
    public static void main(String[] args) {
        int number = +23;
        System.out.println(number);
        number = -23;
        System.out.println(number);
        number++; //POST increment
        System.out.println(number);
        ++number; //PRE increment
        System.out.println(number);
        number = 23;
        System.out.println(++number);
        boolean succes = false;
        System.out.println(!succes);

    }
}
