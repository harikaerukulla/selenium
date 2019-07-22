package artifactmavelproject.mavelproject;
import org.testng.annotations.Test;
public class SampleClassSecond {
@Test
 public void firstMethod() {
// This will return the Thread id
 long id = Thread.currentThread().getId();
 System.out
 .println("Second Class - First Test - Thread id is --&gt; " + id);
 }
@Test
 public void secondMethod() {
 
long id = Thread.currentThread().getId();
 System.out.println("Second Class - Second Test - Thread id is --&gt; "
 + id);
 }
@Test
 public void thirdMethod() {
long id = Thread.currentThread().getId();
 System.out
 .println("Second Class - Third Test - Thread id is --&gt; " + id);
 }
@Test
 public void forthMethod() {
long id = Thread.currentThread().getId();
 System.out
 .println("Second Class - Forth Test - Thread id is --&gt; " + id);
 }
}