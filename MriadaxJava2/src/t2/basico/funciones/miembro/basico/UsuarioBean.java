/**
 *
 */
package t2.basico.funciones.miembro.basico;

/**
 * @see p24
 * @since 23-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class UsuarioBean implements java.io.Serializable {

 private String usuario;
 private String clave;
 private String email;
 private byte edad;

 /**
  * Constructor por defecto
  */
 public UsuarioBean() {
 }

 public String getUsuario() {
  return usuario;
 }

 public void setUsuario(String usuario) {
  this.usuario = usuario;
 }

 public String getClave() {
  return clave;
 }

 public void setClave(String clave) {
  this.clave = clave;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public byte getEdad() {
  return edad;
 }

 public void setEdad(byte edad) {
  this.edad = edad;
 }
}
