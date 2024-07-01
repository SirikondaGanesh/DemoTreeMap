//implimenting a program using TreeMap with student object Roll number as a key and student name as value
package com.collections;
//importing java.util.TreeMa for TreeMap
import java.util.TreeMap;
//class-declaration
public class DemoTreeMap1 {
    //main-function
	public static void main(String[] args) {
	//creating object for TreeMap	
    TreeMap<Integer, String> student = new TreeMap<Integer,String>();
    //using student object we declare put method declare key as  a rollnumber & value as a student name
    student.put(007, "Ganesh");
    student.put(040, "Raj");
    student.put(111, "Nithish");
    student.put(121, "Sudheer");
    student.put(161, "Prasad");
    student.put(199, "Shankar");
    student.put(176, "Anil");
    //print key & values
    System.out.println(student);
    student.put(126, "Hari");
  //print all keys & values  and printing in ascending order based on key
    System.out.println(student);
    //print size of keys
    System.out.println(student.size());
    //print value based on key
    System.out.println(student.get(111));
    
	}

}
