class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
    }
}

class MyLinkedList {
    //Amazon,Google,Microsoft
    ListNode head;
    int size=0;
    public MyLinkedList() {
        head=new ListNode(0);
        int size=0;
    }
    
    public int get(int index) {
        if(index<0){
            return -1;
        }
        if(index>=size){
            return -1;
        }
        ListNode curr=head;
        for(int i=0;i<=index;i++){
            curr=curr.next;
        }
        return curr.val;

    }
    
    public void addAtHead(int val) {
        //Time Complexity:O(1)
        addAtIndex(0,val);
    }
    
    public void addAtTail(int val) {
        //Time Complexity:O(n)
        addAtIndex(size,val);
        
    }
    
    public void addAtIndex(int index, int val) {
        //Time Complexity: O(n)
        if(index<0){
            return;
        }
        if(index>size){
            return;
        }
        ListNode curr=head;
        size++;
        for(int i=0;i<index;i++){
            curr=curr.next;
        }
        ListNode newNode=new ListNode(val);
        newNode.next=curr.next;
        curr.next=newNode;
    }
    
    public void deleteAtIndex(int index) {
        //Time Complexity:O(n)
        if(index<0){
            return;
        }
        if(index>=size){
            return;
        }
        ListNode curr=head;
        for(int i=0;i<index;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        size--;

    }
    //Space Complexity:O(n)
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */