import java.util.*;
import shape.circle;
import shape.square;
import shape.triangle;


class areaPerimeterMain{
    public static void main(String args[]){
        System.out.println("1 - circle \n 2 - square \n 3 - triangle");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch(n){
            case 1:{
                circle c=new circle();
                System.out.println("area of circle: "+ c.area(3.4));
                System.out.println("perimeter of circle: "+ c.perimeter(3.4));
                break;
            }
            case 2:{
                square s=new square();
                System.out.println("area of square: "+ s.area(3));
                System.out.println("perimeter of square: "+ s.perimeter(3));
                break;
            }
            case 3:{
                triangle t=new triangle();
                System.out.println("area of triangle: "+ t.area(3,4));
                System.out.println("perimeter of triangle: "+ t.perimeter(3,4,5));
                break;
            }
        }
    }
}