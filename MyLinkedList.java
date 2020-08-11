public class MyLinkedList<E>{

	static class Node<E>{
		E data;
		Node<E> next;

			public Node(E data){
				this.data=data;
				next=null;
			}
	}

	Node<E> head;

		void add(E data){
			Node<E> toAdd=new Node<E>(data);
			Node<E> temp=head;

				if(isEmpty()){
					head=toAdd;
					return;
				}
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=toAdd;
		}

		boolean isEmpty(){
			return(head==null);
		}

		void print(){
			Node<E> temp=head;
				while(temp!=null){
					System.out.print(temp.data+" ");
					temp=temp.next;
				}
		}
}