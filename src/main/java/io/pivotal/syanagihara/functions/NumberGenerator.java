package io.pivotal.syanagihara.functions;

import java.util.Random;
import java.util.function.Supplier;

public class NumberGenerator implements Supplier<Integer> {

    @Override
    public Integer get() {
        return new Random().nextInt(99) + 1;
    }
}