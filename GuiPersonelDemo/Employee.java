/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personel;

/**
 *
 * @author Chamikorn 2015
 */
public abstract class Employee {

    int id;
    String name;
    String position;

}

class Salary extends Employee {

    double salary;

    Salary(int i, String n, String p, double s) {
        id = i;
        name = n;
        position = p;
        salary = s;
    }

}

class Hourly extends Employee {

    double rate;
    int hour;

    Hourly(int i, String n, String p, double r, int h) {
        id = i;
        name = n;
        hour = h;
        rate = r;
        position = p;
    }

}
