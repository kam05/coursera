/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main_UnionFind
{

	public static void main(String[] args) {
		UnionFind unionFind = new UnionFind(6);
		unionFind.connect(3,4);
		unionFind.connect(1,2);
		unionFind.connect(5,3);
		unionFind.connect(0,5);
		
		unionFind.display();
		
		
		
	}
}


class UnionFind {
    
    int[] id;
    int a,b;
    UnionFind(int N)
    {     
      id = new int[N];
      for(int i=0;i<N;i++)
      {
          id[i] = i;
      }
    }
    
private int root(int a)
{
    while(id[a]!=a)
    {
        a=id[a];
    }
    return a;
}
    
public void connect(int a, int b)
{
     int i = root(a);
     int j = root(b);
     id[i] = j;
     
}

public boolean isConnected(int a, int b)
{
     if(root(a)==root(b))
     {
         return true;
     }
     else
     return false;
}

public void display()
{
    for(int i=0;i<id.length;i++)
    {
        System.out.println("index of "+i+":"+id[i]);
    }
}}
