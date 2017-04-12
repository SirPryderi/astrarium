package fx.components;

import astrarium.Orbit;
import com.sun.javafx.scene.control.behavior.ComboBoxBaseBehavior;
import javafx.scene.control.ComboBoxBase;
import javafx.scene.control.Skin;

/**
 * Created on 11/04/2017.
 *
 * @author Vittorio
 */
public class OrbitField extends ComboBoxBase<Orbit> {
    public OrbitField() {
        //getStyleClass().add("date-picker");
        setEditable(true);
    }

    @Override
    protected Skin<?> createDefaultSkin() {
        return new OrbitFieldSkin(this,
                new ComboBoxBaseBehavior<Orbit>(this, null) {
                    // Well? Whatcha looking at?
                });
    }
}
