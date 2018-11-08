/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assertbasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * @see
 * https://codereview.stackexchange.com/questions/77580/generic-tree-in-java#new-answer
 * @since 06-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class AssertClassInvariant {

 public static void main(String[] args) {

  
  
  
 }
}

class Tree<T> {

 private T value;

 private Tree<T> parent;

 protected List<Tree<T>> children = Collections.emptyList();

 public Tree() {
  
 }

 public Tree(T value) {
  this.value = value;
 }

 /**
  * @return the value
  */
 public T getValue() {
  return value;
 }

 /**
  * @param value the value to set
  */
 public void setValue(T value) {
  this.value = value;
 }

 /**
  * Adds children
  *
  * @param children
  * @return this
  */
 public final Tree<T> addChildren(List<Tree<T>> newChildren) {

  if (children == Collections.EMPTY_LIST) {
   children = new ArrayList<>();
  }

  for (Tree<T> child : newChildren) {
   if (children.add(child)) {
    child.setParent(this);
   }
  }
  return this;
 }

 /**
  * Adds children
  *
  * @param children
  * @return this
  */
 @SafeVarargs
 public final Tree<T> addChildren(Tree<T>... children) {
  return addChildren(Arrays.asList(children));
 }

 /**
  * Removes children
  *
  * @param children
  * @return this
  */
 public final Tree<T> removeChildren(List<Tree<T>> children) {
  for (Tree<T> child : children) {
   if (this.children.remove(child)) {
    child.setParent(null);
   }
  }
  return this;
 }

 /**
  * Removes children
  *
  * @param children
  * @return this
  */
 @SafeVarargs
 public final Tree<T> removeChildren(Tree<T>... children) {
  return removeChildren(Arrays.asList(children));
 }

 /**
  * @return the parent
  */
 public Tree<T> getParent() {
  return parent;
 }

 /**
  * @param parent the parent to set
  */
 public void setParent(Tree<T> parent) {
  this.parent = parent;
 }

 /**
  * @return the tree root
  */
 public Tree<T> getRoot() {
  return parent == null ? this : parent.getRoot();
 }

 /**
  * @return children
  */
 public final List<Tree<T>> getChildren() {
  return children;
 }

 @Override
 public String toString() {
  StringBuilder sb = new StringBuilder();
  buildString(sb, "", true);
  return sb.toString();
 }

 private void buildString(StringBuilder sb, String prefix, boolean isTail) {
  sb.append(prefix).append(isTail ? "└── " : "├── ").append(getValue()).append(System.lineSeparator());
  prefix += (isTail ? "    " : "│   ");

  for (int i = 0; i < children.size(); i++) {
   children.get(i).buildString(sb, prefix, (i == children.size() - 1));
  }
 }

 @Override
 public boolean equals(Object obj) {
  if (this == obj) {
   return true;
  }
  if (obj == null) {
   return false;
  }
  if (!(obj instanceof Tree<?>)) {
   return false;
  }

  Tree<?> other = (Tree<?>) obj;

  if (this.children.size() != other.children.size()) {
   return false;
  }

  for (int i = 0; i < this.children.size(); i++) {
   if (!(children.get(i).equals(other.children.get(i)))) {
    return false;
   }
  }
  return true;
 }

 @Override
 public int hashCode() {
  int hash = 3;
  hash = 13 * hash + Objects.hashCode(this.children);
  return hash;
 }

}
