public class ListElement {
    private ListElement next;
    private ListElement previous;
    private int data;
    public int size = 0;

    public ListElement(){
        data = 0;
        next = null;
        previous = null;
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

    public void addElement(ListElement input){
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

    public void getElement(int retrieve){    //passing the index to retrieve
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
                for(int i = 1; i < retrieve; i++)
                    get = get.next; //traverse until get is at the index to be retrieved 
                return get;
            }
    }

    public void deleteElement(int delete){
        if (delete > size){
            System.out.println("You cannot delete outside the bounds of the list...");
        }
        else if (size == 1){
            ListElement temp = first;
            first = null;
            size--;
        }
        else if (delete == size){
            ListElement temp2 = first;
            for (int i = 1; i < (delete-1); i++)
                temp2 = temp2.next;
            ListElement current = last;
            last = prev;
            last.next = null;
            size--;
        }
        else if (delete == 1){
            ListElement temp3 = first;
            ListElement second = first.next;
            first = second;
            size--;
        }
        else{
            ListElement temp4 = first;
            for (int i = 1; i < (delete-1); i++)
            temp4 = temp4.next;
            ListElement current = temp4.next;
            ListElement after = current.next;
            temp4.next = after;
            size--;
        }
//if there is a single element
//delete first (size == 1)
//delete last (delete == size)
//delete in the middle 


    }


}