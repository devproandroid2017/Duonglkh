package com.example.windows7.demoandroidapp;

import android.support.annotation.NonNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Windows 7 on 5/26/2017.
 */

public class Contact implements List {
    public String name;
    public String mota;
    public String cpu;
    public String type;

    public Contact(String name, String mota, String cpu, String type) {
        this.name = name;
        this.mota = mota;
        this.cpu = cpu;
        this.type = type;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @NonNull
    @Override
    public Iterator iterator() {
        return null;
    }

    @NonNull
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(@NonNull Collection collection) {
        return false;
    }

    @Override
    public boolean addAll(int i, @NonNull Collection collection) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int i) {
        return null;
    }

    @Override
    public Object set(int i, Object o) {
        return null;
    }

    @Override
    public void add(int i, Object o) {

    }

    @Override
    public Object remove(int i) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @NonNull
    @Override
    public ListIterator listIterator(int i) {
        return null;
    }

    @NonNull
    @Override
    public List subList(int i, int i1) {
        return null;
    }

    @Override
    public boolean retainAll(@NonNull Collection collection) {
        return false;
    }

    @Override
    public boolean removeAll(@NonNull Collection collection) {
        return false;
    }

    @Override
    public boolean containsAll(@NonNull Collection collection) {
        return false;
    }

    @NonNull
    @Override
    public Object[] toArray(@NonNull Object[] objects) {
        return new Object[0];
    }
}
