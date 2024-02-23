import java.util.Scanner;

class mycircular
{
	int rear=-1, front =-1,size=5;
	int q[]=new int [size];
	void enqueue(int data)				//main theke data as6e
	{						//checking queue full or not
		if((rear+1)%size==front) 			  
		{							
			System.out.println("queue is overflow..");
		}
		if(front==-1)
		{
			front=0;
		}
		rear=((rear+1)%size);
		q[rear]=data;	
			
	}

	void dequeue()			//checking queue empty or not
	{
		if(front==-1)			
		{
			System.out.println("queue is underflow..");
		}
		int result=q[front];
		if(front==rear)		//for single element
		{
			front=rear=-1;
		}
		else 
		{
			front=(front+1)%size;
		}
			System.out.println("dequeueed element is:"+result);//result print
		
	}

	void peek()
	{
		if(rear==-1)
		{
			System.out.println("queue is underflow..");
		}
		else
		{
		int result=q[front];	
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
			for(int i=0;front<=rear;i++)			// 0 - rear porjoto data ke show 
			{
			System.out.println(q[rear]+" "); // 0-rear show
			}
		}
	}
}
public class Circularqueue 
{

	public static void main(String[] args) 
	{
		mycircular s=new mycircular();	//object create mycircular er
		while(true)
		{
			Scanner obj=new Scanner(System.in);	//value newer jonner object create
			System.out.print("enter your choice: ");
			int ch=obj.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.print("enter elements: ");
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

