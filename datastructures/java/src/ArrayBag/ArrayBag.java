package ArrayBag;

import interfaces.BagInterface;

public final class ArrayBag<T> implements BagInterface<T> {

    private final T[] bag;
    private int numberOfEntries;
    private static final int DEFAULT_CAPACITY = 25;
    private boolean integrityOk;
    private int MAX_CAPACITY = 50;

    public ArrayBag() {
        this(DEFAULT_CAPACITY);
    }

    /*
     *  Creates ab empty bag having a given initial capacity,
     * @param desiredCapacity The integer capacity desired
     * */
    public ArrayBag(int desiredCapacity) {
        // The cast is safe because the new array contains null entries
        integrityOk = false;
        if (desiredCapacity <= MAX_CAPACITY) {
            @SuppressWarnings("unchecked")
            T[] tempBag = (T[]) new Object[desiredCapacity];
            bag = tempBag;
            numberOfEntries = 0;
            integrityOk = true;
        } else {
            throw new IllegalStateException("Attempt to create a bag whose capacity exceeds allowed maximum.");
        }
    }


    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public boolean add(T newEntry) {
        if (isArrayFull()) {
            return false;
        } else {
            bag[numberOfEntries] = newEntry;
            numberOfEntries++;
        }
        return true;
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public boolean remove(T anEntry) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int getFrequencyOf(Object anEntry) {
        return 0;
    }

    @Override
    public boolean contains(Object anEntry) {
        return false;
    }

    /*
     * Retrieves all entries that are in this bag
     * @return A newly allocated array of all the entries in the bag
     * */
    @Override
    public T[] toArray() {
        // The cast is safe because the new array contains null entries.
        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Object[numberOfEntries]; // Unchecked cast
        for (int i = 0; i < numberOfEntries; i++) {
            result[i] = bag[i];
        }
        return result;
    }

    private boolean isArrayFull() {
        return numberOfEntries > bag.length;
    }

    // Throws an exception if this object is not initialized
    private void checkIntegrity() {
        if (!integrityOk) {
            throw new SecurityException("ArrayBag object is corrupt");
        }
    }
}
