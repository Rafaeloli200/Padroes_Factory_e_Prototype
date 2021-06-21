package Prototype;

import org.junit.Test;
import static org.junit.Assert.*;

public class PilotoTest {

    @Test
    void testClone() throws CloneNotSupportedException {

        Piloto piloto = new Piloto(1, "Original", "Fem", "Helicopteros", "Brasil");
        
        Piloto pilotoClone = piloto.clone();
        pilotoClone.setId(3);
        pilotoClone.setNome("Clonado");
        pilotoClone.setSexo("Masc");
        pilotoClone.setFormacao("Jatos");
        
        assertEquals("Piloto{id=1, nome='Original', sexo='Fem', "
                + "formacao='Helicopteros', nacionalidade='Brasil'}", piloto.toString());
        assertEquals("Piloto{id=3, nome='Clonado', sexo='Masc',"
                + " formacao='Jatos', nacionalidade='Brasil'}", pilotoClone.toString());
    }

}
