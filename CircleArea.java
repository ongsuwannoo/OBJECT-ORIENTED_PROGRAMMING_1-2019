import java.util.*;

public class CircleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double redius = input.nextDouble(), area;
        area = Math.PI*Math.pow(redius, 2);
        System.out.println(area);
    }
}