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
/**
*@param PureBinaryTree Constructor
*@param E item
*/
	public PureBinaryTree(E item){
		value = item;
		leftChild = null;
		rightChild = null;
	}
	
/**
*@param toString Method
*@param first String indent
*@return String
*/
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
	
/**
*@param second toString method
*@return String
*/
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
	
//Failed attempt @ getValue(), doesn't need to return a .toString()	
	/*
	public String getValue(){
		if(value == null){
			throw new NullPointerException("No No NO.");
		}
		return value.toString();
	}
	*/
	
/**
*@param setValue method
*@param E item
*@return void
*/
	public void setValue(E item){
		value = item;
	}
		
/**
*@param setLeftChild method
*@param PureBinaryTree<E> item
*@return void
*/
	public void setLeftChild(PureBinaryTree<E> item){
		leftChild = item;
	}
/**
*@param setLeftChild method
*@param PureBinaryTree<E> item
*@return void
*/	
	public void setRightChild(PureBinaryTree<E> item){
		rightChild = item;
	}
/**
*@param getLeftChild method
*@return PureBinaryTree<E>
*/	
	public PureBinaryTree<E> getLeftChild(){
		return leftChild;
	}
/**
*@param getRightChild method
*@return PureBinaryTree<E>
*/
	public PureBinaryTree<E> getRightChild(){
		return rightChild;
	}
/**	
*@param getHeight method
*@return integer
*/
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
/**
*@param equals method
*@param PureBinaryTree<E> item
*@return boolean
*/
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
