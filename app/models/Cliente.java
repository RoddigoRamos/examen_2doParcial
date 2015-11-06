
package models;

import com.google.code.morphia.annotations.*;
import play.modules.morphia.Model;

/**
 *
 * @author rodrigo
 */
@Entity
public class Cliente extends Model{
    
    public String nombre;
    public String domicilio;
    public String telefono;
    public String email;

    @Override
    public String toString() {
        return String.format("%s", nombre);
    }
    
    
    
}
