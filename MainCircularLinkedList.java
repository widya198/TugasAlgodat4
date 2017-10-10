
package CircularLinkedList;

public class MainCircularLinkedList {
    public static void main(String[] args) {
        ChainCircular c = new ChainCircular();
        System.out.println("Apakah kosong?\t\t\t\t"+c.isEmpty());
        c.add(0, 0);
        c.add(1, 1);
        c.add(2, 2);
        c.add(3, 3);
        c.add(4, 4);
        c.add(5, 6);
        c.add(0, 5);
        c.add(0, 8);
        System.out.println("isi elemen setalah d isi\t\t"+c.toString());
        System.out.println("Element di index 0 =\t\t\t"+c.get(0));
        System.out.println("Index dari elemen E = \t\t\t"+c.indexOf(3));
        c.remove(6);
        System.out.println("isi elemen setelah index 6 d hapus = \t"+c.toString());
        c.clear();
        System.out.println("isi elemen setelah di clear =\t\t"+c.toString());
    }
}
