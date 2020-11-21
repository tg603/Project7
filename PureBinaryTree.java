/**
*
*@author Zach 'TG' Thoroughgood
*
*/

import java.lang.*;
public class PureBinaryTree <E extends Object>{
	//Fields
	private E value;
	private PureBinaryTree<E> leftChild; 
	private PureBinaryTree<E> rightChild;
	
	/*
	public PureLinkedList(Top value){
		this.value = value;
		tail = null;
	}
	*/
	
	public PureBinaryTree(E item){
		value = item;
		leftChild = null;
		rightChild = null;
	}
	
	public String toString(String indent) {
    
	StringBuilder builder = new StringBuilder();
		
		if(leftChild != null){
			builder.append(leftChild.toString(indent + "   "));
		}
	builder.append(indent + this.value + "\n");
		
		if(rightChild != null){
			builder.append(rightChild.toString(indent + "   "));
		}
    
	return builder.toString();
	}
	
	
	//Doesn't work
	public String toString(){
		return toString("");
	}
	
		
	public E getValue(){
		if(value == null){
			throw new NullPointerException("No.");
		}else{
		
		return this.value;
		}
	}
	/*
	public String getValue(){
		if(value == null){
			throw new NullPointerException("No No NO.");
		}
		return value.toString();
	}
	*/
	
	public void setValue(E item){
		value = item;
	}
	
	public void setLeftChild(PureBinaryTree<E> item){
		leftChild = item;
	}
	
	public void setRightChild(PureBinaryTree<E> item){
		rightChild = item;
	}
	
	public PureBinaryTree<E> getLeftChild(){
		return leftChild;
	}
	
	public PureBinaryTree<E> getRightChild(){
		return rightChild;
	}
	
	public int getHeight(){
		int Length = 1;
		int Height = 1;
		if(leftChild != null){
			Length = 1 + leftChild.getHeight();
		}
		if(rightChild != null){
			Height = 1 + rightChild.getHeight();
		}
		if(Length < Height){
			return Height;
		}else{
			return Length;
		}
	}
	
	public boolean equals (PureBinaryTree<E> item){
		boolean leftSubtreesEqual = false;
		boolean rightSubtreesEqual = false;
		if(getHeight() == item.getHeight()){
			if(this.value.equals(item.getValue())){
				if(this.leftChild == null && item.getLeftChild() == null){
					leftSubtreesEqual = true;
				}
				if(this.rightChild == null && item.getRightChild() == null){
					rightSubtreesEqual = true;
				}
				if(this.rightChild != null && item.getRightChild() != null){
					this.rightChild.equals(item.getRightChild());
				}
				if(this.leftChild != null && item.getLeftChild() != null){
					this.leftChild.equals(item.getLeftChild());
				}
			}
			
		}
		
		return leftSubtreesEqual && rightSubtreesEqual;
		
	}
	
	
}