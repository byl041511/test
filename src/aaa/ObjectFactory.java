//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2020.02.18 ʱ�� 02:51:48 PM CST 
//


package aaa;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the aaa package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: aaa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DECDATA }
     * 
     */
    public DECDATA createDECDATA() {
        return new DECDATA();
    }

    /**
     * Create an instance of {@link DECDATA.DECHEAD }
     * 
     */
    public DECDATA.DECHEAD createDECDATADECHEAD() {
        return new DECDATA.DECHEAD();
    }

    /**
     * Create an instance of {@link DECDATA.DECLIST }
     * 
     */
    public DECDATA.DECLIST createDECDATADECLIST() {
        return new DECDATA.DECLIST();
    }

    /**
     * Create an instance of {@link DECDATA.DECCONTAINER }
     * 
     */
    public DECDATA.DECCONTAINER createDECDATADECCONTAINER() {
        return new DECDATA.DECCONTAINER();
    }

    /**
     * Create an instance of {@link DECDATA.DECCERTIFICATE }
     * 
     */
    public DECDATA.DECCERTIFICATE createDECDATADECCERTIFICATE() {
        return new DECDATA.DECCERTIFICATE();
    }

}
