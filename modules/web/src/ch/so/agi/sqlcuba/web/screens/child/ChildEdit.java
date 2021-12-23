package ch.so.agi.sqlcuba.web.screens.child;

import com.haulmont.cuba.gui.screen.*;
import ch.so.agi.sqlcuba.entity.Child;

@UiController("sqlcuba_Child.edit")
@UiDescriptor("child-edit.xml")
@EditedEntityContainer("childDc")
@LoadDataBeforeShow
public class ChildEdit extends StandardEditor<Child> {
}