import java.util.*;
import java.io.*;

class Driver{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Product ob=new Product();
		int i,ch=0;
		ArrayList PD=new ArrayList();
		ArrayList pd=new ArrayList();
		while(ch!=5){
			System.out.println("-----------------");
			System.out.println("1. INSERT");
			System.out.println("2. DELETE");
			System.out.println("3. UPDATE");
			System.out.println("4. DISPLAY");
			System.out.println("5. EXIT");
			System.out.print("\n Enter choice : ");
			ch=sc.nextInt();
			if(ch==1){
				pd=ob.insert();
				PD.add(pd);
			}
			else if(ch==2){
				System.out.print("\n Enter postion : ");
				i=sc.nextInt();
				PD=ob.delete(PD,i);
			}
			else if(ch==3){
				System.out.print("\n Enter postion : ");
				i=sc.nextInt();
				pd=ob.insert();
				PD=ob.update(PD,pd,i);
			}
			else if(ch==4){
				ob.display(PD);
			}
			else{
				System.out.println("EXIT");
				break;
			}
		}
	}
}

class Product{
	String productname;
	int productid, quantity;
	double price;
	ArrayList insert(){
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter product-name = ");
		productname=sc.next();
		System.out.print("\n Enter product-ID = ");
		productid=sc.nextInt();
		System.out.print("\n Enter product-quantity = ");
		quantity=sc.nextInt();
		System.out.print("\n Enter product-price = ");
		price=sc.nextDouble();
		ArrayList P=new ArrayList();
		P.add(productid);
		P.add(productname);
		P.add(quantity);
		P.add(price);
		return P;
	}
	ArrayList delete(ArrayList arr,int j){
		arr.remove(j);
		return arr;
	}
	ArrayList update(ArrayList L,ArrayList li,int k){
		L.set(k,li);
		return L;
	}
	void display(ArrayList LI){
		System.out.println(LI);
	}
}



		

