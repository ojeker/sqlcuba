package ch.so.agi.sqlcuba.web.screens.child;

import com.haulmont.cuba.gui.screen.*;
import ch.so.agi.sqlcuba.entity.Child;

@UiController("sqlcuba_Child.browse")
@UiDescriptor("child-browse.xml")
@LookupComponent("childrenTable")
@LoadDataBeforeShow
public class ChildBrowse extends StandardLookup<Child> {
}