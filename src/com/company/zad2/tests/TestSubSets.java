package com.company.zad2.tests;

import com.company.zad1.MyHashTable;
import com.company.zad2.SubSetAlgorithm;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestSubSets {
    @Test
    public void Test1(){
        var set = new MyHashTable<Integer>();
        set.Add(1);
        set.Add(2);
        set.Add(3);

        var subset = new MyHashTable<Integer>();
        subset.Add(1);
        subset.Add(2);

        var algorithm = new SubSetAlgorithm<>(set);
        Assert.assertTrue(algorithm.IsSubSet(subset));
    }

    @Test
    public void Test2(){
        var set = new MyHashTable<Integer>();
        set.Add(1);
        set.Add(2);
        set.Add(3);

        var subset = new MyHashTable<Integer>();
        subset.Add(4);

        var algorithm = new SubSetAlgorithm<>(set);
        Assert.assertFalse(algorithm.IsSubSet(subset));
    }

    @Test
    public void Test3(){
        var set = new MyHashTable<Integer>();
        set.Add(1);
        set.Add(2);
        set.Add(3);
        set.Add(4);
        set.Add(5);

        var subset = new MyHashTable<Integer>();
        subset.Add(1);
        subset.Add(4);
        subset.Add(6);
        subset.Add(2);

        var algorithm = new SubSetAlgorithm<>(set);
        Assert.assertFalse(algorithm.IsSubSet(subset));
    }

    @Test
    public void Test4(){
        var set = new MyHashTable<Character>(new ArrayList<>(){{
            add('a');
            add('b');
            add('c');
            add('d');
        }});

        var subset = new MyHashTable<Character>(new ArrayList<>(){{
            add('b');
            add('d');
        }});

        var algorithm = new SubSetAlgorithm<>(set);
        Assert.assertTrue(algorithm.IsSubSet(subset));
    }

    @Test
    public void Test5(){
        var set = new MyHashTable<Character>(new ArrayList<>(){{
            add('a');
            add('b');
            add('c');
            add('d');
        }});

        var subset = new MyHashTable<Character>(new ArrayList<>(){{
            add('a');
            add('b');
            add('c');
            add('d');
        }});

        var algorithm = new SubSetAlgorithm<>(set);
        Assert.assertTrue(algorithm.IsSubSet(subset));
    }
}
