package hello.typeconverter.converter;

import hello.typeconverter.type.IpPort;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void stringToInteger() {
        StringToIntegerConverter converter = new StringToIntegerConverter();
        Integer result = converter.convert("10");

        assertThat(result).isEqualTo(10);
    }

    @Test
    void integerToString() {
        IntegerToStringConverter converter = new IntegerToStringConverter();
        String result = converter.convert(10);

        assertThat(result).isEqualTo("10");
    }

//    @Test
//    void stringToIpPort() {
//        IpPortToStringConverter converter = new IpPortToStringConverter();
//
//        IpPort source = new IpPort("127.0.0.1", 8080);
//        String result = converter.convert(source);
//        assertThat(result).isEqualTo("127.0.0.1:8080");
//    }
//
//    @Test
//    void ipPortToString() {
//        StringToIpPortConverter converter = new StringToIpPortConverter();
//        String source = "127.0.0.1:8080";
//        IpPort convert = converter.convert(source);
//
//        assertThat(convert).isEqualTo(new IpPort("127.0.0.1", 8080)); // @EqualsAndHashCode 때문에 비교 가능
//
//    }
}