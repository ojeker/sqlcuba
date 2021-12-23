package ch.so.agi.sqlcuba.web.screens.parentv;

import com.haulmont.cuba.gui.screen.*;
import ch.so.agi.sqlcuba.entity.ParentV;

@UiController("sqlcuba_ParentV.browse")
@UiDescriptor("parent-v-browse.xml")
@LookupComponent("parentVsTable")
@LoadDataBeforeShow
public class ParentVBrowse extends StandardLookup<ParentV> {
}