package com.test.numbers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BinaryTreeTest {

   private static final String NO_PATH = "NO PATH";

   @Test
   public void given_0() {
      Integer number = 0;
      BinaryTree bt = new BinaryTree(number);
      assertEquals(NO_PATH, bt.printPath(bt.root, number));
   }

   @Test
   public void given_1() {
      Integer number = 1;
      BinaryTree bt = new BinaryTree(number);
      assertEquals("1", bt.printPath(bt.root, number));
   }

   @Test
   public void given_2() {
      Integer number = 2;
      BinaryTree bt = new BinaryTree(number);
      assertEquals(NO_PATH, bt.printPath(bt.root, number));
   }

   @Test
   public void given_3() {
      Integer number = 3;
      BinaryTree bt = new BinaryTree(number);
      assertEquals("1->3", bt.printPath(bt.root, number));
   }

   @Test
   public void given_4() {
      Integer number = 4;
      BinaryTree bt = new BinaryTree(number);
      assertEquals(NO_PATH, bt.printPath(bt.root, number));
   }

   @Test
   public void given_6() {
      Integer number = 6;
      BinaryTree bt = new BinaryTree(number);
      assertEquals("1->6", bt.printPath(bt.root, number));
   }

   @Test
   public void given_7() {
      Integer number = 7;
      BinaryTree bt = new BinaryTree(number);
      assertEquals(NO_PATH, bt.printPath(bt.root, number));
   }

   @Test
   public void given_8() {
      Integer number = 8;
      BinaryTree bt = new BinaryTree(number);
      assertEquals("1->3->8", bt.printPath(bt.root, number));
   }

   @Test
   public void given_9() {
      Integer number = 9;
      BinaryTree bt = new BinaryTree(number);
      assertEquals("1->3->9", bt.printPath(bt.root, number));
   }

   @Test
   public void given_10() {
      Integer number = 10;
      BinaryTree bt = new BinaryTree(number);
      assertEquals(NO_PATH, bt.printPath(bt.root, number));
   }

   @Test
   public void given11() {
      Integer number = 11;
      BinaryTree bt = new BinaryTree(number);
      assertEquals("1->6->11", bt.printPath(bt.root, number));
   }

   @Test
   public void given12() {
      Integer number = 12;
      BinaryTree bt = new BinaryTree(number);
      assertEquals(NO_PATH, bt.printPath(bt.root, number));
   }

   @Test
   public void given13() {
      Integer number = 13;
      BinaryTree bt = new BinaryTree(number);
      assertEquals("1->3->8->13", bt.printPath(bt.root, number));
   }


   @Test
   public void given14() {
      Integer number = 14;
      BinaryTree bt = new BinaryTree(number);
      assertEquals("1->3->9->14", bt.printPath(bt.root, number));
   }


   @Test
   public void given18() {
      Integer number = 18;
      BinaryTree bt = new BinaryTree(number);
      assertEquals("1->3->8->13->18", bt.printPath(bt.root, number));
   }


   @Test
   public void given28() {
      Integer number = 28;
      BinaryTree bt = new BinaryTree(number);
      assertEquals("1->3->8->13->18->23->28", bt.printPath(bt.root, number));
   }


   @Test
   public void given29() {
      Integer number = 29;
      BinaryTree bt = new BinaryTree(number);
      assertEquals("1->3->9->14->19->24->29", bt.printPath(bt.root, number));
   }

   @Test
   public void given30() {
      Integer number = 30;
      BinaryTree bt = new BinaryTree(number);
      assertEquals(NO_PATH, bt.printPath(bt.root, number));
   }

   @Test
   public void given40() {
      Integer number = 40;
      BinaryTree bt = new BinaryTree(number);
      assertEquals(NO_PATH, bt.printPath(bt.root, number));
   }

   @Test
   public void given50() {
      Integer number = 50;
      BinaryTree bt = new BinaryTree(number);
      assertEquals(NO_PATH, bt.printPath(bt.root, number));
   }

   @Test
   public void given60() {
      Integer number = 60;
      BinaryTree bt = new BinaryTree(number);
      assertEquals(NO_PATH, bt.printPath(bt.root, number));
   }

   @Test
   public void given70() {
      Integer number = 70;
      BinaryTree bt = new BinaryTree(number);
      assertEquals(NO_PATH, bt.printPath(bt.root, number));
   }

   @Test
   public void given80() {
      Integer number = 80;
      BinaryTree bt = new BinaryTree(number);
      assertEquals(NO_PATH, bt.printPath(bt.root, number));
   }

   @Test
   public void given90() {
      Integer number = 90;
      BinaryTree bt = new BinaryTree(number);
      assertEquals(NO_PATH, bt.printPath(bt.root, number));
   }

   @Test
   public void given100() {
      Integer number = 100;
      BinaryTree bt = new BinaryTree(number);
      assertEquals(NO_PATH, bt.printPath(bt.root, number));
   }


   @Test
   public void given_729() {
      Integer number = 729;
      BinaryTree bt = new BinaryTree(number);
      assertEquals("1->3->9->27->81->243->729", bt.printPath(bt.root, number));
   }

   @Test
   public void given_734() {
      Integer number = 734;
      BinaryTree bt = new BinaryTree(number);
      assertEquals("1->3->9->27->81->243->729->734", bt.printPath(bt.root, number));
   }

   @Test
   public void given_2202() {
      Integer number = 2202;
      BinaryTree bt = new BinaryTree(number);
      assertEquals("1->3->9->27->81->243->729->2187->2192->2197->2202", bt.printPath(bt.root, number));
   }

   
} 