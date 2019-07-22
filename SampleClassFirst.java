package artifactmavelproject.mavelproject;
import org.testng.annotations.Test;
public class SampleClassFirst {
@Test
 public void firstMethod() {
// This will return the Thread id
 long id = Thread.currentThread().getId();
 System.out.println("First Class - First Test - Thread id is --&gt; " + id);
 }
@Test
 public void secondMethod() {
long id = Thread.currentThread().getId();
 System.out
 .println("First Class - Second Test - Thread id is --&gt; " + id);
 }
@Test
 public void thirdMethod() {
 long id = Thread.currentThread().getId();
 System.out.println("First Class - Third Test - Thread id is --&gt; " + id);
 }

@Test
public void forthMethod() {
long id = Thread.currentThread().getId();
 System.out.println("First Class - Forth Test - Thread id is --&gt; " + id);
 }
}