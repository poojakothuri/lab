// import java.util.*;

class circle{
    double radius;
    circle(int radius){
        this.radius=radius;
    }
    double getArea(){
        return Math.PI*radius*radius;
    }

    double getPerimeter(){
         return 2*Math.PI*radius;
    }
}
class area{
    public static void main(String args[]){
    circle c1=new circle(7);
    System.out.println(c1.getArea());
    System.out.println(c1.getPerimeter());
  }
}