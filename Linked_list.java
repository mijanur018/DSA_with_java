public class Linked_list 
{
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	void add_first(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;
			return;
		}
		newnode.next=head;
		head=newnode;
		
	}
	void add_last(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;
			return;
		}
		Node currnode=head;
		while(currnode.next!=null)
		{
			currnode=currnode.next;
		}
		currnode.next=newnode;
	}
		
	void delete_frist()
	{
		if(head==null)
		{
			System.out.print("the list is empty");
			return;
		}
		head=head.next;
	}
	void delete_last()
	{
		Node second_last=head;
		Node last=head.next;
		if(head==null)
		{
			System.out.print("the list is empty");
			return;
		}
		while(last.next!=null)
		{
			last=last.next;
			second_last=second_last.next;
		}
		second_last.next=null;
	}
	void print() 
	{
		Node currnode=head;
		if(head==null)
		{
			System.out.print("the list is empty");
			return;
		}
		while(currnode!=null)
		{
			System.out.print(currnode.data+"->");
			currnode=currnode.next;
		}
		System.out.println("null");
	}
	void count() 
	{
		Node currnode=head;
		int c=0;
		if(head==null)
		{
			System.out.print("the list is empty");
			return;
		}
		while(currnode!=null)
		{
			c+=1;
			currnode=currnode.next;
		
		}
		System.out.println("total node is"+c);
	}
	void search(int val)
	{
		boolean k;
		int c=0;
		Node currnode=head;
		while(currnode!=null)
		{
			if(currnode.data==val)
			{
				k=true;
			}
			else
			{
				currnode=currnode.next;
				c+=1;
			}
		}
		if(k=true)
		{
			System.out.print(val+"found at:"+c);
		}
		else
		{
			System.out.print(val+"not found");
		}
	}
		/*if(k==1)
		{
			System.out.print(val+"found at:"+c);
		}
		
		
	}*/
	
	public static void main(String[] args) 
	{
		Linked_list s=new Linked_list();
		s.add_first(5);
		s.add_first(7);
		s.add_first(9);
		s.add_last(20);
		s.add_first(2);
		s.print();
		s.delete_last();
		s.print();
		s.search(9);
		
	}

}
