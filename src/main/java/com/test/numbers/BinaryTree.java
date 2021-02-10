
package com.test.numbers;

import java.util.ArrayList;

public class BinaryTree {

    Node root;

    public BinaryTree(Integer number) {
        this.populate(number);
    }

    public void populate(int number) {
        root = new Node(1);
        addRecursive(root, number);
    }

    private Node addRecursive(Node current, int number) {
        //left side: multiples of 3
        if (current.getValue() * 3 <= number) {
            current.setLeft(new Node(current.getValue() * 3));
            current.setLeft(addRecursive(current.getLeft(), number));
        }
        if (current.getValue() + 5 <= number) {
            current.setRight(new Node(current.getValue() + 5));
            current.setRight(addRecursive(current.getRight(), number));
        }     
        //right side: adding 5  
        return current;
    }

    
    public String printPath(Node root, int x)  
    {  
        String path = "";
        // ArrayList to store the path  
        ArrayList<Integer> arr = new ArrayList<>(); 
      
        // if required node 'x' is present  
        // then print the path  
        if (hasPath(root, arr, x))  
        {  
            for (int i=0; i<arr.size()-1; i++)      
                path = path + (arr.get(i)+"->"); 
                path = path + arr.get(arr.size() - 1);     
        }  
        
        // 'x' is not present in the binary tree   
        else
            path = "NO PATH";  

        return path;
    }  


    public static boolean hasPath(Node root, ArrayList<Integer> arr, int x)  
    {  
        // if root is NULL  
        // there is no path  
        if (root==null)  
            return false;  
        
        // push the node's value in 'arr'  
        arr.add(root.getValue());      
        
        // if it is the required node  
        // return true  
        if (root.getValue() == x)      
            return true;  
        
        // else check whether the required node lies  
        // in the left subtree or right subtree of   
        // the current node  
        if (hasPath(root.getLeft(), arr, x) ||  
            hasPath(root.getRight(), arr, x))  
            return true;  
        
        // required node does not lie either in the   
        // left or right subtree of the current node  
        // Thus, remove current node's value from   
        // 'arr'and then return false      
        arr.remove(arr.size()-1);  
        return false;              
    } 



}