import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculator2Test {

    @Test
    public void empty_String_Should_Returns_Zero(){
        assertThat(new StringCalculator2("").calculate()).isEqualTo(0);
    }
    @Test
    public void single_Number_Should_Returns_The_Value(){
        assertThat(new StringCalculator2("0").calculate()).isEqualTo(0);
        assertThat(new StringCalculator2("1").calculate()).isEqualTo(1);
        assertThat(new StringCalculator2("2").calculate()).isEqualTo(2);

    }
    @Test
    public void two_Numbers_Delimited_By_Comma_Should_Returns_The_Sum(){
        assertThat(new StringCalculator2("0,0").calculate()).isEqualTo(0);
        assertThat(new StringCalculator2("1,0").calculate()).isEqualTo(1);
        assertThat(new StringCalculator2("1,1").calculate()).isEqualTo(2);
        assertThat(new StringCalculator2("1,2").calculate()).isEqualTo(3);
        assertThat(new StringCalculator2("2,1").calculate()).isEqualTo(3);
    }
    @Test
    public void two_Numbers_Delimited_By_NewLine_Should_Returns_The_Sum(){
        assertThat(new StringCalculator2("0\n0").calculate()).isEqualTo(0);
        assertThat(new StringCalculator2("1\n0").calculate()).isEqualTo(1);
        assertThat(new StringCalculator2("1\n1").calculate()).isEqualTo(2);
        assertThat(new StringCalculator2("1\n2").calculate()).isEqualTo(3);
        assertThat(new StringCalculator2("2\n1").calculate()).isEqualTo(3);
    }
    @Test
    public void three_Numbers_Delimited_By_Comma_Should_Returns_The_Sum(){
        assertThat(new StringCalculator2("0,0,0").calculate()).isEqualTo(0);
        assertThat(new StringCalculator2("1,0,0").calculate()).isEqualTo(1);
        assertThat(new StringCalculator2("0,1,0").calculate()).isEqualTo(1);
        assertThat(new StringCalculator2("0,0,1").calculate()).isEqualTo(1);
        assertThat(new StringCalculator2("1,1,0").calculate()).isEqualTo(2);
        assertThat(new StringCalculator2("1,0,1").calculate()).isEqualTo(2);
        assertThat(new StringCalculator2("1,1,1").calculate()).isEqualTo(3);
        assertThat(new StringCalculator2("1,1,2").calculate()).isEqualTo(4);
    }

    @Test
    public void three_Numbers_Delimited_By_NewLine_Should_Returns_The_Sum(){
        assertThat(new StringCalculator2("0\n0\n0").calculate()).isEqualTo(0);
        assertThat(new StringCalculator2("1\n0\n0").calculate()).isEqualTo(1);
        assertThat(new StringCalculator2("0\n1\n0").calculate()).isEqualTo(1);
        assertThat(new StringCalculator2("0\n0\n1").calculate()).isEqualTo(1);
        assertThat(new StringCalculator2("1\n1\n0").calculate()).isEqualTo(2);
        assertThat(new StringCalculator2("1\n0\n1").calculate()).isEqualTo(2);
        assertThat(new StringCalculator2("1\n1\n1").calculate()).isEqualTo(3);
        assertThat(new StringCalculator2("1\n1\n2").calculate()).isEqualTo(4);
    }
}


