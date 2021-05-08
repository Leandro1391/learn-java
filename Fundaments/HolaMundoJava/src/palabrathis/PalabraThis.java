package palabrathis;

public class PalabraThis {

      public static void main(String[] args) {

            //New String crea una referenca en el objeto en una poscición única en la memoria, con doble commilla 
            //se crea un pull de objetos de string, es decir, un conjunto de cadenas
            //con new String se crea un objeto string en una porcion de memoria disitnta
            //no es muy comun hacerlo así, generalmente se  hacecon doble comillas
            //Persona peronsa = new Persona(new String("Juan"), "Perez");
            //Este es la forma recomendable, no es eficiente con pull string
            Persona persona = new Persona("Juan", "Perez");
            System.out.println("peronsa = " + persona);
            System.out.println("Persona nombre: " + persona.nombre);
            System.out.println("Persona apellido: " + persona.apellido);

      }
}

//Si creo mas clases en este archivo no pueden ser modificador de acceso public
// para eso tengo qeu usar otro archivo
//el modificaodr de acceso por defecto va ser el default o package, es decir,
//que este paquete solamente vamos a poder acceder desde otras clases definidas dentro del mismo paquete (palabrathis)
class Persona {

      //Los atributos sin modificador son default o package
      String nombre;
      String apellido;

      Persona(String nombre, String apellido) {
            // super llama al constructor de la clase padre -> clase object
            //super(); llamada implicita al contructor de la clase Padre (object)
            this.nombre = nombre;
            this.apellido = apellido;
            //cuando estamos dentro de la clase (en este caso Persona) impriime el objeto que se está ejecutando en ese momento
            System.out.println("Objeto persona usando this = " + this);
//            Imprimir imprimir = new Imprimir();
            new Imprimir().imprimir(this);
            }
      }

      class Imprimir {
            
            public Imprimir() {
                  super(); //se invoca el constructo de la clase object (padre) para  reservar memoria
            }
            
            public void imprimir(Persona persona) {
                  //Ejecuta el objeto persona porque se envía por argumentos
                  System.out.println("persona desde imprimir: " + persona);
                  //Ejecuta objeto imprimir
                  System.out.println("i1mpresion del objeto actual(this)" + this);
            }
      }
