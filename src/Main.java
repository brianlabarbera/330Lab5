public class Main {
    public static void main(String[] args) {

        Address address1 = new Address("810 Bloomingdale Rd", "Staten Island", "NY", "10309");
        Address address2 = new Address("380 Linden Ct", "Tannersville", "PA", "18372");

        Student student1 = new Student("Brian LaBarbera", 23636489, 2.9, address1);
        Student student2 = new Student("Christina Ciardiello", 87398274, 3.8, address2);


        System.out.println("Are student1 and student2 equal? " + student1.equals(student1,student2));

        System.out.println("student1: " + student1.toString(student1));
        System.out.println("student2: " + student2.toString(student2));

        Student copiedStudent1 = student1.copy();
        System.out.println("Are student1 and copiedStudent1 equal? " + student1.equals(student1, copiedStudent1));

        Student copiedStudent2 = new Student(student2);
        System.out.println("Are student2 and copiedStudent2 equal? " + student2.equals(student2, copiedStudent2));
    }

}