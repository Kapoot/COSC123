//Give a  Code fragment for Reversing an array. 

//Give a  Code fragment for randomly permuting an array. 

//Give a  Code fragment  for circularly rotating an array by distance d.

//This is not the most efficent way, but a method I created from scratch with no outside sourcing




import java.util.*;

import java.util.LinkedList;

import java.util.Queue;

public class Arraytypes 
{
    public static void main(String[] args)

       {

          // TODO Auto-generated method stub

             

             

              System.out.println(reverse("emordnilap a si racecar")); //Output text to be reversed

              System.out.println(Shuffle("lots of letters")); //Output text to be shuffled

              System.out.println(rotate("hello",1)); //Output text to be rotated

             

       }

      

       //Reversing an Arrray

       public static String reverse(String s) {

             

              String x="";

              for(int i=s.length();i>0;i--) //starting at the end of the array and iterating through each character of string

              {

                     x=x+s.charAt(i-1);

              }

             

              return x; //return reversed character array

       }

 

       //Randomly Permuting an Array

      

       public static String Shuffle(String s) {

              String x="";

              Queue<Character> q = new LinkedList<>();  //creating a queue and a linked list, storing string in both

              Stack<Character> stack = new Stack<Character>();

              for(int i=0;i<s.length();i++)

              {

                     stack.push(s.charAt(i));

                     q.add(s.charAt(i));

             

              }

              while(x.length()<=s.length()-1) //each time through the loop we're essentially flipping a coin

                                             //if heads or 0, we pop from the stack, if tails or 1, we remove from the queue

              {

                     if((Math.random()*2)>1)

                     x=x+q.remove();

                     else

                     x=x+stack.pop();

                    

              }

              return x; //returns shuffled character array

      

       }

             

       //Circularly Rotating an Array

       public static String rotate(String s, int d)

       {

              String x = "";

             

              for(int i=(s.length()-d);i<s.length();i++)  //grabbing d characters from the end of the array

              {                                                                          //pushing them to x

                     x=x+s.charAt(i);

              }

             

              for(int i=0;i<(s.length()-(d));i++)   //grabbing the remaining characters from the beginning of the array
                                                    // adding them on

              {

                     x=x+s.charAt(i);

              }

              return x; //returns rotated character array

             

             

       }

      

} //fin