package com.kovalenkovlodymyr.pattern.abstractfactory;

import com.kovalenkovolodymyr.pattern.abstractfactory.NotebookFactory;
import com.kovalenkovolodymyr.pattern.abstractfactory.impl.AppleNotebookFactory;
import com.kovalenkovolodymyr.pattern.abstractfactory.impl.DellNotebookFactory;
import com.kovalenkovolodymyr.pattern.abstractfactory.impl.LenovoNotebookFactory;
import com.kovalenkovolodymyr.pattern.abstractfactory.model.apple.AppleMacBookAir;
import com.kovalenkovolodymyr.pattern.abstractfactory.model.apple.AppleMacBookPro;
import com.kovalenkovolodymyr.pattern.abstractfactory.model.dell.DellInspiron;
import com.kovalenkovolodymyr.pattern.abstractfactory.model.dell.DellXPS;
import com.kovalenkovolodymyr.pattern.abstractfactory.model.lenovo.LenovoThinkpad;
import com.kovalenkovolodymyr.pattern.abstractfactory.model.lenovo.LenovoYoga;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NotebookFactoryTest {

    private final Logger LOG = Logger.getLogger(this.getClass());

    @Test
    public void testFactory() {
        LOG.info("Verify that factories producing classes expected");
        LOG.info("Verifying Apple factory");
        assertFactoryProducingClasses(new AppleNotebookFactory(), AppleMacBookAir.class, AppleMacBookPro.class);
        LOG.info("Verifying Lenovo factory");
        assertFactoryProducingClasses(new LenovoNotebookFactory(), LenovoYoga.class, LenovoThinkpad.class);
        LOG.info("Verifying Dell factory");
        assertFactoryProducingClasses(new DellNotebookFactory(), DellXPS.class, DellInspiron.class);
    }

    private void assertFactoryProducingClasses(NotebookFactory factory, Class<?> expectedUltrabookClass, Class<?> expectedProfessionalNotebookClass) {
        assertEquals(factory.getUltrabook().getClass(), expectedUltrabookClass, String.format("Ultrabook class was not as expected for %s factory", factory.getClass().getName()));
        assertEquals(factory.getProfessionalNotebook().getClass(), expectedProfessionalNotebookClass, String.format("Professional notebook class was not as expected for %s factory", factory.getClass().getName()));
    }
}
