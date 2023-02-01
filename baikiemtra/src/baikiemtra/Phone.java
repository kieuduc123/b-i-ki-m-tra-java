/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baikiemtra;

public abstract class Phone {
    abstract void insertPhone(String Name, String Phone);
    abstract void removePhone(String Name);
    abstract void deletePhone(String Name, String newPhone);
    abstract void searchPhone(String Name);
    abstract void sort();

}
