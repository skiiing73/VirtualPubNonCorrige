package edu.usmb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CocktailTest {

    @Test
     void testCocktailCreation() {
        Cocktail cocktail = new Cocktail("Mojito");
        assertEquals("Mojito", cocktail.nom);
        assertFalse(cocktail.alcoolise);
    }


    @Test
     void testAlcoolFree() {
        Cocktail cocktail = new Cocktail("Virgin Mojito");
        assertTrue(cocktail.alcoolFree());

        cocktail.alcoolise = true;
        assertFalse(cocktail.alcoolFree());
    }

    @Test
     void testToString() {
        Cocktail cocktail = new Cocktail("Mojito");
        cocktail.add("Rhum", 50.0);
        cocktail.add("Menthe", 20.0);
        cocktail.add("Citron", 10.0);
        cocktail.add("Eau gazeuse", 20.0);

        String expected = "Rhum 50.0%\tMenthe 20.0%\tCitron 10.0%\tEau gazeuse 20.0%\t";
        assertEquals(expected, cocktail.toString());
    }

    @Test
     void testToStringEmptyCocktail() {
        Cocktail cocktail = new Cocktail("Empty Cocktail");
        assertEquals("", cocktail.toString());
    }

    @Test
     void testAddNullIngredient() {
        Cocktail cocktail = new Cocktail("Mojito");
        assertThrows(NullPointerException.class, () -> {
            cocktail.add(null, 50.0);
        });
    }

    @Test
    void testAddIngredientAlcoolisee() {
        Cocktail cocktail = new Cocktail("Mojito");
        cocktail.add("Rhum", 100.0);
        assertFalse(cocktail.alcoolFree());
    }
}