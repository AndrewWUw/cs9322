/*
 * An XML document type.
 * Localname: importDownloadFault
 * Namespace: http://sltf.unsw.edu.au/services
 * Java type: au.edu.unsw.sltf.services.ImportDownloadFaultDocument
 *
 * Automatically generated - do not modify.
 */
package au.edu.unsw.sltf.services;


/**
 * A document containing one importDownloadFault(@http://sltf.unsw.edu.au/services) element.
 *
 * This is a complex type.
 */
public interface ImportDownloadFaultDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ImportDownloadFaultDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3E68FC4DE194836EF5928CD8C66708EA").resolveHandle("importdownloadfaultc825doctype");
    
    /**
     * Gets the "importDownloadFault" element
     */
    au.edu.unsw.sltf.services.ImportDownloadFaultDocument.ImportDownloadFault getImportDownloadFault();
    
    /**
     * Sets the "importDownloadFault" element
     */
    void setImportDownloadFault(au.edu.unsw.sltf.services.ImportDownloadFaultDocument.ImportDownloadFault importDownloadFault);
    
    /**
     * Appends and returns a new empty "importDownloadFault" element
     */
    au.edu.unsw.sltf.services.ImportDownloadFaultDocument.ImportDownloadFault addNewImportDownloadFault();
    
    /**
     * An XML importDownloadFault(@http://sltf.unsw.edu.au/services).
     *
     * This is a complex type.
     */
    public interface ImportDownloadFault extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ImportDownloadFault.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3E68FC4DE194836EF5928CD8C66708EA").resolveHandle("importdownloadfault8bc4elemtype");
        
        /**
         * Gets the "faultType" element
         */
        au.edu.unsw.sltf.services.ImportDownloadFaultType.Enum getFaultType();
        
        /**
         * Gets (as xml) the "faultType" element
         */
        au.edu.unsw.sltf.services.ImportDownloadFaultType xgetFaultType();
        
        /**
         * Sets the "faultType" element
         */
        void setFaultType(au.edu.unsw.sltf.services.ImportDownloadFaultType.Enum faultType);
        
        /**
         * Sets (as xml) the "faultType" element
         */
        void xsetFaultType(au.edu.unsw.sltf.services.ImportDownloadFaultType faultType);
        
        /**
         * Gets the "faultMessage" element
         */
        java.lang.String getFaultMessage();
        
        /**
         * Gets (as xml) the "faultMessage" element
         */
        org.apache.xmlbeans.XmlString xgetFaultMessage();
        
        /**
         * Sets the "faultMessage" element
         */
        void setFaultMessage(java.lang.String faultMessage);
        
        /**
         * Sets (as xml) the "faultMessage" element
         */
        void xsetFaultMessage(org.apache.xmlbeans.XmlString faultMessage);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.edu.unsw.sltf.services.ImportDownloadFaultDocument.ImportDownloadFault newInstance() {
              return (au.edu.unsw.sltf.services.ImportDownloadFaultDocument.ImportDownloadFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.edu.unsw.sltf.services.ImportDownloadFaultDocument.ImportDownloadFault newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.edu.unsw.sltf.services.ImportDownloadFaultDocument.ImportDownloadFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.edu.unsw.sltf.services.ImportDownloadFaultDocument newInstance() {
          return (au.edu.unsw.sltf.services.ImportDownloadFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.edu.unsw.sltf.services.ImportDownloadFaultDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.edu.unsw.sltf.services.ImportDownloadFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.edu.unsw.sltf.services.ImportDownloadFaultDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.ImportDownloadFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.edu.unsw.sltf.services.ImportDownloadFaultDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.ImportDownloadFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.edu.unsw.sltf.services.ImportDownloadFaultDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.ImportDownloadFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.edu.unsw.sltf.services.ImportDownloadFaultDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.ImportDownloadFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.edu.unsw.sltf.services.ImportDownloadFaultDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.ImportDownloadFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.edu.unsw.sltf.services.ImportDownloadFaultDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.ImportDownloadFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.edu.unsw.sltf.services.ImportDownloadFaultDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.ImportDownloadFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.edu.unsw.sltf.services.ImportDownloadFaultDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.ImportDownloadFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.edu.unsw.sltf.services.ImportDownloadFaultDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.ImportDownloadFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.edu.unsw.sltf.services.ImportDownloadFaultDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.ImportDownloadFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.edu.unsw.sltf.services.ImportDownloadFaultDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.ImportDownloadFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.edu.unsw.sltf.services.ImportDownloadFaultDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.ImportDownloadFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.edu.unsw.sltf.services.ImportDownloadFaultDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.ImportDownloadFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.edu.unsw.sltf.services.ImportDownloadFaultDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.ImportDownloadFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.edu.unsw.sltf.services.ImportDownloadFaultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.edu.unsw.sltf.services.ImportDownloadFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.edu.unsw.sltf.services.ImportDownloadFaultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.edu.unsw.sltf.services.ImportDownloadFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
