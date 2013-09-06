/*
 * An XML document type.
 * Localname: importMarketData
 * Namespace: http://sltf.unsw.edu.au/services
 * Java type: au.edu.unsw.sltf.services.ImportMarketDataDocument
 *
 * Automatically generated - do not modify.
 */
package au.edu.unsw.sltf.services.impl;
/**
 * A document containing one importMarketData(@http://sltf.unsw.edu.au/services) element.
 *
 * This is a complex type.
 */
public class ImportMarketDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.ImportMarketDataDocument
{
    
    public ImportMarketDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPORTMARKETDATA$0 = 
        new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "importMarketData");
    
    
    /**
     * Gets the "importMarketData" element
     */
    public au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData getImportMarketData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData target = null;
            target = (au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData)get_store().find_element_user(IMPORTMARKETDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "importMarketData" element
     */
    public void setImportMarketData(au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData importMarketData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData target = null;
            target = (au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData)get_store().find_element_user(IMPORTMARKETDATA$0, 0);
            if (target == null)
            {
                target = (au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData)get_store().add_element_user(IMPORTMARKETDATA$0);
            }
            target.set(importMarketData);
        }
    }
    
    /**
     * Appends and returns a new empty "importMarketData" element
     */
    public au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData addNewImportMarketData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData target = null;
            target = (au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData)get_store().add_element_user(IMPORTMARKETDATA$0);
            return target;
        }
    }
    /**
     * An XML importMarketData(@http://sltf.unsw.edu.au/services).
     *
     * This is a complex type.
     */
    public static class ImportMarketDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData
    {
        
        public ImportMarketDataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SEC$0 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "sec");
        private static final javax.xml.namespace.QName STARTDATE$2 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "startDate");
        private static final javax.xml.namespace.QName ENDDATE$4 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "endDate");
        private static final javax.xml.namespace.QName DATASOURCEURL$6 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "dataSourceURL");
        
        
        /**
         * Gets the "sec" element
         */
        public java.lang.String getSec()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEC$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "sec" element
         */
        public org.apache.xmlbeans.XmlString xgetSec()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEC$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "sec" element
         */
        public void setSec(java.lang.String sec)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEC$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEC$0);
                }
                target.setStringValue(sec);
            }
        }
        
        /**
         * Sets (as xml) the "sec" element
         */
        public void xsetSec(org.apache.xmlbeans.XmlString sec)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEC$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEC$0);
                }
                target.set(sec);
            }
        }
        
        /**
         * Gets the "startDate" element
         */
        public java.util.Calendar getStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "startDate" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTDATE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "startDate" element
         */
        public void setStartDate(java.util.Calendar startDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$2);
                }
                target.setCalendarValue(startDate);
            }
        }
        
        /**
         * Sets (as xml) the "startDate" element
         */
        public void xsetStartDate(org.apache.xmlbeans.XmlDateTime startDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTDATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(STARTDATE$2);
                }
                target.set(startDate);
            }
        }
        
        /**
         * Gets the "endDate" element
         */
        public java.util.Calendar getEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "endDate" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDDATE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "endDate" element
         */
        public void setEndDate(java.util.Calendar endDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$4);
                }
                target.setCalendarValue(endDate);
            }
        }
        
        /**
         * Sets (as xml) the "endDate" element
         */
        public void xsetEndDate(org.apache.xmlbeans.XmlDateTime endDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDDATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ENDDATE$4);
                }
                target.set(endDate);
            }
        }
        
        /**
         * Gets the "dataSourceURL" element
         */
        public java.lang.String getDataSourceURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASOURCEURL$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "dataSourceURL" element
         */
        public org.apache.xmlbeans.XmlAnyURI xgetDataSourceURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(DATASOURCEURL$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "dataSourceURL" element
         */
        public void setDataSourceURL(java.lang.String dataSourceURL)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASOURCEURL$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATASOURCEURL$6);
                }
                target.setStringValue(dataSourceURL);
            }
        }
        
        /**
         * Sets (as xml) the "dataSourceURL" element
         */
        public void xsetDataSourceURL(org.apache.xmlbeans.XmlAnyURI dataSourceURL)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(DATASOURCEURL$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(DATASOURCEURL$6);
                }
                target.set(dataSourceURL);
            }
        }
    }
}
