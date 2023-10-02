/*
Write a program that reads two integers 
line by line and calculates their difference.
Hint: To read an integer from a 
line in the input stream, you can 
use the readInt() method of the StdIn object.

Sample Input:
8
11

Sample Output:
-3
*/

import scala.io.StdIn
object Main extends App {
  //put your code here
    val a = scala.io.StdIn.readInt()
    val b = scala.io.StdIn.readInt()
    
    val difference = a - b
    
    println(difference)
    
}

