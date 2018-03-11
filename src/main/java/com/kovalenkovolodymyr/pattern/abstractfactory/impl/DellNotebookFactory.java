package com.kovalenkovolodymyr.pattern.abstractfactory.impl;

import com.kovalenkovolodymyr.pattern.abstractfactory.NotebookFactory;
import com.kovalenkovolodymyr.pattern.abstractfactory.model.Notebook;
import com.kovalenkovolodymyr.pattern.abstractfactory.model.dell.DellInspiron;
import com.kovalenkovolodymyr.pattern.abstractfactory.model.dell.DellXPS;

public class DellNotebookFactory implements NotebookFactory {
    @Override
    public Notebook getUltrabook() {
        return new DellXPS();
    }

    @Override
    public Notebook getProfessionalNotebook() {
        return new DellInspiron();
    }
}
