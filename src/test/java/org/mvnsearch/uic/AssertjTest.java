package org.mvnsearch.uic;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * assertj test
 *
 * @author linux_china
 */
public class AssertjTest {

    @Test
    public void testSpike() {
        String text = "good morning";
        assertThat(text).contains("good");
        Map<String,String> data=new HashMap<>();
        data.put("nick", "jacky");
        assertThat(data).containsKey("nick");
    }
}
