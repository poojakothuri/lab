import java.util.*;
import admission.marks;

class admissionListMain{
    public static void main(String args[]){
       marks m=new marks();
       m.getMathsMarks();
       m.getPhysicsMarks();
       m.getChemistryMarks();
       m.getEnglishMarks();
       m.eligible();

}}