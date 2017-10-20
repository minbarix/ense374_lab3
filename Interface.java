public class Interface{
    public static void main(String[] args){

            ListElement Lab = new ListElement();
            ListElement le = new ListElement();

            le.setData(10);
            Lab.addElement(le);
            le.setData(20);
            Lab.addElement(le);
            le.setData(30);
            Lab.addElement(le);
            le.setData(40);
            Lab.addElement(le);
            le.setData(50);
            Lab.addElement(le);

            System.out.println("Manual reading of list elements using built in functions: ");
            ListElement storage = Lab.getElement(1);
            System.out.println(storage.getData());

            for(int i = 2; i < 6; i++){
                storage = Lab.getElement(i);
                System.out.println(storage.getData());
            }

            Lab.print();
          //  ListElement testfunc = Lab.deleteElement(1);
    }
}