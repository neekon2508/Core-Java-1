package Chap6_InterfaceLambdaInner.lambda;

import java.util.*;
import java.util.function.IntConsumer;

import javax.swing.*;
import javax.swing.Timer;

/**
 * This program demonstrates the use of lambda expressions
 * @version 1.0 2024-07-06
 * @author Neekon
 */
public class LambdaTest {
    public static void main(String[] args) {
        repeat(10, i -> System.out.println("Countdown: "+(9-i)));
    }
    public static void repeat(int n, IntConsumer action)
    {
        for (int i = 0; i<n;++i) action.accept(i);
    }
}
