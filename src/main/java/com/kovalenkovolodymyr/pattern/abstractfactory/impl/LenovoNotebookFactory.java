package com.kovalenkovolodymyr.pattern.abstractfactory.impl;

import com.kovalenkovolodymyr.pattern.abstractfactory.NotebookFactory;
import com.kovalenkovolodymyr.pattern.abstractfactory.model.Notebook;
import com.kovalenkovolodymyr.pattern.abstractfactory.model.lenovo.LenovoThinkpad;
import com.kovalenkovolodymyr.pattern.abstractfactory.model.lenovo.LenovoYoga;

public class LenovoNotebookFactory implements NotebookFactory {
    @Override
    public Notebook getUltrabook() {
        return new LenovoYoga();
    }

    @Override
    public Notebook getProfessionalNotebook() {
        return new LenovoThinkpad();
    }
}
