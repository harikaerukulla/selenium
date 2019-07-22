package artifactmavelproject.mavelproject;
import org.testng.annotations.Test;
public class SampleParallelMethods {
@Test
 public void firstMethod() {
// This will return the Thread id
 long id = Thread.currentThread().getId();
 System.out.println("First Test - Thread id is --&gt; " + id);
 }
@Test
 public void secondMethod() {
long id = Thread.currentThread().getId();
 System.out.println("Second Test - Thread id is --&gt; " + id);
 }
@Test
 public void thirdMethod() {
long id = Thread.currentThread().getId();
 System.out.println("Third Test - Thread id is --&gt; " + id);
 }
@Test
 public void forthMethod() {
long id = Thread.currentThread().getId();
 System.out.println("Forth Test - Thread id is --&gt; " + id);
 }
}