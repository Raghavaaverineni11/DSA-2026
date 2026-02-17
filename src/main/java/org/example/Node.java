package org.example;

public class Node {

    Node left,right;
    int data;

    Node(int value){
        this.data=value;
        left=right=null;
    }



}

class BinaryTree{
     Node root;
     void insert(int value){
         root=insertRec(root,value);
     }

     Node insertRec(Node root,int value){
         if(root==null){
             return new Node(value);
         }
         if(value < root.data){
             root.left=insertRec(root.left,value);
         }
         else
             root.right = insertRec(root.right, value);

         return root;
     }

}
