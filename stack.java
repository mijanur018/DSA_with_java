import java.util.Scanner;

class mystack
{
	int top=-1,size=5;
	int stk[]=new int [size];
	void push(int data)				//main theke data as6e
	{					//checking stack full or not
		if(top==size-1) 			//jodi ami 3 data push korte chai tahole ter index/top hobe 2..so top==size-1 hoi 
		{							//tahole stack full
			System.out.println("stack is overflow..");
		}
		else
		{
			top++;				//top=-1 theke 0 hobe then sei index no. e data dhukbe
			stk[top]=data;
		}
	}

	void pop()			//checking stack empty or not
	{
		if(top==-1)			//mane stack empty
		{
			System.out.println("stack is underflow..");
		}
		else
		{
		int result=stk[top];		//result e top/index no. ta store kora holo
		top--;					//top removed
		System.out.println("poped element is:"+result);//result print
		}
		
	}

	void peek()
	{
		if(top==-1)
		{
			System.out.println("stack is underflow..");
		}
		else
		{
		int result=stk[top];		//top value show 
		System.out.println("top is: "+result);
		}
	}
	void display()
	{
		if(top==-1)
		{
			System.out.print("stack is empty");
		}
		else
		{	
			System.out.println("the stack is: ");
			for(int i=0;i<=top;i++)			// 0 - top porjoto data ke show 
			{
			System.out.println(stk[i]+" "); // 0-top show
			}
		}
	}
}
public class stack 
{

	public static void main(String[] args) 
	{
		mystack s=new mystack();	//object create mystack er
		while(true)
		{
			Scanner obj=new Scanner(System.in);	//value newer jonner object create
			System.out.print("enter your choice: ");
			int ch=obj.nextInt();
			
			switch(ch)
			{
			case 1:
				s.push(obj.nextInt());		//data moddhe value patha66e
				
				break;
			
			case 2:
				s.pop();
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
