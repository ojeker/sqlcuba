package ch.so.agi.sqlcuba.web.screens.parentv;

import com.haulmont.cuba.gui.screen.*;
import ch.so.agi.sqlcuba.entity.ParentV;

@UiController("sqlcuba_ParentV.keyval-browse")
@UiDescriptor("parent-v-keyval-browse.xml")
@LookupComponent("parentVsTable")
@LoadDataBeforeShow
public class ParentVKeyvalBrowse extends StandardLookup<ParentV> {
}