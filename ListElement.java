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
        ListElement temp = new ListElement(input);
        input.next = null; //creation of next element after this input

        if(first  != null){ //if there are existing elements
            last.next = temp; //point last element to new element
            last = temp;    //set this element to be last
        }
        else{
            first = temp;   //set the new input to be the first and last element
            last = first;
        }
    }

    public getElement(int retrieve){    //passing the index to retrieve
            if (n > size){
                System.out.println("You cannot access outside the bounds of the list...");
                return null;
            }
           else  if (n == size){    //return when last element is picked
                return last;
            }
            else if (n == 1){   //return if first element is picked
                return first;
            }
            else {  //anywhere in between first and last
                ListElement get = first;
                for(int i = 0; i < retrieve; i++)
                    get = get.next; //traverse until get is at the index to be retrieved 
                return get;
            }
    }

    public deleteElement(int delete){

    }

}