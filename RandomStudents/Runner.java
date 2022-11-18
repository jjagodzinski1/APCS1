package RandomStudents;

/*
* Group Creator
*
* V1.0
* 9/2/2022
* @Author: Jacob Jagodzinski
*/

import java.util.ArrayList;

public class Runner {
    
    public static void main(String[] args){

        //Initializes all muy different courses
        Course b1 = new Course(initB1());
        Course w2 = new Course(initW2());
        Course w6 = new Course(initW6());
        Course b7 = new Course(initB7());
        Course w8 = new Course(initW8());

        //How many people in each group you want
        int groupNum = 3;

            groups(w2, groupNum);
         
    }

    public static void groups(Course c, int groupNum){
        ArrayList<String> student = c.getStudents();
        int classSize = student.size();
        int tempSize = 0;
        while (classSize!=0){
            if (tempSize != groupNum-1){
                int index = (int) (Math.random()*classSize);
                System.out.print(student.get(index)+", ");
                student.remove(index);
                classSize = student.size();
                tempSize++;
            }
            else{
                int index = (int) (Math.random()*classSize);
                System.out.println(student.get(index));
                student.remove(index);
                classSize = student.size();
                tempSize=0;
            }
            

        }

    }

    public static ArrayList<String> initB1(){
        ArrayList<String> studentList = new ArrayList<String>();
        studentList.add("Adi A");
        studentList.add("Phoebe C");
        studentList.add("Olena C");
        studentList.add("Tenny D");
        studentList.add("Sayam G");
        studentList.add("Kent H");
        studentList.add("Mason H");
        studentList.add("Ray H");
        studentList.add("Matthew H");
        studentList.add("Aiden L");
        studentList.add("Jonah S");
        studentList.add("Frank S");
        studentList.add("Asher S");
        studentList.add("Anderew J");
        studentList.add("Rohan S");
        studentList.add("Jeremy W");
        studentList.add("Sam W");
        studentList.add("Max Y");
    

       
        return studentList;
    }
    public static ArrayList<String> initW2(){
        ArrayList<String> studentList = new ArrayList<String>();
        studentList.add("Kelly B");
        studentList.add("Natalie B");
        studentList.add("Vlad C");
        studentList.add("Matthew C");
        //studentList.add("Lucy E");
        studentList.add("Sancho G");
        studentList.add("Pricilla G");
        studentList.add("John H");
        studentList.add("Aiden Q");
        //studentList.add("James R");
        studentList.add("Ahren R");
        studentList.add("Hargun S");
        studentList.add("Alex W");
        studentList.add("Jin Z");
       
        return studentList;
    }
    public static ArrayList<String> initW6(){
        ArrayList<String> studentList = new ArrayList<String>();
        studentList.add("Alex A");
        studentList.add("Olivia B");
        studentList.add("Chrsitan B");
        studentList.add("Abheek D");
        studentList.add("Brian D");
        studentList.add("Geoffrey G");
        studentList.add("Olivia H");
        studentList.add("Aditya J");
        studentList.add("David J");
        studentList.add("Robbie M");
        studentList.add("Grant M");
        studentList.add("Frank N");
        studentList.add("Aparneesh P");
        studentList.add("Robert Q");
        studentList.add("Owen S");
        studentList.add("Kevin T");
        studentList.add("Aaron T");
        studentList.add("Ashmit T");
        studentList.add("Amelia W");
        studentList.add("Edward Z");
        studentList.add("Hariswar B");

        return studentList;
    }
    public static ArrayList<String> initB7(){
        ArrayList<String> studentList = new ArrayList<String>();
        studentList.add("Pranay A");
        studentList.add("Jake B");
        studentList.add("Alexander C");
        studentList.add("Keegan C");
        studentList.add("Aronno D");
        studentList.add("Zach H");
        studentList.add("Manya J");
        studentList.add("Qianyi K");
        studentList.add("Aalaa M");
        studentList.add("Sahasra M");
        studentList.add("Urmll P");
        studentList.add("Nick P");
        studentList.add("Jack S");
        studentList.add("Jenna S");
        studentList.add("Dominic S");
        //studentList.add("Tyler S");
        studentList.add("Anderson W");
        studentList.add("William Y");
        studentList.add("Rex Z");

        return studentList;
    }
    public static ArrayList<String> initW8(){
        ArrayList<String> studentList = new ArrayList<String>();
        studentList.add("Avery A");
        studentList.add("Matthew B");
        studentList.add("Maria B");
        studentList.add("Matthew C");
        studentList.add("Pranavi C");
        studentList.add("Henry G");
        studentList.add("Max H");
        studentList.add("Dylan H");
        studentList.add("Martin H");
        studentList.add("Maria J");
        studentList.add("Sage P");
        studentList.add("Jett R");
        studentList.add("Charlie R");
        studentList.add("Mikki S");
        studentList.add("Sami S");
        studentList.add("Braylon T");
        studentList.add("Adonis W");

        return studentList;
    }

}
