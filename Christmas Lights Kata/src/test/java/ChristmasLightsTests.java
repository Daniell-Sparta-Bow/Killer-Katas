import org.junit.jupiter.api.*;

public class ChristmasLightsTests {

    @BeforeAll
    static void setUp(){
        ChristmasLights.setUp();
    }
    @AfterEach
    void cleanUp(){
        ChristmasLights.clearAll();
    }
    @Test
    @DisplayName("given an input of (0,0) and (999,999) will turn on all lights")
    void givenAnInputOf0_0And999_999WillTurnOnAllLights() {
        // Arrange
        int expected = 1_000_000;
        int actual;
        // Act
        ChristmasLights.toggleLights(0,0, 999, 999);
        actual = ChristmasLights.howManyAreOn();
        // Assert
        Assertions.assertEquals(expected, actual);

    }

    @Test
    @DisplayName("given an input of (0,0) and (999,0) will turn on 1000lights")
    void givenAnInputOf0_0And999_0WillTurnOn1000Lights() {
        // Arrange
        int expected = 1_000;
        int actual;
        // Act
        ChristmasLights.toggleLights(0,0, 999, 0);
        actual = ChristmasLights.howManyAreOn();
        // Assert
        Assertions.assertEquals(expected, actual);

    }

    @Test
    @DisplayName("given an input of (0,0) and (0,0) will turn on 1 light")
    void givenAnInputOf0_0And0_0WillTurnOn1Light() {
        // Arrange
        int expected = 1;
        int actual;
        // Act
        ChristmasLights.toggleLights(0,0,0,0);
        actual = ChristmasLights.howManyAreOn();
        // Assert
        Assertions.assertEquals(expected, actual);

    }

    @Test
    @DisplayName("given an input of (0,0) and (0,0) and false will turn on no lights")
    void givenAnInputOf0_0And0_0AndFalseWillTurnOnNoLights() {
        // Arrange
        int expected = 0;
        int actual;
        // Act
        ChristmasLights.toggleLights(0,0,0,0, false);
        actual = ChristmasLights.howManyAreOn();
        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("given an input of (0,0) and (99,99) followed by (0,0) (1,1) false will turn off 4 lights")
    void givenAnInputOf00And9999FollowedBy004949FalseWillTurnOnHalfTheLights() {
        // Arrange
        int expected = 9_996;
        int actual;
        // Act
        ChristmasLights.toggleLights(0,0,99,99);
        ChristmasLights.toggleLights(0, 0, 1, 1, false);
        actual = ChristmasLights.howManyAreOn();
        // Assert
        Assertions.assertEquals(expected, actual);


    }

    @Test
    @DisplayName("given an input of (0,0) and (0,0) followed by (0,0) (0,0) true no lights should turn off")
    void givenAnInputOf00And00FollowedBy0000TrueNoLightsShouldTurnOff() {
        // Arrange
        int expected = 1;
        int actual;
        // Act
        ChristmasLights.toggleLights(0,0,0,0);
        ChristmasLights.toggleLights(0,0,0,0,true);
        actual = ChristmasLights.howManyAreOn();
        // Assert
        Assertions.assertEquals(expected, actual);

    }

    @Test
    @DisplayName("given an input of (0,0) and (0,0) false true total brightness should be 2")
    void givenAnInputOf00And00FalseTrueTotalBrightnessShouldBe2() {
        // Arrange
        int expected = 2;
        int actual;
        // Act
        ChristmasLights.toggleLightsBrightness(0,0,0,0);
        actual = ChristmasLights.getTotalBrightness();
        // Assert
        Assertions.assertEquals(expected, actual);

    }

    @Test
    @DisplayName("given an input of (0,0) and (0,0) true false total brightness should be 1")
    void givenAnInputOf00And00TrueFalseTotalBrightnessShouldBe1() {
        // Arrange
        int expected = 1;
        int actual;
        // Act
        ChristmasLights.toggleLightsBrightness(0,0,0,0, true);
        actual = ChristmasLights.getTotalBrightness();
        // Assert
        Assertions.assertEquals(expected, actual);

    }

    @Test
    @DisplayName("given an input of (0,0) and (0,0) false false total brightness should be 0")
    void givenAnInputOf00And00FalseFalseTotalBrightnessShouldBe0() {
        // Arrange
        int expected = 0;
        int actual;
        // Act
        ChristmasLights.toggleLightsBrightness(0,0,0,0, false);
        actual = ChristmasLights.getTotalBrightness();
        // Assert
        Assertions.assertEquals(expected, actual);

    }

    @Test
    @DisplayName("given an input of (0,0) an d (0,0) false true, followed by Light.clearCount(), total brightness should be 0")
    void givenAnInputOf00AnD00FalseTrueFollowedByLightClearCountTotalBrightnessShouldBe0() {
        // Arrange
        int expected = 0;
        int actual;
        // Act
        ChristmasLights.toggleLightsBrightness(0,0,0,0);
        Light.clearCount();
        actual = ChristmasLights.getTotalBrightness();
        // Assert
        Assertions.assertEquals(expected, actual);


    }

    @Test
    @DisplayName("given a light is switched on, getIsOn should return true")
    void givenALightIsSwitchedOnGetIsOnShouldReturnTrue() {
        // Arrange
        Light light = new Light();
        boolean expected = true;
        boolean actual;
        // Act
        light.toggleOn();
        actual = light.getIsOn();
        // Assert
        Assertions.assertEquals(expected, actual);

    }

}
