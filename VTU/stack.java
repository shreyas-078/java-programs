// Simulation of Stacks using array

import java.util.Scanner;

public class stack {
  public static int top = -1;
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int stack[] = new int[10];
    while(true) {
      System.out.println("Enter your operations:[ PUSH, POP, ISEMPTY, ISFULL, EXIT, DISPLAY ]");
      String lowerInput = in.next();
      String input = lowerInput.toUpperCase();
      if(input.equals("ISEMPTY")) {
        System.out.println(isEmpty(stack));
      } else if(input.equals("PUSH")) {
        System.out.println("Enter element to push");
        int pushele = in.nextInt();
        int status = STACK_PUSH(stack, pushele);
        if(status == 0) {
          System.out.println(("Stack is full"));
        }
        System.out.println("Element " + pushele + " pushed to stack");
      } else if(input.equals("POP")) {
        int popstatus = STACK_POP(stack);
        if(popstatus == 0) {
          System.out.println("Stack is empty");
        } else {
          System.out.println("Latest element popped from the stack");
        }
      } else if(input.equals("DISPLAY")) {
        display(stack);
      } else if(input.equals("EXIT")) {
        System.out.println("Exited");
        break;
      } else {
        System.out.println("Wrong input");
      }
    }
    in.close();
  }

  public static void inputStack(int[] stack) {
    Scanner in = new Scanner(System.in);
    for(int i = 0; i<10; i++) {
      System.out.println("Enter the element at position " + i);
      stack[i] = in.nextInt();
    }
    in.close();
  }

    public static int STACK_PUSH(int[] stack, int num) {
      if(top == 10) {
        return 0;
      } else {
        stack[++top] = num;
        return 1;
      }
    }

    public static boolean isEmpty(int[] stack) {
      if(top == -1) {
        return true;
      } else {
        return false;
      }
    }

    public static int STACK_POP(int[] stack) {
      if(top == -1) {
        return 0;
      }
      stack[top--] = 0;
      return 1;
    }

    public static void display(int[] stack) {
      for(int i = 9; i >= 0; i--) {
        System.out.println(stack[i]);
      }
    }
}