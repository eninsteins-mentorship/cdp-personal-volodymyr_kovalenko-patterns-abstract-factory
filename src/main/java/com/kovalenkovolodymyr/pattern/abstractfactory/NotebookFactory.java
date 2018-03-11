package com.kovalenkovolodymyr.pattern.abstractfactory;

import com.kovalenkovolodymyr.pattern.abstractfactory.model.Notebook;

public interface NotebookFactory {
    Notebook getUltrabook();
    Notebook getProfessionalNotebook();
}
