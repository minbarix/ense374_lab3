public class Interface{
    public static void main(String[] args){

            ListElement Lab = new ListElement();
            ListElement le = new ListElement();

            Lab.addElement(le);
            Lab.addElement(le);
            Lab.addElement(le);
            Lab.addElement(le);
            Lab.addElement(le);
            le.setData(1);
            le.setData(2);
            le.setData(3);
            le.setData(4);
            le.setData(5);


            ListElement storage = Lab.getElement(1);
            System.out.println(storage.getData());
     /*       for(int i = 2; i < 5; i++){
                System.out.println(storage.getData());
                storage = Lab.getElement(i);
            }

*/
    }
}