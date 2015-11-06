
package models;

import com.google.code.morphia.annotations.*;
import java.util.Date;
import play.modules.morphia.Model;

/**
 *
 * @author rodrigo
 */
@Entity
public class Cita extends Model{
    
    @Reference
    public Cliente cliente;
    
    @Embedded
    public Tratamiento tratamiento;
    
    public Date dia;
    
}
