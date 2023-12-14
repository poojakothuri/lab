import java.util.*;
class person{
    String name,address;
    person(String n,String a){
        name=n;
        address=a;
    }
   public String toString(){
    return name+" "+address;
   }
}
class student extends person{
    double avgGrade=0;
    double numCourses;
     student(String n,String a,int num){
        super(n,a);
        numCourses=num;
        setCourses();
     }
     private Map<String,Double> courses=new HashMap<>();
    void setCourses(){
        Scanner sc=new Scanner(System.in);
     if(numCourses>30) System.out.println("more than 30 courses is not allowed");
     for(int i=0;i<numCourses;i++){
        System.out.println("enter course name and respective grade obtained: ");
        String s;
        double g;
        s=sc.next();
        g=sc.nextDouble();
        if(courses.get(s)!=null) System.out.println("course already exists");
       else{ avgGrade+=g;
        courses.put(s,g);
       }
     }
  }
    boolean addCourse(String c,double grade){
             if(courses.size()>=30) {System.out.println("max courses reached ,new course can't be added"); return false; }
             if(courses.get(c)!=null) return false;
        courses.put(c,grade); avgGrade+=grade;
        return true;
    }
   
    void printCourse(){
        Set<Map.Entry<String,Double>> entryset=courses.entrySet();
        for(Map.Entry<String,Double> it:entryset){
            System.out.println(it.getKey()+" "+it.getValue());
        }
    }
    double getAvg(){
        return avgGrade;
    }
}

class teacher extends person{
    double avgGrade=0;
    int numCourses;
     teacher(String n,String a, int num){
        super(n,a);
        numCourses=num;
        setCourses();
     }
     private List<String> l=new ArrayList<>();
    
    void setCourses(){
     if(numCourses>5) System.out.println("more than 5 courses is not allowed");
     System.out.println("enter course name  ");
     for(int i=0;i<numCourses;i++){
       Scanner sc=new Scanner(System.in);
        String s;
        s=sc.next();
        if(l.contains(s)) System.out.println("course already exists");
        else l.add(s);
     }
  }
    boolean addCourse(String c){
             if(l.size()>=5) {System.out.println("max courses reached ,new course can't be added"); return false; }
             if(l.contains(c)) return false;
          l.add(c); 
         return true;
    }
    boolean removeCourse(String c){
        if(l.contains(c)==false) return false;
        else {
            int ind=l.indexOf(c);
            l.remove(ind);
        }
        return true;
    }

}
class courses{
    public static void main(String args[]){
     student s=new student("ram","hyd",5);
     System.out.println(s.addCourse("a",8));
      System.out.println(s.addCourse("dbms",8));
      s.printCourse();
      s.getAvg();
      teacher t=new teacher("dev","knr",4);
     System.out.println(t.addCourse("ss"));
     System.out.println( t.addCourse("flat"));
     System.out.println( t.removeCourse("dbms"));
     System.out.println( t.removeCourse("da"));


    }
}