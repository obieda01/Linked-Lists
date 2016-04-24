import java.util.*;


public class Linked<T> {

	private T data;
	private Linked<T> next;
	
	public Linked(T value){data=value;};
	public Linked(){}
	public T value(){return data;}
	
	public Linked<T> next(){return next;}
	
	public void setValue(T value){data=value;}
	
	public void setNext(Linked<T> elem){this.next=elem; }

	
	public Linked<T> insertFront(Linked<T> list,T data)
	{
		Linked<T> head=new Linked<T> (data);
		
		head.setNext(list);
		
		return head;
	}
	public void triverse(Linked<T> head)
	{	

		Linked<T> elem=head;
		while(elem!=null)
		{
			System.out.println(elem.value());
			elem=elem.next();
		}
	}
	public Linked<T> dup(Linked<T> list)
	{	
		Linked<T> ind=list;
		Linked<T> current=list;
		Linked<T> mover=list;
		while(current!=null)
		{
			mover=current;
			
			while(mover.next!=null)
			{
				if(current.value()==mover.next.value())
					mover.next=mover.next.next();
				else
					mover=mover.next;
			}
			current=current.next;
		}
		return ind;
	}
	
	
	public Linked<T> duplicates(Linked<T> list)
	{	Linked<T> newlist= new Linked<T>();
		HashSet<T> set=new HashSet<T>();
		while(list!=null)
		{
			if(set.contains(list.value()))
				list=list.next;
			else{
				set.add(list.value());
				newlist=newlist.insertFront(newlist, list.value());
				list=list.next;

			}
			
		}
		//System.out.println(set);
		return newlist;
	}
	
	public Linked<T> Kth(Linked<T> list,int k)
	{
		Linked<T> head=list;
		Linked<T> last=list;
		Linked<T> kk=list;
		int counter=1;
		while(last.next!=null)
		{
			last =last.next;
			if(counter==k){kk=kk.next;}
			else{counter++;	}
			
		}
		
		return kk;
	}
	
	public Linked<T> removefront(Linked<T> list)
	{
		if(list.next()== null)
			throw new EmptyStackException();
		Linked<T> temp;
		temp=list.next();
		return temp;
	}
	
	public int sum(Linked<T>f,Linked<T> s)
	{
		int first =f.digit(f);
		int second =s.digit(s);
		
		
		return first+second;
	}
	
	public int digit(Linked<T> list)
	{
		int multi=1;
		int val=0;
		while(list!=null)
		{
			val += Integer.parseInt(String.valueOf(list.data))*multi;
			multi*=10;
			list=list.next;
		}
		System.out.println(String.valueOf(val));
		return val;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Linked<String> newlist=new Linked<String>("Ahmad");
	Linked<String> head=newlist;
	
	head=head.insertFront(head,"Mohammad");
	head=head.insertFront(head,"Mohsdsd");
	head=head.insertFront(head,"Mo");
	head=head.insertFront(head,"Mo");
	

	head=head.removefront(head);
	
	
	head=head.insertFront(head,"1");
	head=head.insertFront(head,"2");
	head=head.insertFront(head,"3");
	head=head.insertFront(head,"4");
	head=head.insertFront(head,"1");
	head=head.insertFront(head,"2");
	head=head.insertFront(head,"3");
	head=head.insertFront(head,"4");
	head=head.insertFront(head,"1");
	head=head.insertFront(head,"2");
	head=head.insertFront(head,"3");
	head=head.insertFront(head,"4");
	head=head.insertFront(head,"1");
	head=head.insertFront(head,"2");
	head=head.insertFront(head,"3");
	head=head.insertFront(head,"4");
	head=head.insertFront(head,"1");
	head=head.insertFront(head,"2");
	head=head.insertFront(head,"3");
	head=head.insertFront(head,"4");
	head=head.insertFront(head,"1");
	head=head.insertFront(head,"2");
	head=head.insertFront(head,"3");
	head=head.insertFront(head,"4");
	head=head.insertFront(head,"1");
	head=head.insertFront(head,"2");
	head=head.insertFront(head,"3");
	head=head.insertFront(head,"4");
	head=head.insertFront(head,"1");
	head=head.insertFront(head,"2");
	head=head.insertFront(head,"3");
	head=head.insertFront(head,"4");
	head=head.insertFront(head,"1");
	head=head.insertFront(head,"2");
	head=head.insertFront(head,"3");
	head=head.insertFront(head,"4");
	head=head.insertFront(head,"1");
	head=head.insertFront(head,"2");
	head=head.insertFront(head,"3");
	head=head.insertFront(head,"4");
	head=head.insertFront(head,"1");
	head=head.insertFront(head,"2");
	head=head.insertFront(head,"3");
	head=head.insertFront(head,"4");
	head=head.insertFront(head,"1");
	head=head.insertFront(head,"2");
	head=head.insertFront(head,"3");
	head=head.insertFront(head,"4");
	//head=head.duplicates(head);
	//head=head.dup(head);
	//head.triverse(head);
	Linked<String> kthvalue=head;
	kthvalue=kthvalue.Kth(kthvalue, 10);
	head.triverse(kthvalue);
	
	Linked<Integer> first=new Linked<Integer>(6);
	first=first.insertFront(first, 1);
	first=first.insertFront(first, 7);
	
	int x= first.digit(first);
	Linked<Integer> second=new Linked<Integer>(2);
	second=second.insertFront(second, 9);
	second=second.insertFront(second, 5);
	int y= second.sum(first,second);
	System.out.println(y);
	
	int [] s={1,3,4,5,6};
	System.out.println(s.length);
	}

}
