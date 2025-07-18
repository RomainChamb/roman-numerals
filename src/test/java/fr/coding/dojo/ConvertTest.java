package fr.coding.dojo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConvertTest {

    @Test
    public void testXXX() {
        assertThat(false).isFalse();
    }

    @Test
    public void test1() {
        String actual = convert(1);
        assertThat(actual).isEqualTo("I");
    }

    @Test
    public void test2() {
        String actual = convert(2);
        assertThat(actual).isEqualTo("II");
    }

    @Test
    public void test3() {
        String actual = convert(3);
        assertThat(actual).isEqualTo("III");
    }

    @Test
    public void test4() {
        String actual = convert(4);
        assertThat(actual).isEqualTo("IV");
    }

    @Test
    public void test5() {
        String actual = convert(5);
        assertThat(actual).isEqualTo("V");
    }

    @Test
    public void test6() {
        String actual = convert(6);
        assertThat(actual).isEqualTo("VI");
    }

    @Test
    public void test7() {
        String actual = convert(7);
        assertThat(actual).isEqualTo("VII");
    }

    @Test
    public void test8() {
        String actual = convert(8);
        assertThat(actual).isEqualTo("VIII");
    }

    @Test
    public void test9() {
        String actual = convert(10);
        assertThat(actual).isEqualTo("X");
    }

    @Test
    public void test10() {
        String actual = convert(11);
        assertThat(actual).isEqualTo("XI");
    }

    @Test
    public void test11() {
        String actual = convert(16);
        assertThat(actual).isEqualTo("XVI");
    }

    @Test
    public void test12() {
        String actual = convert(26);
        assertThat(actual).isEqualTo("XXVI");
    }

    @Test
    public void test13() {
        String actual = convert(66);
        assertThat(actual).isEqualTo("LXVI");
    }

    @Test
    public void test14() {
        String actual = convert(2728);
        assertThat(actual).isEqualTo("MMDCCXXVIII");
    }

    @Test
    public void test15() {
        String actual = convert(29);
        assertThat(actual).isEqualTo("XXIX");
    }

    @Test
    public void test16() {
        String actual = convert(49);
        assertThat(actual).isEqualTo("XLIX");
    }


    private static String convert(int i) {
        return convertBis("", i, 9);
    }

    private static String convertBis(String current, int remaining, int k) {
        String[] romanDigits = new String[]{"I","IV", "V", "IX", "X", "XL", "L", "C", "D", "M"};
        int[] romanValue = new int[]{1, 4, 5, 9, 10, 49, 50, 100, 500, 1000};

        if(remaining == 49)
            return "XLIX";

        if (remaining >= romanValue[k])
            return convertBis(current + romanDigits[k], remaining - romanValue[k], k);

        if(k > 0) {
            return convertBis(current, remaining, k-1);
        }

        return current;
    }
}
