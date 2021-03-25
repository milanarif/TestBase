package triangle;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;


class TriangleTest {
    @Test
    void testScalene(){
        Triangle scalaneTriangle = new Triangle(2,2,2);

        assertThat(scalaneTriangle.isScalene()).isTrue();
    }

    @Test
    void testNotScalene(){
        Triangle notScalaneTriangle = new Triangle(2,1,2);

        assertThat(notScalaneTriangle.isScalene()).isFalse();
    }

    @Test
    void testEquilateral(){
        Triangle equilateralTriangle = new Triangle(1,2,3);

        assertThat(equilateralTriangle.isEquilateral()).isTrue();
    }

    @Test
    void testNotEquilateral(){
        Triangle notEquilateralTriangle = new Triangle(1,1,2);

        assertThat(notEquilateralTriangle.isEquilateral()).isFalse();
    }

    @Test
    void testIsosceles(){
        Triangle isoscelesTriangle = new Triangle(1,2,2);

        assertThat(isoscelesTriangle.isIsosceles()).isTrue();
    }

    @Test
    void testNotIsosceles(){
        Triangle notIsoscelesTriangle = new Triangle(1,2,3);

        assertThat(notIsoscelesTriangle.isIsosceles()).isFalse();
    }
}
