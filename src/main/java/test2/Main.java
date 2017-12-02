package test2;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Impl<JButton> jButtonImpl = new Impl();
        JButton o = jButtonImpl.get();
    }
}
