package test3;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Impl<JButton> jButtonImpl = new Impl();
        Object o = jButtonImpl.get();
    }
}
