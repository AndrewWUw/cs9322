/*
 * An XML document type.
 * Localname: importMarketDataResponse
 * Namespace: http://sltf.unsw.edu.au/services
 * Java type: au.edu.unsw.sltf.services.ImportMarketDataResponseDocument
 *
 * Automatically generated - do not modify.
 */
package au.edu.unsw.sltf.services;


/**
 * A document containing one importMarketDataResponse(@http://sltf.unsw.edu.au/services) element.
 *
 * This is a complex type.
 */
public interface ImportMarketDataResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ImportMarketDataResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3E68FC4DE194836EF5928CD8C66708EA").resolveHandle("importmarketdataresponse489cdoctype");
    
    /**
     * Gets the "importMarketDataResponse" element
     */
    au.edu.unsw.sltf.services.ImportMarketDataResponseDocument.ImportMarketDataResponse getImportMarketDataResponse();
    
    /**
     * Sets the "importMarketDataResponse" element
     */
    void setImportMarketDataResponse(au.edu.unsw.sltf.services.ImportMarketDataResponseDocument.ImportMarketDataResponse importMarketDataResponse);
    
    /**
     * Appends and returns a new empty "importMarketDataResponse" element
     */
    au.edu.unsw.sltf.services.ImportMarketDataResponseDocument.ImportMarketDataResponse addNewImportMarketDataResponse();
    
    /**
     * An XML importMarketDataResponse(@http://sltf.unsw.edu.au/services).
     *
     * This is a complex type.
     */
    public interface ImportMarketDataResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ImportMarketDataResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3E68FC4DE194836EF5928CD8C66708EA").resolveHandle("importmarketdataresponseca24elemtype");
        
        /**
         * Gets the "eventSetId" element
         */
        java.lang.String getEventSetId();
        
        /**
         * Gets (as xml) the "eventSetId" element
         */
        org.apache.xmlbeans.XmlString xgetEventSetId();
        
        /**
         * Sets the "eventSetId" element
         */
        void setEventSetId(java.lang.String eventSetId);
        
        /**
         * Sets (as xml) the "eventSetId" element
         */
        void xsetEventSetId(org.apache.xmlbeans.XmlString eventSetId);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.edu.unsw.sltf.services.ImportMarketDataResponseDocument.ImportMarketDataResponse newInstance() {
              return (au.edu.unsw.sltf.services.ImportMarketDataResponseDocument.ImportMarketDataResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.edu.unsw.sltf.services.ImportMarketDataResponseDocument.ImportMarketDataResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.edu.unsw.sltf.services.ImportMarketDataResponseDocument.ImportMarketDataResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.edu.unsw.sltf.services.ImportMarketDataResponseDocument newInstance() {
          return (au.edu.unsw.sltf.services.ImportMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.edu.unsw.sltf.services.ImportMarketDataResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.edu.unsw.sltf.services.ImportMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.edu.unsw.sltf.services.ImportMarketDataResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.ImportMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.edu.unsw.sltf.services.ImportMarketDataResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.ImportMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.edu.unsw.sltf.services.ImportMarketDataResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.ImportMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.edu.unsw.sltf.services.ImportMarketDataResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.ImportMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.edu.unsw.sltf.services.ImportMarketDataResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.ImportMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.edu.unsw.sltf.services.ImportMarketDataResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.ImportMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.edu.unsw.sltf.services.ImportMarketDataResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.ImportMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.edu.unsw.sltf.services.ImportMarketDataResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.ImportMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.edu.unsw.sltf.services.ImportMarketDataResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.ImportMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.edu.unsw.sltf.services.ImportMarketDataResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.ImportMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.edu.unsw.sltf.services.ImportMarketDataResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.ImportMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.edu.unsw.sltf.services.ImportMarketDataResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.ImportMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.edu.unsw.sltf.services.ImportMarketDataResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.ImportMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.edu.unsw.sltf.services.ImportMarketDataResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.ImportMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.edu.unsw.sltf.services.ImportMarketDataResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.edu.unsw.sltf.services.ImportMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.edu.unsw.sltf.services.ImportMarketDataResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.edu.unsw.sltf.services.ImportMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
