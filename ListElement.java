public class ListElement {
    private ListElement next;
    private ListElement previous;
    private int data;

    public ListElement(){
        this.data = 0;
        this.next = null;
        this.previous = null;
    }

    public ListElement(ListElement temp){
        data = temp.data;
    }

    public int getData(){
        return data;
    }

    public void setData(int tempData){
        data = tempData; //check if this works
    }

    public addElement(ListElement input){

    }

    public getElement(int retrieve){

    }

    public deleteElement(int delete){
        
    }

}