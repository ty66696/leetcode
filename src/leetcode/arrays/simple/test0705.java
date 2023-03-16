package leetcode.arrays.simple;

import java.util.ArrayList;
import java.util.List;

class MyHashSet {


    private List<Integer> list;

    public MyHashSet() {
        MyHashSet myHashSet = new MyHashSet();
    }

    public void add(int key) {
        if(contains(key))
            return;
        else {
            list.add(key);
        }
    }

    public void remove(int key) {
        if(!contains(key))
            return;
        else{
            for (Integer integer : list) {
                if(integer==key)
                    list.remove(integer);
            }
        }
    }

    public boolean contains(int key) {
        for (Integer integer : list) {
            if(key==integer)
                return true;
        }
        return false;
    }
}