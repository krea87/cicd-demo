package jensen.johan.cicddemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UtilsTests {
    Utils utils;

    @BeforeEach
    public void setup(){
        utils = new Utils();
    }

    @Test
    public void testCapitalize(){

        // Arrange
        String str = "hello";

        // Act
        String result = utils.capitalize(str);

        // Assert
        assertEquals("Hello", result);
    }

    // Mitt sätt att se på detta är att en validering om det är nummer eller inte spelar ingen roll.
    // Det kan man göra i frontend sen. Backend behöver aldrig ens vara oroad av att få in siffror.
    // Så siffror kan vara oföräandrad, ingen användare kommer märka något.
    @Test
    public void testCapitalizeIfNumber(){

        // Arrange
        String str = "123";

        // Act
        String result = utils.capitalize(str);

        // Assert
        assertEquals("123", result);
    }



    // Exakt samma här. Vi lägger ansvaret till frontend att hantera detta.
    // Ser till att backend inte crashar om strängen råkar vara tom.
    // La till:
    //     if(str.length() == 0){
    //        return str;
    //    }

    @Test
    public void testCapitalizeIfEmpty(){

        // Arrange
        String str = "";

        // Act
        String result = utils.capitalize(str);

        // Assert
        assertEquals("", result);
    }

    @Test
    public void testCapitalizeFirstLetterAlreadyCapitalized(){

        // Arrange
        String str = "Hello";

        // Act
        String result = utils.capitalize(str);

        // Assert
        assertEquals("Hello", result);
    }


    // La till .toLowerCase() i
    //  return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    @Test
    public void testCapitalizeAllLettersCapitalized(){
        // Arrange
        String str = "HELLO";

        // Act
        String result = utils.capitalize(str);

        // Assert
        assertEquals("Hello", result);
    }


    // Test som testar ifall null kommer in.
    // Testet förväntar sig att det kastast ett undantag. Då ska det gå igenom.
    // Lagt till:
    //     if(str==null){
    //        throw new IllegalArgumentException("String cannot be null");
    //    }

    @Test
    public void testCapitalizeIfNull(){
        // Arrange
        String str = null;

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> utils.capitalize(str));

    }

    // testar title, återanvänder capitalize och använder split och trim i metoden.
    @Test
    public void testTitle() {
        // Arrange
        String str = "hello world";

        // Act
        String result = utils.title(str);

        // Assert
        assertEquals("Hello World", result);
    }

    @Test
    public void testTitleMixedStringAndNumbers(){
        // Arrange
        String str = "hello 123 world";

        // Act
        String result = utils.title(str);

        // Assert
        assertEquals("Hello 123 World", result);
    }


    // Denna funkar pga trim.
    @Test
    public void testTitleEmptyString(){
        // Arrange
        String str = "";

        // Act
        String result = utils.title(str);

        // Assert
        assertEquals("", result);

    }



    // La till
    //    if(str==null){
    //        throw new IllegalArgumentException("String cannot be null");
    //    }
    @Test
    public void testTitleIsNull(){
        // Arrange
        String str = null;

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> utils.title(str));
    }

}
