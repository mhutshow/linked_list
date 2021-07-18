package cse220lab02;
public class MyList {
    Node head;
    
    public MyList(int[] a) {
    Node tail = null;
    for (int i=0 ; i < a.length ; i++){
     
        Node temp = new Node(a[i], null);
        if(head==null){
         head=temp;
         tail=temp;
        } 
        else{
        tail.next=temp;
        tail=temp;
        }
    }
   }
    
    
  public void showList(){
  if(head==null){
      System.out.println("Empty List");
  }
  else{
    System.out.print("[");
  for (Node n=head ; n!=null ; n=n.next){
      System.out.print(n.element);
      if(n.next!=null){
      System.out.print("->");
      }
  }
      System.out.println("]");
  }
  }


  public boolean isEmpty(){
        return head==null;
  }
  
  public void clear(){
   if(head!=null){
     for (Node n=head ; n!=null ; n=n.next){
     Node temp=head.next;
     head=null;
     head=temp;
   }
   } 
  }
  
  public void insert(Node newElement){
      
      for (Node n=head ; n!=null ; n=n.next){
       if(newElement.element==n.element){
           System.out.println("Already Exist");
       }
       else{
         if(n.next==null){
          n.next=newElement;
          break;
         }
       }
      } 
  }
  
  public void insert(int element, int index){
      Node newElement= new Node(element , null);
      if(index<0 || index>countList()){
          System.out.println("Invalid Index");
      }
      if(index==0){
       newElement.next=head;
       head=newElement;
      }
      else{
          Node pred=nodeAt(index-1);
          newElement.next=pred.next;
          pred.next=newElement;
      }
      
  }
  
    public int remove(int index){
      if(index<0 || index>countList()){
          System.out.println("Invalid Index");
      }
      Node removeNode;
      if(index==0){
       removeNode=head;
       head=head.next;
      }
      else{
          Node pred=nodeAt(index-1);
          removeNode=pred.next;
          pred.next=removeNode.next;
      }
      
      return removeNode.element;
      
  }
    
    public void evenScrapper(){
    Node evens=null;
    Node tail = null;
    for (Node n=head ; n!=null ; n=n.next){
        if(n.element%2==0){
           if(evens==null){
             evens=n;
             tail=n;
            } 
            else{
            tail.next=n;
            tail=n;
        }
      }
    } 
        printCustomList(head);
    }
    
    public boolean elementExist(int element){
    boolean flag = false;
    for (Node n=head ; n!=null ; n=n.next){
        if(n.element== element){
         flag=true;
        }
      }
    return flag;
    }
    
    public void reverseList(){
     Node newHead=null;
     Node n = head;
     while(n!=null){
     Node nextNode=n.next;
     n.next=newHead;
     newHead=n;
     n=nextNode;
     }
     head=newHead;
     printCustomList(newHead);
    }
    
    
   public void SortingList() {
      Node n = this.head;
      Node index = null;
      if (this.head != null) {
         while(n != null) {
            for(index = n.next; index != null; index = index.next) {
               if (n.element > index.element) {
                  int temp = n.element;
                  n.element = index.element;
                  index.element = temp;
               }
            }
            n = n.next;
         }
      }
      showList();
   }
   
   public int sum() {
     Node n = head;
      if (n == null) {
         return 0;
      } else {
         int total;
         for(total = 0; n != null; n = n.next) {
            total += n.element;
         }
         return total;
      }
   }
   
     public void rotateLeft(int time) {
      for(int i = 0; i < time; ++i) {
          Node n;
          for(n = head; n.next != null; n = n.next) {
         }
         Node temp = head.next;
        n.next = head;
        head.next = null;
        head = temp;
      }
   }

   public void rotateRight(int time) {
      for(int i = 0; i < time; ++i) {
      Node n = head;
      Node tail;
      for(tail = null; n.next != null; n = n.next) {
         if (n.next.next == null) {
            tail = n;
         }
      }
      Node temp = head;
      n.next = temp;
      head = n;
      tail.next = null;
      }
   }


    
 //Supporting mehods
    public int countList(){
        int count = 0;
        for (Node n=head ; n!=null ; n=n.next){
           count++;
        }
        return count;
    }
    
    public Node nodeAt(int index){
     Node nodeAt=head;
     for (int i =0 ; i < index ; i++){
        nodeAt=nodeAt.next;
       } 
     return nodeAt;
    }
  
  public void printCustomList(Node custom){
  if(custom==null){
      System.out.println("Empty List");
  }
  else{
    System.out.print("[");
  for (Node n=custom ; n!=null ; n=n.next){
      System.out.print(n.element);
      if(n.next!=null){
      System.out.print("->");
      }
  }
      System.out.println("]");
  }
  }

} 
    

