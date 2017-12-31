package inference;

import javax.swing.*;

public class Test1 {

    public static <T> T test(T t) {
        return t;
    }

    public static void main(String[] args) {
        JButton jButton = test(new JButton()); // implicit
        JComponent test = Test1.<JComponent>test(jButton); // explicit

    }
}
