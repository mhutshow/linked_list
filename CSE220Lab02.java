package cse220lab02;
public class CSE220Lab02 {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1: Creating List from an array");
        int[] array = {10, 11, 12, 13,1,15,9,87,20,36};
        MyList object = new MyList(array);
        
        //Task2
        object.showList();
        
        //Task 3
        boolean isEmpty = object.isEmpty();
        System.out.println(isEmpty);
        
        //Task 4 xommenting out as its clears the head;
        //object.clear();
        //object.showList();
        
        //Task5
        Node insert= new Node(50,null);
        object.insert(insert);
        object.showList();
        
        //Task 6
        object.insert(100 , 3);
        object.showList();
        
        //Task 7
        object.remove(3);
        object.showList();
        
        
        
        
        //Advance Operation
        //Task 1
        object.evenScrapper();
        
        //Task2
        boolean elementExist=object.elementExist(10);
        System.out.println(elementExist);
        
        //Task3
        object.reverseList();
        
        //Task4
        object.SortingList();
        
        //Task5 
        int sum= object.sum();
        System.out.println(sum);
        
        //Task6
        object.rotateLeft(3);
        object.showList();
        object.rotateRight(3);
        object.showList();
    }
    
}
