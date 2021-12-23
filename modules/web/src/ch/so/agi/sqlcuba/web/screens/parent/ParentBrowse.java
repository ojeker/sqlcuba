package ch.so.agi.sqlcuba.web.screens.parent;

import com.haulmont.cuba.gui.screen.*;
import ch.so.agi.sqlcuba.entity.Parent;

@UiController("sqlcuba_Parent.browse")
@UiDescriptor("parent-browse.xml")
@LookupComponent("parentsTable")
@LoadDataBeforeShow
public class ParentBrowse extends StandardLookup<Parent> {
}