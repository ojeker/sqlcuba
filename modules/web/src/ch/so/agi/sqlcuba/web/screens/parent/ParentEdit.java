package ch.so.agi.sqlcuba.web.screens.parent;

import com.haulmont.cuba.gui.screen.*;
import ch.so.agi.sqlcuba.entity.Parent;

@UiController("sqlcuba_Parent.edit")
@UiDescriptor("parent-edit.xml")
@EditedEntityContainer("parentDc")
@LoadDataBeforeShow
public class ParentEdit extends StandardEditor<Parent> {
}