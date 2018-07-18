/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antiifcampaign;

/**
 *
 * @author claudio
 */
public class AntiIfCampaign {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Engineer eng = new Engineer("123");
        Admin adm = new Admin("1");
        Employee emp = new Employee("0000000");

        // we can use Polymorfism to avoid if-else statements
        blame(eng);
        blame(adm);
        blame(emp);

    }

    // The correct function is automatically invoked
    private static void blame(Employee emp) {
        System.out.println("Employee, is your fault!" + emp.cf);
    }

    private static void blame(Engineer eng) {
        System.out.println("Is all your fault!" + eng.cf);
    }

    // If blame(Admin adm) is not implemented, the Admin case
    // automatically fallback into superclass Employee
//    private static void blame(Admin adm) {
//        System.out.println("Maybe is your fault..." + adm.cf);
//    }
    
    private static class Employee {

        public String cf;

        public Employee(String cf) {
            this.cf = cf;
        }
    }

    // These classes are just "tagged" version of Employee class
    private static class Engineer extends Employee {

        // Remember that Constructors are not inherited
        // We have to re-declare the constructor
        public Engineer(String cf) {
            super(cf);
        }
    }

    private static class Admin extends Employee {

        public Admin(String cf) {
            super(cf);
        }
    }

}
