import java.util.Scanner;

class myqueue
{
	int rear=-1,size=5;
	int q[]=new int [size];
	void enqueue(int data)				//main theke data as6e
	{					//checking queue full or not
		if(rear==size-1) 			//jodi ami 3 data enqueue korte chai tahole ter index/rear hobe 2..so rear==size-1 hoi 
		{							//tahole queue full
			System.out.println("queue is overflow..");
		}
		else
		{
			rear++;				//rear=-1 theke 0 hobe then sei index no. e data dhukbe
			q[rear]=data;
		}
	}

	void dequeue()			//checking queue empty or not
	{
		if(rear==-1)			//mane queue empty
		{
			System.out.println("queue is underflow..");
		}
		else
		{
		int result=q[0];		//result e rear/index no. ta store kora holo
		for(int i=0;i<rear;i++)
		{
			q[i]= q[i+1];       //q[i]=0 q[i+1]=1 so 0 no.index e 1no. index er man ta chole jabe
		}
		rear--;					//rear removed
		System.out.println("dequeueed element is:"+result);//result print
		}
		
	}

	void peek()
	{
		if(rear==-1)
		{
			System.out.println("queue is underflow..");
		}
		else
		{
		int result=q[0];		//rear value show 
		System.out.println("rear is: "+result);
		}
	}
	void display()
	{
		if(rear==-1)
		{
			System.out.print("queue is empty");
		}
		else
		{	
			System.out.println("the queue is: ");
			for(int i=0;i<=rear;i++)			// 0 - rear porjoto data ke show 
			{
			System.out.println(q[i]+" "); // 0-rear show
			}
		}
	}
}
public class Queue 
{

	public static void main(String[] args) 
	{
		myqueue s=new myqueue();	//object create myqueue er
		while(true)
		{
			Scanner obj=new Scanner(System.in);	//value newer jonner object create
			System.out.print("enter your choice: ");
			int ch=obj.nextInt();
			
			switch(ch)
			{
			case 1:
				s.enqueue(obj.nextInt());		//data moddhe value patha66e
				
				break;
			
			case 2:
				s.dequeue();
				break;
			case 3:
				s.peek();
				break;
			case 4:
				s.display();
				break;
			default:
				System.out.println("invalid input");
			}
				
				
		}
		
	}

}

