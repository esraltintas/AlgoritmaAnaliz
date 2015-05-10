/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointerbasedındex;

/**
 *
 * @author Esra
 */
public class PointerBasedIndex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kuyruk kuyruk = new Kuyruk();
        Dugum dugum1 = new Dugum(1);
        Dugum dugum2 = new Dugum(2);
        Dugum dugum3 = new Dugum(3);
        kuyruk.add(dugum1);
        kuyruk.add(dugum2);
        kuyruk.add(dugum3);
        kuyruk.showAllMembers();
        System.out.println(kuyruk.head.value);
        kuyruk.remove();
        System.out.println(kuyruk.head.value);
        kuyruk.showAllMembers();     
        System.out.println(kuyruk.get(2));
        System.out.println(kuyruk.getDeger(1));
    }
    
}
