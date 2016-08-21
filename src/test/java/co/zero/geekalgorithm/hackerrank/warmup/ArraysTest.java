package co.zero.geekalgorithm.hackerrank.warmup;

import org.junit.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * Created by hernan on 8/20/16.
 */
public class ArraysTest {
    private static InputStream stdin;

    @BeforeClass
    public static void setUp() throws Exception {
        stdin = System.in;
    }

    @Test
    public void sumNormalInts() throws Exception {
        String data = "5\n1 2 3 4 5\n";

        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            int sum = ArraysOperations.sumNormalInts();
            assertEquals(sum, 15);
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void sumReallyBigInts() throws Exception {
        String data = "4\n2147483647 2147483647 2147483647 2147483647";

        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            long sum = ArraysOperations.sumReallyBigInts();
            assertEquals(sum, 2147483647L*4);
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
        public void countIntTypes() throws Exception {
        String data = "6\n-4 3 -9 0 4 1";

        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            String result = ArraysOperations.countIntTypes();
            assertEquals("0.500000\n0.333333\n0.166667", result);
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void circularRotation() throws Exception {
        String data = "3 2 3\n1 2 3\n0\n1\n2\n";

        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            String result = ArraysOperations.circularRotation();
            assertEquals("2\n3\n1\n", result);
        } finally {
            System.setIn(stdin);
        }
    }
}