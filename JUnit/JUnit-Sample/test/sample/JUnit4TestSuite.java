/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Cuando ejecuta el conjunto de pruebas, el IDE ejecuta las pruebas incluidas
 * en el conjunto en el orden en que aparecen. Los resultados se muestran en la
 * ventana Resultados de la prueba de JUnit.
 *
 * @author Robot
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(value = {UtilsJUnit4Test.class, VectorsJUnit4Test.class})
public class JUnit4TestSuite {

}
