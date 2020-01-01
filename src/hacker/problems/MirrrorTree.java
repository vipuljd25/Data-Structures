package hacker.problems;
import java.util.Scanner;


public class MirrrorTree {

	static class Node {
		
		int key ;
		Node left,right ;
	}
	
	static Node newNode(int key){
		
		Node n = new Node();
		
		n.key = key;
		n.left=null;
		n.right =null;
		return n;
		
	}
	
	static Node search(Node root, int key){
		if(root !=null ){
			if(root.key ==key ){
				return root;
		}else{
			Node nodeFound =search(root.left,key);
			if(nodeFound == null){
				 return search(root.right,key);
			}else{
				return nodeFound;
			}
		}
			
		}else{
			return null;
		}
	}
	
	static int findMirrorRec(int target, Node left, Node right)  
	{  
	  
	    if (left==null || right==null)  
	        return 0;  
	  
	  
	    if (left.key == target)  
	        return right.key;  
	  
	    if (right.key == target)  
	        return left.key;  
	  
	    int mirror_val = findMirrorRec(target, left.left, right.right);  
	    if (mirror_val != 0)  
	        return mirror_val;  
	  
	    return findMirrorRec(target, left.right, right.left);  
	}  
	  
	// interface for mirror search  
	static int findMirror(Node root, int target)  
	{  
	    if (root == null)  
	        return 0;  
	    if (root.key == target)  
	        return target;  
	    return findMirrorRec(target, root.left, root.right);  
	}  
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		int q = sc.nextInt();
		
		//String[] str1 =sc.nextLine().split("/ ");
		
		//sc.next
		
		 int root1 = sc.nextInt(); //Integer.parseInt(str1[0]);
		 int e1 = sc.nextInt();//Integer.parseInt(str1[1]);
		 String p1 = sc.next(); //str1[3];
		 
		 Node root = newNode(root1);
		 Node el = newNode(e1);
		 if(p1.equalsIgnoreCase("L")){
			 root.left=el;
		 }else{
			 root.right=el;
		 }
		 
		for (int i = 0; i < n-2; i++) {
			
			//String[] str =sc.nextLine().split(" ");
			
			 int k = sc.nextInt();//Integer.parseInt(str[0]);
			 int e = sc.nextInt();//Integer.parseInt(str[1]);
			 String p = sc.next();//str[3];
			 
			 Node node=search(root,k);
			 
			 Node m = newNode(e);
			 
			 System.out.println(k + " "+ e+ " "+ node.key);
			 if(p.equalsIgnoreCase("L")){
				 node.left=m;
			 }else{
				 node.right=m;
			 }
		}
		
		for (int i = 0; i < q; i++) {
		
			int s=sc.nextInt();
			
			int y=findMirror(root, s);
			if(y!=0){
				System.out.println(y);
			}else{
				System.out.println("-1");
			}
		}
		
		
		
	}
}
