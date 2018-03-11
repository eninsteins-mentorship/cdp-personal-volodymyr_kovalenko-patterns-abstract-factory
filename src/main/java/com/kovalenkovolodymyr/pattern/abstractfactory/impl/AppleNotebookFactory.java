package com.kovalenkovolodymyr.pattern.abstractfactory.impl;

import com.kovalenkovolodymyr.pattern.abstractfactory.NotebookFactory;
import com.kovalenkovolodymyr.pattern.abstractfactory.model.Notebook;
import com.kovalenkovolodymyr.pattern.abstractfactory.model.apple.AppleMacBookAir;
import com.kovalenkovolodymyr.pattern.abstractfactory.model.apple.AppleMacBookPro;

public class AppleNotebookFactory implements NotebookFactory {
    @Override
    public Notebook getUltrabook() {
        return new AppleMacBookAir();
    }

    @Override
    public Notebook getProfessionalNotebook() {
        return new AppleMacBookPro();
    }
}
