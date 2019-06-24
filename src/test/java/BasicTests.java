import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTests {

    @Test
    public void permutationCount() {
        Permutation p = new Permutation();
        p.permute("abcde", 0, 4);
        Assert.assertEquals(120, p.getCounter());
    }
}
