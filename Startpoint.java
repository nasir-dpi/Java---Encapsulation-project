
package oop;


public class Startpoint {
     public static void main(String[] args) {
         
         Student bio = new Student();
         bio.setStudentid("29");
         bio.setStudentName("Nasir");
         bio.setAge("20");
         bio.setAddress("Dhaka");
         bio.setStudentDepartment("CSE");
         bio.setStudentEmail("uddinrjnasir@gmail.com");
         System.out.println("Name : " + bio.getStudentName() + " ID: " + bio.getStudentid() + " Age :" + bio.getAge() + " Address : " + bio.getAddress() + " Department : " + bio.getStudentDepartment() + " Email: " + bio.getStudentEmail());
         
         
}
     
     
}
