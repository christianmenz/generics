package test2;

public class Impl<T> implements Interface {
    public T get() { // should be fine
        return null;
    }


    public void set(T o) { // won't work

    }
}
