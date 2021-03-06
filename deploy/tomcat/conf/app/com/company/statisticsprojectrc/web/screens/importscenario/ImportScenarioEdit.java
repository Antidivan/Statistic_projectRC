package com.company.statisticsprojectrc.web.screens.importscenario;

import com.company.statisticsprojectrc.entity.Importer;
import com.company.statisticsprojectrc.web.importer.ImportersDatasource;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.statisticsprojectrc.entity.ImportScenario;
import com.haulmont.cuba.gui.components.FieldGroup;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.xml.layout.ComponentsFactory;

import javax.inject.Inject;

public class ImportScenarioEdit extends AbstractEditor<ImportScenario> {
    @Inject
    private ImportersDatasource importersDs;

    @Inject
    private FieldGroup fieldGroup;

    @Inject
    private ComponentsFactory componentsFactory;

    @Override
    protected void postInit() {
        super.postInit();

        fieldGroup.addCustomField("importer", (datasource, propertyId) -> {
            LookupField lookupField = (LookupField) componentsFactory.createComponent(LookupField.NAME);
            lookupField.setOptionsDatasource(importersDs);
            return lookupField;
        });

        importersDs.addItemChangeListener(e -> {
            if (e.getItem() != null )
                getItem().setImporterBeanName(e.getItem().getBeanName());
            else
                getItem().setImporterBeanName(null);
        });

    }

    @Override
    public void ready() {
        super.ready();

        if (getItem().getImporterBeanName() != null) {
            for (Importer i : importersDs.getItems()) {
                if (i.getBeanName().equalsIgnoreCase(getItem().getImporterBeanName()))
                    ((LookupField) fieldGroup.getFieldComponent("importer")).setValue(i);
                break;
            }
        }
    }
}