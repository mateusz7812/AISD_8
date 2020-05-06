package com.company.zad1.tests;

import com.company.zad1.MyHashTable;
import org.junit.Assert;
import org.junit.Test;

public class TestMyHashTable {

    @Test
    public void Test1() {
        var obj1 = 1;
        var obj2 = 1;
        var obj3 = 2;

        var table = new MyHashTable<Integer>(10);

        Assert.assertTrue(table.Add(obj1));
        Assert.assertFalse(table.Add(obj2));
        Assert.assertTrue(table.Add(obj3));

        Assert.assertTrue(table.Remove(obj1));
        Assert.assertFalse(table.Remove(obj2));
        Assert.assertTrue(table.Remove(obj3));
    }

    @Test
    public void Test2() {
        var obj1 = 1;
        var obj2 = 1;
        var obj3 = 2;

        var table = new MyHashTable<Integer>(10);

        table.Add(obj1);
        table.Add(obj2);
        table.Add(obj3);

        var iterator = table.GetIterator();
        Assert.assertEquals(obj1, iterator.next().intValue());
        Assert.assertEquals(obj3, iterator.next().intValue());
        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void Test3() {
        var obj1 = 1;
        var obj2 = 2;

        var table = new MyHashTable<Integer>(1);

        table.Add(obj1);
        table.Add(obj2);

        var iterator = table.GetIterator();
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals(obj1, iterator.next().intValue());
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals(obj2, iterator.next().intValue());
        Assert.assertFalse(iterator.hasNext());
    }
}
