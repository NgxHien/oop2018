package week3;

import org.junit.Test;
import org.junit.Assert;

public class Week3Test {

    @Test
    public void Test(){
    // TODO: Viết 5 testcase cho phương thức max()
        Assert.assertEquals(10,Week3.max(5,10));
        Assert.assertEquals(100,Week3.max(0,100));
        Assert.assertEquals(100000,Week3.max(-10000,100000));
        Assert.assertEquals(10,Week3.max(3,10));
        Assert.assertEquals(19,Week3.max(1,19));
    // TODO: Viết 5 testcase cho phương thức minOfArray()
        int arr1[] = new int[] {1,2,3};
        int arr2[] = new int[] {2,3,4,5,6,7,8,9};
        int arr3[] = new int[] {7,8,9};
        int arr4[] = new int[] {9};
        int arr5[] = new int[] {100000,-10};
        Assert.assertEquals(1,Week3.minOfArray(arr1));
        Assert.assertEquals(2,Week3.minOfArray(arr2));
        Assert.assertEquals(7,Week3.minOfArray(arr3));
        Assert.assertEquals(9,Week3.minOfArray(arr4));
        Assert.assertEquals(-10,Week3.minOfArray(arr5));
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
        Assert.assertEquals("Thiếu cân", Week3.calculateBMI(40.5,1.5));
        Assert.assertEquals("Bình thường", Week3.calculateBMI(45.4,1.5));
        Assert.assertEquals("Thừa cân", Week3.calculateBMI(55,1.5));
        Assert.assertEquals("Béo phì", Week3.calculateBMI(65,1.5));
        Assert.assertEquals("Bình thường", Week3.calculateBMI(57,1.7));
    }
}
