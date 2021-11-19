package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findByName(String name) {
        int size = 0;
        Item[] tempArray = new Item[this.size];
        for (int index = 0; index < this.size; index++) {
            Item item = items[index];
            if (item.getName().equals(name)) {
                tempArray[size] = item;
                size++;
            }
        }
        Item[] rsl = Arrays.copyOf(tempArray, size);
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            items[index].setName(item.getName());
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            int length = size - index - 1;
            int start = index + 1;
            System.arraycopy(items, start, items, index, length);
            items[size - 1] = null;
            size--;
        }
        return rsl;

    }
}
