package org.dynjs.runtime.modules;

import static org.fest.assertions.Assertions.assertThat;

import org.dynjs.runtime.AbstractDynJSTestSupport;
import org.junit.Ignore;
import org.junit.Test;

public class UtilModuleTest extends AbstractDynJSTestSupport {
    
    private UtilModule module = new UtilModule();

    @Test
    public void formatParity() {
        assertThat(module.format(null, null, "The secret to %s is %d", "the universe", 42)).isEqualTo(String.format("The secret to %s is %d", "the universe", 42));
    }
    
    @Test
    @Ignore
    // http://nodejs.org/api/util.html#util_util_format_format
    public void formatWithExtraArgs() {
        assertThat(module.format(null, null, "%s:%s", "foo", "bar", "baz")).isEqualTo("foo:bar baz");
    }
    
    @Test
    public void formatWithNoFormatString() {
        assertThat(module.format(null, null, 1, 2, 3)).isEqualTo("1 2 3");
    }

    @Test
    @Ignore
    public void formatEvaluation() {
        assertThat(eval("require('util').format('1 2 3')")).isEqualTo("1 2 3");
    }


}