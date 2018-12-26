package io.pivotal.syanagihara.functions;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class NumberGenerator implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer bound) {
        return new Random().nextInt(bound) + 1;
    }
}
