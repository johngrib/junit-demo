package number;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


@DisplayName("Describe: Complex class")
class ComplexTest {

  @Nested @DisplayName("Describe: of 메소드")
  class DescribeAdd {

    @Nested @DisplayName("Context: 실수부만 입력했다면")
    class Context_with_naturals {
      private final double givenNatual = 3d;
      private Complex given = Complex.of(givenNatual);

      @Test @DisplayName("It: i 값은 0 이어야 한다")
      void it_has_0_imagine_value() {
        assertThat(given.getImagine(), is(0d));
      }
    }
  }

  @Nested @DisplayName("Given: toString 메소드")
  class GivenToString {
    @Nested @DisplayName("When: 실수부만 있다면")
    class Context_with_naturals {
      private final double givenNatual = 3d;
      private Complex given = Complex.of(givenNatual);
      private String expectPattern = "^3(?:\\.0+)?$";

      @Test @DisplayName("Then: 실수부만 표현해야 한다")
      void it_has_0_imagine_value() {
        assertTrue(given.toString().matches(expectPattern));
      }
    }

    @Nested @DisplayName("When: 실수부와 허수부가 있다면")
    class Context_with_imagine {
      private final double givenNatual = 3d;
      private final double givenImagine = 7d;
      private Complex given = Complex.of(givenNatual, givenImagine);
      private String expectPattern = "^3(?:\\.0+)?\\+7(?:\\.0+)?i$";

      @Test @DisplayName("Then: 실수부 + 허수부i 형식으로 표현해야 한다")
      void it_has_0_imagine_value() {
        System.out.println(given);
        assertTrue(given.toString().matches(expectPattern));
      }
    }

  }
}