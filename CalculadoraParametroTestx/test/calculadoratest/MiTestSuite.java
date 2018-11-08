/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoratest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Anotacion
 *
 * @RunWith - Indica que tipo de clase queremos utilizar en este caso
 * 'Suite.class' - Conjunto de clases
 *
 * @Suite.SuiteClasses - Indicar las clases que se van a probar
 *
 * @author MyDevelop
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
 // CalculadoraParametro.class,
 CalculadoraParametroTest.class
})

public class MiTestSuite {

}
