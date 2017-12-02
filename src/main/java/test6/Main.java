package test6;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Impl<JButton> jcomponentImpl = new Impl<JButton>();
        JButton jButton = jcomponentImpl.get();

    }
}
