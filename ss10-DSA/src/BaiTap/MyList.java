package BaiTap;

import java.util.Arrays;

public class MyList<E> {
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private E elements[];

    public MyList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyList(int size) {
        elements = (E[]) new Object[size];
    }

    private void ensureCapa() {
        if (size > elements.length) {
            int newSize = size * 2 + 1;
            elements = Arrays.copyOf(elements, newSize);
        }
    }

    public void add(E e) {
        size += 1;
        ensureCapa();
        elements[size - 1] = e;
    }

    public boolean add(int index, E e) {
        if (index > 0 && index < size) {
            size += 1;
            ensureCapa();
            for (int i = size - 2;i >= index;i--) {
                elements[size + 1] = elements[i];
            }
            elements[index] = e;
            return true;
        } else {
            return false;
        }
    }
}
