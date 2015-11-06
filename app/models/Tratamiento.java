
package models;

import com.google.code.morphia.annotations.*;
import play.modules.morphia.Model;

/**
 *
 * @author rodrigo
 */
@Embedded
//@Entity
public class Tratamiento {
    
    public String descripcion;
    public Integer precio;
    
}
