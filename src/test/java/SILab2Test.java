import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {


    @Test
    void EveryBranch() {
        RuntimeException ex;
        ex=assertThrows(RuntimeException.class,()->SILab2.function(null,new LinkedList<User>()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
        assertFalse(SILab2.function(new User("user", "1234", "usermail"), new LinkedList<User>()));
        //korisnickotot ime nema da se sovpadne mailot kje se sovpadne
        assertFalse(SILab2.function(new User(null,"abcdefgh","user@mail.com"), new LinkedList<User>()));
        //korisnickotot ime se sovpagja meilot nema da se sovpagja
         assertFalse(SILab2.function(new User("user2","abcd 1234","user2@mail.com"),new LinkedList<User>()));
        assertFalse(SILab2.function(new User("user3","1234!","user3@mail.com"),new LinkedList<User>()));

    }
    @Test
    void MultipleChoiches()
    {
        //True False False
        RuntimeException ex;
        ex=assertThrows(RuntimeException.class,()->SILab2.function(null,new LinkedList<User>()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        //False True False
        ex=assertThrows(RuntimeException.class,()->SILab2.function(new User("user",null,"mail"),new LinkedList<User>()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        //False False True
        ex=assertThrows(RuntimeException.class,()->SILab2.function(new User("user","12345",null),new LinkedList<User>()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));



    }
}