package design.an.ordered.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class OrderedStreamTest {
    @Test
    public void test1() {
        OrderedStream stream = new OrderedStream(5);
        assertThat(stream.insert(3, "ccccc"), is(new ArrayList<String>()));
        assertThat(stream.insert(1, "aaaaa"), is(List.of("aaaaa")));
        assertThat(stream.insert(2, "bbbbb"), is(List.of("bbbbb", "ccccc")));
        assertThat(stream.insert(5, "eeeee"), is(new ArrayList<String>()));
        assertThat(stream.insert(4, "ddddd"), is(List.of("ddddd", "eeeee")));
    }
}