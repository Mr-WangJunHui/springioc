package spring.xmlconfig.parse;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class MyNamespaceHandler extends NamespaceHandlerSupport{

    public void init() {
        registerBeanDefinitionParser("person",new PeopleBeanDefinitionParser());
    }
}
