package test4;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Impl jcomponentImpl = new Impl();
        JComponent jComponent = jcomponentImpl.get();
    }
}
